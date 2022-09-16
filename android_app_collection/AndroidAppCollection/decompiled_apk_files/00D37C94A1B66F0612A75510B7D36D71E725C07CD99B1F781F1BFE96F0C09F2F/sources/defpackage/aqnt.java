package defpackage;
/* compiled from: PG */
/* renamed from: aqnt  reason: default package */
/* loaded from: classes2.dex */
public final class aqnt extends aopi implements aoqv {
    public static final aqnt a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public aqns d;
    public aqnw e;
    private byte g = 2;

    static {
        aqnt aqntVar = new aqnt();
        a = aqntVar;
        aopi.registerDefaultInstance(aqnt.class, aqntVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqntVar, aqntVar, null, 372117054, aosj.MESSAGE, aqnt.class);
    }

    private aqnt() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new aqnt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqnt.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
