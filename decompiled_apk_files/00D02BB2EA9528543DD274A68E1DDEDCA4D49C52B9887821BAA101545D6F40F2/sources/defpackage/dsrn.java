package defpackage;
/* compiled from: PG */
/* renamed from: dsrn  reason: default package */
/* loaded from: classes6.dex */
public enum dsrn {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(dspd.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);
    
    public final Class<?> k;

    static {
        dspd dspdVar = dspd.b;
    }

    dsrn(Class cls) {
        this.k = cls;
    }
}
