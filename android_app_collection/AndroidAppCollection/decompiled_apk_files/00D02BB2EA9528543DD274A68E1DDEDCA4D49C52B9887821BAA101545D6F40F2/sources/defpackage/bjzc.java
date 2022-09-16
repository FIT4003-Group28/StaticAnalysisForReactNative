package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjzc  reason: default package */
/* loaded from: classes3.dex */
public final class bjzc implements btzi<djar, djav> {
    final /* synthetic */ bjzd a;

    public bjzc(bjzd bjzdVar) {
        this.a = bjzdVar;
    }

    private final void c() {
        bjzd bjzdVar = this.a;
        bjzdVar.b.b(bjzdVar.c);
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
