package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CommerceActionCommandOuterClass$CommerceActionCommand extends aopi implements aoqv {
    public static final CommerceActionCommandOuterClass$CommerceActionCommand a;
    public static final aopg commerceActionCommand;
    private static volatile aorb i;
    public int b;
    public apzg f;
    public apzg g;
    public boolean h;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public aopu e = aopi.emptyProtobufList();

    static {
        CommerceActionCommandOuterClass$CommerceActionCommand commerceActionCommandOuterClass$CommerceActionCommand = new CommerceActionCommandOuterClass$CommerceActionCommand();
        a = commerceActionCommandOuterClass$CommerceActionCommand;
        aopi.registerDefaultInstance(CommerceActionCommandOuterClass$CommerceActionCommand.class, commerceActionCommandOuterClass$CommerceActionCommand);
        commerceActionCommand = aopi.newSingularGeneratedExtension(apzg.a, commerceActionCommandOuterClass$CommerceActionCommand, commerceActionCommandOuterClass$CommerceActionCommand, null, 354960961, aosj.MESSAGE, CommerceActionCommandOuterClass$CommerceActionCommand.class);
    }

    private CommerceActionCommandOuterClass$CommerceActionCommand() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0002\u0001ဈ\u0001\u0002\u001a\u0003ᐉ\u0003\u0004ဇ\u0004\u0005ᐉ\u0002\u0006ဈ\u0000", new Object[]{"b", "d", "e", "g", "h", "f", "c"});
            case 3:
                return new CommerceActionCommandOuterClass$CommerceActionCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (CommerceActionCommandOuterClass$CommerceActionCommand.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
