package defpackage;
/* compiled from: PG */
/* renamed from: apwv  reason: default package */
/* loaded from: classes2.dex */
public final class apwv extends aopi implements aoqv {
    public static final apwv a;
    private static volatile aorb h;
    public int b;
    public boolean d;
    public apxa e;
    public boolean f;
    public apww g;
    private byte i = 2;
    public String c = "";

    static {
        apwv apwvVar = new apwv();
        a = apwvVar;
        aopi.registerDefaultInstance(apwv.class, apwvVar);
    }

    private apwv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new apwv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apwv.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
