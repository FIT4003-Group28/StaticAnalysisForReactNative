package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akin  reason: default package */
/* loaded from: classes.dex */
public final class akin implements aynl {
    final /* synthetic */ akiq a;

    public akin(akiq akiqVar) {
        this.a = akiqVar;
    }

    @Override // defpackage.aynl
    public final void a() {
        this.a.c.post(new akik(this, 1));
    }

    @Override // defpackage.aynl
    public final void b(final Throwable th) {
        this.a.c.post(new Runnable() { // from class: akim
            @Override // java.lang.Runnable
            public final void run() {
                akin akinVar = akin.this;
                akinVar.a.e.b(th);
            }
        });
    }

    @Override // defpackage.aynl
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        amnl amnlVar = (amnl) obj;
        int i = amnlVar.b;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        if (c != 0 && c == 3) {
            this.a.c.post(new akik(this));
        }
        this.a.c.post(new akil(this, amnlVar, 1));
        amnv amnvVar = amnlVar.e;
        if (amnvVar == null) {
            amnvVar = amnv.a;
        }
        if (amnvVar.b.d() > 0) {
            this.a.c.post(new akil(this, amnlVar));
        }
        if (amnlVar.c != null) {
            this.a.c.post(new akil(this, amnlVar, 2));
        }
    }
}
