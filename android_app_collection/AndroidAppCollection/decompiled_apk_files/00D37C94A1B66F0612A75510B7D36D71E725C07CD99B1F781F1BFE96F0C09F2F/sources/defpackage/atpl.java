package defpackage;
/* compiled from: PG */
/* renamed from: atpl  reason: default package */
/* loaded from: classes2.dex */
public final class atpl extends aopd implements aope {
    public static final atpl a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arag d;
    public apzg e;
    public int g;
    private aoux i;
    private byte j = 2;
    public aoob f = aoob.b;

    static {
        atpl atplVar = new atpl();
        a = atplVar;
        aopi.registerDefaultInstance(atpl.class, atplVar);
    }

    private atpl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0006ဌ\u0005", new Object[]{"b", "c", "d", "e", "i", "f", "g", aqfh.p});
            case 3:
                return new atpl();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atpl.class) {
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
