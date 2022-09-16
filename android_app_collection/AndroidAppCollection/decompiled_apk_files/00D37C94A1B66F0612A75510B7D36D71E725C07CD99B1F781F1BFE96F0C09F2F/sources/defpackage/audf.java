package defpackage;
/* compiled from: PG */
/* renamed from: audf  reason: default package */
/* loaded from: classes2.dex */
public final class audf extends aopi implements aoqv {
    public static final audf a;
    private static volatile aorb h;
    public int b;
    public audk c;
    public audd d;
    public audh e;
    public aqtb f;
    public atfa g;
    private avpa i;
    private avqa j;
    private apjd k;
    private aucl l;
    private audm m;
    private byte n = 2;

    static {
        audf audfVar = new audf();
        a = audfVar;
        aopi.registerDefaultInstance(audf.class, audfVar);
    }

    private audf() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\uf875ᢰﾭ朰\n\u0000\u0000\n\uf875ᢰᐉ\u0000\ue592᯦ᐉ\t\ue0b9⸫ᐉ\u0003\ue377\u2e52ᐉ\u0001\ue3c8\u2e52ᐉ\u0002ﱉ㚈ᐉ\u0004\uecd5䉹ᐉ\u0005\uf492䤳ᐉ\b\ue091抢ᐉ\u0006ﾭ朰ᐉ\u0007", new Object[]{"b", "c", "g", "k", "i", "j", "l", "d", "f", "m", "e"});
            case 3:
                return new audf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (audf.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
