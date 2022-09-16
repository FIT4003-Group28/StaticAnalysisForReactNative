package defpackage;
/* compiled from: PG */
/* renamed from: atmu  reason: default package */
/* loaded from: classes2.dex */
public final class atmu extends aopi implements aoqv {
    public static final atmu a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aunb e;
    private aunb f;
    private aunb g;
    private aoux h;
    private aunb i;
    private aunb j;
    private apzg k;
    private aunb l;
    private byte m = 2;

    static {
        atmu atmuVar = new atmu();
        a = atmuVar;
        aopi.registerDefaultInstance(atmu.class, atmuVar);
    }

    private atmu() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\u0003", new Object[]{"c", "d", "e", "f", "h", "i", "j", "k", "l", "g"});
            case 3:
                return new atmu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atmu.class) {
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
