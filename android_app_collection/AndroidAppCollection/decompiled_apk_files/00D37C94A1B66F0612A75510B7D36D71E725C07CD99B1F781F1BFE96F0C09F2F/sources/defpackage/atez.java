package defpackage;
/* compiled from: PG */
/* renamed from: atez  reason: default package */
/* loaded from: classes2.dex */
public final class atez extends aopi implements aoqv {
    public static final atez a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private apzg e;
    private apzg f;
    private aoux g;
    private byte h = 2;

    static {
        atez atezVar = new atez();
        a = atezVar;
        aopi.registerDefaultInstance(atez.class, atezVar);
    }

    private atez() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u0013\u0004\u0000\u0000\u0004\u0004ᐉ\b\u0005ᐉ\n\bᐉ\u0006\u0013ᐉ\u0003", new Object[]{"c", "f", "g", "e", "d"});
            case 3:
                return new atez();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atez.class) {
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
