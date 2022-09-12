package defpackage;
/* compiled from: PG */
/* renamed from: wd  reason: default package */
/* loaded from: classes7.dex */
public final class wd implements oj {
    int a;
    final /* synthetic */ we b;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public wd(we weVar) {
        this.b = weVar;
    }

    @Override // defpackage.oj
    public final void a() {
        this.c = true;
    }

    @Override // defpackage.oj
    public final void b() {
        if (this.c) {
            return;
        }
        we weVar = this.b;
        weVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.oj
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    public final void d(oi oiVar, int i) {
        this.b.f = oiVar;
        this.a = i;
    }
}
