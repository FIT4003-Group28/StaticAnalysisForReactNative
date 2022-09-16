package defpackage;
/* compiled from: PG */
/* renamed from: dnp */
/* loaded from: classes3.dex */
public final class dnp extends aopi implements aoqv {
    private static final dnp a;
    private static volatile aorb b;
    private int c;
    private long e;
    private int m;
    private String d = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private String k = "";
    private aopu l = emptyProtobufList();

    static {
        dnp dnpVar = new dnp();
        a = dnpVar;
        aopi.registerDefaultInstance(dnp.class, dnpVar);
    }

    private dnp() {
    }

    public static dnm a() {
        return (dnm) a.createBuilder();
    }

    public static /* synthetic */ dnp b() {
        return a;
    }

    public void j(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    public void k(String str) {
        this.c |= 16;
        this.h = str;
    }

    public void l(String str) {
        this.c |= 1024;
        this.k = str;
    }

    public void m(String str) {
        str.getClass();
        this.c |= 8;
        this.g = str;
    }

    public void n(dno dnoVar) {
        this.m = dnoVar.d;
        this.c |= 2048;
    }

    public void o(long j) {
        this.c |= 2;
        this.e = j;
    }

    public void p(String str) {
        str.getClass();
        this.c |= 4;
        this.f = str;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u000bဈ\n\rဌ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "k", "m", dno.b()});
            case 3:
                return new dnp();
            case 4:
                return new dnm();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (dnp.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
