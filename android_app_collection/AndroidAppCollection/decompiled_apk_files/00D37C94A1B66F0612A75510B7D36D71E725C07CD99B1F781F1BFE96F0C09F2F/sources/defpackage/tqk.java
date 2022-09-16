package defpackage;
/* compiled from: PG */
/* renamed from: tqk  reason: default package */
/* loaded from: classes4.dex */
public final class tqk extends aopi implements aoqv {
    public static final tqk a;
    private static volatile aorb r;
    public int b;
    public int e;
    public int f;
    public awxs h;
    public int j;
    public awxs k;
    public int m;
    public int n;
    public aono q;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public aopu l = emptyProtobufList();
    public String o = "";
    public String p = "";

    static {
        tqk tqkVar = new tqk();
        a = tqkVar;
        aopi.registerDefaultInstance(tqk.class, tqkVar);
    }

    private tqk() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004င\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000fဌ\u0003\u0010င\u0007\u0011ဌ\t\u0012ဌ\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", tqo.class, "i", "f", sml.m, "j", "m", sml.l, "n", sml.k, "o", "p", "q"});
            case 3:
                return new tqk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (tqk.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
