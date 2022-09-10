package defpackage;
/* compiled from: PG */
/* renamed from: bqxe  reason: default package */
/* loaded from: classes4.dex */
final class bqxe {
    public final bqla a;
    public final bwrs<ilo> b;
    public final bqwz c;
    final /* synthetic */ bqxf d;

    public bqxe(bqxf bqxfVar, bqla bqlaVar, bwrs<ilo> bwrsVar, bqwz bqwzVar) {
        this.d = bqxfVar;
        this.a = bqlaVar;
        this.b = bwrsVar;
        this.c = bqwzVar;
    }

    public final void a() {
        this.d.aU(new Runnable(this) { // from class: bqxa
            private final bqxe a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d.ax.G().g(bqtz.NO_DRAFT);
            }
        });
        this.d.aj.c(this.a, this.b, new bqxd(this, this.d.am.b(this.a)));
    }
}
