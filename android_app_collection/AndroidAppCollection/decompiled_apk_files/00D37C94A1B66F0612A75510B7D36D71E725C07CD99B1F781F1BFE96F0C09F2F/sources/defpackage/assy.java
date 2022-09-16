package defpackage;
/* compiled from: PG */
/* renamed from: assy  reason: default package */
/* loaded from: classes2.dex */
public final class assy extends aopi implements aoqv {
    public static final assy a;
    private static volatile aorb h;
    public arag b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private int i;
    private byte j = 2;

    static {
        assy assyVar = new assy();
        a = assyVar;
        aopi.registerDefaultInstance(assy.class, assyVar);
    }

    private assy() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new assy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (assy.class) {
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
