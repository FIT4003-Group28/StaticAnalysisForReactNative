package defpackage;
/* compiled from: PG */
/* renamed from: jqj  reason: default package */
/* loaded from: classes3.dex */
final class jqj implements yiw {
    private final ahcy a;
    private final String b;
    private final String c;

    public jqj(ahcy ahcyVar, String str, String str2) {
        this.a = ahcyVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r2 = (Void) obj;
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Could not get playability result: ");
        sb.append(valueOf);
        afus.b(2, 10, sb.toString());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r4 = (Void) obj;
        if (((aiot) obj2).c - 1 != 2) {
            return;
        }
        this.a.n(this.c, this.b, null, false);
    }
}
