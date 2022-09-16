package defpackage;
/* compiled from: PG */
/* renamed from: apyp  reason: default package */
/* loaded from: classes2.dex */
public final class apyp extends aopi implements aoqv {
    public static final apyp a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aunb e;
    private aunb f;
    private aunb g;
    private aunb h;
    private aunb i;
    private aoux j;
    private byte k = 2;

    static {
        apyp apypVar = new apyp();
        a = apypVar;
        aopi.registerDefaultInstance(apyp.class, apypVar);
    }

    private apyp() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002ᐉ\t\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0001\tᐉ\u0006\nᐉ\u0007", new Object[]{"c", "j", "e", "f", "g", "d", "h", "i"});
            case 3:
                return new apyp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apyp.class) {
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
