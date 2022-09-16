package defpackage;
/* compiled from: PG */
/* renamed from: aroy  reason: default package */
/* loaded from: classes2.dex */
public final class aroy extends aopi implements aoqv {
    public static final aroy a;
    private static volatile aorb l;
    public int b;
    public arow c;
    public arow d;
    public arpd e;
    public aroz f;
    public aros g;
    public arpc i;
    public aror j;
    private byte m = 2;
    public String h = "";
    public aopu k = emptyProtobufList();

    static {
        aroy aroyVar = new aroy();
        a = aroyVar;
        aopi.registerDefaultInstance(aroy.class, aroyVar);
    }

    private aroy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0002\u0001ဉ\u0000\u0003ဉ\u0002\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0007\bဉ\u0001\tᐉ\b\u000bဈ\u0006\f\u001b", new Object[]{"b", "c", "e", "f", "g", "i", "d", "j", "h", "k", aroq.class});
            case 3:
                return new aroy();
            case 4:
                return new aopa((int[][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aroy.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
