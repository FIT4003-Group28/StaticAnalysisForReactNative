package defpackage;
/* compiled from: PG */
/* renamed from: aqpn  reason: default package */
/* loaded from: classes2.dex */
public final class aqpn extends aopi implements aoqv {
    public static final aqpn a;
    public static final aopg b;
    private static volatile aorb p;
    public int c;
    public Object e;
    public int k;
    public int n;
    public int d = 0;
    private byte q = 2;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public String o = "";

    static {
        aqpn aqpnVar = new aqpn();
        a = aqpnVar;
        aopi.registerDefaultInstance(aqpn.class, aqpnVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aqpnVar, aqpnVar, null, 192, aosj.MESSAGE, aqpn.class);
    }

    private aqpn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0003\u0006ᐼ\u0000\u0007ᐼ\u0000\bဈ\b\tင\u0005\u000bဈ\t\fင\n\rဈ\u000b", new Object[]{"e", "d", "c", "f", "g", "h", "j", "i", avhn.class, aqpm.class, "l", "k", "m", "n", "o"});
            case 3:
                return new aqpn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aqpn.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
