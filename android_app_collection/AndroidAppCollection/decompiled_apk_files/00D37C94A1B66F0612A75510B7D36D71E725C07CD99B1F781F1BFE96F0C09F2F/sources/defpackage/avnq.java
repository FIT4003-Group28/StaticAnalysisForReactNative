package defpackage;
/* compiled from: PG */
/* renamed from: avnq  reason: default package */
/* loaded from: classes2.dex */
public final class avnq extends aopi implements aoqv {
    public static final avnq a;
    private static volatile aorb i;
    public int b;
    public avne c;
    public avmy e;
    public avmt f;
    public aopu g;
    public avng h;
    private arag j;
    private apnm k;
    private aoux l;
    private aqhd m;
    private arag n;
    private aunb o;
    private byte p = 2;
    public aopu d = emptyProtobufList();

    static {
        avnq avnqVar = new avnq();
        a = avnqVar;
        aopi.registerDefaultInstance(avnq.class, avnqVar);
    }

    private avnq() {
        aoob aoobVar = aoob.b;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0002\f\u0001ᐉ\u0002\u0002Л\u0003ᐉ\u0003\u0004ᐉ\u0000\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\b\tᐉ\u0007\nЛ\u000bᐉ\u0001\fᐉ\t\u000eᐉ\n", new Object[]{"b", "j", "d", avnh.class, "k", "c", "l", "m", "n", "f", "g", apzg.class, "e", "h", "o"});
            case 3:
                return new avnq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avnq.class) {
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
