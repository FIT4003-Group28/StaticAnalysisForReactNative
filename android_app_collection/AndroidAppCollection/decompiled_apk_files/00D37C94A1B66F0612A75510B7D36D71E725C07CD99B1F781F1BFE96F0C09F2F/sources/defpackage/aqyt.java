package defpackage;
/* compiled from: PG */
/* renamed from: aqyt */
/* loaded from: classes2.dex */
public final class aqyt extends aopi implements aoqv {
    private static final aqyt a;
    private static volatile aorb b;
    private int c;
    private String d = "";
    private aqyv e;
    private aqyu f;
    private int g;
    private int h;

    static {
        aqyt aqytVar = new aqyt();
        a = aqytVar;
        aopi.registerDefaultInstance(aqyt.class, aqytVar);
    }

    private aqyt() {
    }

    public static aqys a() {
        return (aqys) a.createBuilder();
    }

    public static /* synthetic */ void c(aqyt aqytVar, String str) {
        aqytVar.k(str);
    }

    public static /* synthetic */ void d(aqyt aqytVar, aqzj aqzjVar) {
        aqytVar.l(aqzjVar);
    }

    public static /* synthetic */ void e(aqyt aqytVar, int i) {
        aqytVar.h(0);
    }

    public static /* synthetic */ void f(aqyt aqytVar, aqyv aqyvVar) {
        aqytVar.i(aqyvVar);
    }

    public static /* synthetic */ void g(aqyt aqytVar, aqyu aqyuVar) {
        aqytVar.j(aqyuVar);
    }

    public void h(int i) {
        this.c |= 16;
        this.h = 0;
    }

    public void i(aqyv aqyvVar) {
        aqyvVar.getClass();
        this.e = aqyvVar;
        this.c |= 2;
    }

    public void j(aqyu aqyuVar) {
        this.f = aqyuVar;
        this.c |= 4;
    }

    public void k(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    public void l(aqzj aqzjVar) {
        this.g = aqzjVar.r;
        this.c |= 8;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005င\u0004", new Object[]{"c", "d", "e", "f", "g", aqzj.a(), "h"});
            case 3:
                return new aqyt();
            case 4:
                return new aqys();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqyt.class) {
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
