package defpackage;
/* compiled from: PG */
/* renamed from: awmk  reason: default package */
/* loaded from: classes2.dex */
public final class awmk extends aopi implements aoqv {
    public static final awmk a;
    public static final aopg b;
    private static volatile aorb j;
    public int d;
    public int f;
    public int g;
    public int h;
    public apyq i;
    private int k;
    public String c = "";
    public String e = "";

    static {
        awmk awmkVar = new awmk();
        a = awmkVar;
        aopi.registerDefaultInstance(awmk.class, awmkVar);
        b = aopi.newSingularGeneratedExtension(awow.a, awmkVar, awmkVar, null, 258602976, aosj.MESSAGE, awmk.class);
    }

    private awmk() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဉ\u0006\nဋ\u0003\u000bဋ\u0004\fဋ\u0005", new Object[]{"k", "c", "d", "e", "i", "f", "g", "h"});
            case 3:
                return new awmk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (awmk.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
