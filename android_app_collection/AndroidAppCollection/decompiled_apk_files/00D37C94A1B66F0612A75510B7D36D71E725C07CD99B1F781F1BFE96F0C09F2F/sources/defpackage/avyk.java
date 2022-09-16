package defpackage;
/* compiled from: PG */
/* renamed from: avyk  reason: default package */
/* loaded from: classes2.dex */
public final class avyk extends aopi implements aoqv {
    public static final avyk a;
    private static volatile aorb o;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    private int p;
    private int q;

    static {
        avyk avykVar = new avyk();
        a = avykVar;
        aopi.registerDefaultInstance(avyk.class, avykVar);
    }

    private avyk() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0002\u0005.\r\u0000\u0000\u0000\u0005ဇ\u0004\tဇ\b\nဇ\t\u000bဇ\n\u0012ဇ\u0011\u001cဇ\u001b\u001dဌ\u001c\u001fဇ\u001e ဇ\u001f$ဇ#'ဇ&)ဇ(.ဇ-", new Object[]{"p", "q", "b", "c", "d", "e", "f", "g", "h", avxs.e, "i", "j", "k", "l", "m", "n"});
            case 3:
                return new avyk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (avyk.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
