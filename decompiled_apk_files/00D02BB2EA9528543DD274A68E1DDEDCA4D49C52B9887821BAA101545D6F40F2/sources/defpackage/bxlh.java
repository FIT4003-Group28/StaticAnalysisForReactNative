package defpackage;
/* compiled from: PG */
/* renamed from: bxlh  reason: default package */
/* loaded from: classes4.dex */
public final class bxlh implements btxx {
    private boolean a;
    private final long b;
    private final btxx c;
    private final bvrb d;
    @dzsi
    private final bxlg e;

    public bxlh(bvrb bvrbVar, btxx btxxVar, long j, @dzsi bxlg bxlgVar) {
        this.d = bvrbVar;
        this.c = btxxVar;
        this.b = j;
        this.e = bxlgVar;
    }

    @Override // defpackage.btxx
    public final void a() {
        if (this.b <= 0) {
            c();
        } else {
            this.d.a(new bxlf(this), bvrj.SUGGEST_CALLBACK_THREAD, this.b);
        }
    }

    @Override // defpackage.btxx
    public final void b() {
        synchronized (this) {
            this.a = true;
            this.c.b();
        }
    }

    public final void c() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.c.a();
            this.e.a(this);
        }
    }
}
