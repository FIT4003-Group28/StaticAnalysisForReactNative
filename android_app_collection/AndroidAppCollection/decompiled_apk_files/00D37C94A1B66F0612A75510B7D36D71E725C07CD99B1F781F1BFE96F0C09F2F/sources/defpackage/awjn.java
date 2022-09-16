package defpackage;
/* compiled from: PG */
/* renamed from: awjn  reason: default package */
/* loaded from: classes2.dex */
public final class awjn extends aopi implements aoqv {
    public static final awjn a;
    public static final aopg b;
    private static volatile aorb i;
    public int c;
    public String d = "";
    public String e;
    public aopu f;
    public long g;
    public long h;

    static {
        awjn awjnVar = new awjn();
        a = awjnVar;
        aopi.registerDefaultInstance(awjn.class, awjnVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, awjnVar, awjnVar, null, 156, aosj.MESSAGE, awjn.class);
    }

    private awjn() {
        aoob aoobVar = aoob.b;
        this.e = "";
        this.f = aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u001a\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new awjn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awjn.class) {
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
