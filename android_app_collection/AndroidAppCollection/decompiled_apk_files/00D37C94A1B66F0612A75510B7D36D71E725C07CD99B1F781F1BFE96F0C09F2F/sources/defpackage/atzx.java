package defpackage;
/* compiled from: PG */
/* renamed from: atzx  reason: default package */
/* loaded from: classes2.dex */
public final class atzx extends aopi implements aoqv {
    public static final atzx a;
    private static volatile aorb h;
    public int b;
    public Object d;
    public atzz e;
    public aunb f;
    public boolean g;
    private auab i;
    public int c = 0;
    private byte j = 2;

    static {
        atzx atzxVar = new atzx();
        a = atzxVar;
        aopi.registerDefaultInstance(atzx.class, atzxVar);
    }

    private atzx() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ှ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ျ\u0000\u0006ဇ\u0005", new Object[]{"d", "c", "b", "i", "e", "f", "g"});
            case 3:
                return new atzx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atzx.class) {
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
