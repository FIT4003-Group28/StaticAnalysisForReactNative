package defpackage;
/* compiled from: PG */
/* renamed from: apdl  reason: default package */
/* loaded from: classes.dex */
public final class apdl extends aopi implements aoqv {
    public static final aopr a = new uil(9);
    public static final apdl b;
    private static volatile aorb r;
    public int c;
    public aopu d = emptyProtobufList();
    public aopq e = emptyIntList();
    public aoxx f;
    public boolean g;
    public boolean h;
    public atvr i;
    public float j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    private int s;

    static {
        apdl apdlVar = new apdl();
        b = apdlVar;
        aopi.registerDefaultInstance(apdl.class, apdlVar);
    }

    private apdl() {
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
                return newMessageInfo(b, "\u0001\u000e\u0000\u0002\u0002%\u000e\u0000\u0002\u0000\u0002\u001b\u0005\u001e\rဉ\t\u000eဇ\n\u000fဇ\u000b\u0013ဉ\u000f\u0015ခ\u0011\u0016ဇ\u0012\u001bဇ\u0017\u001eဇ\u001a ဇ\u001c!ဇ\u001d$ဇ %ဇ!", new Object[]{"c", "s", "d", apge.class, "e", apel.a(), "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case 3:
                return new apdl();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (apdl.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
