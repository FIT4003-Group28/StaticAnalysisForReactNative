package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetSurveyCommandOuterClass$GetSurveyCommand extends aopi implements aoqv {
    public static final GetSurveyCommandOuterClass$GetSurveyCommand a;
    private static volatile aorb d;
    public static final aopg getSurveyCommand;
    public asdu b;
    public int c;
    private int e;

    static {
        GetSurveyCommandOuterClass$GetSurveyCommand getSurveyCommandOuterClass$GetSurveyCommand = new GetSurveyCommandOuterClass$GetSurveyCommand();
        a = getSurveyCommandOuterClass$GetSurveyCommand;
        aopi.registerDefaultInstance(GetSurveyCommandOuterClass$GetSurveyCommand.class, getSurveyCommandOuterClass$GetSurveyCommand);
        getSurveyCommand = aopi.newSingularGeneratedExtension(apzg.a, getSurveyCommandOuterClass$GetSurveyCommand, getSurveyCommandOuterClass$GetSurveyCommand, null, 284673439, aosj.MESSAGE, GetSurveyCommandOuterClass$GetSurveyCommand.class);
    }

    private GetSurveyCommandOuterClass$GetSurveyCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"e", "b", "c", arpt.s});
            case 3:
                return new GetSurveyCommandOuterClass$GetSurveyCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (GetSurveyCommandOuterClass$GetSurveyCommand.class) {
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
