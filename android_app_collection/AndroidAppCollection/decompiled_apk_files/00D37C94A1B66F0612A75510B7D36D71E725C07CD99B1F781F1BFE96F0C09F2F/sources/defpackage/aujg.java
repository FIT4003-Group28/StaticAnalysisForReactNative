package defpackage;
/* compiled from: PG */
/* renamed from: aujg  reason: default package */
/* loaded from: classes2.dex */
public final class aujg extends aopi implements aoqv {
    public static final aujg a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private aunb g;
    private apzg h;
    private apzg i;
    private ates j;
    private aozy k;
    private aoux l;
    private aunb m;
    private aunb n;
    private byte o = 2;

    static {
        aujg aujgVar = new aujg();
        a = aujgVar;
        aopi.registerDefaultInstance(aujg.class, aujgVar);
    }

    private aujg() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.o = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u0013\u000b\u0000\u0000\u000b\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\nᐉ\b\u000bᐉ\t\fᐉ\n\u0011ᐉ\u0007\u0012ᐉ\u000e\u0013ᐉ\u000f", new Object[]{"c", "d", "e", "f", "g", "h", "j", "k", "l", "i", "m", "n"});
            case 3:
                return new aujg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aujg.class) {
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
