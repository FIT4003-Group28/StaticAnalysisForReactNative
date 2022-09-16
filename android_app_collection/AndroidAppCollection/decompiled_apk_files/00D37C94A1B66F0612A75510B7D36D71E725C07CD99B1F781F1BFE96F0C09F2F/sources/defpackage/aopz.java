package defpackage;
/* compiled from: PG */
/* renamed from: aopz  reason: default package */
/* loaded from: classes.dex */
public enum aopz {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(aoob.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);
    
    public final Class k;

    static {
        aoob aoobVar = aoob.b;
    }

    aopz(Class cls) {
        this.k = cls;
    }
}
