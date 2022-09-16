package defpackage;
/* compiled from: PG */
/* renamed from: atxf  reason: default package */
/* loaded from: classes2.dex */
public final class atxf extends aopi implements aoqv {
    public static final atxf a;
    private static volatile aorb l;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public atxg i;
    public atxg j;
    public boolean k;

    static {
        atxf atxfVar = new atxf();
        a = atxfVar;
        aopi.registerDefaultInstance(atxf.class, atxfVar);
    }

    private atxf() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0013\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0005\u0003င\u0001\u0007င\u0004\bဇ\t\u000bဉ\u000b\fဉ\f\u0012ဇ\n\u0013ဇ\u0011", new Object[]{"b", "c", "f", "d", "e", "g", "i", "j", "h", "k"});
            case 3:
                return new atxf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (atxf.class) {
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
