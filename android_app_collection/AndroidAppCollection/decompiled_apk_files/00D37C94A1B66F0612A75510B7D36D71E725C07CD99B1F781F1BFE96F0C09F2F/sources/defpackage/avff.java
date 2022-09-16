package defpackage;
/* compiled from: PG */
/* renamed from: avff  reason: default package */
/* loaded from: classes2.dex */
public final class avff extends aopi implements aoqv {
    public static final avff a;
    private static volatile aorb p;
    public int b;
    public boolean c;
    public avfa d;
    public avfd e;
    public avey f;
    public avex g;
    public avet h;
    public aver i;
    public avew j;
    public avfe k;
    public avfc l;
    public avev m;
    public int n;
    public avez o;

    static {
        avff avffVar = new avff();
        a = avffVar;
        aopi.registerDefaultInstance(avff.class, avffVar);
    }

    private avff() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u001e\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0004\u0004ဉ\u0006\bဉ\b\tဉ\t\rဉ\f\u0017ဉ\u0016\u0018ဉ\u0017\u001aဉ\u0019\u001bင\u001a\u001cဉ\r\u001eဉ\u001c", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "j", "o"});
            case 3:
                return new avff();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (avff.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
