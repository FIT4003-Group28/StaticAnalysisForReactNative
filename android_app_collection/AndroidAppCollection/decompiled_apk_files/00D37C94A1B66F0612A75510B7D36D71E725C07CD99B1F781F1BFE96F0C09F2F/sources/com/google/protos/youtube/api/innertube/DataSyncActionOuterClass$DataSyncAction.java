package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DataSyncActionOuterClass$DataSyncAction extends aopi implements aoqv {
    public static final DataSyncActionOuterClass$DataSyncAction a;
    private static volatile aorb c;
    public static final aopg dataSyncAction;
    public aqkf b;
    private int d;
    private byte e = 2;

    static {
        DataSyncActionOuterClass$DataSyncAction dataSyncActionOuterClass$DataSyncAction = new DataSyncActionOuterClass$DataSyncAction();
        a = dataSyncActionOuterClass$DataSyncAction;
        aopi.registerDefaultInstance(DataSyncActionOuterClass$DataSyncAction.class, dataSyncActionOuterClass$DataSyncAction);
        dataSyncAction = aopi.newSingularGeneratedExtension(apzg.a, dataSyncActionOuterClass$DataSyncAction, dataSyncActionOuterClass$DataSyncAction, null, 143523974, aosj.MESSAGE, DataSyncActionOuterClass$DataSyncAction.class);
    }

    private DataSyncActionOuterClass$DataSyncAction() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new DataSyncActionOuterClass$DataSyncAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (DataSyncActionOuterClass$DataSyncAction.class) {
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
