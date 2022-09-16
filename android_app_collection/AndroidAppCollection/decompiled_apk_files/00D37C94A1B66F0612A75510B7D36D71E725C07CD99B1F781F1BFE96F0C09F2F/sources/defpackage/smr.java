package defpackage;
/* compiled from: PG */
/* renamed from: smr  reason: default package */
/* loaded from: classes4.dex */
public final class smr extends aopi implements aoqv {
    public static final smr a;
    private static volatile aorb h;
    public int b;
    public smm c;
    public smq d;
    public smk f;
    private byte i = 2;
    public aopu e = emptyProtobufList();
    public aopq g = emptyIntList();

    static {
        smr smrVar = new smr();
        a = smrVar;
        aopi.registerDefaultInstance(smr.class, smrVar);
    }

    private smr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0005\u001b\u0006ᐉ\u0004\u0007\u001e", new Object[]{"b", "c", "d", "e", smh.class, "f", "g", sml.b});
            case 3:
                return new smr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (smr.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
