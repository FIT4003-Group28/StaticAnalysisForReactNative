package defpackage;
/* compiled from: PG */
/* renamed from: atim  reason: default package */
/* loaded from: classes2.dex */
public final class atim extends aopi implements aoqv {
    public static final atim a;
    private static volatile aorb k;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public apzg f;
    public atil g;
    public atik h;
    public arag i;
    public aoob j;
    private aoux l;
    private byte m = 2;

    static {
        atim atimVar = new atim();
        a = atimVar;
        aopi.registerDefaultInstance(atim.class, atimVar);
    }

    private atim() {
        emptyProtobufList();
        this.j = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\b\u0006ᐉ\t\u0007ᐉ\u0004\bᐉ\u0005\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "j", "l", "g", "h", "i"});
            case 3:
                return new atim();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (atim.class) {
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
