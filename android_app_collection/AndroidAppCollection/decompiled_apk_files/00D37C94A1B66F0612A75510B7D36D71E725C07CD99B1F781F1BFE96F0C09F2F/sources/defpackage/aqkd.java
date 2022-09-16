package defpackage;
/* compiled from: PG */
/* renamed from: aqkd */
/* loaded from: classes2.dex */
public final class aqkd extends aopi implements aoqv {
    private static final aqkd a;
    private static volatile aorb b;
    private int c;
    private Object e;
    private int d = 0;
    private String f = "";
    private String g = "";

    static {
        aqkd aqkdVar = new aqkd();
        a = aqkdVar;
        aopi.registerDefaultInstance(aqkd.class, aqkdVar);
    }

    private aqkd() {
    }

    public static aqkc a() {
        return (aqkc) a.createBuilder();
    }

    public static /* synthetic */ aqkd b() {
        return a;
    }

    public void g(String str) {
        str.getClass();
        this.c |= 4;
        this.f = str;
    }

    public void h(String str) {
        this.c |= 8;
        this.g = "tf-lite-bandwidth-model.tflite";
    }

    public void i(int i) {
        this.d = 4;
        this.e = Integer.valueOf(i);
    }

    public void j(aqkb aqkbVar) {
        this.e = Integer.valueOf(aqkbVar.h);
        this.d = 1;
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004့\u0000", new Object[]{"e", "d", "c", aqkb.a(), "f", "g"});
            case 3:
                return new aqkd();
            case 4:
                return new aqkc();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqkd.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
