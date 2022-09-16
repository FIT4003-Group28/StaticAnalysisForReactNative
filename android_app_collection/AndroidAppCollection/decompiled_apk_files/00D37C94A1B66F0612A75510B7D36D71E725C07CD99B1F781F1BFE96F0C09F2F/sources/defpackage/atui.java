package defpackage;
/* compiled from: PG */
/* renamed from: atui  reason: default package */
/* loaded from: classes2.dex */
public final class atui extends aopi implements aoqv {
    public static final atui a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public atuk e;
    public boolean f;
    public apzg g;
    public aopu h;
    private apzg j;
    private aoux k;
    private byte l = 2;
    public aopu d = emptyProtobufList();

    static {
        atui atuiVar = new atui();
        a = atuiVar;
        aopi.registerDefaultInstance(atui.class, atuiVar);
    }

    private atui() {
        emptyProtobufList();
        this.h = emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0007\u0001ᐉ\u0000\u0005ᐉ\t\bЛ\tᐉ\u0003\nဇ\u0004\fᐉ\u0005\rᐉ\u0006\u000fЛ", new Object[]{"b", "c", "k", "d", atug.class, "e", "f", "g", "j", "h", apzg.class});
            case 3:
                return new atui();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atui.class) {
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
