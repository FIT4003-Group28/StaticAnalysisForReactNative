package defpackage;
/* compiled from: PG */
/* renamed from: atzq  reason: default package */
/* loaded from: classes2.dex */
public final class atzq extends aopi implements aoqv {
    public static final atzq a;
    private static volatile aorb l;
    public int b;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public String c = "";
    public aopq d = emptyIntList();
    public boolean k = true;

    static {
        atzq atzqVar = new atzq();
        a = atzqVar;
        aopi.registerDefaultInstance(atzq.class, atzqVar);
    }

    private atzq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u000b\t\u0000\u0001\u0000\u0002\u0016\u0003င\u0001\u0004င\u0003\u0005ဌ\u0005\u0006ဇ\u0002\u0007ဇ\u0004\bဈ\u0000\tဇ\u0007\u000bဌ\u0006", new Object[]{"b", "d", "e", "g", "i", atzp.a(), "f", "h", "c", "k", "j", apps.a()});
            case 3:
                return new atzq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (atzq.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
