package defpackage;
/* compiled from: PG */
/* renamed from: aqgr  reason: default package */
/* loaded from: classes2.dex */
public final class aqgr extends aopi implements aoqv {
    public static final aqgr a;
    private static volatile aorb h;
    public int b;
    public Object d;
    public arhs e;
    public aovr f;
    public aqgq g;
    private aoux i;
    public int c = 0;
    private byte j = 2;

    static {
        aqgr aqgrVar = new aqgr();
        a = aqgrVar;
        aopi.registerDefaultInstance(aqgr.class, aqgrVar);
    }

    private aqgr() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ဉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"d", "c", "b", "e", apzg.class, apzg.class, "f", "i", "g"});
            case 3:
                return new aqgr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqgr.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
