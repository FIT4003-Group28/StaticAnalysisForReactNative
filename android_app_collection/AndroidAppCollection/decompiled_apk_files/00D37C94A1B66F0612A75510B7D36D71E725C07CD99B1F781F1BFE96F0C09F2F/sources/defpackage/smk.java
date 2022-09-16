package defpackage;
/* compiled from: PG */
/* renamed from: smk  reason: default package */
/* loaded from: classes4.dex */
public final class smk extends aopd implements aope {
    private static final smk a;
    private static volatile aorb b;
    private int c;
    private int d;
    private byte e = 2;

    static {
        smk smkVar = new smk();
        a = smkVar;
        aopi.registerDefaultInstance(smk.class, smkVar);
    }

    private smk() {
    }

    public static smk c() {
        return a;
    }

    public smj a() {
        smj a2 = smj.a(this.d);
        return a2 == null ? smj.UNKNOWN : a2;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", smj.b()});
            case 3:
                return new smk();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (smk.class) {
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
