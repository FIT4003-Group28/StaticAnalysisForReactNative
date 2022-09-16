package defpackage;
/* compiled from: PG */
/* renamed from: augy  reason: default package */
/* loaded from: classes2.dex */
public final class augy extends aopi implements aoqv {
    public static final augy a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private aunb g;
    private aunb h;
    private arag i;
    private aunb j;
    private aunb k;
    private aunb l;
    private aunb m;
    private aoux n;
    private aunb o;
    private aunb p;
    private byte q = 2;

    static {
        augy augyVar = new augy();
        a = augyVar;
        aopi.registerDefaultInstance(augy.class, augyVar);
    }

    private augy() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u001c\r\u0000\u0000\r\u0001ᐉ\u0000\u0003ᐉ\r\u000bᐉ\f\u000eᐉ\u0011\u000fᐉ\u000e\u0015ᐉ\u0002\u0016ᐉ\u0005\u0017ᐉ\t\u0018ᐉ\b\u0019ᐉ\u0007\u001aᐉ\u000f\u001bᐉ\u0012\u001cᐉ\u0013", new Object[]{"c", "d", "k", "j", "n", "l", "e", "f", "i", "h", "g", "m", "o", "p"});
            case 3:
                return new augy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (augy.class) {
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
