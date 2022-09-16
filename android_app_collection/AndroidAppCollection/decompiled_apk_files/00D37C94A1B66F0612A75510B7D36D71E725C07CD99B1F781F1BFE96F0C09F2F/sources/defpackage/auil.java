package defpackage;
/* compiled from: PG */
/* renamed from: auil  reason: default package */
/* loaded from: classes2.dex */
public final class auil extends aopi implements aoqv {
    private static volatile aorb A;
    public static final auil a;
    public int b;
    public avhn c;
    public avhn d;
    public aunb e;
    public arhs f;
    public arag g;
    public arag h;
    public float i;
    public arag j;
    public arag k;
    public arag l;
    public aunb m;
    public long n;
    public aunb o;
    public boolean p;
    public apzg q;
    public aunb s;
    public long t;
    public apnp u;
    public boolean w;
    public auhy x;
    public auij y;
    public boolean z;
    private byte B = 2;
    public aopu r = emptyProtobufList();
    public aopu v = emptyProtobufList();

    static {
        auil auilVar = new auil();
        a = auilVar;
        aopi.registerDefaultInstance(auil.class, auilVar);
    }

    private auil() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0002\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ခ\u0006\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000f\fЛ\rᐉ\u0010\u000eဂ\u0011\u000fဉ\u0012\u0010Л\u0011ဇ\u0013\u0012ᐉ\u000b\u0014ဉ\u0015\u0015ဉ\u0016\u0018ဇ\u0018\u0019ᐉ\r\u001aဂ\f\u001bဇ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "q", "r", apzg.class, "s", "t", "u", "v", apzg.class, "w", "m", "x", "y", "z", "o", "n", "p"});
            case 3:
                return new auil();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = A;
                if (aorbVar == null) {
                    synchronized (auil.class) {
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
