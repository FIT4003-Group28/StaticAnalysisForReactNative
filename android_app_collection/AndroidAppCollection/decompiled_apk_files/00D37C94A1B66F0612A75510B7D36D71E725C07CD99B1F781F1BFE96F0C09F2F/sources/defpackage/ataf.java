package defpackage;
/* compiled from: PG */
/* renamed from: ataf  reason: default package */
/* loaded from: classes2.dex */
public final class ataf extends aopi implements aoqv {
    public static final ataf a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public String d = "";
    public String e;
    public int f;
    public boolean g;
    public atae h;
    public int i;

    static {
        ataf atafVar = new ataf();
        a = atafVar;
        aopi.registerDefaultInstance(ataf.class, atafVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, atafVar, atafVar, null, 196, aosj.MESSAGE, ataf.class);
    }

    private ataf() {
        aoob aoobVar = aoob.b;
        this.e = "";
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဌ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", atag.a()});
            case 3:
                return new ataf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (ataf.class) {
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
