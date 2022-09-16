package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountLinkCommandOuterClass$AccountLinkCommand extends aopi implements aoqv {
    public static final AccountLinkCommandOuterClass$AccountLinkCommand a;
    public static final aopg accountLinkCommand;
    private static volatile aorb g;
    public int b;
    public apzg c;
    public apzg d;
    private apzg h;
    private byte i = 2;
    public String e = "";
    public aopu f = aopi.emptyProtobufList();

    static {
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = new AccountLinkCommandOuterClass$AccountLinkCommand();
        a = accountLinkCommandOuterClass$AccountLinkCommand;
        aopi.registerDefaultInstance(AccountLinkCommandOuterClass$AccountLinkCommand.class, accountLinkCommandOuterClass$AccountLinkCommand);
        accountLinkCommand = aopi.newSingularGeneratedExtension(apzg.a, accountLinkCommandOuterClass$AccountLinkCommand, accountLinkCommandOuterClass$AccountLinkCommand, null, 194259413, aosj.MESSAGE, AccountLinkCommandOuterClass$AccountLinkCommand.class);
    }

    private AccountLinkCommandOuterClass$AccountLinkCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0006\u001a", new Object[]{"b", "c", "d", "e", "h", "f"});
            case 3:
                return new AccountLinkCommandOuterClass$AccountLinkCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (AccountLinkCommandOuterClass$AccountLinkCommand.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
