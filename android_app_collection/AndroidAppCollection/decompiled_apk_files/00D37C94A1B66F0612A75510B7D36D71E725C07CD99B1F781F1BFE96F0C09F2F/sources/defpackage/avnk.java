package defpackage;
/* compiled from: PG */
/* renamed from: avnk  reason: default package */
/* loaded from: classes2.dex */
public final class avnk extends aopi implements aoqv {
    public static final avnk a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public arag d;
    public aunb e;
    private aoux g;
    private byte h = 2;

    static {
        avnk avnkVar = new avnk();
        a = avnkVar;
        aopi.registerDefaultInstance(avnk.class, avnkVar);
    }

    private avnk() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "g", "e"});
            case 3:
                return new avnk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avnk.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
