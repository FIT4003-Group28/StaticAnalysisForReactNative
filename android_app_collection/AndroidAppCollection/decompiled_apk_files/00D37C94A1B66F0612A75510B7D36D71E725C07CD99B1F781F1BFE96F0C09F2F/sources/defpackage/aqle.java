package defpackage;
/* compiled from: PG */
/* renamed from: aqle  reason: default package */
/* loaded from: classes2.dex */
public final class aqle extends aopi implements aoqv {
    public static final aqle a;
    private static volatile aorb q;
    public int b;
    public int c;
    public int d;
    public aqld e;
    public aqlf f;
    public aqli g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public float m;
    public boolean n;
    public boolean o;
    public float p;

    static {
        aqle aqleVar = new aqle();
        a = aqleVar;
        aopi.registerDefaultInstance(aqle.class, aqleVar);
    }

    private aqle() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u001b\u000e\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0007\u0005င\u0001\bဉ\u0004\nဉ\t\u000bင\n\rင\r\u000eဇ\u000e\u0015ဇ\u0013\u0016ခ\u0014\u0018ဇ\u0016\u0019ဇ\u0017\u001aင\f\u001bခ\u0018", new Object[]{"b", "c", "f", "d", "e", "g", "h", "j", "k", "l", "m", "n", "o", "i", "p"});
            case 3:
                return new aqle();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (aqle.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
