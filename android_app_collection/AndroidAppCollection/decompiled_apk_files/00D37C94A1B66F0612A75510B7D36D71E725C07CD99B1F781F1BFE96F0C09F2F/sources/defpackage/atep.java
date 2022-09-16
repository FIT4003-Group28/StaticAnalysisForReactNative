package defpackage;
/* compiled from: PG */
/* renamed from: atep  reason: default package */
/* loaded from: classes2.dex */
public final class atep extends aopi implements aoqv {
    public static final atep a;
    private static volatile aorb l;
    public int b;
    public atev d;
    public atei e;
    public boolean f;
    public String g;
    public atel h;
    public aovs i;
    public boolean j;
    public boolean k;
    private aoux m;
    private apzg n;
    private aunb o;
    private byte p = 2;
    public aopu c = emptyProtobufList();

    static {
        atep atepVar = new atep();
        a = atepVar;
        aopi.registerDefaultInstance(atep.class, atepVar);
    }

    private atep() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        this.g = "";
    }

    public final void a() {
        aopu aopuVar = this.c;
        if (!aopuVar.c()) {
            this.c = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0012\f\u0000\u0001\u0007\u0001Л\u0003ᐉ\u0000\u0005ᐉ\u0002\u0007ᐉ\u0003\bဇ\u0004\tᐉ\u0007\nဉ\b\u000bဈ\u0006\u000eဇ\u000b\u000fᐉ\n\u0011ᐉ\u000e\u0012ဇ\r", new Object[]{"b", "c", aten.class, "m", "d", "e", "f", "h", "i", "g", "j", "n", "o", "k"});
            case 3:
                return new atep();
            case 4:
                return new aopa((short[][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (atep.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
