package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjzm  reason: default package */
/* loaded from: classes3.dex */
public final class bjzm implements btzi<djar, djav> {
    final /* synthetic */ bjzn a;

    public bjzm(bjzn bjznVar) {
        this.a = bjznVar;
    }

    private final void c() {
        this.a.b.b(new Runnable(this) { // from class: bjzl
            private final bjzm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c.run();
            }
        });
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djar> btzrVar, btzy btzyVar) {
        c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djar> btzrVar, djav djavVar) {
        int a = djau.a(djavVar.b);
        if (a == 0 || a != 2) {
            c();
            return;
        }
        this.a.a.b(new bjfg());
        this.a.a.b(new bjfa(3, 1));
    }
}
