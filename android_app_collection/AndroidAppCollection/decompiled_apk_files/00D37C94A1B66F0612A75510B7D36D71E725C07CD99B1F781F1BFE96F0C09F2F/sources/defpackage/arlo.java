package defpackage;
/* compiled from: PG */
/* renamed from: arlo  reason: default package */
/* loaded from: classes2.dex */
public final class arlo extends aopi implements aoqv {
    public static final arlo a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arlo arloVar = new arlo();
        a = arloVar;
        aopi.registerDefaultInstance(arlo.class, arloVar);
    }

    private arlo() {
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
                return newMessageInfo(a, "\u00017\u0001\u0000\ue002ᘡ\ue37d떂7\u0000\u00007\ue002ᘡᐼ\u0000\ueb38៴ᐼ\u0000\ue059ᥧᐼ\u0000\ue28dṰᐼ\u0000\uec4fẲᐼ\u0000\uef3c⊱ᐼ\u0000\uf3cf⛠ᐼ\u0000\uf449⡛ᐼ\u0000\uf86d⣉ᐼ\u0000\ue845⦨ᐼ\u0000\uec4a⫳ᐼ\u0000\uf5ea\u2b94ᐼ\u0000ﾸ⸜ᐼ\u0000\uea92\u2e55ᐼ\u0000樂⾪ᐼ\u0000\ue59e\u2fe0ᐼ\u0000\uf288すᐼ\u0000ﲣヅᐼ\u0000ﻍㄎᐼ\u0000\uf227㔀ᐼ\u0000\ue727㝤ᐼ\u0000ﶇ㯺ᐼ\u0000ﺶ㱾ᐼ\u0000\uf3c8䔆ᐼ\u0000\ued5c䝠ᐼ\u0000\uf492䤳ᐼ\u0000\uf1cb䧺ᐼ\u0000\uf385䨬ᐼ\u0000ｍ䩮ᐼ\u0000\ue90b䯘ᐼ\u0000\uf6fe勇ᐼ\u0000\uee40勒ᐼ\u0000煮勒ᐼ\u0000羅娆ᐼ\u0000\ue4a5巤ᐼ\u0000﹁彩ᐼ\u0000\ue0c5捎ᐼ\u0000\ue417撪ᐼ\u0000\uee38柗ᐼ\u0000\ueb16棪ᐼ\u0000\ue969歼ᐼ\u0000\uf59d瘾ᐼ\u0000\uedb0矰ᐼ\u0000\ue945硤ᐼ\u0000\ue3a4篸ᐼ\u0000\uea81褡ᐼ\u0000\ue00f鑻ᐼ\u0000画閑ᐼ\u0000ﳝꄷᐼ\u0000ﹷꦞᐼ\u0000充\uab3dᐼ\u0000臭걲ᐼ\u0000\ufe6c겑ᐼ\u0000\ue14c끤ᐼ\u0000\ue37d떂ᐼ\u0000", new Object[]{"c", "b", appd.class, aqye.class, aucu.class, avlc.class, aqjf.class, avlf.class, aqjm.class, aups.class, arci.class, arcj.class, arch.class, apeb.class, aucg.class, avpc.class, atkm.class, asud.class, auwm.class, avju.class, aqgc.class, aqbi.class, avqt.class, avpy.class, avam.class, apqk.class, atkb.class, aqtb.class, arhn.class, avkv.class, avzy.class, aqlw.class, atke.class, atkf.class, atkr.class, askk.class, asml.class, arcc.class, asmg.class, aqxj.class, aqdc.class, avpl.class, atmu.class, aqxs.class, apqh.class, atml.class, atkz.class, atms.class, arfs.class, ausv.class, aulh.class, atkn.class, atmr.class, atkg.class, apta.class, asnf.class, avpp.class});
            case 3:
                return new arlo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arlo.class) {
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
