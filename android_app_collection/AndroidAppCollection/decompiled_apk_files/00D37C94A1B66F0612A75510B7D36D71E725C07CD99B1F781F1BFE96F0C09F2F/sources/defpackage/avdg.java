package defpackage;
/* compiled from: PG */
/* renamed from: avdg  reason: default package */
/* loaded from: classes2.dex */
public final class avdg extends aopi implements aoqv {
    public static final avdg a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public apzg d;
    public boolean f;
    private aoux h;
    private byte i = 2;
    public aoob e = aoob.b;

    static {
        avdg avdgVar = new avdg();
        a = avdgVar;
        aopi.registerDefaultInstance(avdg.class, avdgVar);
    }

    private avdg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ည\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", "h", "e", "f"});
            case 3:
                return new avdg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avdg.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
