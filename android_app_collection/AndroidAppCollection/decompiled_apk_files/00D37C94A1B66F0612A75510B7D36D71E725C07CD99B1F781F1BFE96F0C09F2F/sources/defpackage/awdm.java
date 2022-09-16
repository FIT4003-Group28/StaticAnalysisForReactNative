package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: awdm  reason: default package */
/* loaded from: classes2.dex */
public final class awdm extends aopi implements aoqv {
    public static final awdm a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public apzg d;
    public awdq f;
    private arag i;
    private aoux j;
    private byte k = 2;
    public aopu e = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        awdm awdmVar = new awdm();
        a = awdmVar;
        aopi.registerDefaultInstance(awdm.class, awdmVar);
    }

    private awdm() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tည\u0007", new Object[]{"b", "c", "d", "e", awdl.class, "f", "i", "j", "g"});
            case 3:
                return new awdm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awdm.class) {
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
