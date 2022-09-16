package defpackage;
/* compiled from: PG */
/* renamed from: atyv  reason: default package */
/* loaded from: classes2.dex */
public final class atyv extends aopi implements aoqv {
    private static final atyv a;
    private static volatile aorb b;
    private int c;
    private int d;
    private atyt e;
    private int f;
    private String g = "";
    private int h;

    static {
        atyv atyvVar = new atyv();
        a = atyvVar;
        aopi.registerDefaultInstance(atyv.class, atyvVar);
    }

    private atyv() {
    }

    public static atyu a() {
        return (atyu) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        this.c |= 8;
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(aqlv aqlvVar) {
        this.f = aqlvVar.B;
        this.c |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(atyx atyxVar) {
        this.h = atyxVar.p;
        this.c |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(atyy atyyVar) {
        this.d = atyyVar.f;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(atyt atytVar) {
        atytVar.getClass();
        this.e = atytVar;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"c", "d", atyy.a(), "e", "f", aqlv.a(), "g", "h", atyx.a()});
            case 3:
                return new atyv();
            case 4:
                return new atyu();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atyv.class) {
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
