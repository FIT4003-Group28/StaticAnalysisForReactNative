package defpackage;
/* compiled from: PG */
/* renamed from: jox  reason: default package */
/* loaded from: classes3.dex */
final class jox implements yiw {
    final /* synthetic */ joy a;
    private final String b;
    private final String c;

    public jox(joy joyVar, String str, String str2) {
        this.a = joyVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r2 = (Void) obj;
        String valueOf = String.valueOf(String.valueOf(exc));
        afus.b(2, 10, valueOf.length() != 0 ? "Could not get playability result: ".concat(valueOf) : new String("Could not get playability result: "));
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r4 = (Void) obj;
        if (((aiot) obj2).c - 1 != 2) {
            return;
        }
        this.a.d.n(this.c, this.b, null, false);
    }
}
