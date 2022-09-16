package defpackage;
/* compiled from: PG */
/* renamed from: aqgm  reason: default package */
/* loaded from: classes2.dex */
public final class aqgm extends aopi implements aoqv {
    public static final aqgm a;
    public static final aopg b;
    private static volatile aorb p;
    public int c;
    public arag d;
    public avhn e;
    public int f;
    public apzg n;
    private byte q = 2;
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String o = "";

    static {
        aqgm aqgmVar = new aqgm();
        a = aqgmVar;
        aopi.registerDefaultInstance(aqgm.class, aqgmVar);
        b = aopi.newSingularGeneratedExtension(aqkj.a, aqgmVar, aqgmVar, null, 139735787, aosj.MESSAGE, aqgm.class);
    }

    private aqgm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0003\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဌ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0007ဈ\u0007\bဈ\t\tဈ\n\nᐉ\f\fဈ\u000b\rဈ\b\u000eဈ\r", new Object[]{"c", "d", "e", "f", aqfh.c, "g", "h", "i", "k", "l", "n", "m", "j", "o"});
            case 3:
                return new aqgm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aqgm.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
