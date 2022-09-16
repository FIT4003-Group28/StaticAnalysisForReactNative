package defpackage;
/* compiled from: PG */
/* renamed from: asxs  reason: default package */
/* loaded from: classes2.dex */
public final class asxs extends aopi implements aoqv {
    public static final asxs a;
    private static volatile aorb m;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public String j = "";
    public boolean k;
    public boolean l;

    static {
        asxs asxsVar = new asxs();
        a = asxsVar;
        aopi.registerDefaultInstance(asxs.class, asxsVar);
    }

    private asxs() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\bဌ\u0007\tဈ\b\nဇ\t\u000bဇ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", asut.s, "j", "k", "l"});
            case 3:
                return new asxs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (asxs.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
