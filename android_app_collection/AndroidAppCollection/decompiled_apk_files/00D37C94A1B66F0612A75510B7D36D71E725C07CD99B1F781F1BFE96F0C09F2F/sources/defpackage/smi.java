package defpackage;
/* compiled from: PG */
/* renamed from: smi  reason: default package */
/* loaded from: classes4.dex */
public final class smi extends aopd implements aope {
    public static final /* synthetic */ int a = 0;
    private static final smi b;
    private static volatile aorb c;
    private byte d = 2;

    static {
        smi smiVar = new smi();
        b = smiVar;
        aopi.registerDefaultInstance(smi.class, smiVar);
    }

    private smi() {
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
                return newMessageInfo(b, "\u0001\u0000", null);
            case 3:
                return new smi();
            case 4:
                return new aopc(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (smi.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
