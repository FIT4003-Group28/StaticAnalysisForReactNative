package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SubmitSurveyCommandOuterClass$SubmitSurveyCommand extends aopi implements aoqv {
    public static final SubmitSurveyCommandOuterClass$SubmitSurveyCommand a;
    private static volatile aorb e;
    public static final aopg submitSurveyCommand;
    public aval b;
    public String c = "";
    public boolean d;
    private int f;

    static {
        SubmitSurveyCommandOuterClass$SubmitSurveyCommand submitSurveyCommandOuterClass$SubmitSurveyCommand = new SubmitSurveyCommandOuterClass$SubmitSurveyCommand();
        a = submitSurveyCommandOuterClass$SubmitSurveyCommand;
        aopi.registerDefaultInstance(SubmitSurveyCommandOuterClass$SubmitSurveyCommand.class, submitSurveyCommandOuterClass$SubmitSurveyCommand);
        submitSurveyCommand = aopi.newSingularGeneratedExtension(apzg.a, submitSurveyCommandOuterClass$SubmitSurveyCommand, submitSurveyCommandOuterClass$SubmitSurveyCommand, null, 288174649, aosj.MESSAGE, SubmitSurveyCommandOuterClass$SubmitSurveyCommand.class);
    }

    private SubmitSurveyCommandOuterClass$SubmitSurveyCommand() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new SubmitSurveyCommandOuterClass$SubmitSurveyCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (SubmitSurveyCommandOuterClass$SubmitSurveyCommand.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
