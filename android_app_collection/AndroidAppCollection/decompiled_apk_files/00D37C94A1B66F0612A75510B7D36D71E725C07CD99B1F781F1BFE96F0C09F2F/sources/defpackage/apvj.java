package defpackage;
/* compiled from: PG */
/* renamed from: apvj  reason: default package */
/* loaded from: classes2.dex */
public final class apvj extends aopi implements aoqv {
    public static final apvj a;
    private static volatile aorb g;
    public boolean e;
    public boolean f;
    private int h;
    private aoux i;
    private arag j;
    private aunb k;
    private aunb l;
    private aoxw m;
    private byte n = 2;
    public aopu b = emptyProtobufList();
    public int c = 3;
    public aoob d = aoob.b;

    static {
        apvj apvjVar = new apvj();
        a = apvjVar;
        aopi.registerDefaultInstance(apvj.class, apvjVar);
    }

    private apvj() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0006\u0001Л\u0002င\u0000\u0003ᐉ\u0001\u0004ည\u0002\u0005ဇ\u0003\u0006ᐉ\u0004\u0007ဇ\u0005\bᐉ\u0006\tᐉ\u0007\u000bᐉ\b", new Object[]{"h", "b", apvk.class, "c", "i", "d", "e", "j", "f", "k", "l", "m"});
            case 3:
                return new apvj();
            case 4:
                return new aopa((short[][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apvj.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
