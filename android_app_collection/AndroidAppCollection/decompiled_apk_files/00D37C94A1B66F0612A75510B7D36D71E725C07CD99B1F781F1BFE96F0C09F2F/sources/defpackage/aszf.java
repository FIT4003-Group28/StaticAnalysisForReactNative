package defpackage;
/* compiled from: PG */
/* renamed from: aszf  reason: default package */
/* loaded from: classes2.dex */
public final class aszf extends aopi implements aoqv {
    public static final aszf a;
    public static final aopg b;
    private static volatile aorb r;
    public int c;
    public String e;
    public String f;
    public String g;
    public long h;
    public int i;
    public avhn j;
    public arag k;
    public long l;
    public long m;
    public long n;
    public awku o;
    public aszh p;
    public String q;
    private byte s = 2;
    public String d = "";

    static {
        aszf aszfVar = new aszf();
        a = aszfVar;
        aopi.registerDefaultInstance(aszf.class, aszfVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aszfVar, aszfVar, null, 261, aosj.MESSAGE, aszf.class);
    }

    private aszf() {
        aoob aoobVar = aoob.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.q = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.s = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0002\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဃ\u0005\u0007င\u0006\bᐉ\u0007\tᐉ\b\nဃ\t\u000bဃ\n\fဃ\u000b\rဉ\f\u000eဉ\r\u000fဈ\u000e", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case 3:
                return new aszf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (aszf.class) {
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
