package defpackage;
/* compiled from: PG */
/* renamed from: atfw  reason: default package */
/* loaded from: classes2.dex */
public final class atfw extends aopi implements aoqv {
    private static volatile aorb B;
    public static final atfw a;
    public apeu A;
    private avwl C;
    private byte D = 2;
    public int b;
    public int c;
    public auml d;
    public avtk e;
    public asfs f;
    public atdb g;
    public aski h;
    public atxf i;
    public aqle j;
    public aqwl k;
    public aufi l;
    public apgv m;
    public aqwq n;
    public arbn o;
    public apfn p;
    public apej q;
    public apil r;
    public atts s;
    public aqju t;
    public apfc u;
    public apgt v;
    public apep w;
    public avff x;
    public apgu y;
    public aqlc z;

    static {
        atfw atfwVar = new atfw();
        a = atfwVar;
        aopi.registerDefaultInstance(atfw.class, atfwVar);
    }

    private atfw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.D);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.D = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0002ﭹ᥏\ue98f㷖\u0019\u0000\u0000\u0002ﭹ᥏ဉ\u0000\ue63bᮊဉ\u0011︿Ḗᐉ\u0001；‵ဉ\u0004遼⃝ဉ\u000b\uf601⃩ဉ\f\ufb0d⌰ဉ\u0003ｦ⍲ဉ\u0012\uf20e┶ဉ\u0017\uec7b\u2baeဉ\u001dﵘ\u2bb0ဉ\u001b\uf48fⱓဉ\u001e\uf007⸑ဉ\u001f\ue4ef⽴ဉ\u000f\ue987〙ဉ\u001c\ufd42ヶဉ$\ueea0ヷဉ#\ue3a3ㅆဉ%ﵝ㏌ဉ(\ue70c㔱ᐉ\u0002\uf79c㕛ဉ\r\ue44a㖌ဉ\u000e\uef32㳠ဉ1\uf2f2㷔ဉ2\ue98f㷖ဉ4", new Object[]{"b", "c", "d", "m", "e", "g", "h", "i", "f", "n", "o", "r", "p", "s", "t", "l", "q", "v", "u", "w", "x", "C", "j", "k", "y", "z", "A"});
            case 3:
                return new atfw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = B;
                if (aorbVar == null) {
                    synchronized (atfw.class) {
                        aorbVar = B;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            B = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
