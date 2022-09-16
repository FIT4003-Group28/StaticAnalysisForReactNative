package defpackage;
/* compiled from: PG */
/* renamed from: auld  reason: default package */
/* loaded from: classes2.dex */
public final class auld extends aopi implements aoqv {
    public static final auld a;
    private static volatile aorb m;
    public int b;
    public boolean c;
    public aull d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    static {
        auld auldVar = new auld();
        a = auldVar;
        aopi.registerDefaultInstance(auld.class, auldVar);
    }

    private auld() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001!\n\u0000\u0000\u0000\u0001ဇ\u0000\fဉ\t\u000eဇ\u000b\u0016ဇ\u0010\u0017ဇ\u0012\u001aဇ\u0015\u001bဇ\u0016\u001dဇ\u0018\u001eဇ\u0011!ဇ\u001b", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "k", "g", "l"});
            case 3:
                return new auld();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (auld.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
