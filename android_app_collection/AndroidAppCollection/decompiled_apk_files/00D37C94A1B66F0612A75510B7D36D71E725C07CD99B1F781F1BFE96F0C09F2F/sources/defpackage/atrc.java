package defpackage;
/* compiled from: PG */
/* renamed from: atrc  reason: default package */
/* loaded from: classes2.dex */
public final class atrc extends aopd implements aope {
    public static final aopr a = new asvu(3);
    public static final atrc b;
    private static volatile aorb g;
    public int c;
    public int d;
    private byte h = 2;
    public aopq e = emptyIntList();
    public aopq f = emptyIntList();

    static {
        atrc atrcVar = new atrc();
        b = atrcVar;
        aopi.registerDefaultInstance(atrc.class, atrcVar);
    }

    private atrc() {
    }

    public final void a() {
        aopq aopqVar = this.e;
        if (!aopqVar.c()) {
            this.e = aopi.mutableCopy(aopqVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001e\u0003\u0016", new Object[]{"c", "d", "e", atra.a(), "f"});
            case 3:
                return new atrc();
            case 4:
                return new aopc(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atrc.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void e() {
        aopq aopqVar = this.f;
        if (!aopqVar.c()) {
            this.f = aopi.mutableCopy(aopqVar);
        }
    }
}
