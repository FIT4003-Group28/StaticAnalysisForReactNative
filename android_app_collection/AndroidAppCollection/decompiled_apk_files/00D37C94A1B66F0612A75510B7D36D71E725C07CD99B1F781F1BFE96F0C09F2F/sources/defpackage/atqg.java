package defpackage;
/* compiled from: PG */
/* renamed from: atqg  reason: default package */
/* loaded from: classes2.dex */
public final class atqg extends aopi implements aoqv {
    public static final atqg a;
    private static volatile aorb m;
    public int b;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;

    static {
        atqg atqgVar = new atqg();
        a = atqgVar;
        aopi.registerDefaultInstance(atqg.class, atqgVar);
    }

    private atqg() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဂ\u0000\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0004\bဇ\u0005\tဌ\u0006\nင\u0007\u000bဇ\b", new Object[]{"b", "c", atqi.class, "d", atqh.class, "e", "f", "g", "h", "i", "j", aqlv.a(), "k", "l"});
            case 3:
                return new atqg();
            case 4:
                return new aopa((short[][]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atqg.class) {
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
