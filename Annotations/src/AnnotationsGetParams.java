/* ways of using annotations:
  @MyAnno() // both str and val default
  @MyAnno(str = "some string") // val defaults
  @MyAnno(val = 100) // str defaults
  @MyAnno(str = "Testing", val = 100) // no defaults
 */

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationInterface {
    String str();
    int val();
}
class AnnotationsGetParams {
    // myMeth now has two arguments.
    @AnnotationInterface(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i)
    {
        AnnotationsGetParams ob = new AnnotationsGetParams();
        try {
            Class<?> c = ob.getClass();
            // Here, the parameter types are specified.
            Method m = c.getMethod("myMeth", String.class, int.class);
            AnnotationInterface anno = m.getAnnotation(AnnotationInterface.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String[] args) {
        myMeth("test", 10);
    }
}