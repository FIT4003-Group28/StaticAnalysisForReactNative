package defpackage;
/* compiled from: PG */
/* renamed from: avpk  reason: default package */
/* loaded from: classes2.dex */
public final class avpk extends aopi implements aoqv {
    public static final avpk a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private aunb f;
    private aunb g;
    private aoux h;
    private aunb i;
    private byte j = 2;

    static {
        avpk avpkVar = new avpk();
        a = avpkVar;
        aopi.registerDefaultInstance(avpk.class, avpkVar);
    }

    private avpk() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002ᐉ\u0003\u0003ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u0001\u0007ᐉ\u0002\bᐉ\u0007", new Object[]{"c", "f", "g", "h", "d", "e", "i"});
            case 3:
                return new avpk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpk.class) {
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
