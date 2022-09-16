package defpackage;
/* compiled from: PG */
/* renamed from: aiot  reason: default package */
/* loaded from: classes.dex */
public final class aiot {
    public static final aiot a = new aiot(1, null);
    private static final aiot d = new aiot(3, null);
    public final aikd b;
    public final int c;

    private aiot(int i, aikd aikdVar) {
        this.c = i;
        this.b = aikdVar;
    }

    public static void a(yiw yiwVar, aikd aikdVar) {
        yiwVar.b(null, new aiot(2, aikdVar));
    }

    public static void b(yiw yiwVar) {
        yiwVar.b(null, d);
    }
}
