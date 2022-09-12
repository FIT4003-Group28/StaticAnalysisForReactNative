package defpackage;
/* compiled from: PG */
/* renamed from: bnuq  reason: default package */
/* loaded from: classes.dex */
public enum bnuq {
    INVALID,
    IDLE,
    BEGIN_FRAME,
    UPDATE,
    PRE_DRAW,
    DRAW,
    POST_DRAW,
    END_FRAME;
    
    public static long j;
    public static final ThreadLocal<bnuq> i = new ThreadLocal<bnuq>() { // from class: bnup
        @Override // java.lang.ThreadLocal
        protected final /* bridge */ /* synthetic */ bnuq initialValue() {
            return bnuq.INVALID;
        }
    };
    public static int k = 0;
    public static final long[] l = new long[values().length];
    public static final long[] m = new long[values().length];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(bnuq bnuqVar, bnuq bnuqVar2) {
        if (bnuqVar == IDLE) {
            k++;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime - j;
        j = nanoTime;
        long[] jArr = l;
        int ordinal = bnuqVar.ordinal();
        jArr[ordinal] = jArr[ordinal] + j2;
        long[] jArr2 = m;
        int ordinal2 = bnuqVar.ordinal();
        jArr2[ordinal2] = jArr2[ordinal2] + (j2 * j2);
        i.set(bnuqVar2);
    }

    public static boolean b() {
        return i.get() != INVALID;
    }

    public static void c() {
        if (b()) {
            return;
        }
        throw new IllegalStateException("Not on render thread");
    }
}
