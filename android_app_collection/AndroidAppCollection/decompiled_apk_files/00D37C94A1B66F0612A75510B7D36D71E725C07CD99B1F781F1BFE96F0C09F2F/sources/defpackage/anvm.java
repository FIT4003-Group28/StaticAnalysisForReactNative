package defpackage;
/* compiled from: PG */
/* renamed from: anvm  reason: default package */
/* loaded from: classes.dex */
public final class anvm extends aopi implements aoqv {
    private static final anvm a;
    private static volatile aorb b;
    private int c;
    private Object e;
    private int f;
    private int d = 0;
    private String g = "";

    static {
        anvm anvmVar = new anvm();
        a = anvmVar;
        aopi.registerDefaultInstance(anvm.class, anvmVar);
    }

    private anvm() {
    }

    public static anvl a() {
        return (anvl) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(anvh anvhVar) {
        this.f = anvhVar.f;
        this.c |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(anvi anviVar) {
        anviVar.getClass();
        this.e = anviVar;
        this.d = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        str.getClass();
        this.d = 1;
        this.e = str;
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ဌ\u0002", new Object[]{"e", "d", "c", anvi.class, "f", anvh.b()});
            case 3:
                return new anvm();
            case 4:
                return new anvl();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (anvm.class) {
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
