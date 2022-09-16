package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand extends aopi implements aoqv {
    public static final UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand a;
    private static volatile aorb c;
    public static final aopg updateDonationShelfCommand;
    public aunb b;
    private int d;
    private aunb e;
    private byte f = 2;

    static {
        UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand = new UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand();
        a = updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand;
        aopi.registerDefaultInstance(UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class, updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand);
        updateDonationShelfCommand = aopi.newSingularGeneratedExtension(apzg.a, updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand, updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand, null, 219123099, aosj.MESSAGE, UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class);
    }

    private UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", "e"});
            case 3:
                return new UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
