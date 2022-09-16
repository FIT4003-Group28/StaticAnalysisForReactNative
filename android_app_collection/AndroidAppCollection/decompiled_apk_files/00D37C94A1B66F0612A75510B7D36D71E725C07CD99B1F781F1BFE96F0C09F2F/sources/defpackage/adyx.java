package defpackage;
/* compiled from: PG */
/* renamed from: adyx  reason: default package */
/* loaded from: classes.dex */
public final class adyx extends aopi implements aoqv {
    public static final adyx a;
    private static volatile aorb u;
    public int b;
    public double d;
    public auom f;
    public atzv g;
    public asan h;
    public asap i;
    public boolean j;
    public boolean q;
    private byte v = 2;
    public String c = "";
    public String e = "";
    public String k = "";
    public String l = "";
    public aoob m = aoob.b;
    public aoob n = aoob.b;
    public aoob o = aoob.b;
    public aoob p = aoob.b;
    public aopu r = emptyProtobufList();
    public aopu s = emptyProtobufList();
    public aopu t = emptyProtobufList();

    static {
        adyx adyxVar = new adyx();
        a = adyxVar;
        aopi.registerDefaultInstance(adyx.class, adyxVar);
    }

    private adyx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0003\u0003\u0001ဈ\u0000\u0002က\u0001\u0004ဈ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ဇ\b\bဈ\t\tဈ\n\nည\u000b\u000bည\f\fဇ\u000f\r\u001b\u000e\u001b\u000f\u001b\u0011ဉ\u0004\u0012ည\r\u0014ည\u000e\u0015ᐉ\u0007", new Object[]{"b", "c", "d", "e", "g", "h", "j", "k", "l", "m", "n", "q", "r", ajfw.class, "s", ajfw.class, "t", ajfw.class, "f", "o", "p", "i"});
            case 3:
                return new adyx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = u;
                if (aorbVar == null) {
                    synchronized (adyx.class) {
                        aorbVar = u;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            u = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
