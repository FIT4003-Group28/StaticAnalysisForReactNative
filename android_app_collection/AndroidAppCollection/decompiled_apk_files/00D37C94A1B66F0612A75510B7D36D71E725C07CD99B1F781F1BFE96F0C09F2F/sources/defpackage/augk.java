package defpackage;
/* compiled from: PG */
/* renamed from: augk  reason: default package */
/* loaded from: classes2.dex */
public final class augk extends aopi implements aoqv {
    public static final augk a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public avhn d;
    public apzg e;
    public int f;
    public int g;
    public aunb h;
    public arag i;
    private aoux m;
    private byte n = 2;
    public aoob j = aoob.b;
    public aopu k = emptyProtobufList();

    static {
        augk augkVar = new augk();
        a = augkVar;
        aopi.registerDefaultInstance(augk.class, augkVar);
    }

    private augk() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tည\b\nЛ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "m", "j", "k", apzg.class});
            case 3:
                return new augk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (augk.class) {
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
