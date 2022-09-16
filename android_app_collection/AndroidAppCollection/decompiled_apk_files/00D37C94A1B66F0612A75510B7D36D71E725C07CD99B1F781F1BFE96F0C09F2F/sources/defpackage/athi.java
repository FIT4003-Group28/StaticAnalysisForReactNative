package defpackage;
/* compiled from: PG */
/* renamed from: athi  reason: default package */
/* loaded from: classes2.dex */
public final class athi extends aopi implements aoqv {
    private static final athi a;
    private static volatile aorb b;
    private int c;
    private String d = "";
    private String e = "";

    static {
        athi athiVar = new athi();
        a = athiVar;
        aopi.registerDefaultInstance(athi.class, athiVar);
    }

    private athi() {
    }

    public static athh a() {
        return (athh) a.createBuilder();
    }

    public static /* synthetic */ void c(athi athiVar, String str) {
        athiVar.e(str);
    }

    public static /* synthetic */ void d(athi athiVar, String str) {
        athiVar.f(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        this.c |= 1;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        this.c |= 2;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new athi();
            case 4:
                return new athh();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (athi.class) {
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
