package defpackage;
/* compiled from: PG */
/* renamed from: auxj  reason: default package */
/* loaded from: classes2.dex */
public final class auxj extends aopi implements aoqv {
    public static final auxj a;
    private static volatile aorb f;
    public int b;
    public auxa d;
    public auxa e;
    private arag g;
    private aoux h;
    private byte i = 2;
    public aopu c = emptyProtobufList();

    static {
        auxj auxjVar = new auxj();
        a = auxjVar;
        aopi.registerDefaultInstance(auxj.class, auxjVar);
    }

    private auxj() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", auwz.class, "d", "e", "g", "h"});
            case 3:
                return new auxj();
            case 4:
                return new aopa((float[]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auxj.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
