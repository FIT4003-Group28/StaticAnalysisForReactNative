package defpackage;
/* compiled from: PG */
/* renamed from: arpy  reason: default package */
/* loaded from: classes2.dex */
public final class arpy extends aopi implements aoqv {
    public static final arpy a;
    private static volatile aorb i;
    public int b;
    public aroy c;
    public arqb e;
    public arqa h;
    private byte j = 2;
    public aopu d = emptyProtobufList();
    public String f = "";
    public String g = "";

    static {
        arpy arpyVar = new arpy();
        a = arpyVar;
        aopi.registerDefaultInstance(arpy.class, arpyVar);
    }

    private arpy() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0007ဈ\u0003\bဈ\u0004\tဉ\u0002\nဉ\u0005\u000b\u001b", new Object[]{"b", "c", "f", "g", "e", "h", "d", arqe.class});
            case 3:
                return new arpy();
            case 4:
                return new aopa((char[][][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arpy.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
