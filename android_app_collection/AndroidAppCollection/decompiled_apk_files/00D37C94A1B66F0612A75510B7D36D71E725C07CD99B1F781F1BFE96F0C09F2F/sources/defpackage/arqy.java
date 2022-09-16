package defpackage;
/* compiled from: PG */
/* renamed from: arqy  reason: default package */
/* loaded from: classes2.dex */
public final class arqy extends aopi implements aoqv {
    public static final arqy a;
    private static volatile aorb o;
    public int b;
    public aroy c;
    public int e;
    public boolean j;
    public int k;
    public boolean l;
    public int m;
    public long n;
    private byte p = 2;
    public String d = "";
    public aoob f = aoob.b;
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        arqy arqyVar = new arqy();
        a = arqyVar;
        aopi.registerDefaultInstance(arqy.class, arqyVar);
    }

    private arqy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007\tဋ\b\u000bဇ\n\fဌ\u000b\rဂ\f", new Object[]{"b", "c", "d", "e", aqvj.j, "f", "g", "h", "i", "j", "k", "l", "m", aqvj.l, "n"});
            case 3:
                return new arqy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (arqy.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
