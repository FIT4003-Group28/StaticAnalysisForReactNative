package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProfileCardCommandOuterClass$ProfileCardCommand extends aopi implements aoqv {
    public static final ProfileCardCommandOuterClass$ProfileCardCommand a;
    private static volatile aorb f;
    public static final aopg profileCardCommand;
    public boolean d;
    private int g;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        ProfileCardCommandOuterClass$ProfileCardCommand profileCardCommandOuterClass$ProfileCardCommand = new ProfileCardCommandOuterClass$ProfileCardCommand();
        a = profileCardCommandOuterClass$ProfileCardCommand;
        aopi.registerDefaultInstance(ProfileCardCommandOuterClass$ProfileCardCommand.class, profileCardCommandOuterClass$ProfileCardCommand);
        profileCardCommand = aopi.newSingularGeneratedExtension(apzg.a, profileCardCommandOuterClass$ProfileCardCommand, profileCardCommandOuterClass$ProfileCardCommand, null, 214503604, aosj.MESSAGE, ProfileCardCommandOuterClass$ProfileCardCommand.class);
    }

    private ProfileCardCommandOuterClass$ProfileCardCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new ProfileCardCommandOuterClass$ProfileCardCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ProfileCardCommandOuterClass$ProfileCardCommand.class) {
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
