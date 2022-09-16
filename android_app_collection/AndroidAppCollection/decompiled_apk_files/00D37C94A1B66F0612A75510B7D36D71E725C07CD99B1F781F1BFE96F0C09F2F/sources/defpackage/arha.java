package defpackage;
/* compiled from: PG */
/* renamed from: arha  reason: default package */
/* loaded from: classes2.dex */
public final class arha extends aopd implements aope {
    public static final arha a;
    private static volatile aorb h;
    public int b;
    public int d;
    public int e;
    public arag f;
    public aoob g;
    private apzg i;
    private aoxw j;
    private aunb k;
    private aunb m;
    private aoux n;
    private byte o = 2;
    public aopu c = emptyProtobufList();

    static {
        arha arhaVar = new arha();
        a = arhaVar;
        aopi.registerDefaultInstance(arha.class, arhaVar);
    }

    private arha() {
        emptyProtobufList();
        this.g = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\u0007\u0001Л\u0002ᐉ\b\u0003ᐉ\u0002\u0004ည\t\u0006င\u0000\u0007င\u0001\bᐉ\u0003\u000bᐉ\u0006\fᐉ\u0007\rᐉ\u0005", new Object[]{"b", "c", arhb.class, "n", "f", "g", "d", "e", "i", "k", "m", "j"});
            case 3:
                return new arha();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arha.class) {
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
