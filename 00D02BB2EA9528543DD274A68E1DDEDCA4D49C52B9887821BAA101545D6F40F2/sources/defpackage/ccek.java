package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccek  reason: default package */
/* loaded from: classes4.dex */
public final class ccek implements akey {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ droq c;
    final /* synthetic */ ccel d;

    public ccek(ccel ccelVar, String str, String str2, droq droqVar) {
        this.d = ccelVar;
        this.a = str;
        this.b = str2;
        this.c = droqVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        if (!this.d.a.b() || this.d.b.j() == null) {
            return;
        }
        this.d.c.p(false);
        this.d.d(this.a, this.b, this.c);
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
