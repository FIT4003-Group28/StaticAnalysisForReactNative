package defpackage;
/* compiled from: PG */
/* renamed from: aurg  reason: default package */
/* loaded from: classes2.dex */
public final class aurg extends aopi implements aoqv {
    public static final aurg a;
    private static volatile aorb q;
    public int b;
    public int c;
    public arag d;
    public arag e;
    public boolean f;
    public boolean g;
    public apzg h;
    public apzg i;
    public arag j;
    public arag k;
    public aurl l;
    public aurl m;
    public aunb n;
    private aoux r;
    private byte s = 2;
    public aopu o = emptyProtobufList();
    public aoob p = aoob.b;

    static {
        aurg aurgVar = new aurg();
        a = aurgVar;
        aopi.registerDefaultInstance(aurg.class, aurgVar);
    }

    private aurg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0012\u000f\u0000\u0001\n\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ဇ\u0006\u0005ᐉ\t\u0006ᐉ\n\u0007ᐉ\u000b\b\u001b\tဇ\u0007\nᐉ\f\u000bᐉ\u000e\fᐉ\u0011\rည\u0012\u000eᐉ\r\u000fဌ\u0000\u0012ᐉ\u000f", new Object[]{"b", "d", "e", "f", "h", "i", "j", "o", ausj.class, "g", "k", "m", "r", "p", "l", "c", aupm.m, "n"});
            case 3:
                return new aurg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (aurg.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
