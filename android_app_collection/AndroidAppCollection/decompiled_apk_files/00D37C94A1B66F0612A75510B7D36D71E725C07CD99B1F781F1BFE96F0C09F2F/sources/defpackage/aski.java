package defpackage;
/* compiled from: PG */
/* renamed from: aski  reason: default package */
/* loaded from: classes2.dex */
public final class aski extends aopi implements aoqv {
    public static final aski a;
    private static volatile aorb m;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public float j;
    public boolean k;
    public boolean l;

    static {
        aski askiVar = new aski();
        a = askiVar;
        aopi.registerDefaultInstance(aski.class, askiVar);
    }

    private aski() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001 \n\u0000\u0000\u0000\u0001ဇ\u0000\u0011ဇ\u0010\u0018ဇ\u0015\u0019ဇ\u0016\u001aဇ\u0017\u001cဇ\u0019\u001dဇ\u001a\u001eခ\u001b\u001fဇ\u001c ဇ\u001d", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new aski();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aski.class) {
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
