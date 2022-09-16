package defpackage;
/* compiled from: PG */
/* renamed from: aqxv  reason: default package */
/* loaded from: classes2.dex */
public final class aqxv extends aopi implements aoqv {
    public static final aqxv a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public arag d;
    public apzg e;
    public avhn f;
    public aqxu g;
    public aoob h;
    private aunb j;
    private aoux k;
    private byte l = 2;

    static {
        aqxv aqxvVar = new aqxv();
        a = aqxvVar;
        aopi.registerDefaultInstance(aqxv.class, aqxvVar);
    }

    private aqxv() {
        emptyProtobufList();
        this.h = aoob.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ည\u0007\tᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "k", "h", "j"});
            case 3:
                return new aqxv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqxv.class) {
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
