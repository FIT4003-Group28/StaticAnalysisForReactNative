package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: annp  reason: default package */
/* loaded from: classes2.dex */
public final class annp implements Runnable {
    final /* synthetic */ annq a;

    public annp(annq annqVar) {
        this.a = annqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.f.getBooleanExtra("homescreen_shortcut", false)) {
            this.a.e.i(cjtd.a(dtyi.bx));
        }
        if (this.a.i.getPath().equals("/locationhistory/email")) {
            this.a.d.m();
            return;
        }
        String queryParameter = this.a.i.getQueryParameter("pb");
        dbsg<String> j = dbsg.j(this.a.i.getQueryParameter("ved"));
        if (j.a()) {
            cjqy cjqyVar = this.a.e;
            cjta b = cjtd.b();
            b.g(j.b());
            cjqyVar.i(b.a());
        }
        if (queryParameter != null) {
            try {
                this.a.d.G((drqz) annq.c.a(queryParameter, drqz.e), j);
                return;
            } catch (Exception unused) {
            }
        }
        anhg anhgVar = this.a.d;
        anhq j2 = anhy.l().j();
        j2.j(j);
        anhgVar.D(j2.k());
    }
}
