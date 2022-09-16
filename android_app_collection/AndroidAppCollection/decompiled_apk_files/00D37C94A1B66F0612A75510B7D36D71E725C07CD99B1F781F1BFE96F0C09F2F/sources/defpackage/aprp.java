package defpackage;
/* compiled from: PG */
/* renamed from: aprp  reason: default package */
/* loaded from: classes2.dex */
public final class aprp extends aopi implements aoqv {
    public static final aprp a;
    private static volatile aorb s;
    public int b;
    public arag c;
    public arag f;
    public aprr i;
    public arag j;
    public int k;
    public int l;
    public int m;
    public aqre n;
    public arag p;
    public arag q;
    public arag r;
    private byte t = 2;
    public String d = "";
    public boolean e = true;
    public String g = "";
    public boolean h = true;
    public aopu o = emptyProtobufList();

    static {
        aprp aprpVar = new aprp();
        a = aprpVar;
        aopi.registerDefaultInstance(aprp.class, aprpVar);
    }

    private aprp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u0013\u0010\u0000\u0001\b\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ᐉ\u0005\u0007ဈ\u0006\bဇ\u0007\nဉ\t\u000bင\u000b\fင\f\rင\r\u000eᐉ\u000e\u000fЛ\u0010ᐉ\n\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", arag.class, "j", "p", "q", "r"});
            case 3:
                return new aprp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (aprp.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
