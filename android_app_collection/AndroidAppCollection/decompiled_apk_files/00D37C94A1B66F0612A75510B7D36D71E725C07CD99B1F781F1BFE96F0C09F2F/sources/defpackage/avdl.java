package defpackage;
/* compiled from: PG */
/* renamed from: avdl  reason: default package */
/* loaded from: classes2.dex */
public final class avdl extends aopi implements aoqv {
    public static final avdl a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public avdm d;
    public apok e;
    public apok f;
    public int g;
    private aoux j;
    private byte k = 2;
    public aoob h = aoob.b;

    static {
        avdl avdlVar = new avdl();
        a = avdlVar;
        aopi.registerDefaultInstance(avdl.class, avdlVar);
    }

    private avdl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ᐉ\u0005\u0007ည\u0006", new Object[]{"b", "c", "d", "e", "f", "g", avcd.i, "j", "h"});
            case 3:
                return new avdl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avdl.class) {
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
