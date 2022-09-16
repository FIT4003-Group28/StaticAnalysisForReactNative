package defpackage;
/* compiled from: PG */
/* renamed from: apne  reason: default package */
/* loaded from: classes.dex */
public final class apne extends aopi implements aoqv {
    private static final apne a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;

    static {
        apne apneVar = new apne();
        a = apneVar;
        aopi.registerDefaultInstance(apne.class, apneVar);
    }

    private apne() {
    }

    public static apnd a() {
        return (apnd) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(apnb apnbVar) {
        this.d = apnbVar.e;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(apnc apncVar) {
        this.e = apncVar.d;
        this.c |= 2;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", apnb.a(), "e", apnc.a()});
            case 3:
                return new apne();
            case 4:
                return new apnd();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apne.class) {
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
