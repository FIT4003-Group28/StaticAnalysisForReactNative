package defpackage;
/* compiled from: PG */
/* renamed from: atmt  reason: default package */
/* loaded from: classes2.dex */
public final class atmt extends aopi implements aoqv {
    public static final atmt a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private arag e;
    private arag f;
    private arag g;
    private apzg h;
    private apzg i;
    private aunb j;
    private aunb k;
    private aunb l;
    private aunb m;
    private aunb n;
    private aunb o;
    private aunb p;
    private aoux q;
    private byte r = 2;

    static {
        atmt atmtVar = new atmt();
        a = atmtVar;
        aopi.registerDefaultInstance(atmt.class, atmtVar);
    }

    private atmt() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0018\u000e\u0000\u0000\u000e\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0010\bᐉ\u000b\nᐉ\u0004\u000bᐉ\b\u0010ᐉ\u0006\u0011ᐉ\t\u0014ᐉ\u0007\u0016ᐉ\n\u0017ᐉ\f\u0018ᐉ\u000e", new Object[]{"c", "d", "e", "f", "h", "q", "n", "g", "k", "i", "l", "j", "m", "o", "p"});
            case 3:
                return new atmt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atmt.class) {
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
