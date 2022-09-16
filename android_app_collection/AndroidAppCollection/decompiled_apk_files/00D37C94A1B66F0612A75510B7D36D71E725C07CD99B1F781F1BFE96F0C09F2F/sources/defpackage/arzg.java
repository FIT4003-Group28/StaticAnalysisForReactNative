package defpackage;
/* compiled from: PG */
/* renamed from: arzg  reason: default package */
/* loaded from: classes2.dex */
public final class arzg extends aopi implements aoqv {
    public static final arzg a;
    private static volatile aorb g;
    public int b;
    public aroy c;
    public boolean f;
    private byte h = 2;
    public aopu d = emptyProtobufList();
    public String e = "";

    static {
        arzg arzgVar = new arzg();
        a = arzgVar;
        aopi.registerDefaultInstance(arzg.class, arzgVar);
    }

    private arzg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", arzm.class, "e", "f"});
            case 3:
                return new arzg();
            case 4:
                return new aopa((boolean[][][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arzg.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
