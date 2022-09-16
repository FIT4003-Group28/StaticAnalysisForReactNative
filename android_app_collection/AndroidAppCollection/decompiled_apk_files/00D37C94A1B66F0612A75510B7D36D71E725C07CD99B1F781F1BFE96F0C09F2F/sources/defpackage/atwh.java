package defpackage;
/* compiled from: PG */
/* renamed from: atwh  reason: default package */
/* loaded from: classes2.dex */
public final class atwh extends aopi implements aoqv {
    public static final atwh a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public atwi d;
    public atwj e;
    public atwi f;
    public atwg g;
    public arag h;
    private arag j;
    private arag k;
    private byte l = 2;

    static {
        atwh atwhVar = new atwh();
        a = atwhVar;
        aopi.registerDefaultInstance(atwh.class, atwhVar);
    }

    private atwh() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k"});
            case 3:
                return new atwh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atwh.class) {
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
