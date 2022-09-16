package defpackage;
/* compiled from: PG */
/* renamed from: auri  reason: default package */
/* loaded from: classes2.dex */
public final class auri extends aopi implements aoqv {
    private static volatile aorb S;
    public static final auri a;
    public avor A;
    public avot B;
    public avou C;
    public avpi D;
    public avqd E;
    public ausc F;
    public avqv G;
    public ausg H;
    public ausd I;

    /* renamed from: J  reason: collision with root package name */
    public ausa f121J;
    public ausf K;
    public avpr L;
    public ausb M;
    public avpn N;
    public aury O;
    public auqz P;
    public aurz Q;
    public aura R;
    private byte T = 2;
    public int b;
    public int c;
    public aurf d;
    public aurg e;
    public aurk f;
    public aurs g;
    public aurt h;
    public aurq i;
    public aurv j;
    public aurh k;
    public auqy l;
    public arbx m;
    public arct n;
    public aurr o;
    public aurx p;
    public auru q;
    public auqw r;
    public auqx s;
    public aurb t;
    public aure u;
    public auqv v;
    public apwn w;
    public apwl x;
    public avro y;
    public avrx z;

    static {
        auri auriVar = new auri();
        a = auriVar;
        aopi.registerDefaultInstance(auri.class, auriVar);
    }

    private auri() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.T);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.T = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001)\u0000\u0002\uf004ᴽ\ue123띙)\u0000\u0000(\uf004ᴽᐉ\u0004\uf7d8ᴾᐉ\u0001\ue6c6Ὺᐉ\u0007\uf415∱ᐉ\u0000\ue65c⌷ᐉ\f\ue0e7⏒ᐉ\u0002\uf7d7␇ᐉ\u000b\uf1de⒩ᐉ\u0003\ue0dd⠘ᐉ\b\ue71b⡺ᐉ\u0006\uea85⢲ဉ\u000e\uf006⢾ᐉ\u000f\ue80a㭴ᐉ\rﱪ㴵ᐉ\u001e\uf146㽭ᐉ\u0010ﬅ㽰ᐉ\u0011\ueee5㽴ᐉ\u001f\uf5f8䀱ᐉ%\uea13䃆ᐉ$\uf347䃺ᐉ\u0018\uf348䃺ᐉ\u0019\uf34b䃺ᐉ\u0017\ue2ce䉥ᐉ \ue39b䐄ᐉ\"\uf1dd䙇ᐉ\u0012\ue9f2䩆ᐉ\t\uec67䩗ᐉ\nﺝ䬘ᐉ#\ue334儕ᐉ&︻儤ᐉ'\ue463儧ᐉ(\uf814卓ᐉ\u001cﷶ咦ᐉ\u001d\ufadc垙ᐉ\u0013ﲛ埿ᐉ\u0014\ue1dd寰ᐉ\u001a\uf707峬ᐉ\u001b\uedd3蘕ᐉ\u0005\ueee8ꇏᐉ\u0016ﶶꇹᐉ\u0015\ue123띙ᐉ!", new Object[]{"b", "c", "h", "e", "k", "d", "p", "f", "o", "g", "l", "j", "r", "s", "q", "H", "t", "u", "I", "O", "N", "B", "C", "A", "J", "L", "v", "m", "n", "M", "P", "Q", "R", "F", "G", "w", "x", "D", "E", "i", "z", "y", "K"});
            case 3:
                return new auri();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = S;
                if (aorbVar == null) {
                    synchronized (auri.class) {
                        aorbVar = S;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            S = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
