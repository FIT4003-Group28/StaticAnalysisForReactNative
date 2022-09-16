package defpackage;
/* compiled from: PG */
/* renamed from: aqpu  reason: default package */
/* loaded from: classes2.dex */
public final class aqpu extends aopi implements aoqv {
    public static final aqpu a;
    public static final aopg b;
    private static volatile aorb o;
    public int c;
    public avhn e;
    public int h;
    private byte p = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public aopu m = emptyProtobufList();
    public aoob n = aoob.b;

    static {
        aqpu aqpuVar = new aqpu();
        a = aqpuVar;
        aopi.registerDefaultInstance(aqpu.class, aqpuVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aqpuVar, aqpuVar, null, 199, aosj.MESSAGE, aqpu.class);
    }

    private aqpu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\n\u001b\u000bည\t", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", aqnl.class, "n"});
            case 3:
                return new aqpu();
            case 4:
                return new aopa((char[][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (aqpu.class) {
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
