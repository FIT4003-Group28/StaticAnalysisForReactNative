package defpackage;
/* compiled from: PG */
/* renamed from: atqb  reason: default package */
/* loaded from: classes2.dex */
public final class atqb extends aopi implements aoqv {
    public static final atqb a;
    private static volatile aorb k;
    public arag b;
    public arag c;
    public apzg f;
    public int h;
    public avhn i;
    public ates j;
    private int l;
    private byte m = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public String g = "";

    static {
        atqb atqbVar = new atqb();
        a = atqbVar;
        aopi.registerDefaultInstance(atqb.class, atqbVar);
    }

    private atqb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004Л\u0005ᐉ\u0002\u0007ဈ\u0003\bဌ\u0004\tᐉ\u0005\nᐉ\u0006", new Object[]{"l", "b", "c", "d", arag.class, "e", avhn.class, "f", "g", "h", apog.a, "i", "j"});
            case 3:
                return new atqb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (atqb.class) {
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
