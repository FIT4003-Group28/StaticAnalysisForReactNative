package defpackage;
/* compiled from: PG */
/* renamed from: apmg  reason: default package */
/* loaded from: classes.dex */
public final class apmg extends aopi implements aoqv {
    public static final apmg a;
    private static volatile aorb g;
    public int b;
    public apmk c;
    public apmi d;
    public apmh e;
    public atfh f;
    private apmm h;
    private byte i = 2;

    static {
        apmg apmgVar = new apmg();
        a = apmgVar;
        aopi.registerDefaultInstance(apmg.class, apmgVar);
    }

    private apmg() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\ue5d8ᡈ\ue496㴵\u0005\u0000\u0000\u0005\ue5d8ᡈᐉ\u0004\uf03a\u2b94ᐉ\u0000ﭥ㇃ᐉ\u0001\ue5b3㇊ᐉ\u0002\ue496㴵ᐉ\u0003", new Object[]{"b", "h", "c", "d", "e", "f"});
            case 3:
                return new apmg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apmg.class) {
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
