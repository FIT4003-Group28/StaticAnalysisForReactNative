package defpackage;
/* compiled from: PG */
/* renamed from: atze  reason: default package */
/* loaded from: classes2.dex */
public final class atze extends aopi implements aoqv {
    private static final atze a;
    private static volatile aorb b;
    private int c;
    private String d = "";
    private float e;
    private float f;

    static {
        atze atzeVar = new atze();
        a = atzeVar;
        aopi.registerDefaultInstance(atze.class, atzeVar);
    }

    private atze() {
    }

    public static atzd a() {
        return (atzd) a.createBuilder();
    }

    public static /* synthetic */ void c(atze atzeVar, String str) {
        atzeVar.f(str);
    }

    public static /* synthetic */ void d(atze atzeVar, float f) {
        atzeVar.h(f);
    }

    public static /* synthetic */ void e(atze atzeVar, float f) {
        atzeVar.g(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        this.c |= 1;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(float f) {
        this.c |= 4;
        this.f = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f) {
        this.c |= 2;
        this.e = f;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new atze();
            case 4:
                return new atzd();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atze.class) {
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
