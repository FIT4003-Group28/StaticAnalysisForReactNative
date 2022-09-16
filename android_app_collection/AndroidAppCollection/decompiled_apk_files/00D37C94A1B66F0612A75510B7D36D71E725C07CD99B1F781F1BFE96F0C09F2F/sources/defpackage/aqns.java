package defpackage;
/* compiled from: PG */
/* renamed from: aqns  reason: default package */
/* loaded from: classes2.dex */
public final class aqns extends aopi implements aoqv {
    public static final aqns a;
    private static volatile aorb o;
    public int b;
    public Object d;
    public Object f;
    public int g;
    public awmt k;
    public boolean m;
    public int c = 0;
    public int e = 0;
    private byte p = 2;
    public String h = "";
    public String i = "";
    public String j = "";
    public aopu l = emptyProtobufList();
    public String n = "";

    static {
        aqns aqnsVar = new aqns();
        a = aqnsVar;
        aopi.registerDefaultInstance(aqns.class, aqnsVar);
    }

    private aqns() {
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
                return newMessageInfo(a, "\u0001\f\u0002\u0001\u0001\f\f\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ျ\u0000\u0007ျ\u0000\bွ\u0001\t့\u0001\n\u001b\u000bဇ\t\fဈ\n", new Object[]{"d", "c", "f", "e", "b", "g", aqfh.r, "h", "i", "j", "k", "l", aqnl.class, "m", "n"});
            case 3:
                return new aqns();
            case 4:
                return new aopa((boolean[][][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (aqns.class) {
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
