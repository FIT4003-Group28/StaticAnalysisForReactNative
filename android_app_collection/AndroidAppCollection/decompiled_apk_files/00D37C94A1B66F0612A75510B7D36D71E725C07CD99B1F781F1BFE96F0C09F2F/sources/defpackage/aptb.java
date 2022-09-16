package defpackage;
/* compiled from: PG */
/* renamed from: aptb  reason: default package */
/* loaded from: classes2.dex */
public final class aptb extends aopi implements aoqv {
    public static final aptb a;
    private static volatile aorb f;
    public arag b;
    public aptd c;
    public aptd d;
    public aptc e;
    private int g;
    private arag h;
    private aoux i;
    private byte j = 2;

    static {
        aptb aptbVar = new aptb();
        a = aptbVar;
        aopi.registerDefaultInstance(aptb.class, aptbVar);
    }

    private aptb() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"g", "b", "c", "d", "h", "e", "i"});
            case 3:
                return new aptb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aptb.class) {
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
