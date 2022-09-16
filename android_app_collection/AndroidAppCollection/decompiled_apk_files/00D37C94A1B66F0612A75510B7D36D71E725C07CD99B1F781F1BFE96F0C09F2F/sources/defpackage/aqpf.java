package defpackage;
/* compiled from: PG */
/* renamed from: aqpf  reason: default package */
/* loaded from: classes2.dex */
public final class aqpf extends aopi implements aoqv {
    public static final aqpf a;
    public static final aopg b;
    private static volatile aorb i;
    public int c;
    public boolean d;
    private byte j = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        aqpf aqpfVar = new aqpf();
        a = aqpfVar;
        aopi.registerDefaultInstance(aqpf.class, aqpfVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqpfVar, aqpfVar, null, 355044355, aosj.MESSAGE, aqpf.class);
    }

    private aqpf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqpf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqpf.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
