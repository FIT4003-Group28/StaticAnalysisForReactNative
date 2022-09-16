package defpackage;
/* compiled from: PG */
/* renamed from: attp  reason: default package */
/* loaded from: classes2.dex */
public final class attp extends aopi implements aoqv {
    public static final attp a;
    private static volatile aorb j;
    public int b;
    public boolean c;
    public atto d;
    public attn g;
    private aoux k;
    private byte l = 2;
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public aopu h = emptyProtobufList();
    public aoob i = aoob.b;

    static {
        attp attpVar = new attp();
        a = attpVar;
        aopi.registerDefaultInstance(attp.class, attpVar);
    }

    private attp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0003\u0006\u0001ဇ\u0000\u0002ᐉ\u0003\u0003Л\u0004ည\u0007\u0005ᐉ\u0004\bᐉ\u0006\tЛ\u000bЛ", new Object[]{"b", "c", "d", "e", attk.class, "i", "g", "k", "h", apzg.class, "f", attm.class});
            case 3:
                return new attp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (attp.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
