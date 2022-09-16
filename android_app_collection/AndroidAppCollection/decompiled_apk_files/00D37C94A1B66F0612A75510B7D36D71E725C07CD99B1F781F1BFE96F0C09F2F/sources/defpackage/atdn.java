package defpackage;
/* compiled from: PG */
/* renamed from: atdn  reason: default package */
/* loaded from: classes2.dex */
public final class atdn extends aopi implements aoqv {
    public static final atdn a;
    private static volatile aorb h;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        atdn atdnVar = new atdn();
        a = atdnVar;
        aopi.registerDefaultInstance(atdn.class, atdnVar);
    }

    private atdn() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\b\u0014\u0005\u0000\u0000\u0000\bဇ\u0004\u000eဇ\t\u000fဇ\n\u0013ဇ\u000b\u0014ဇ\f", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new atdn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atdn.class) {
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
