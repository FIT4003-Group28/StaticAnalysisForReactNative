package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anlo  reason: default package */
/* loaded from: classes.dex */
public final class anlo extends anks {
    final /* synthetic */ anlq a;
    private final aniq b;

    public anlo(anlq anlqVar, aniq aniqVar) {
        this.a = anlqVar;
        aniqVar.getClass();
        this.b = aniqVar;
    }

    @Override // defpackage.anks
    public final /* bridge */ /* synthetic */ Object a() {
        ankt a = this.b.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.anks
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.anks
    public final void d(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.anks
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.lV((ankt) obj);
    }

    @Override // defpackage.anks
    public final boolean g() {
        return this.a.isDone();
    }
}
