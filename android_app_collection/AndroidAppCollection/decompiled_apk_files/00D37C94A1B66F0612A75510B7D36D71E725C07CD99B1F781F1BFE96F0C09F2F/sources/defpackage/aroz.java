package defpackage;
/* compiled from: PG */
/* renamed from: aroz  reason: default package */
/* loaded from: classes2.dex */
public final class aroz extends aopi implements aoqv {
    public static final aroz a;
    private static volatile aorb e;
    public int b;
    public boolean c;
    public aopu d;
    private angh f;
    private aote g;
    private angh h;
    private byte i = 2;

    static {
        aroz arozVar = new aroz();
        a = arozVar;
        aopi.registerDefaultInstance(aroz.class, arozVar);
    }

    private aroz() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0005\u001a\u0005\u0000\u0001\u0003\u0005ᐉ\u0000\u000bᐉ\u0007\u000eဇ\r\u0011ᐉ\u000f\u001a\u001b", new Object[]{"b", "f", "g", "c", "h", "d", aqgk.class});
            case 3:
                return new aroz();
            case 4:
                return new aopa((char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aroz.class) {
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
