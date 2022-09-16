package defpackage;
/* compiled from: PG */
/* renamed from: awrd  reason: default package */
/* loaded from: classes2.dex */
public final class awrd extends aopi implements aoqv {
    private static final awrd a;
    private static volatile aorb b;
    private int c;
    private awrg d;
    private awmt e;
    private awon f;
    private byte g = 2;

    static {
        awrd awrdVar = new awrd();
        a = awrdVar;
        aopi.registerDefaultInstance(awrd.class, awrdVar);
    }

    private awrd() {
    }

    public static awrc a() {
        return (awrc) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(awmt awmtVar) {
        awmtVar.getClass();
        this.e = awmtVar;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(awrg awrgVar) {
        this.d = awrgVar;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(awon awonVar) {
        awonVar.getClass();
        this.f = awonVar;
        this.c |= 4;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new awrd();
            case 4:
                return new awrc();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awrd.class) {
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
