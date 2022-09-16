package defpackage;
/* compiled from: PG */
/* renamed from: auyv  reason: default package */
/* loaded from: classes2.dex */
public final class auyv extends aopi implements aoqv {
    public static final auyv a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public aunb f;
    public aunb g;
    public arag h;
    public arag i;
    public aunb j;
    public arag k;
    public boolean l;
    private arag n;
    private arag o;
    private aunb p;
    private aunb q;
    private aunb r;
    private byte s = 2;

    static {
        auyv auyvVar = new auyv();
        a = auyvVar;
        aopi.registerDefaultInstance(auyv.class, auyvVar);
    }

    private auyv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\u0007\bᐉ\u0004\tᐉ\n\nဇ\u000b\u000bᐉ\u0003\fᐉ\f\rᐉ\t\u000fᐉ\u000e\u0010ᐉ\u000f", new Object[]{"b", "c", "n", "d", "g", "h", "j", "i", "f", "k", "l", "e", "p", "o", "q", "r"});
            case 3:
                return new auyv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (auyv.class) {
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
