package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand extends aopi implements aoqv {
    public static final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand a;
    private static volatile aorb h;
    public static final aopg sfvAudioItemPlaybackCommand;
    public int b;
    public apzg f;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public aopu e = emptyProtobufList();
    public String g = "";

    static {
        SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand = new SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand();
        a = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
        aopi.registerDefaultInstance(SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class, sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand);
        sfvAudioItemPlaybackCommand = aopi.newSingularGeneratedExtension(apzg.a, sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand, sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand, null, 312722532, aosj.MESSAGE, SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class);
    }

    private SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ᐉ\u0002\u0005ဈ\u0003", new Object[]{"b", "c", "d", "e", ausq.class, "f", "g"});
            case 3:
                return new SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
