package defpackage;
/* compiled from: PG */
/* renamed from: arkm  reason: default package */
/* loaded from: classes2.dex */
public final class arkm extends aopi implements aoqv {
    public static final arkm a;
    private static volatile aorb i;
    public int b;
    public Object d;
    public aroy e;
    public int f;
    public aopu g;
    public arkl h;
    private apzg j;
    public int c = 0;
    private byte k = 2;

    static {
        arkm arkmVar = new arkm();
        a = arkmVar;
        aopi.registerDefaultInstance(arkm.class, arkmVar);
    }

    private arkm() {
        aoob aoobVar = aoob.b;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\u0012\b\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ဌ\u0001\u0004Л\u0005ᐉ\u0004\fြ\u0000\rျ\u0000\u000eျ\u0000\u0012ဉ\r", new Object[]{"d", "c", "b", "e", "f", arka.c, "g", aoxp.class, "j", aqlm.class, "h"});
            case 3:
                return new arkm();
            case 4:
                return new aopa((short[][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arkm.class) {
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
