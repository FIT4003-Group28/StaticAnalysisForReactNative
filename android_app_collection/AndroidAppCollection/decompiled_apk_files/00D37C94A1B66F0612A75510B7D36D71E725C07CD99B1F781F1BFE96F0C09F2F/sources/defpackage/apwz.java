package defpackage;
/* compiled from: PG */
/* renamed from: apwz  reason: default package */
/* loaded from: classes2.dex */
public final class apwz extends aopi implements aoqv {
    public static final apwz a;
    private static volatile aorb i;
    public int b;
    public apwu c;
    public apwy d;
    public int f;
    public aopu g;
    public aoob h;
    private aoux j;
    private byte k = 2;
    public aopu e = emptyProtobufList();

    static {
        apwz apwzVar = new apwz();
        a = apwzVar;
        aopi.registerDefaultInstance(apwz.class, apwzVar);
    }

    private apwz() {
        emptyProtobufList();
        this.g = aopi.emptyProtobufList();
        this.h = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0003\u0001ᐉ\u0001\u0002Л\u0004ဋ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007ဉ\u0000\b\u001a", new Object[]{"b", "d", "e", apxb.class, "f", "j", "h", "c", "g"});
            case 3:
                return new apwz();
            case 4:
                return new aopa((short[][][]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apwz.class) {
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
