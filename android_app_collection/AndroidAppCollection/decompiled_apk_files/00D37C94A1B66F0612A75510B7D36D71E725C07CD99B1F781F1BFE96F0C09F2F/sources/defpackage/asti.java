package defpackage;
/* compiled from: PG */
/* renamed from: asti  reason: default package */
/* loaded from: classes2.dex */
public final class asti extends aopi implements aoqv {
    public static final asti a;
    private static volatile aorb l;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    static {
        asti astiVar = new asti();
        a = astiVar;
        aopi.registerDefaultInstance(asti.class, astiVar);
    }

    private asti() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0002\u0003ဃ\u0003\u0004ဇ\u0004\u0005ဇ\u0005\u0006ဇ\u0006\u0007ဌ\u0007\nဌ\n\fဇ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", asnz.s, "j", asnz.q, "k"});
            case 3:
                return new asti();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (asti.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
