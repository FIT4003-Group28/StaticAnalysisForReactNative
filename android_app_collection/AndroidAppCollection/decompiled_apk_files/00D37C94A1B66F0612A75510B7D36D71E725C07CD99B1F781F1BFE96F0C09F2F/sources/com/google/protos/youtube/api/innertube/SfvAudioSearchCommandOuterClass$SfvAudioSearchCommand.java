package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand extends aopi implements aoqv {
    public static final SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand a;
    private static volatile aorb f;
    public static final aopg sfvAudioSearchCommand;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand = new SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand();
        a = sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand;
        aopi.registerDefaultInstance(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class, sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand);
        sfvAudioSearchCommand = aopi.newSingularGeneratedExtension(apzg.a, sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand, sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand, null, 321865519, aosj.MESSAGE, SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class);
    }

    private SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class) {
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
