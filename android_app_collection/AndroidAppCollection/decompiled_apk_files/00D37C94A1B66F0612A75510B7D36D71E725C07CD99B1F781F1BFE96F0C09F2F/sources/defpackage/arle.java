package defpackage;
/* compiled from: PG */
/* renamed from: arle  reason: default package */
/* loaded from: classes2.dex */
public final class arle extends aopi implements aoqv {
    public static final arle a;
    private static volatile aorb m;
    public int b;
    public aroy c;
    public long d;
    public long e;
    public int f;
    public float g;
    public int h;
    public aopu i;
    public aopu j;
    public aopu k;
    public aopu l;
    private byte n = 2;

    static {
        arle arleVar = new arle();
        a = arleVar;
        aopi.registerDefaultInstance(arle.class, arleVar);
    }

    private arle() {
        emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0004\u0001\u0001ᐉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဋ\u0003\u0005ခ\u0004\u0006ဋ\u0005\b\u001b\n\u001b\u000b\u001b\f\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", arlg.class, "j", attq.class, "k", arli.class, "l", arlk.class});
            case 3:
                return new arle();
            case 4:
                return new aopa((int[]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (arle.class) {
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
