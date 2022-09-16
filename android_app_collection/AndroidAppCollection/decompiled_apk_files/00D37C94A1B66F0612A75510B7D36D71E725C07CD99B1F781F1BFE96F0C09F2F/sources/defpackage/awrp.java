package defpackage;
/* compiled from: PG */
/* renamed from: awrp */
/* loaded from: classes2.dex */
public final class awrp extends aopi implements aoqv {
    private static final awrp a;
    private static volatile aorb b;
    private int c;
    private Object e;
    private aorw f;
    private int d = 0;
    private byte h = 2;
    private String g = "";

    static {
        awrp awrpVar = new awrp();
        a = awrpVar;
        aopi.registerDefaultInstance(awrp.class, awrpVar);
    }

    private awrp() {
    }

    public static awro a() {
        return (awro) a.createBuilder();
    }

    public static /* synthetic */ awrp b() {
        return a;
    }

    public static /* synthetic */ void c(awrp awrpVar, aorw aorwVar) {
        awrpVar.p(aorwVar);
    }

    public static /* synthetic */ void h(awrp awrpVar, awrj awrjVar) {
        awrpVar.m(awrjVar);
    }

    public void j(awrb awrbVar) {
        awrbVar.getClass();
        this.e = awrbVar;
        this.d = 5;
    }

    public void k(awrd awrdVar) {
        awrdVar.getClass();
        this.e = awrdVar;
        this.d = 4;
    }

    public void l(awrf awrfVar) {
        awrfVar.getClass();
        this.e = awrfVar;
        this.d = 9;
    }

    public void m(awrj awrjVar) {
        awrjVar.getClass();
        this.e = awrjVar;
        this.d = 8;
    }

    public void n(awrl awrlVar) {
        awrlVar.getClass();
        this.e = awrlVar;
        this.d = 3;
    }

    public void o(awrn awrnVar) {
        awrnVar.getClass();
        this.e = awrnVar;
        this.d = 2;
    }

    public void p(aorw aorwVar) {
        aorwVar.getClass();
        this.f = aorwVar;
        this.c |= 1;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0002\u0001ဉ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"e", "d", "c", "f", awrn.class, awrl.class, awrd.class, awrb.class, awrh.class, awrj.class, awrf.class});
            case 3:
                return new awrp();
            case 4:
                return new awro();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awrp.class) {
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
