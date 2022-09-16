package defpackage;
/* compiled from: PG */
/* renamed from: smh  reason: default package */
/* loaded from: classes4.dex */
public final class smh extends aopi implements aoqv {
    private static final smh a;
    private static volatile aorb b;
    private int c;
    private int d;
    private long e;

    static {
        smh smhVar = new smh();
        a = smhVar;
        aopi.registerDefaultInstance(smh.class, smhVar);
    }

    private smh() {
    }

    public static smg a() {
        return (smg) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(dwg dwgVar) {
        this.d = dwgVar.getNumber();
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(long j) {
        this.c |= 2;
        this.e = j;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", dwg.b(), "e"});
            case 3:
                return new smh();
            case 4:
                return new smg();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (smh.class) {
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
