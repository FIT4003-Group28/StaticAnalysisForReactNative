package defpackage;
/* compiled from: PG */
/* renamed from: aqfn  reason: default package */
/* loaded from: classes2.dex */
public final class aqfn extends aopi implements aoqv {
    public static final aqfn a;
    private static volatile aorb k;
    public int b;
    public aqrw c;
    public aqfo d;
    public aqxk e;
    public int f;
    public int g;
    public aqfp h;
    public aqrw i;
    public boolean j;
    private augf l;

    static {
        aqfn aqfnVar = new aqfn();
        a = aqfnVar;
        aopi.registerDefaultInstance(aqfn.class, aqfnVar);
    }

    private aqfn() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0006ဉ\u0005\bင\b\tင\u0006\nဉ\t\fဉ\n\rဇ\u000b", new Object[]{"b", "c", "d", "l", "e", "g", "f", "h", "i", "j"});
            case 3:
                return new aqfn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aqfn.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
