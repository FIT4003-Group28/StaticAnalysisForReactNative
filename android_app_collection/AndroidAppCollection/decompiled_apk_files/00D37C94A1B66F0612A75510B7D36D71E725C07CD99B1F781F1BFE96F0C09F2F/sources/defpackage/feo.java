package defpackage;
/* compiled from: PG */
/* renamed from: feo  reason: default package */
/* loaded from: classes3.dex */
public final class feo implements ezg, ahqa, ynl {
    public final fem[] a = new fem[2];
    public boolean b;
    private boolean c;
    private boolean d;

    public feo() {
        for (int i = 0; i < 2; i++) {
            this.a[i] = new fem();
        }
    }

    public final void b() {
        if (this.c) {
            this.a[0].a(true);
            this.a[1].a(false);
            return;
        }
        boolean z = !this.b && this.d;
        this.a[0].a(!z);
        this.a[1].a(z);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.b = ((ahhv) obj).a;
                b();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhv.class};
    }

    @Override // defpackage.ahqa
    public final void oh(boolean z) {
        this.d = z;
        b();
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        boolean z = true;
        if (!ezxVar.k() && !ezxVar.e()) {
            z = false;
        }
        this.c = z;
        b();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
