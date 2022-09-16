package defpackage;
/* compiled from: PG */
/* renamed from: aten  reason: default package */
/* loaded from: classes2.dex */
public final class aten extends aopi implements aoqv {
    public static final aten a;
    private static volatile aorb q;
    public int b;
    public ateo c;
    public ater d;
    public ateq e;
    public atex f;
    public atej g;
    public atek h;
    public atew i;
    public avrr j;
    public avrs k;
    public atet l;
    public avqs m;
    public atef n;
    public auyw o;
    public aqtb p;
    private byte r = 2;

    static {
        aten atenVar = new aten();
        a = atenVar;
        aopi.registerDefaultInstance(aten.class, atenVar);
    }

    private aten() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\uef94ᾮ\uf7d1ꂤ\u000e\u0000\u0000\u000e\uef94ᾮᐉ\u0000\uefc3ᾮᐉ\u0001ﶃⓖᐉ\u0005\ueea7ⓗᐉ\u0004\uf42d▚ᐉ\u0003\uf492䤳ᐉ\r\ue8e7䴓ᐉ\u0006\uf389櫀ᐉ\u0007﹉淹ᐉ\bﺥ瓧ᐉ\t\uea03磭ᐉ\n\ue957茥ᐉ\u000b\uef21队ᐉ\f\uf7d1ꂤᐉ\u0002", new Object[]{"b", "c", "d", "h", "g", "f", "p", "i", "j", "k", "l", "m", "n", "o", "e"});
            case 3:
                return new aten();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (aten.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
