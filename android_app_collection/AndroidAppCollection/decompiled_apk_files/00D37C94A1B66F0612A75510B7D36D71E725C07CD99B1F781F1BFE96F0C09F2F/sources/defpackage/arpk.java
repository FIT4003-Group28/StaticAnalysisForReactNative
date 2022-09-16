package defpackage;
/* compiled from: PG */
/* renamed from: arpk  reason: default package */
/* loaded from: classes2.dex */
public final class arpk extends aopi implements aoqv {
    public static final arpk a;
    private static volatile aorb i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public String f = "";
    public String h = "";

    static {
        arpk arpkVar = new arpk();
        a = arpkVar;
        aopi.registerDefaultInstance(arpk.class, arpkVar);
    }

    private arpk() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဈ\u0003\u0004ဇ\u0004\u0005ဈ\u0005\u0006ဇ\u0001", new Object[]{"b", "c", "e", "f", "g", "h", "d"});
            case 3:
                return new arpk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arpk.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
