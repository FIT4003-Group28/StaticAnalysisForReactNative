package defpackage;
/* compiled from: PG */
/* renamed from: apwe  reason: default package */
/* loaded from: classes2.dex */
public final class apwe extends aopi implements aoqv {
    public static final aopr a = new uil(13);
    public static final apwe b;
    private static volatile aorb l;
    public int c;
    public int f;
    public aqkg j;
    public String d = "";
    public String e = "";
    public aopq g = emptyIntList();
    public String h = "";
    public String i = "";
    public String k = "";

    static {
        apwe apweVar = new apwe();
        b = apweVar;
        aopi.registerDefaultInstance(apwe.class, apweVar);
    }

    private apwe() {
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
                return newMessageInfo(b, "\u0001\b\u0000\u0001\u0003\n\b\u0000\u0001\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဌ\u0003\u0006\u001e\u0007ဈ\u0004\bဈ\u0005\tဉ\u0006\nဈ\u0007", new Object[]{"c", "d", "e", "f", apvq.e, "g", aoxn.a(), "h", "i", "j", "k"});
            case 3:
                return new apwe();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (apwe.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
