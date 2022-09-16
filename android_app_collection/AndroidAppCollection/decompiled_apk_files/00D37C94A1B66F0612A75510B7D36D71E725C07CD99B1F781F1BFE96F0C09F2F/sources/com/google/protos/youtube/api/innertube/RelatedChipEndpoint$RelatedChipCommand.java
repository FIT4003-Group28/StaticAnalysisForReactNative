package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RelatedChipEndpoint$RelatedChipCommand extends aopi implements aoqv {
    public static final RelatedChipEndpoint$RelatedChipCommand a;
    private static volatile aorb d;
    public static final aopg relatedChipCommand;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        RelatedChipEndpoint$RelatedChipCommand relatedChipEndpoint$RelatedChipCommand = new RelatedChipEndpoint$RelatedChipCommand();
        a = relatedChipEndpoint$RelatedChipCommand;
        aopi.registerDefaultInstance(RelatedChipEndpoint$RelatedChipCommand.class, relatedChipEndpoint$RelatedChipCommand);
        relatedChipCommand = aopi.newSingularGeneratedExtension(apzg.a, relatedChipEndpoint$RelatedChipCommand, relatedChipEndpoint$RelatedChipCommand, null, 189079648, aosj.MESSAGE, RelatedChipEndpoint$RelatedChipCommand.class);
    }

    private RelatedChipEndpoint$RelatedChipCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐼ\u0000\u0003်\u0000", new Object[]{"c", "b", aqgx.class});
            case 3:
                return new RelatedChipEndpoint$RelatedChipCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (RelatedChipEndpoint$RelatedChipCommand.class) {
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
