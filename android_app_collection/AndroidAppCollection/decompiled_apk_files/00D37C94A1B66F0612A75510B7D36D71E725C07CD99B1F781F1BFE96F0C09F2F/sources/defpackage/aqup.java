package defpackage;
/* compiled from: PG */
/* renamed from: aqup  reason: default package */
/* loaded from: classes2.dex */
public final class aqup extends aopi implements aoqv {
    public static final aqup a;
    public static final aopg b;
    private static volatile aorb i;
    public int c;
    public avhn f;
    public boolean g;
    public boolean h;
    private byte j = 2;
    public String d = "";
    public aopu e = aopi.emptyProtobufList();

    static {
        aqup aqupVar = new aqup();
        a = aqupVar;
        aopi.registerDefaultInstance(aqup.class, aqupVar);
        b = aopi.newSingularGeneratedExtension(arai.a, aqupVar, aqupVar, null, 152040444, aosj.MESSAGE, aqup.class);
    }

    private aqup() {
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0005ᐉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqup();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqup.class) {
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
