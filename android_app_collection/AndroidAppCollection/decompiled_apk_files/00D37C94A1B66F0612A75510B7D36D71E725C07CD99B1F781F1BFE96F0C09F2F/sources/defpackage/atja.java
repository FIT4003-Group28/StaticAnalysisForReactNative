package defpackage;
/* compiled from: PG */
/* renamed from: atja  reason: default package */
/* loaded from: classes2.dex */
public final class atja extends aopi implements aoqv {
    public static final atja a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atja atjaVar = new atja();
        a = atjaVar;
        aopi.registerDefaultInstance(atja.class, atjaVar);
    }

    private atja() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0001\u0000\uec06\u17ef\ue754鶩\u0010\u0000\u0000\u0010\uec06\u17efᐼ\u0000\ue592᯦ᐼ\u0000\uf41eⓄᐼ\u0000\ueb6b⳹ᐼ\u0000\ue1ce㩂ᐼ\u0000\ue81c㽾ᐼ\u0000\ueec1䳄ᐼ\u0000\uf584唧ᐼ\u0000\uf086抵ᐼ\u0000\ue538荟ᐼ\u0000\uf281荟ᐼ\u0000\uf283荟ᐼ\u0000\ue442覓ᐼ\u0000\uee76鴒ᐼ\u0000\ue0d4鴮ᐼ\u0000\ue754鶩ᐼ\u0000", new Object[]{"c", "b", aslq.class, atfa.class, aoxf.class, apke.class, atiz.class, atiw.class, avix.class, aqgo.class, aqcd.class, aprc.class, aprb.class, aprf.class, apra.class, avdd.class, aumq.class, aufj.class});
            case 3:
                return new atja();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atja.class) {
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
