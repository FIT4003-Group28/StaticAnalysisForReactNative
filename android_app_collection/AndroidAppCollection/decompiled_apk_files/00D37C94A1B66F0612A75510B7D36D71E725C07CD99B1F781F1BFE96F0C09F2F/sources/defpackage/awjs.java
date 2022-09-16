package defpackage;
/* compiled from: PG */
/* renamed from: awjs  reason: default package */
/* loaded from: classes2.dex */
public final class awjs extends aopi implements aoqv {
    public static final awjs a;
    public static final aopg b;
    private static volatile aorb i;
    public int c;
    public String d = "";
    public String e;
    public String f;
    public String g;
    public long h;

    static {
        awjs awjsVar = new awjs();
        a = awjsVar;
        aopi.registerDefaultInstance(awjs.class, awjsVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, awjsVar, awjsVar, null, 155, aosj.MESSAGE, awjs.class);
    }

    private awjs() {
        aoob aoobVar = aoob.b;
        this.e = "";
        this.f = "";
        this.g = "";
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new awjs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awjs.class) {
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
