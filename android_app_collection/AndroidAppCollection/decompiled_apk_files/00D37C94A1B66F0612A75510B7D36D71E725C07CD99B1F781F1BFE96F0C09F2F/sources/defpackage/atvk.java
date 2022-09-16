package defpackage;
/* compiled from: PG */
/* renamed from: atvk  reason: default package */
/* loaded from: classes2.dex */
public final class atvk extends aopi implements aoqv {
    public static final atvk a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public int d;
    public apzg e;
    public boolean f;
    private byte h = 2;

    static {
        atvk atvkVar = new atvk();
        a = atvkVar;
        aopi.registerDefaultInstance(atvk.class, atvkVar);
    }

    private atvk() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", atti.f, "e", "f"});
            case 3:
                return new atvk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atvk.class) {
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
