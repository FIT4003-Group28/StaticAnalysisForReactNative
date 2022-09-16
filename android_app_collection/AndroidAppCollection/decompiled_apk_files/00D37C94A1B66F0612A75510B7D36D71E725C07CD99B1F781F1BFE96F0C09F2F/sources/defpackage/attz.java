package defpackage;
/* compiled from: PG */
/* renamed from: attz  reason: default package */
/* loaded from: classes2.dex */
public final class attz extends aopi implements aoqv {
    public static final attz a;
    private static volatile aorb h;
    public int b;
    public String c = "";
    public attx d;
    public atua e;
    public aqke f;
    public attw g;
    private int i;

    static {
        attz attzVar = new attz();
        a = attzVar;
        aopi.registerDefaultInstance(attz.class, attzVar);
    }

    private attz() {
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0002\u00012\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0014ဉ\u0011\u001bဉ\u00172ဉ)", new Object[]{"b", "i", "c", "d", "e", "f", "g"});
            case 3:
                return new attz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (attz.class) {
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
