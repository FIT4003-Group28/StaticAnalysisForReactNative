package defpackage;
/* compiled from: PG */
/* renamed from: aqrd  reason: default package */
/* loaded from: classes2.dex */
public final class aqrd extends aopi implements aoqv {
    public static final aqrd a;
    private static volatile aorb e;
    public int b;
    private byte f = 2;
    public aopu c = emptyProtobufList();
    public String d = "";

    static {
        aqrd aqrdVar = new aqrd();
        a = aqrdVar;
        aopi.registerDefaultInstance(aqrd.class, aqrdVar);
    }

    private aqrd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000", new Object[]{"b", "c", aqra.class, "d"});
            case 3:
                return new aqrd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqrd.class) {
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
