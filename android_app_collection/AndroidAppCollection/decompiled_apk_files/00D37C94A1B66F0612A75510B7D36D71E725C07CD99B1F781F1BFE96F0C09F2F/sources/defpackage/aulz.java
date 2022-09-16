package defpackage;
/* compiled from: PG */
/* renamed from: aulz  reason: default package */
/* loaded from: classes2.dex */
public final class aulz extends aopi implements aoqv {
    public static final aulz a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public arhs d;
    public arag e;
    public int f;
    public aunb g;
    public auly i;
    public aunb k;
    private aoux m;
    private byte n = 2;
    public aopu h = emptyProtobufList();
    public aoob j = aoob.b;

    static {
        aulz aulzVar = new aulz();
        a = aulzVar;
        aopi.registerDefaultInstance(aulz.class, aulzVar);
    }

    private aulz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0004\u0003Л\u0004ᐉ\u0006\u0005ည\u0007\u0006ᐉ\b\u0007ဉ\u0005\bᐉ\u0001\tᐉ\u0002\nဌ\u0003", new Object[]{"b", "c", "g", "h", aunb.class, "m", "j", "k", "i", "d", "e", "f", aulk.i});
            case 3:
                return new aulz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aulz.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
