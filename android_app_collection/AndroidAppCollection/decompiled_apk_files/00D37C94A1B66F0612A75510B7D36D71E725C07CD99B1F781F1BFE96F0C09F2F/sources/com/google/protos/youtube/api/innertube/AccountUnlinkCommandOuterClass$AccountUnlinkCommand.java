package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountUnlinkCommandOuterClass$AccountUnlinkCommand extends aopi implements aoqv {
    public static final AccountUnlinkCommandOuterClass$AccountUnlinkCommand a;
    public static final aopg accountUnlinkCommand;
    private static volatile aorb f;
    public int b;
    public apzg c;
    public apzg d;
    private apzg g;
    private byte h = 2;
    public String e = "";

    static {
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
        a = accountUnlinkCommandOuterClass$AccountUnlinkCommand;
        aopi.registerDefaultInstance(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class, accountUnlinkCommandOuterClass$AccountUnlinkCommand);
        accountUnlinkCommand = aopi.newSingularGeneratedExtension(apzg.a, accountUnlinkCommandOuterClass$AccountUnlinkCommand, accountUnlinkCommandOuterClass$AccountUnlinkCommand, null, 194259476, aosj.MESSAGE, AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class);
    }

    private AccountUnlinkCommandOuterClass$AccountUnlinkCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
