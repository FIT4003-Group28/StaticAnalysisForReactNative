package defpackage;
/* compiled from: PG */
/* renamed from: aqqh  reason: default package */
/* loaded from: classes2.dex */
public final class aqqh extends aopi implements aoqv {
    public static final aqqh a;
    public static final aopg b;
    private static volatile aorb s;
    public int c;
    public avhn e;
    public int h;
    public int k;
    public boolean m;
    public boolean n;
    public int o;
    private byte t = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String p = "";
    public String q = "";
    public aopu r = emptyProtobufList();

    static {
        aqqh aqqhVar = new aqqh();
        a = aqqhVar;
        aopi.registerDefaultInstance(aqqh.class, aqqhVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aqqhVar, aqqhVar, null, 173, aosj.MESSAGE, aqqh.class);
    }

    private aqqh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.t = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0006\u0007င\u0007\bဈ\b\tဇ\t\nဇ\n\u000bင\u000b\rဈ\f\u000eဈ\u0005\u000fဈ\r\u0011\u001b", new Object[]{"c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "i", "q", "r", aplt.class});
            case 3:
                return new aqqh();
            case 4:
                return new aopa((char[][]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (aqqh.class) {
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
