package defpackage;
/* compiled from: PG */
/* renamed from: apod  reason: default package */
/* loaded from: classes.dex */
public final class apod extends aopi implements aoqv {
    private static final apod a;
    private static volatile aorb b;
    private int c;
    private int e;
    private boolean g;
    private String d = "";
    private String f = "";

    static {
        apod apodVar = new apod();
        a = apodVar;
        aopi.registerDefaultInstance(apod.class, apodVar);
    }

    private apod() {
    }

    public static apoc a() {
        return (apoc) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(boolean z) {
        this.c |= 8;
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        str.getClass();
        this.c |= 4;
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        this.c |= 2;
        this.e = i;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new apod();
            case 4:
                return new apoc();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apod.class) {
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
