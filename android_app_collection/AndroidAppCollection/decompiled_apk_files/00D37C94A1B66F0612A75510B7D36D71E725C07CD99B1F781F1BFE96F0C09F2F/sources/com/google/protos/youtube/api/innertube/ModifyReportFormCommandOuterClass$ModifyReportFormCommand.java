package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ModifyReportFormCommandOuterClass$ModifyReportFormCommand extends aopi implements aoqv {
    public static final ModifyReportFormCommandOuterClass$ModifyReportFormCommand a;
    private static volatile aorb c;
    public static final aopg modifyReportFormCommand;
    public int b;
    private int d;

    static {
        ModifyReportFormCommandOuterClass$ModifyReportFormCommand modifyReportFormCommandOuterClass$ModifyReportFormCommand = new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
        a = modifyReportFormCommandOuterClass$ModifyReportFormCommand;
        aopi.registerDefaultInstance(ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class, modifyReportFormCommandOuterClass$ModifyReportFormCommand);
        modifyReportFormCommand = aopi.newSingularGeneratedExtension(apzg.a, modifyReportFormCommandOuterClass$ModifyReportFormCommand, modifyReportFormCommandOuterClass$ModifyReportFormCommand, null, 171313789, aosj.MESSAGE, ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class);
    }

    private ModifyReportFormCommandOuterClass$ModifyReportFormCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", atdq.m});
            case 3:
                return new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class) {
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
