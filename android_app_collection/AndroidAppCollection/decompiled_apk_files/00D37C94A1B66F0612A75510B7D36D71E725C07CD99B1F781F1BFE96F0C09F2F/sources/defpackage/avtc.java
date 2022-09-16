package defpackage;
/* compiled from: PG */
/* renamed from: avtc  reason: default package */
/* loaded from: classes2.dex */
public final class avtc extends aopi implements aoqv {
    public static final avtc a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public String e;
    public apzg f;
    private byte h = 2;
    public aopu d = emptyProtobufList();

    static {
        avtc avtcVar = new avtc();
        a = avtcVar;
        aopi.registerDefaultInstance(avtc.class, avtcVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, avtcVar, avtcVar, null, 126705043, aosj.MESSAGE, avtc.class);
    }

    private avtc() {
        emptyProtobufList();
        this.e = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001\u001b\u0004ဈ\u0000\u0005ᐉ\u0001", new Object[]{"c", "d", arvh.class, "e", "f"});
            case 3:
                return new avtc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avtc.class) {
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
