package defpackage;
/* compiled from: PG */
/* renamed from: awmd  reason: default package */
/* loaded from: classes2.dex */
public final class awmd extends aopd implements aope {
    public static final awmd a;
    private static volatile aorb q;
    public int b;
    public Object d;
    public int e;
    public int f;
    public float h;
    public int i;
    public int j;
    public boolean k;
    public awme m;
    public float n;
    public int o;
    public int p;
    public int c = 0;
    private byte r = 2;
    public String g = "";

    static {
        awmd awmdVar = new awmd();
        a = awmdVar;
        aopi.registerDefaultInstance(awmd.class, awmdVar);
    }

    private awmd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0000\u0001\u0001ဋ\u0000\u0002ဋ\u0001\u0004ခ\u0004\u0005ဋ\u0005\u0006ဌ\u0006\u0007ှ\u0000\bဿ\u0000\tဇ\t\nᐉ\n\u000bခ\u000b\fဌ\f\rဌ\r\u000eဈ\u0003", new Object[]{"d", "c", "b", "e", "f", "h", "i", "j", awkk.f, awkk.e, "k", "m", "n", "o", awkk.f, "p", awkk.d, "g"});
            case 3:
                return new awmd();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (awmd.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
