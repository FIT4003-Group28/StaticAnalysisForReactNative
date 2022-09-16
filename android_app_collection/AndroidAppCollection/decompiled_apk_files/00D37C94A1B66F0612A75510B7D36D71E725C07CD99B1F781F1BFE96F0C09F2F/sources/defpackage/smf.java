package defpackage;
/* compiled from: PG */
/* renamed from: smf  reason: default package */
/* loaded from: classes4.dex */
public final class smf extends aopi implements aoqv {
    public static final smf a;
    private static volatile aorb j;
    public int b;
    public boolean g;
    public boolean i;
    public aopq c = emptyIntList();
    public aopu d = aopi.emptyProtobufList();
    public String e = "";
    public String f = "";
    public aopq h = emptyIntList();

    static {
        smf smfVar = new smf();
        a = smfVar;
        aopi.registerDefaultInstance(smf.class, smfVar);
    }

    private smf() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0016\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဇ\u0002\u0005\u001a\u0006\u0016\u0007ဇ\u0003", new Object[]{"b", "c", "e", "f", "g", "d", "h", "i"});
            case 3:
                return new smf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (smf.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
