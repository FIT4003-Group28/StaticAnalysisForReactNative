package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetAppThemeCommandOuterClass$SetAppThemeCommand extends aopi implements aoqv {
    public static final SetAppThemeCommandOuterClass$SetAppThemeCommand a;
    private static volatile aorb c;
    public static final aopg setAppThemeCommand;
    public int b;
    private int d;

    static {
        SetAppThemeCommandOuterClass$SetAppThemeCommand setAppThemeCommandOuterClass$SetAppThemeCommand = new SetAppThemeCommandOuterClass$SetAppThemeCommand();
        a = setAppThemeCommandOuterClass$SetAppThemeCommand;
        aopi.registerDefaultInstance(SetAppThemeCommandOuterClass$SetAppThemeCommand.class, setAppThemeCommandOuterClass$SetAppThemeCommand);
        setAppThemeCommand = aopi.newSingularGeneratedExtension(apzg.a, setAppThemeCommandOuterClass$SetAppThemeCommand, setAppThemeCommandOuterClass$SetAppThemeCommand, null, 195899132, aosj.MESSAGE, SetAppThemeCommandOuterClass$SetAppThemeCommand.class);
    }

    private SetAppThemeCommandOuterClass$SetAppThemeCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", aupm.h});
            case 3:
                return new SetAppThemeCommandOuterClass$SetAppThemeCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (SetAppThemeCommandOuterClass$SetAppThemeCommand.class) {
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
