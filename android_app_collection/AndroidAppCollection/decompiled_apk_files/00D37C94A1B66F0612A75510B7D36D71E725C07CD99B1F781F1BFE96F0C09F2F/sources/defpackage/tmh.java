package defpackage;
/* compiled from: PG */
/* renamed from: tmh  reason: default package */
/* loaded from: classes4.dex */
public final class tmh extends aopd implements tmi {
    public static final tmh a;
    private static volatile aorb g;
    public int b;
    public angf d;
    public int e;
    public long f;
    private byte h = 2;
    public aopq c = emptyIntList();

    static {
        tmh tmhVar = new tmh();
        a = tmhVar;
        aopi.registerDefaultInstance(tmh.class, tmhVar);
    }

    private tmh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005ဌ\u0001\u0006ဂ\u0002", new Object[]{"b", "c", "d", "e", adzd.s, "f"});
            case 3:
                return new tmh();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (tmh.class) {
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
