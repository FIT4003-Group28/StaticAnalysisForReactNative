package defpackage;
/* compiled from: PG */
/* renamed from: aqnb  reason: default package */
/* loaded from: classes2.dex */
public final class aqnb extends aopi implements aoqv {
    private static volatile aorb A;
    public static final aqnb a;
    private arag B;
    private arag C;
    private arag D;
    private arag E;
    private arag F;
    private arag G;
    private aoux H;
    public int b;
    public arag c;
    public arag d;
    public avhn e;
    public apok f;
    public float g;
    public arag h;
    public arag i;
    public arag j;
    public arag k;
    public apok l;
    public arag m;
    public arag n;
    public arag o;
    public arag r;
    public arag s;
    public long t;
    public long u;
    public arag v;
    public arag w;
    public boolean x;
    private byte I = 2;
    public aopu p = emptyProtobufList();
    public aopu q = emptyProtobufList();
    public String y = "";
    public aoob z = aoob.b;

    static {
        aqnb aqnbVar = new aqnb();
        a = aqnbVar;
        aopi.registerDefaultInstance(aqnb.class, aqnbVar);
    }

    private aqnb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.I);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.I = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001f\u0000\u0001\u0001%\u001f\u0000\u0002\u0019\u0001ᐉ\u0004\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\b\u0005ခ\t\u0006ᐉ\n\u0007ᐉ\u000b\bᐉ\u000e\tᐉ\u001e\nည\u001f\fᐉ\u0012\rᐉ\u0007\u000eᐉ\u000f\u000fᐉ\u0010\u0010ᐉ\u0011\u0013ᐉ\u0013\u0014ᐉ\u0014\u0015Л\u0016Л\u0017ᐉ\u0015\u0018ᐉ\u0016\u0019ဂ\u0017\u001aဂ\u0018\u001bᐉ\u0019\u001cᐉ\u001a\u001dᐉ\f\u001fᐉ\u0001\"ᐉ\r#ဈ\u001d$ᐉ\u001b%ဇ\u001c", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "l", "H", "z", "D", "C", "m", "n", "o", "E", "F", "q", aqnd.class, "p", aqmz.class, "r", "s", "t", "u", "v", "G", "j", "B", "k", "y", "w", "x"});
            case 3:
                return new aqnb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = A;
                if (aorbVar == null) {
                    synchronized (aqnb.class) {
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
