package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand extends aopi implements aoqv {
    public static final AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand a;
    public static final aopg addFollowUpSurveyCommand;
    private static volatile aorb e;
    public int b;
    public arag d;
    private byte f = 2;
    public aopu c = emptyProtobufList();

    static {
        AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
        a = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
        aopi.registerDefaultInstance(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand);
        addFollowUpSurveyCommand = aopi.newSingularGeneratedExtension(apzg.a, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, null, 194801007, aosj.MESSAGE, AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class);
    }

    private AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"b", "c", aunb.class, "d"});
            case 3:
                return new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class) {
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
