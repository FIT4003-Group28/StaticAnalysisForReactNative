package defpackage;
/* compiled from: PG */
/* renamed from: atkb  reason: default package */
/* loaded from: classes2.dex */
public final class atkb extends aopi implements aoqv {
    public static final atkb a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private aunb f;
    private aunb g;
    private aunb h;
    private aunb i;
    private aunb j;
    private aunb k;
    private byte l = 2;

    static {
        atkb atkbVar = new atkb();
        a = atkbVar;
        aopi.registerDefaultInstance(atkb.class, atkbVar);
    }

    private atkb() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0000\b\u0002ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\u0005\u000bᐉ\u0001", new Object[]{"c", "e", "f", "h", "i", "j", "k", "g", "d"});
            case 3:
                return new atkb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atkb.class) {
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
