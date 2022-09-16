package defpackage;
/* compiled from: PG */
/* renamed from: apzk  reason: default package */
/* loaded from: classes2.dex */
public final class apzk extends aopi implements aoqv {
    public static final apzk a;
    private static volatile aorb i;
    public int b;
    public apok c;
    public apok d;
    public apok e;
    public aqjj f;
    public aunb g;
    public long h;
    private aunb j;
    private aunb k;
    private apok l;
    private apzm m;
    private apok n;
    private apzm o;
    private apok p;
    private apzm q;
    private apok r;
    private apzm s;
    private apzm t;
    private aoux u;
    private byte v = 2;

    static {
        apzk apzkVar = new apzk();
        a = apzkVar;
        aopi.registerDefaultInstance(apzk.class, apzkVar);
    }

    private apzk() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0000\u0011\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\n\u0004ᐉ\u0006\u0005ᐉ\b\u0006ᐉ\f\u0007ᐉ\u0001\tᐉ\u0013\nᐉ\u0007\u000bᐉ\t\fᐉ\u000b\rᐉ\r\u000eᐉ\u000e\u000fᐉ\u0005\u0010ဂ\u0011\u0011ᐉ\u0004\u0013ᐉ\u0003\u0014ᐉ\u000f", new Object[]{"b", "c", "e", "p", "l", "n", "r", "d", "u", "m", "o", "q", "s", "t", "f", "h", "k", "j", "g"});
            case 3:
                return new apzk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apzk.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
