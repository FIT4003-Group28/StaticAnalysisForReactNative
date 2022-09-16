package defpackage;
/* compiled from: PG */
/* renamed from: smd  reason: default package */
/* loaded from: classes4.dex */
public final class smd extends aopi implements aoqv {
    public static final smd a;
    private static volatile aorb e;
    public int b;
    public smr d;
    private boolean f;
    private byte g = 2;
    public String c = "";

    static {
        smd smdVar = new smd();
        a = smdVar;
        aopi.registerDefaultInstance(smd.class, smdVar);
    }

    private smd() {
    }

    public static /* synthetic */ void a(smd smdVar) {
        smdVar.b |= 4;
        smdVar.f = true;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new smd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (smd.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
