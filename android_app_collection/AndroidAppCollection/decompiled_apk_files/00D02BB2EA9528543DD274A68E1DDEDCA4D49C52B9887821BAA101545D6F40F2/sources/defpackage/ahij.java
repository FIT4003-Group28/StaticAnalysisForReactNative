package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahij  reason: default package */
/* loaded from: classes2.dex */
public final class ahij implements degu<Void> {
    final /* synthetic */ ahim a;
    final /* synthetic */ ahin b;

    public ahij(ahin ahinVar, ahim ahimVar) {
        this.b = ahinVar;
        this.a = ahimVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.b.t = false;
        ges gesVar = this.b.m.get();
        if (gesVar != null && gesVar.aD) {
            cqkx.p(this.a.b);
        }
        if (this.b.c.a().aZ) {
            cjxu.i(this.b.c.a(), this.b.c.a().getString(R.string.LOCALSTREAM_REMOVE_CARD_FAILURE_MESSAGE));
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r3) {
        this.b.e.c();
        ges gesVar = this.b.m.get();
        if (!this.b.l.remove(this.a) || gesVar == null || !gesVar.aD) {
            return;
        }
        this.b.F(true);
    }
}
