package defpackage;
/* compiled from: PG */
/* renamed from: apjk  reason: default package */
/* loaded from: classes.dex */
public final class apjk extends aopi implements aoqv {
    public static final apjk a;
    private static volatile aorb f;
    public int b;
    public apzg c;
    public boolean d;
    public boolean e;
    private aoux g;
    private byte h = 2;

    static {
        apjk apjkVar = new apjk();
        a = apjkVar;
        aopi.registerDefaultInstance(apjk.class, apjkVar);
    }

    private apjk() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new apjk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apjk.class) {
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
