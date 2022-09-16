package defpackage;
/* compiled from: PG */
/* renamed from: augb  reason: default package */
/* loaded from: classes2.dex */
public final class augb extends aopi implements aoqv {
    public static final augb a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private arag f;
    private aunb g;
    private aunb h;
    private aunb i;
    private arag j;
    private arag k;
    private aunb l;
    private aunb m;
    private aunb n;
    private aoux o;
    private aunb p;
    private apzg q;
    private byte r = 2;

    static {
        augb augbVar = new augb();
        a = augbVar;
        aopi.registerDefaultInstance(augb.class, augbVar);
    }

    private augb() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.r = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0003\u0017\u000e\u0000\u0000\u000e\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\u000eᐉ\r\u000fᐉ\u000e\u0011ᐉ\u000f\u0014ᐉ\u0011\u0016ᐉ\u0014\u0017ᐉ\u0015", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case 3:
                return new augb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (augb.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
