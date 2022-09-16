package defpackage;
/* compiled from: PG */
/* renamed from: awrn  reason: default package */
/* loaded from: classes2.dex */
public final class awrn extends aopi implements aoqv {
    private static final awrn a;
    private static volatile aorb b;
    private int c;
    private awrg d;
    private String e = "";

    static {
        awrn awrnVar = new awrn();
        a = awrnVar;
        aopi.registerDefaultInstance(awrn.class, awrnVar);
    }

    private awrn() {
    }

    public static awrm a() {
        return (awrm) a.createBuilder();
    }

    public static /* synthetic */ void c(awrn awrnVar, String str) {
        awrnVar.f(str);
    }

    public static /* synthetic */ void d(awrn awrnVar, awrg awrgVar) {
        awrnVar.e(awrgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(awrg awrgVar) {
        this.d = awrgVar;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        str.getClass();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new awrn();
            case 4:
                return new awrm();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awrn.class) {
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
