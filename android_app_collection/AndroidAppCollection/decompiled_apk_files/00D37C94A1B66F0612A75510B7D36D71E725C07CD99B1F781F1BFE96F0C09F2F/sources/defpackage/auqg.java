package defpackage;
/* compiled from: PG */
/* renamed from: auqg  reason: default package */
/* loaded from: classes2.dex */
public final class auqg extends aopi implements aoqv {
    public static final auqg a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        auqg auqgVar = new auqg();
        a = auqgVar;
        aopi.registerDefaultInstance(auqg.class, auqgVar);
    }

    private auqg() {
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
                return newMessageInfo(a, "\u0001\u0013\u0001\u0000\ue9db⫩\ue3a4篸\u0013\u0000\u0000\u0013\ue9db⫩ᐼ\u0000履\u2b4eᐼ\u0000\uf73e㍽ᐼ\u0000\uf707㥚ᐼ\u0000\ue162㥴ᐼ\u0000\ue4a3㱾ᐼ\u0000\uf225㵔ᐼ\u0000\uea01䆵ᐼ\u0000\ue0a6䎫ᐼ\u0000\ue539丘ᐼ\u0000\ue275凔ᐼ\u0000\ueb7a怋ᐼ\u0000\uf152拄ᐼ\u0000\uecd7斿ᐼ\u0000ﵬ橈ᐼ\u0000\uf662欣ᐼ\u0000﹐稬ᐼ\u0000\uf696竅ᐼ\u0000\ue3a4篸ᐼ\u0000", new Object[]{"c", "b", apti.class, apvj.class, aqxv.class, auob.class, avsd.class, atxc.class, apbr.class, auuj.class, apoe.class, avgb.class, aqwj.class, atuf.class, auxp.class, aqyd.class, ardr.class, avoq.class, atnk.class, arfv.class, atkz.class});
            case 3:
                return new auqg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auqg.class) {
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
