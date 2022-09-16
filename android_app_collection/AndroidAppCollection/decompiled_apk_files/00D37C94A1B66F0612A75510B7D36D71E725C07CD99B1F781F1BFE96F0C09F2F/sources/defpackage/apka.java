package defpackage;
/* compiled from: PG */
/* renamed from: apka  reason: default package */
/* loaded from: classes.dex */
public final class apka extends aopi implements aoqv {
    public static final apka a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public apok f;
    private apzg h;
    private aoux i;
    private byte j = 2;

    static {
        apka apkaVar = new apka();
        a = apkaVar;
        aopi.registerDefaultInstance(apka.class, apkaVar);
    }

    private apka() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "h", "f", "i"});
            case 3:
                return new apka();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apka.class) {
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
