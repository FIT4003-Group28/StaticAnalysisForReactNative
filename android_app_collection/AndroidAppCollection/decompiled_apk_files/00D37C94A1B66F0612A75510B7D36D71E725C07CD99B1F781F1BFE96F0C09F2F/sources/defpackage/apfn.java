package defpackage;
/* compiled from: PG */
/* renamed from: apfn  reason: default package */
/* loaded from: classes.dex */
public final class apfn extends aopi implements aoqv {
    public static final apfn a;
    private static volatile aorb g;
    public boolean b;
    public boolean c;
    public boolean d;
    public aopu e = aopi.emptyProtobufList();
    public boolean f;
    private int h;

    static {
        apfn apfnVar = new apfn();
        a = apfnVar;
        aopi.registerDefaultInstance(apfn.class, apfnVar);
    }

    private apfn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u0010\u0005\u0000\u0001\u0000\u0003ဇ\u0002\u000bဇ\t\rဇ\u000b\u000e\u001a\u0010ဇ\r", new Object[]{"h", "b", "c", "d", "e", "f"});
            case 3:
                return new apfn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apfn.class) {
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
