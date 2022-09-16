package defpackage;
/* compiled from: PG */
/* renamed from: auuw  reason: default package */
/* loaded from: classes2.dex */
public final class auuw extends aopi implements aoqv {
    private static volatile aorb A;
    public static final auuw a;
    private int B;
    private int C;
    private int D;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        auuw auuwVar = new auuw();
        a = auuwVar;
        aopi.registerDefaultInstance(auuw.class, auuwVar);
    }

    private auuw() {
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
                return newMessageInfo(a, "\u0001\u0019\u0000\u0003\u0006E\u0019\u0000\u0000\u0000\u0006ဇ\u0005\bဇ\u0007\u000bဇ\n\u0010ဇ\u000f\u0011ဇ\u0010\u0012င\u0011\u0013င\u0012\u0016ဇ\u0015\u001bဇ\u001a\u001eဇ\u001d&ဇ&'ဇ()ဇ*.င1/ဇ20ဇ31ဇ+4ဇ48ဇ89ဇ0;ဇ:>ဇ=CဇBDဇCEဇD", new Object[]{"B", "C", "D", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "r", "s", "o", "t", "u", "p", "v", "w", "x", "y", "z"});
            case 3:
                return new auuw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = A;
                if (aorbVar == null) {
                    synchronized (auuw.class) {
                        aorbVar = A;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            A = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
