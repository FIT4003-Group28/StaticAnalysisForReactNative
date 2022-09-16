package defpackage;
/* compiled from: PG */
/* renamed from: ashd  reason: default package */
/* loaded from: classes2.dex */
public final class ashd extends aopi implements aoqv {
    public static final ashd a;
    private static volatile aorb l;
    public int b;
    public aroy c;
    public avka j;
    private byte m = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public aoob h = aoob.b;
    public aoob i = aoob.b;
    public aopu k = emptyProtobufList();

    static {
        ashd ashdVar = new ashd();
        a = ashdVar;
        aopi.registerDefaultInstance(ashd.class, ashdVar);
    }

    private ashd() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ည\u0005\u0007ည\u0006\bဈ\u0003\tဈ\u0004\rဉ\b\u000e\u001c", new Object[]{"b", "c", "d", "e", "h", "i", "f", "g", "j", "k"});
            case 3:
                return new ashd();
            case 4:
                return new aopa((int[][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (ashd.class) {
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
