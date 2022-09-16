package defpackage;
/* compiled from: PG */
/* renamed from: uin  reason: default package */
/* loaded from: classes4.dex */
public final class uin extends aopi implements aoqv {
    public static final uin a;
    private static volatile aorb m;
    public int b;
    public boolean c;
    public boolean d;
    public float e;
    public int f;
    public int g;
    public int h;
    public float i;
    public int j;
    public int k;
    public int l;
    private int n;

    static {
        uin uinVar = new uin();
        a = uinVar;
        aopi.registerDefaultInstance(uin.class, uinVar);
    }

    private uin() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0003ခ\u0003\u0004ခ\u0007\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\b\tင\t\nင\n\u000bဇ\u0001\fဇ\u0002", new Object[]{"n", "b", sml.u, "e", "i", "f", "g", "h", "j", "k", "l", "c", "d"});
            case 3:
                return new uin();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (uin.class) {
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
