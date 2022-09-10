package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: uuf  reason: default package */
/* loaded from: classes7.dex */
final class uuf extends cqmr<zbz> {
    @dzsi
    zbz a;
    final dbty<vlm> b = dbud.a(new uue(this));
    final /* synthetic */ View c;
    final /* synthetic */ uug d;

    public uuf(uug uugVar, View view) {
        this.d = uugVar;
        this.c = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(zbz zbzVar, boolean z) {
        zbz zbzVar2 = zbzVar;
        vlm a = this.b.a();
        a.a(true);
        if (zbzVar2 != this.a && a.a) {
            a.c();
        }
        this.a = zbzVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        this.b.a().a(false);
        this.a = null;
    }
}
