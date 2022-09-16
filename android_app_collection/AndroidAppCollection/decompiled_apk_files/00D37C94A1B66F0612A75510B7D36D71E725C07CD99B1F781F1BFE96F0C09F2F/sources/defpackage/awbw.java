package defpackage;
/* compiled from: PG */
/* renamed from: awbw  reason: default package */
/* loaded from: classes2.dex */
public final class awbw extends aopi implements aoqv {
    public static final awbw a;
    private static volatile aorb o;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public boolean j;
    public String k = "";
    public String l = "";
    public boolean m;
    public boolean n;
    private int p;

    static {
        awbw awbwVar = new awbw();
        a = awbwVar;
        aopi.registerDefaultInstance(awbw.class, awbwVar);
    }

    private awbw() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0015\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0007ဇ\u0006\fဇ\u000b\u000eဇ\r\u000fခ\u000e\u0010ဇ\u000f\u0011ဈ\u0010\u0012ဈ\u0011\u0014ဇ\u0013\u0015ဇ\u0014", new Object[]{"p", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new awbw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (awbw.class) {
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
