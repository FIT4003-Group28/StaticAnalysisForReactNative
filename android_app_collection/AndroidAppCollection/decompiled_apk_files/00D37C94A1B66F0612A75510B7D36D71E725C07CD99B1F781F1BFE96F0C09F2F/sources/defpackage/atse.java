package defpackage;
/* compiled from: PG */
/* renamed from: atse  reason: default package */
/* loaded from: classes2.dex */
public final class atse extends aopi implements aoqv {
    public static final atse a;
    private static volatile aorb m;
    public int b;
    public Object d;
    public int f;
    public int g;
    public int h;
    public int j;
    public aoob k;
    public atqu l;
    public int c = 0;
    private byte n = 2;
    public String e = "";
    public String i = "";

    static {
        atse atseVar = new atse();
        a = atseVar;
        aopi.registerDefaultInstance(atse.class, atseVar);
    }

    private atse() {
        aoob aoobVar = aoob.b;
        this.k = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u000f\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ᐼ\u0000\u000bဌ\t\fည\n\rဉ\u000b\u000fြ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", atqy.p, "i", atsd.class, "j", atqy.i, "k", "l", atqt.class});
            case 3:
                return new atse();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atse.class) {
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
