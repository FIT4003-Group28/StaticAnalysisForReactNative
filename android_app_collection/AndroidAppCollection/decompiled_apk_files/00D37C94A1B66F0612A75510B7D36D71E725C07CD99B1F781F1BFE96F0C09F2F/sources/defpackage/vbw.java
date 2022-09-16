package defpackage;
/* compiled from: PG */
/* renamed from: vbw  reason: default package */
/* loaded from: classes4.dex */
public final class vbw extends aopi implements aoqv {
    public static final vbw a;
    private static volatile aorb j;
    public int b;
    public String c = "";
    public aoob d = aoob.b;
    public String e = "";
    public aopu f = emptyProtobufList();
    public aopu g = aopi.emptyProtobufList();
    public boolean h;
    public long i;

    static {
        vbw vbwVar = new vbw();
        a = vbwVar;
        aopi.registerDefaultInstance(vbw.class, vbwVar);
    }

    private vbw() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", vbx.class, "g", "h", "i"});
            case 3:
                return new vbw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (vbw.class) {
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
