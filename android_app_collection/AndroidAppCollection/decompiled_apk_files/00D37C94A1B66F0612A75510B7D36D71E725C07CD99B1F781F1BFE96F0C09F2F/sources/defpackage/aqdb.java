package defpackage;
/* compiled from: PG */
/* renamed from: aqdb  reason: default package */
/* loaded from: classes2.dex */
public final class aqdb extends aopi implements aoqv {
    public static final aopr a = new uil(15);
    public static final aqdb b;
    private static volatile aorb j;
    public boolean d;
    public boolean e;
    public int g;
    public boolean h;
    public boolean i;
    private int k;
    public String c = "";
    public aopq f = emptyIntList();

    static {
        aqdb aqdbVar = new aqdb();
        b = aqdbVar;
        aopi.registerDefaultInstance(aqdb.class, aqdbVar);
    }

    private aqdb() {
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
                return newMessageInfo(b, "\u0001\u0007\u0000\u0001\u0003\u000f\u0007\u0000\u0001\u0000\u0003ဈ\u0002\u0004ဇ\u0003\nဇ\n\u000b\u001e\fင\u000b\u000eဇ\f\u000fဇ\r", new Object[]{"k", "c", "d", "e", "f", apwf.a(), "g", "h", "i"});
            case 3:
                return new aqdb();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqdb.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
