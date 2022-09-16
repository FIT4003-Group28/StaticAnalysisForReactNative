package defpackage;
/* compiled from: PG */
/* renamed from: awnq  reason: default package */
/* loaded from: classes2.dex */
public final class awnq extends aopd implements aope {
    public static final awnq a;
    public static final aopg b;
    private static volatile aorb c;
    private byte d = 2;

    static {
        awnq awnqVar = new awnq();
        a = awnqVar;
        aopi.registerDefaultInstance(awnq.class, awnqVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awnqVar, awnqVar, null, 342268478, aosj.MESSAGE, awnq.class);
    }

    private awnq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new awnq();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awnq.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
