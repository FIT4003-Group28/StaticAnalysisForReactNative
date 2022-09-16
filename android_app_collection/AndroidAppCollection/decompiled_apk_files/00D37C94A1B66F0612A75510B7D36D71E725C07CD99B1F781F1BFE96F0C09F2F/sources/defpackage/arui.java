package defpackage;
/* compiled from: PG */
/* renamed from: arui  reason: default package */
/* loaded from: classes2.dex */
public final class arui extends aopi implements aoqv {
    public static final arui a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    public boolean d;
    public boolean f;
    public aruj g;
    private byte i = 2;
    public aopu e = emptyProtobufList();

    static {
        arui aruiVar = new arui();
        a = aruiVar;
        aopi.registerDefaultInstance(arui.class, aruiVar);
    }

    private arui() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0002\u0001ᐉ\u0000\u0003ဇ\u0001\u0004Л\u0006ဇ\u0003\bဉ\u0005", new Object[]{"b", "c", "d", "e", aoxp.class, "f", "g"});
            case 3:
                return new arui();
            case 4:
                return new aopa((boolean[][]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arui.class) {
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
