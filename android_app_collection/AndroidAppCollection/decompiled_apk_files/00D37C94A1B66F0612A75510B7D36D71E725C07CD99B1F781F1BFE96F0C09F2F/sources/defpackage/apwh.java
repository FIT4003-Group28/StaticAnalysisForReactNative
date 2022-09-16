package defpackage;
/* compiled from: PG */
/* renamed from: apwh  reason: default package */
/* loaded from: classes2.dex */
public final class apwh extends aopi implements aoqv {
    public static final aopr a = new uil(14);
    public static final apwh b;
    private static volatile aorb m;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private arag n;
    private aoux o;
    private byte p = 2;
    public aopq k = emptyIntList();
    public aoob l = aoob.b;

    static {
        apwh apwhVar = new apwh();
        b = apwhVar;
        aopi.registerDefaultInstance(apwh.class, apwhVar);
    }

    private apwh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ᐉ\b\u0005ည\t\u0006ဇ\u0006\u0007ဇ\u0007\bဇ\u0003\tဇ\u0005\nဇ\u0004\u000b,", new Object[]{"c", "n", "d", "e", "o", "l", "i", "j", "f", "h", "g", "k", attl.a()});
            case 3:
                return new apwh();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (apwh.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
