package defpackage;
/* compiled from: PG */
/* renamed from: auxm  reason: default package */
/* loaded from: classes2.dex */
public final class auxm extends aopi implements aoqv {
    public static final auxm a;
    private static volatile aorb n;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public apmg f;
    public apmg g;
    public apzg j;
    public int k;
    public int l;
    public auxl m;
    private aoux o;
    private aunb p;
    private byte q = 2;
    public aopu h = emptyProtobufList();
    public aoob i = aoob.b;

    static {
        auxm auxmVar = new auxm();
        a = auxmVar;
        aopi.registerDefaultInstance(auxm.class, auxmVar);
    }

    private auxm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0005\bည\u0006\tᐉ\u0007\nᐉ\b\u000bဌ\t\fဌ\n\rဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", aplw.class, "o", "i", "p", "j", "k", auwh.g, "l", arhr.a(), "m"});
            case 3:
                return new auxm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (auxm.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
