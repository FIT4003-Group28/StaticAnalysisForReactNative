package defpackage;
/* compiled from: PG */
/* renamed from: orh  reason: default package */
/* loaded from: classes4.dex */
public final class orh extends aopi implements aoqv {
    public static final orh a;
    private static volatile aorb k;
    public int b;
    public oqu d;
    public aryz e;
    public int g;
    public int h;
    public ork i;
    public int j;
    private byte l = 2;
    public aopu c = aopi.emptyProtobufList();
    public aoob f = aoob.b;

    static {
        orh orhVar = new orh();
        a = orhVar;
        aopi.registerDefaultInstance(orh.class, orhVar);
    }

    private orh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0001\u0001\u001a\u0002ဉ\u0000\u0003ᐉ\u0001\u0004ည\u0002\u0005င\u0003\u0006င\u0004\nဉ\u0007\rဌ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", aouw.a()});
            case 3:
                return new orh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (orh.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
