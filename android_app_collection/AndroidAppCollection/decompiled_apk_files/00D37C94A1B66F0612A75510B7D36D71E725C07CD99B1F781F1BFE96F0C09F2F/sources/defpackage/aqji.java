package defpackage;
/* compiled from: PG */
/* renamed from: aqji  reason: default package */
/* loaded from: classes2.dex */
public final class aqji extends aopi implements aoqv {
    public static final aqji a;
    private static volatile aorb n;
    public int b;
    public avhn c;
    public aqjg d;
    public aqjh f;
    public boolean g;
    public boolean h;
    public apzg i;
    public apzg j;
    public aovs k;
    public aovs l;
    public arag m;
    private arag o;
    private byte p = 2;
    public String e = "";

    static {
        aqji aqjiVar = new aqji();
        a = aqjiVar;
        aopi.registerDefaultInstance(aqji.class, aqjiVar);
    }

    private aqji() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ဉ\u0002\u0004ဈ\u0004\u0005ဇ\u0007\u0006ဇ\b\u0007ᐉ\t\bᐉ\n\tဉ\u000b\nဉ\f\fᐉ\u0006\u000eᐉ\r\u000fᐉ\u000e", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "f", "m", "o"});
            case 3:
                return new aqji();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aqji.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
