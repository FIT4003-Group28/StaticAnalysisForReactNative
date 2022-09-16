package defpackage;
/* compiled from: PG */
/* renamed from: ashz  reason: default package */
/* loaded from: classes2.dex */
public final class ashz extends aopi implements aoqv {
    public static final ashz a;
    private static volatile aorb f;
    public int b;
    public aovs d;
    public apzg e;
    private arag g;
    private byte h = 2;
    public aopu c = emptyProtobufList();

    static {
        ashz ashzVar = new ashz();
        a = ashzVar;
        aopi.registerDefaultInstance(ashz.class, ashzVar);
    }

    private ashz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0003\u0002ᐉ\u0001\u0004Л\u0005ဉ\u0003\u0006ᐉ\u0004", new Object[]{"b", "g", "c", ashy.class, "d", "e"});
            case 3:
                return new ashz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ashz.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
