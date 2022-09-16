package defpackage;
/* compiled from: PG */
/* renamed from: avfk  reason: default package */
/* loaded from: classes2.dex */
public final class avfk extends aopi implements aoqv {
    public static final avfk a;
    private static volatile aorb d;
    public int b;
    public auqh c;
    private aslq e;
    private avfr f;
    private aqwh g;
    private audg h;
    private aqha i;
    private avpg j;
    private arcy k;
    private atfa l;
    private avlj m;
    private aurh n;
    private aurg o;
    private auqz p;
    private aurz q;
    private aura r;
    private aurf s;
    private aurs t;
    private aurt u;
    private aunx v;
    private atmc w;
    private byte x = 2;

    static {
        avfk avfkVar = new avfk();
        a = avfkVar;
        aopi.registerDefaultInstance(avfk.class, avfkVar);
    }

    private avfk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.x = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\ue824ᝌ\ue7f2蓫\u0014\u0000\u0000\u0014\ue824ᝌᐉ\u0002\ue7f5ណᐉ\u0000\uec06\u17efᐉ\u0001\uf158ᠤᐉ\u0004\ue592᯦ᐉ\n\uf004ᴽᐉ\u0013\uf7d8ᴾᐉ\r﮼\u1f4fᐉ\t\ue6c6Ὺᐉ\f\uf415∱ᐉ\u0011\uec84⎵ᐉ\u0005\uf1de⒩ᐉ\u0012\uf11e⠗ᐉ\u0003\ue0df㢚ᐉ\u0006\uee53䴝ᐉ\u000b\ue334儕ᐉ\u000e︻儤ᐉ\u000f\ue463儧ᐉ\u0010神禠ᐉ\u0014\ue7f2蓫ᐉ\u0015", new Object[]{"b", "f", "c", "e", "h", "l", "u", "o", "k", "n", "s", "i", "t", "g", "j", "m", "p", "q", "r", "v", "w"});
            case 3:
                return new avfk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avfk.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
