package defpackage;
/* compiled from: PG */
/* renamed from: aqhu  reason: default package */
/* loaded from: classes2.dex */
public final class aqhu extends aopi implements aoqv {
    public static final aqhu a;
    private static volatile aorb b;
    private int c;
    private aqhn d;
    private aunb e;
    private aunb f;
    private arag g;
    private ates h;
    private aqht i;
    private apzg j;
    private aoux k;
    private arag l;
    private aunb m;
    private byte n = 2;

    static {
        aqhu aqhuVar = new aqhu();
        a = aqhuVar;
        aopi.registerDefaultInstance(aqhu.class, aqhuVar);
    }

    private aqhu() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0005\u001d\n\u0000\u0000\n\u0005ᐉ\u0006\tᐉ\b\u000bᐉ\t\u000fᐉ\f\u0010ᐉ\n\u0012ᐉ\u0002\u0014ᐉ\u000e\u0018ᐉ\u0011\u001cᐉ\u0003\u001dᐉ\u0004", new Object[]{"c", "g", "h", "i", "k", "j", "d", "l", "m", "e", "f"});
            case 3:
                return new aqhu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhu.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
