package defpackage;
/* compiled from: PG */
/* renamed from: arpi  reason: default package */
/* loaded from: classes2.dex */
public final class arpi extends aopi implements aoqv {
    public static final arpi a;
    private static volatile aorb g;
    public int b;
    public arpa c;
    public arpj f;
    private apzg h;
    private apzg i;
    private apzg j;
    private apzg k;
    private apzg l;
    private byte m = 2;
    public String d = "";
    public aopu e = emptyProtobufList();

    static {
        arpi arpiVar = new arpi();
        a = arpiVar;
        aopi.registerDefaultInstance(arpi.class, arpiVar);
    }

    private arpi() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\b\u0001ᐉ\u0000\u0003ဈ\u0001\u0004Л\u0005ᐉ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0003\tᐉ\u0004\u000bᐉ\u0006\fᐉ\u0007", new Object[]{"b", "c", "d", "e", arpg.class, "h", "f", "i", "j", "k", "l"});
            case 3:
                return new arpi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arpi.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
