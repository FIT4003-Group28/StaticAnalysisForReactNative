package defpackage;
/* compiled from: PG */
/* renamed from: aveq  reason: default package */
/* loaded from: classes2.dex */
public final class aveq extends aopi implements aoqv {
    public static final aveq a;
    private static volatile aorb v;
    public int b;
    public apga c;
    public apet d;
    public apgs e;
    public boolean f;
    public apgx g;
    public int h;
    public boolean i;
    public int j;
    public boolean k;
    public float l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public long u;
    private int w;

    static {
        aveq aveqVar = new aveq();
        a = aveqVar;
        aopi.registerDefaultInstance(aveq.class, aveqVar);
    }

    private aveq() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0002\u0001#\u0013\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\bဇ\u0007\rဉ\f\u0010င\r\u0013ဇ\u0010\u0015င\u0012\u0017ဇ\u0014\u0018ခ\u0015\u0019ဇ\u0016\u001aဂ\u0017\u001bဇ\u0018\u001cဇ\u0019\u001dဇ\u001a\u001eဂ\u001b!ဌ\u001e\"ဂ\u001f#ဂ ", new Object[]{"b", "w", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", apfa.c, "t", "u"});
            case 3:
                return new aveq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (aveq.class) {
                        aorbVar = v;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            v = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
