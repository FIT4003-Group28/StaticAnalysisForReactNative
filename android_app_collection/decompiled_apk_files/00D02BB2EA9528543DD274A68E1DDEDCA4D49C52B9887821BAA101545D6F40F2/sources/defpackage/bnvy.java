package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bnvy  reason: default package */
/* loaded from: classes3.dex */
public final class bnvy<T> {
    public static final Set<Class<?>> e;
    public final String a;
    public final Class<T> b;
    Constructor<T> c;
    String[] d;
    @dzsi
    private final String f;
    private final Map<String, bnvx> g = new HashMap();

    static {
        dbtm.a(',');
        e = dcep.G(String.class, Boolean.TYPE, Boolean.class, Character.TYPE, Character.class, Byte.TYPE, Byte.class, Short.TYPE, Short.class, Integer.TYPE, Integer.class, Long.TYPE, Long.class, Float.TYPE, Float.class, Double.TYPE, Double.class, double[].class, Double[].class, int[].class, Integer[].class, long[].class, Long[].class, float[].class, Float[].class, ahrn.class);
    }

    private bnvy(String str, Class<T> cls, @dzsi String str2) {
        this.a = str;
        this.b = cls;
        this.f = str2;
    }

    public static <T> bnvy<T> a(Class<T> cls) {
        Field[] declaredFields;
        Method[] methods;
        int length;
        Annotation[] annotationArr;
        try {
            ckol ckolVar = (ckol) cls.getAnnotation(ckol.class);
            if (ckolVar == null) {
                throw new RuntimeException(String.format(Locale.US, "Class %s needs @ReplayableEvent annotation", cls.getName()));
            }
            String a = ckolVar.a();
            ckolVar.b();
            String c = ckolVar.c();
            if (true != cls.isEnum()) {
                c = null;
            }
            bnvy<T> bnvyVar = new bnvy<>(a, cls, c);
            synchronized (bnvyVar) {
                for (Constructor<?> constructor : cls.getConstructors()) {
                    Constructor<T> constructor2 = (Constructor<T>) constructor;
                    Annotation[][] parameterAnnotations = constructor2.getParameterAnnotations();
                    int length2 = parameterAnnotations.length;
                    if (length2 != 0) {
                        ckoo[] ckooVarArr = new ckoo[length2];
                        boolean[] zArr = new boolean[length2];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            length = parameterAnnotations.length;
                            if (i >= length) {
                                break;
                            }
                            for (Annotation annotation : parameterAnnotations[i]) {
                                if (annotation instanceof ckoo) {
                                    ckooVarArr[i] = (ckoo) annotation;
                                    i2++;
                                } else if (annotation instanceof dzsi) {
                                    zArr[i] = true;
                                }
                            }
                            i++;
                        }
                        if (i2 > 0) {
                            if (i2 == length) {
                                if (bnvyVar.d == null) {
                                    bnvyVar.c = constructor2;
                                    bnvyVar.d = new String[i2];
                                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        bnvx b = bnvyVar.b(ckooVarArr[i3].a());
                                        b.a(parameterTypes[i3]);
                                        b.g = true;
                                        b.h = zArr[i3];
                                        b.i = ckooVarArr[i3].b();
                                        if ("*NO_DEFAULT*".equals(b.i)) {
                                            b.i = null;
                                        }
                                        ckooVarArr[i3].c();
                                        ckooVarArr[i3].d();
                                        ckooVarArr[i3].e();
                                        bnvyVar.d[i3] = b.a;
                                    }
                                } else {
                                    throw new RuntimeException(String.format(Locale.US, "%s has multiple constructors with parameters annotated with @ReplayableProperty", cls.getName()));
                                }
                            } else {
                                throw new RuntimeException(String.format(Locale.US, "Not all parameters for %s constructor are annotated with @ReplayableProperty", cls.getName()));
                            }
                        }
                    } else if (bnvyVar.c == null) {
                        bnvyVar.c = constructor2;
                    }
                }
                if (bnvyVar.c == null && ((bnvy) bnvyVar).f == null) {
                    throw new RuntimeException(String.format(Locale.US, "%s has no usable constructor", cls.getName()));
                }
                for (Field field : cls.getDeclaredFields()) {
                    ckoo ckooVar = (ckoo) field.getAnnotation(ckoo.class);
                    if (ckooVar != null) {
                        String a2 = ckooVar.a();
                        Class<?> type = field.getType();
                        bnvx b2 = bnvyVar.b(a2);
                        if (b2.c == null) {
                            b2.a(type);
                            ckooVar.c();
                            ckooVar.d();
                            ckooVar.e();
                            b2.c = field;
                        } else {
                            throw new RuntimeException(String.format(Locale.US, "Event class %s has duplicate @ReplayProperty(\"%s\") annotations", cls.getName(), a2));
                        }
                    }
                }
                for (Method method : cls.getMethods()) {
                    ckop ckopVar = (ckop) method.getAnnotation(ckop.class);
                    if (ckopVar == null) {
                        ckom ckomVar = (ckom) method.getAnnotation(ckom.class);
                        if (ckomVar == null) {
                            ckon ckonVar = (ckon) method.getAnnotation(ckon.class);
                            if (ckonVar != null) {
                                String a3 = ckonVar.a();
                                bnvx b3 = bnvyVar.b(a3);
                                if (b3.f == null) {
                                    if (method.getReturnType() == Boolean.TYPE) {
                                        b3.f = method;
                                    } else {
                                        throw new RuntimeException(String.format(Locale.US, "%s of %s must return a boolean", method.getName(), a3));
                                    }
                                } else {
                                    throw new RuntimeException(String.format(Locale.US, "Event class %s has duplicate @ReplayHasProperty(\"%s\") annotations", bnvyVar.b.getName(), a3));
                                }
                            }
                        } else {
                            String a4 = ckomVar.a();
                            Class<?> returnType = method.getReturnType();
                            bnvx b4 = bnvyVar.b(a4);
                            if (b4.e == null && b4.c == null) {
                                b4.a(returnType);
                                b4.e = method;
                            } else {
                                throw new RuntimeException(String.format(Locale.US, "Event class %s has redundant @ReplayGetter(\"%s\") annotation", bnvyVar.b.getName(), a4));
                            }
                        }
                    } else {
                        String a5 = ckopVar.a();
                        Class<?>[] parameterTypes2 = method.getParameterTypes();
                        if (parameterTypes2.length == 1) {
                            bnvx b5 = bnvyVar.b(a5);
                            if (b5.c == null && b5.d == null && !b5.g) {
                                b5.a(parameterTypes2[0]);
                                b5.d = method;
                            } else {
                                throw new RuntimeException(String.format(Locale.US, "Event class %s has redundant @ReplaySetter(\"%s\") annotation", bnvyVar.b.getName(), a5));
                            }
                        } else {
                            throw new RuntimeException(String.format(Locale.US, "Setter %s of %s must take one parameter.", method.getName(), a5));
                        }
                    }
                }
                for (bnvx bnvxVar : ((bnvy) bnvyVar).g.values()) {
                    if (bnvxVar.c == null) {
                        if (bnvxVar.d == null && !bnvxVar.g) {
                            throw new RuntimeException(String.format(Locale.US, "Must define means to set attribute %s for event class %s ", bnvxVar.a, cls.getName()));
                        }
                        if (bnvxVar.e == null) {
                            throw new RuntimeException(String.format(Locale.US, "Must define means to get attribute %s for event class %s", bnvxVar.a, cls.getName()));
                        }
                    }
                    if (bnvxVar.g && !bnvxVar.h && bnvxVar.b != Float.TYPE && bnvxVar.b != Double.TYPE && bnvxVar.i == null && bnvxVar.f != null) {
                        throw new RuntimeException(String.format(Locale.US, "Attribute %s in class %s can't have @ReplayHasProperty method if it is required in constructor.", bnvxVar.a, cls.getName()));
                    }
                }
            }
            return bnvyVar;
        } catch (IllegalAccessError e2) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 32);
            sb.append("Failed to get annotation for <");
            sb.append(name);
            sb.append(">.");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    private final bnvx b(String str) {
        bnvx bnvxVar = this.g.get(str);
        if (bnvxVar == null) {
            bnvx bnvxVar2 = new bnvx(str);
            this.g.put(str, bnvxVar2);
            return bnvxVar2;
        }
        return bnvxVar;
    }
}
