package defpackage;
/* compiled from: PG */
/* renamed from: kro  reason: default package */
/* loaded from: classes3.dex */
final class kro implements yiw {
    final /* synthetic */ krp a;
    private final String b;

    public kro(krp krpVar, String str) {
        this.a = krpVar;
        zgh.m(str);
        this.b = str;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String str = (String) obj;
        zep.d("Encountered exception when syncing playlist", exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (this.b.equals((String) obj)) {
            this.a.F = bool;
        }
    }
}
