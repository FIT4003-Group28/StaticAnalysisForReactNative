package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: auxg  reason: default package */
/* loaded from: classes2.dex */
public final class auxg extends aopd implements aope {
    public static final auxg a;
    private static volatile aorb e;
    public int b;
    public arag c;
    public auxf d;
    private arag f;
    private arag g;
    private apmg h;
    private apmg i;
    private arag j;
    private arag k;
    private arag m;
    private avzt n;
    private apzg o;
    private auxa p;
    private auxa q;
    private aunb r;
    private aoux s;
    private byte t = 2;

    static {
        auxg auxgVar = new auxg();
        a = auxgVar;
        aopi.registerDefaultInstance(auxg.class, auxgVar);
    }

    private auxg() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0003\u0018\u000f\u0000\u0000\u000f\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\bᐉ\t\tᐉ\u000b\nᐉ\f\fᐉ\u0006\rᐉ\u0005\u000fᐉ\n\u0010ᐉ\u0012\u0012ᐉ\r\u0014ᐉ\u000e\u0015ᐉ\u000f\u0016ᐉ\u0010\u0018ᐉ\u0007", new Object[]{"b", "c", "f", "g", "d", "m", "n", "i", "h", "k", "s", "o", "p", "q", "r", "j"});
            case 3:
                return new auxg();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auxg.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
