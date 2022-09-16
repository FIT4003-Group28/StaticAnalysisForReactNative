package defpackage;
/* compiled from: PG */
/* renamed from: atcy  reason: default package */
/* loaded from: classes2.dex */
public final class atcy extends aopi implements aoqv {
    public static final atcy a;
    private static volatile aorb j;
    public boolean b;
    public boolean c;
    public int d;
    public int g;
    public boolean h;
    private int k;
    private int l;
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public String i = "";

    static {
        atcy atcyVar = new atcy();
        a = atcyVar;
        aopi.registerDefaultInstance(atcy.class, atcyVar);
    }

    private atcy() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0002\u00045\b\u0000\u0002\u0000\u0004ဇ\u0003\u0007ဇ\u0005\fင\n\u000f\u001b\u0010\u001b\u0011င\r(ဇ\"5ဈ.", new Object[]{"k", "l", "b", "c", "d", "e", atdd.class, "f", atde.class, "g", "h", "i"});
            case 3:
                return new atcy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (atcy.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
