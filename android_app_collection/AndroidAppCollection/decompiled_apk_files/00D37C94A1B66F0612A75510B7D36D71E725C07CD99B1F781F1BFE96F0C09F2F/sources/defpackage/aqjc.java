package defpackage;
/* compiled from: PG */
/* renamed from: aqjc  reason: default package */
/* loaded from: classes2.dex */
public final class aqjc extends aopi implements aoqv {
    public static final aqjc a;
    private static volatile aorb e;
    public int b;
    public arag d;
    private aoux f;
    private arag g;
    private byte h = 2;
    public aopu c = emptyProtobufList();

    static {
        aqjc aqjcVar = new aqjc();
        a = aqjcVar;
        aopi.registerDefaultInstance(aqjc.class, aqjcVar);
    }

    private aqjc() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0004\u0001Л\u0002ᐉ\u0000\u0004ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"b", "c", aunb.class, "d", "f", "g"});
            case 3:
                return new aqjc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqjc.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
