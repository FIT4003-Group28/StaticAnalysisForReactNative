package defpackage;
/* compiled from: PG */
/* renamed from: apdq  reason: default package */
/* loaded from: classes.dex */
public final class apdq extends aopi implements aoqv {
    public static final apdq a;
    private static volatile aorb v;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    private int w;
    private int x;
    private int y;

    static {
        apdq apdqVar = new apdq();
        a = apdqVar;
        aopi.registerDefaultInstance(apdq.class, apdqVar);
    }

    private apdq() {
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
                return newMessageInfo(a, "\u0001\u0014\u0000\u00033\u009a\u0014\u0000\u0000\u00003ဇ\u00104ဇ\u0011qဇ!|ဇ,~ဇ/\u0080ဇ1\u0082ဇ3\u0083ဇ.\u0086ဇ6\u0087ဇ7\u0088ဇ8\u008cဇ<\u008dဇ=\u008eဇ>\u008fဇ?\u0090ဇ@\u0094ဇD\u0096ဇF\u0099ဇI\u009aဇJ", new Object[]{"w", "x", "y", "b", "c", "d", "e", "g", "h", "i", "f", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
            case 3:
                return new apdq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (apdq.class) {
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
