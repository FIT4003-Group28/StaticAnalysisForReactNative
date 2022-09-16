package defpackage;
/* compiled from: PG */
/* renamed from: awsv  reason: default package */
/* loaded from: classes2.dex */
public final class awsv extends aopi implements aoqv {
    public static final awsv a;
    public static final aopg b;
    private static volatile aorb n;
    public int c;
    public awma d;
    public boolean f;
    public float g;
    public boolean j;
    public int k;
    public int l;
    public int m;
    private byte o = 2;
    public String e = "";
    public aopu h = emptyProtobufList();
    public String i = "";

    static {
        awsv awsvVar = new awsv();
        a = awsvVar;
        aopi.registerDefaultInstance(awsv.class, awsvVar);
        b = aopi.newSingularGeneratedExtension(awon.a, awsvVar, awsvVar, null, 220721894, aosj.MESSAGE, awsv.class);
    }

    private awsv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.o = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0007\u001b\bဈ\u0006\tဇ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"c", "d", "e", "f", "g", "h", awsp.class, "i", "j", "k", "l", "m"});
            case 3:
                return new awsv();
            case 4:
                return new aopa((boolean[][]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (awsv.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
