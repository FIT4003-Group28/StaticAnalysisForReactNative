package c.e.a.b.d.g;
/* loaded from: classes.dex */
public enum l5 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(v3.class, v3.class, v3.f4474c),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f4282b;

    l5(Class cls, Class cls2, Object obj) {
        this.f4282b = cls2;
    }

    public final Class<?> a() {
        return this.f4282b;
    }
}
