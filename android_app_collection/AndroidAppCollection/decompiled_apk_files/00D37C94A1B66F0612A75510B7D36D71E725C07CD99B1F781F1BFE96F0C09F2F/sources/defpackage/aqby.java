package defpackage;
/* compiled from: PG */
/* renamed from: aqby  reason: default package */
/* loaded from: classes2.dex */
public final class aqby extends aopi implements aoqv {
    public static final aqby a;
    private static volatile aorb e;
    public int b;
    public aqca c;
    public apli d;
    private aufq f;
    private byte g = 2;

    static {
        aqby aqbyVar = new aqby();
        a = aqbyVar;
        aopi.registerDefaultInstance(aqby.class, aqbyVar);
    }

    private aqby() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001ﯠⲵﶭ愤\u0003\u0000\u0000\u0003ﯠⲵᐉ\u0000\ue818㢄ᐉ\u0001ﶭ愤ᐉ\u0002", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new aqby();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqby.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
