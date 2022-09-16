package defpackage;
/* compiled from: PG */
/* renamed from: auxr  reason: default package */
/* loaded from: classes2.dex */
public final class auxr extends aopi implements aoqv {
    public static final auxr a;
    private static volatile aorb h;
    public int b;
    public arhs e;
    public aovs f;
    public argl g;
    private aoux i;
    private byte j = 2;
    public aopu c = emptyProtobufList();
    public String d = "";

    static {
        auxr auxrVar = new auxr();
        a = auxrVar;
        aopi.registerDefaultInstance(auxr.class, auxrVar);
    }

    private auxr() {
        aoob aoobVar = aoob.b;
    }

    public final void a() {
        aopu aopuVar = this.c;
        if (!aopuVar.c()) {
            this.c = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0004\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001\u0004ဉ\u0002\bᐉ\u0007\tᐉ\u0005", new Object[]{"b", "c", auxq.class, "d", "e", "f", "i", "g"});
            case 3:
                return new auxr();
            case 4:
                return new aopa((float[][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (auxr.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
