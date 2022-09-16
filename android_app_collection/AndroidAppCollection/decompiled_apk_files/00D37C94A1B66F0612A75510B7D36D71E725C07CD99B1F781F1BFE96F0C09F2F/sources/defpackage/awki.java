package defpackage;
/* compiled from: PG */
/* renamed from: awki  reason: default package */
/* loaded from: classes2.dex */
public final class awki extends aopi implements aoqv {
    public static final awki a;
    public static final aopg b;
    private static volatile aorb o;
    public int c;
    public String e;
    public String f;
    public String g;
    public awma h;
    public arag i;
    public int j;
    public avhn k;
    public aopu l;
    public aopu m;
    public aoqp n = aoqp.a;
    private byte p = 2;
    public String d = "";

    static {
        awki awkiVar = new awki();
        a = awkiVar;
        aopi.registerDefaultInstance(awki.class, awkiVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, awkiVar, awkiVar, null, 154, aosj.MESSAGE, awki.class);
    }

    private awki() {
        aoob aoobVar = aoob.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.l = aopi.emptyProtobufList();
        this.m = aopi.emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0001\u0002\u0004\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ᐉ\u0005\u0007ဌ\u0007\bᐉ\b\t\u001a\n\u001a\u000bв\fᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "j", awkl.a(), "k", "l", "m", "n", awkh.a, "i"});
            case 3:
                return new awki();
            case 4:
                return new aopa((int[][][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (awki.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
