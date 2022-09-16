package defpackage;
/* compiled from: PG */
/* renamed from: apyy  reason: default package */
/* loaded from: classes2.dex */
public final class apyy extends aopi implements aoqv {
    private static volatile aorb F;
    public static final apyy a;
    public aqyn A;
    public apes B;
    public aqxe C;
    public auol D;
    public aukw E;
    private int G;
    public int b;
    public apfo d;
    public asxj e;
    public apdl f;
    public atjw g;
    public apfd h;
    public aovy i;
    public aowu j;
    public atfw k;
    public aunf l;
    public atqk m;
    public atcj n;
    public athd o;
    public aqto p;
    public atdx q;
    public asvs r;
    public avve s;
    public asvi t;
    public aveq u;
    public atzt v;
    public atpm w;
    public aukh x;
    public aqda y;
    public apzt z;
    private byte H = 2;
    public String c = "";

    static {
        apyy apyyVar = new apyy();
        a = apyyVar;
        aopi.registerDefaultInstance(apyy.class, apyyVar);
    }

    private apyy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.H);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.H = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001d\u0000\u0002\u0001\ue444귛\u001d\u0000\u0000\u0001\u0001ဈ\u0000\u0004ဉ\u0015\ue948㖈ဉ\u0003\uf69a㻒ဉ\u0004祉㼞ဉ\u0007\uec0f㾐ဉ\t\uee68䀼ဉ\u0005\uf593䁟ᐉ\n\ue4a4䆮ဉ\u0006\ue04c䕮ဉ\f\ue7c6䠑ဉ\u0010\ueb23䡟ဉ\u0011\ueb51䯔ဉ\u0012\ue6c3䳄ဉ\u0013\ue71e䵲ဉ\u0016\ue7b1为ဉ\u0017ﱷ亀ဉ\u0018ﲘ兪ဉ\u001a\ue33d劎ဉ\u001bﾦ塍ဉ\u001d\uf211帧ဉ\u001f\uf519損ဉ \ue779暇ဉ!\ue5eb瓠ဉ#\ue2a9盦ဉ\b\ue1c7齙ဉ%\uefebꕋဉ&\ufaf0ꕋဉ'\ue444귛ဉ(", new Object[]{"b", "G", "c", "q", "d", "e", "h", "j", "f", "k", "g", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "i", "B", "C", "D", "E"});
            case 3:
                return new apyy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = F;
                if (aorbVar == null) {
                    synchronized (apyy.class) {
                        aorbVar = F;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            F = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
