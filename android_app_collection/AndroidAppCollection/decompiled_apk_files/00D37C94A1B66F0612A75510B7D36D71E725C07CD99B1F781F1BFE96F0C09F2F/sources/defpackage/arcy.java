package defpackage;
/* compiled from: PG */
/* renamed from: arcy  reason: default package */
/* loaded from: classes2.dex */
public final class arcy extends aopi implements aoqv {
    public static final arcy a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public arag d;
    public apok e;
    public avhn f;
    public arhs g;
    public avhn h;
    public apzg i;
    private apzg l;
    private aoux m;
    private byte n = 2;
    public aoob j = aoob.b;

    static {
        arcy arcyVar = new arcy();
        a = arcyVar;
        aopi.registerDefaultInstance(arcy.class, arcyVar);
    }

    private arcy() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\n\tည\u000b\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "m", "j", "l"});
            case 3:
                return new arcy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (arcy.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
