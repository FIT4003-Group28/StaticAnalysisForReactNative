package defpackage;
/* compiled from: PG */
/* renamed from: apnv  reason: default package */
/* loaded from: classes.dex */
public final class apnv extends aopi implements aoqv {
    public static final apnv a;
    private static volatile aorb l;
    public int b;
    public boolean f;
    public apnx g;
    public apny h;
    public aqkk i;
    public int k;
    private byte m = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String j = "";

    static {
        apnv apnvVar = new apnv();
        a = apnvVar;
        aopi.registerDefaultInstance(apnv.class, apnvVar);
    }

    private apnv() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u000e\t\u0000\u0000\u0001\u0002ဈ\u0000\u0003ဈ\u0002\u0005ဈ\u0003\u0006ᐉ\u0005\u0007ဇ\u0004\bဉ\u0006\tဉ\u0007\fဈ\n\u000eဌ\u000b", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i", "j", "k", apog.b});
            case 3:
                return new apnv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (apnv.class) {
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
