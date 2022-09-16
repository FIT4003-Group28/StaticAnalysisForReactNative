package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand extends aopi implements aoqv {
    public static final SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand a;
    private static volatile aorb h;
    public static final aopg sfvAudioItemSelectCommand;
    public int b;
    public auss e;
    public apzg g;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public aopu f = emptyProtobufList();

    static {
        SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand = new SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand();
        a = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
        aopi.registerDefaultInstance(SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class, sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand);
        sfvAudioItemSelectCommand = aopi.newSingularGeneratedExtension(apzg.a, sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand, sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand, null, 313660028, aosj.MESSAGE, SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class);
    }

    private SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004\u001b\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f", aust.class, "g"});
            case 3:
                return new SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class) {
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
