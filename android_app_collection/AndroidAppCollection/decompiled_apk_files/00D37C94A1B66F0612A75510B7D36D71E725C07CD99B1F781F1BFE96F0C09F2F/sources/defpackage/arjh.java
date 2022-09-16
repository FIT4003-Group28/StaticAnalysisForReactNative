package defpackage;
/* compiled from: PG */
/* renamed from: arjh  reason: default package */
/* loaded from: classes2.dex */
public final class arjh extends aopi implements aoqv {
    public static final arjh a;
    private static volatile aorb k;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public boolean f;
    public arag g;
    public apzg h;
    private arir l;
    private aoux m;
    private byte n = 2;
    public aopu i = emptyProtobufList();
    public aoob j = aoob.b;

    static {
        arjh arjhVar = new arjh();
        a = arjhVar;
        aopi.registerDefaultInstance(arjh.class, arjhVar);
    }

    private arjh() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0007\bည\b\tᐉ\u0002\nဇ\u0003\u000e\u001b\u000fᐉ\u0005\u0010ᐉ\u0006", new Object[]{"b", "c", "d", "l", "m", "j", "e", "f", "i", aswg.class, "g", "h"});
            case 3:
                return new arjh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (arjh.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
