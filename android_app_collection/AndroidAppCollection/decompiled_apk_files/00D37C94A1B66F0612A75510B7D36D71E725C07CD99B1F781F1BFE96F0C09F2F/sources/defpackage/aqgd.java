package defpackage;
/* compiled from: PG */
/* renamed from: aqgd  reason: default package */
/* loaded from: classes2.dex */
public final class aqgd extends aopi implements aoqv {
    public static final aqgd a;
    public static final aopg b;
    private static volatile aorb e;
    public awmt c;
    public awmt d;
    private int f;
    private byte g = 2;

    static {
        aqgd aqgdVar = new aqgd();
        a = aqgdVar;
        aopi.registerDefaultInstance(aqgd.class, aqgdVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aqgdVar, aqgdVar, null, 285132689, aosj.MESSAGE, aqgd.class);
    }

    private aqgd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new aqgd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqgd.class) {
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
