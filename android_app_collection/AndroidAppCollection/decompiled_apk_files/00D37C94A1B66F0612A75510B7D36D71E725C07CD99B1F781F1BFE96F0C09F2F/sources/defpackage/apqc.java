package defpackage;
/* compiled from: PG */
/* renamed from: apqc  reason: default package */
/* loaded from: classes2.dex */
public final class apqc extends aopi implements aoqv {
    public static final apqc a;
    private static volatile aorb h;
    public int b;
    public Object d;
    public avhn e;
    public int f;
    public int g;
    public int c = 0;
    private byte i = 2;

    static {
        apqc apqcVar = new apqc();
        a = apqcVar;
        aopi.registerDefaultInstance(apqc.class, apqcVar);
    }

    private apqc() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐉ\u0002\u0004င\u0004\u0005င\u0005\u0006ᐼ\u0000", new Object[]{"d", "c", "b", avhn.class, "e", "f", "g", appy.class});
            case 3:
                return new apqc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apqc.class) {
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
