package defpackage;
/* compiled from: PG */
/* renamed from: avpn  reason: default package */
/* loaded from: classes2.dex */
public final class avpn extends aopi implements aoqv {
    public static final avpn a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private aunb f;
    private aunb g;
    private aoux h;
    private byte i = 2;

    static {
        avpn avpnVar = new avpn();
        a = avpnVar;
        aopi.registerDefaultInstance(avpn.class, avpnVar);
    }

    private avpn() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\f\u0005\u0000\u0000\u0005\u0003ᐉ\u0004\u0004ᐉ\u0005\u0006ᐉ\u000b\u000bᐉ\b\fᐉ\t", new Object[]{"c", "d", "e", "h", "f", "g"});
            case 3:
                return new avpn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpn.class) {
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
