package defpackage;
/* compiled from: PG */
/* renamed from: axir */
/* loaded from: classes2.dex */
public final class axir extends aopd implements aope {
    private static final axir a;
    private static volatile aorb b;
    private int c;
    private long d;
    private long e;
    private int g;
    private long i;
    private boolean x;
    private int w = -1;
    private byte z = 2;
    private String f = "";
    private String h = "";
    private aopu j = emptyProtobufList();
    private aoob k = aoob.b;
    private aoob m = aoob.b;
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private long r = 180000;
    private aoob s = aoob.b;
    private String t = "";
    private aopq u = emptyIntList();
    private aopq v = emptyIntList();
    private String y = "";

    static {
        axir axirVar = new axir();
        a = axirVar;
        aopi.registerDefaultInstance(axir.class, axirVar);
    }

    private axir() {
    }

    public static axiq g() {
        return (axiq) a.createBuilder();
    }

    public static /* synthetic */ axir h() {
        return a;
    }

    public void r(aoob aoobVar) {
        this.c |= 262144;
        this.s = aoobVar;
    }

    public void s(String str) {
        this.c |= 32;
        this.h = "";
    }

    public void t(int i) {
        this.c |= 16;
        this.g = i;
    }

    public void u(long j) {
        this.c |= 64;
        this.i = j;
    }

    public void v(long j) {
        this.c |= 1;
        this.d = j;
    }

    public void w(long j) {
        this.c |= 2;
        this.e = j;
    }

    public void x(boolean z) {
        this.c |= 8388608;
        this.x = z;
    }

    public void y(aoob aoobVar) {
        this.c |= 1024;
        this.m = aoobVar;
    }

    public void z(long j) {
        this.c |= 65536;
        this.r = j;
    }

    public int a() {
        return this.g;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.z = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u001a\t\u0000\u0000\u0000\u0001ဂ\u0000\u0006ည\n\u000bင\u0004\fဂ\u0006\u000fတ\u0010\u0011ဂ\u0001\u0012ည\u0012\u0019ဇ\u0017\u001aဈ\u0005", new Object[]{"c", "d", "m", "g", "i", "r", "e", "s", "x", "h"});
            case 3:
                return new axir();
            case 4:
                return new axiq();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axir.class) {
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

    public long e() {
        return this.d;
    }

    public aoob f() {
        return this.m;
    }
}
