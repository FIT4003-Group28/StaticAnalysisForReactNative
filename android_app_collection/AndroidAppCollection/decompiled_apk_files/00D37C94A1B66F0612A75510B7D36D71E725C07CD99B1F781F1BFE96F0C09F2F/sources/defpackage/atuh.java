package defpackage;
/* compiled from: PG */
/* renamed from: atuh  reason: default package */
/* loaded from: classes2.dex */
public final class atuh extends aopi implements aoqv {
    public static final atuh a;
    private static volatile aorb e;
    public int b;
    public arag c;
    public apzg d;
    private aoux f;
    private byte g = 2;

    static {
        atuh atuhVar = new atuh();
        a = atuhVar;
        aopi.registerDefaultInstance(atuh.class, atuhVar);
    }

    private atuh() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new atuh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atuh.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
