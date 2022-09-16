package defpackage;
/* compiled from: PG */
/* renamed from: azza  reason: default package */
/* loaded from: classes2.dex */
public final class azza extends aopi implements aoqv {
    public static final azza a;
    private static volatile aorb l;
    public int b;
    public int c;
    public long d;
    public azzk g;
    public int h;
    public long i;
    public azzj j;
    public long k;
    private byte m = 2;
    public String e = "";
    public String f = "";

    static {
        azza azzaVar = new azza();
        a = azzaVar;
        aopi.registerDefaultInstance(azza.class, azzaVar);
    }

    private azza() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004", new Object[]{"b", "c", azyz.a(), "h", azyz.a(), "i", "j", "k", "d", "e", "f", "g"});
            case 3:
                return new azza();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (azza.class) {
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
