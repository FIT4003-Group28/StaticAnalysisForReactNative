package defpackage;
/* compiled from: PG */
/* renamed from: aqdr  reason: default package */
/* loaded from: classes2.dex */
public final class aqdr extends aopi implements aoqv {
    public static final aqdr a;
    private static volatile aorb p;
    public int b;
    public Object d;
    public Object f;
    public arhs g;
    public aunb h;
    public avhn i;
    public arag j;
    public arag k;
    public aqdq m;
    private apzg q;
    private apzg r;
    private aoux s;
    public int c = 0;
    public int e = 0;
    private byte t = 2;
    public String l = "";
    public aoob n = aoob.b;
    public boolean o = true;

    static {
        aqdr aqdrVar = new aqdr();
        a = aqdrVar;
        aopi.registerDefaultInstance(aqdr.class, aqdrVar);
    }

    private aqdr() {
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
                return newMessageInfo(a, "\u0001\u0010\u0002\u0001\u0001\u0014\u0010\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐼ\u0001\u0005ᐉ\u0010\u0006ည\u0011\u0007ᐼ\u0000\bᐼ\u0000\tᐼ\u0001\u000bᐉ\u000e\fဈ\r\rᐉ\u0005\u0011ဇ\u0013\u0012ᐉ\u0001\u0013ᐉ\u000b\u0014ᐉ\f", new Object[]{"d", "c", "f", "e", "b", "g", "i", "j", apzg.class, "s", "n", arhs.class, arag.class, apzg.class, "m", "l", "k", "o", "h", "q", "r"});
            case 3:
                return new aqdr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aqdr.class) {
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
