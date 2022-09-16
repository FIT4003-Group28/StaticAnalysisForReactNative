package defpackage;
/* compiled from: PG */
/* renamed from: angc */
/* loaded from: classes.dex */
public final class angc extends aopi implements aoqv {
    private static final angc a;
    private static volatile aorb b;
    private int c;
    private int d;
    private long e;
    private int o;
    private anga p;
    private ange q;
    private anfy t;
    private byte u = 2;
    private String f = "";
    private String g = "";
    private String h = "";
    private aopq i = emptyIntList();
    private aopu j = emptyProtobufList();
    private aopu k = emptyProtobufList();
    private aopu l = emptyProtobufList();
    private aopu m = emptyProtobufList();
    private aopu n = emptyProtobufList();
    private aopu r = emptyProtobufList();
    private aopu s = emptyProtobufList();

    static {
        angc angcVar = new angc();
        a = angcVar;
        aopi.registerDefaultInstance(angc.class, angcVar);
    }

    private angc() {
    }

    public static angb b() {
        return (angb) a.createBuilder();
    }

    public static angb c(angc angcVar) {
        return (angb) a.createBuilder(angcVar);
    }

    public static /* synthetic */ angc d() {
        return a;
    }

    public void m(anfz anfzVar) {
        anfzVar.getClass();
        n();
        this.r.add(anfzVar);
    }

    private void n() {
        aopu aopuVar = this.r;
        if (!aopuVar.c()) {
            this.r = aopi.mutableCopy(aopuVar);
        }
    }

    public void o(anfy anfyVar) {
        anfyVar.getClass();
        this.t = anfyVar;
        this.d |= 256;
    }

    public void p(anga angaVar) {
        angaVar.getClass();
        this.p = angaVar;
        this.c |= 1073741824;
    }

    public void q(String str) {
        this.c |= 2048;
        this.f = str;
    }

    public void r(int i) {
        this.c |= 268435456;
        this.o = i;
    }

    public void s(String str) {
        this.c |= 65536;
        this.h = str;
    }

    public void t(String str) {
        str.getClass();
        this.c |= 16384;
        this.g = str;
    }

    public void u(long j) {
        this.c |= 2;
        this.e = j;
    }

    public anga a() {
        anga angaVar = this.p;
        return angaVar == null ? anga.a : angaVar;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.u = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0002\u00020\t\u0000\u0001\u0001\u0002ဂ\u0001\tဈ\u000e\rဈ\u000b\u0011ဈ\u0010\u001fဆ\u001c!ဉ\u001e%ᐉ (\u001b0ဉ(", new Object[]{"c", "d", "e", "g", "f", "h", "o", "p", "q", "r", anfz.class, "t"});
            case 3:
                return new angc();
            case 4:
                return new angb();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (angc.class) {
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
