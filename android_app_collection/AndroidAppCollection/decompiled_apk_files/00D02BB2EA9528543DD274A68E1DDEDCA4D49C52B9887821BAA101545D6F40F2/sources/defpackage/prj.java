package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: prj  reason: default package */
/* loaded from: classes7.dex */
public final class prj implements Runnable {
    final /* synthetic */ ges a;
    final /* synthetic */ vnk b;
    final /* synthetic */ int c;
    final /* synthetic */ dpjn d;
    final /* synthetic */ String e;
    final /* synthetic */ prk f;

    public prj(prk prkVar, ges gesVar, vnk vnkVar, int i, dpjn dpjnVar, String str) {
        this.f = prkVar;
        this.a = gesVar;
        this.b = vnkVar;
        this.c = i;
        this.d = dpjnVar;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.aD || this.f.b.d() == null || !dbsd.a(this.f.b.d(), this.a)) {
            return;
        }
        this.b.C(this.c);
        this.f.a.a(dbsg.i(Integer.valueOf(this.c)), this.d, this.d.e, this.e, this.a);
    }
}
