package defpackage;
/* compiled from: PG */
/* renamed from: aoxz  reason: default package */
/* loaded from: classes.dex */
public final class aoxz extends aopi implements aoqv {
    public static final aoxz a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private aunb f;
    private aunb g;
    private aunb h;
    private aunb i;
    private aunb j;
    private apzg k;
    private aoux l;
    private byte m = 2;

    static {
        aoxz aoxzVar = new aoxz();
        a = aoxzVar;
        aopi.registerDefaultInstance(aoxz.class, aoxzVar);
    }

    private aoxz() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.m = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\t\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0007\u0007ᐉ\u000b\nᐉ\u0006\u000bᐉ\u0000", new Object[]{"c", "e", "f", "g", "h", "i", "k", "l", "j", "d"});
            case 3:
                return new aoxz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aoxz.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
