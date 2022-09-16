package defpackage;
/* compiled from: PG */
/* renamed from: aotf  reason: default package */
/* loaded from: classes.dex */
public final class aotf extends aopi implements aoqv {
    public static final aotf a;
    private static volatile aorb n;
    public int b;
    public int d;
    public long e;
    public long f;
    public long g;
    public int i;
    public int j;
    public aotc k;
    public String c = "";
    public String h = "";
    public aopt l = emptyLongList();
    public String m = "";

    static {
        aotf aotfVar = new aotf();
        a = aotfVar;
        aopi.registerDefaultInstance(aotf.class, aotfVar);
    }

    private aotf() {
    }

    public static /* synthetic */ void b(aotf aotfVar) {
        aotfVar.b |= 4;
        aotfVar.e = -1232518371L;
    }

    public final void a() {
        aopt aoptVar = this.l;
        if (!aoptVar.c()) {
            this.l = aopi.mutableCopy(aoptVar);
        }
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဂ\u0004\u0005ဈ\u0005\u0006ဌ\u0006\u0007ဌ\u0007\t\u0014\u000bဈ\u000b\fင\u0001\rဉ\t", new Object[]{"b", "c", "e", "f", "g", "h", "i", aoli.t, "j", aotd.a(), "l", "m", "d", "k"});
            case 3:
                return new aotf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aotf.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
