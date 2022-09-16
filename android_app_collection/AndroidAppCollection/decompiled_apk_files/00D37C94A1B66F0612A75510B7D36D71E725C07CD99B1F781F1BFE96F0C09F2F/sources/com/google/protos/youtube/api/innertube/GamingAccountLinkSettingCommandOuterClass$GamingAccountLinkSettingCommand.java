package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand extends aopi implements aoqv {
    public static final GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand a;
    private static volatile aorb d;
    public static final aopg gamingAccountLinkSettingCommand;
    public int b;
    public aunb c;
    private byte e = 2;

    static {
        GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand = new GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand();
        a = gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
        aopi.registerDefaultInstance(GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class, gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand);
        gamingAccountLinkSettingCommand = aopi.newSingularGeneratedExtension(apzg.a, gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand, gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand, null, 194162732, aosj.MESSAGE, GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class);
    }

    private GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class) {
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
