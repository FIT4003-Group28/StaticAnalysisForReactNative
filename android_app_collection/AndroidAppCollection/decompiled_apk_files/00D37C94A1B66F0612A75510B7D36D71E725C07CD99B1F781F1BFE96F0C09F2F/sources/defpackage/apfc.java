package defpackage;
/* compiled from: PG */
/* renamed from: apfc  reason: default package */
/* loaded from: classes.dex */
public final class apfc extends aopi implements aoqv {
    private static volatile aorb D;
    public static final apfc a;
    public boolean A;
    public boolean B;
    public boolean C;
    private int E;
    private int F;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    static {
        apfc apfcVar = new apfc();
        a = apfcVar;
        aopi.registerDefaultInstance(apfc.class, apfcVar);
    }

    private apfc() {
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
                return newMessageInfo(a, "\u0001\u001c\u0000\u0002\u0002&\u001c\u0000\u0000\u0000\u0002ဇ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0007\bဇ\t\tဇ\n\nင\u000b\rင\f\u000eင\u0006\u000fခ\u0004\u0010ဇ\r\u0011ဇ\u000e\u0012ခ\u000f\u0014ခ\u0005\u0016ဇ\u0012\u0017ဇ\u0013\u001aဇ\u0016\u001cဇ\u0017\u001dဇ\u0018\u001eဇ\u0019\u001fဇ\u001a ခ\u001b!ဇ\u001d\"ဇ\u001f#ခ\u001c$ဇ\u001e%ဇ &ဇ!", new Object[]{"E", "F", "b", "c", "d", "h", "i", "j", "k", "l", "g", "e", "m", "n", "o", "f", "p", "q", "r", "s", "t", "u", "v", "w", "y", "A", "x", "z", "B", "C"});
            case 3:
                return new apfc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = D;
                if (aorbVar == null) {
                    synchronized (apfc.class) {
                        aorbVar = D;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            D = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
