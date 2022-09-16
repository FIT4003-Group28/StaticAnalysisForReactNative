package defpackage;
/* compiled from: PG */
/* renamed from: avhn  reason: default package */
/* loaded from: classes2.dex */
public final class avhn extends aopd implements aope {
    public static final avhn a;
    private static volatile aorb j;
    public int b;
    public aovs d;
    public avhk e;
    public boolean f;
    public avhl g;
    public asos h;
    public asos i;
    private byte k = 2;
    public aopu c = emptyProtobufList();

    static {
        avhn avhnVar = new avhn();
        a = avhnVar;
        aopi.registerDefaultInstance(avhn.class, avhnVar);
    }

    private avhn() {
        aoob aoobVar = aoob.b;
    }

    public final void a() {
        aopu aopuVar = this.c;
        if (!aopuVar.c()) {
            this.c = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0001\u0000\u0001\u001b\u0004ဉ\u0002\u0007ဉ\u0005\u000bဇ\u0007\fဉ\b\rဉ\t\u000eဉ\n", new Object[]{"b", "c", avhm.class, "d", "e", "f", "g", "h", "i"});
            case 3:
                return new avhn();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (avhn.class) {
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
