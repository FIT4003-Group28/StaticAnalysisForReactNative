package defpackage;
/* compiled from: PG */
/* renamed from: aucg  reason: default package */
/* loaded from: classes2.dex */
public final class aucg extends aopi implements aoqv {
    public static final aucg a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private apzg e;
    private apzg f;
    private arag g;
    private arag h;
    private aueo i;
    private auch j;
    private aoux k;
    private byte l = 2;

    static {
        aucg aucgVar = new aucg();
        a = aucgVar;
        aopi.registerDefaultInstance(aucg.class, aucgVar);
    }

    private aucg() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\r\b\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000b\rᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new aucg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aucg.class) {
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
