package defpackage;
/* compiled from: PG */
/* renamed from: athe  reason: default package */
/* loaded from: classes2.dex */
public final class athe extends aopi implements aoqv {
    public static final athe a;
    private static volatile aorb m;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public apob h;
    public boolean i;
    public aopq j;
    public atnt k;
    public awet l;
    private int n;

    static {
        athe atheVar = new athe();
        a = atheVar;
        aopi.registerDefaultInstance(athe.class, atheVar);
    }

    private athe() {
        emptyIntList();
        aopi.emptyProtobufList();
        this.j = emptyIntList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u000b'\u000b\u0000\u0001\u0000\u000bဇ\u0006\rဇ\b\u0019ဇ\u000f\u001fဇ\u0015 ဇ\u0016\"ဇ\u0018#ဉ\u0019$ဇ\u001a%\u0016&ဉ\u001b'ဉ\u001c", new Object[]{"n", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new athe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (athe.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
