package defpackage;
/* compiled from: PG */
/* renamed from: aupg  reason: default package */
/* loaded from: classes2.dex */
public final class aupg extends aopi implements aoqv {
    public static final aupg a;
    private static volatile aorb g;
    public boolean c;
    public boolean e;
    private int h;
    public String b = "";
    public String d = "";
    public String f = "";

    static {
        aupg aupgVar = new aupg();
        a = aupgVar;
        aopi.registerDefaultInstance(aupg.class, aupgVar);
    }

    private aupg() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ဈ\u0005", new Object[]{"h", "b", "c", "d", "e", "f"});
            case 3:
                return new aupg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aupg.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
