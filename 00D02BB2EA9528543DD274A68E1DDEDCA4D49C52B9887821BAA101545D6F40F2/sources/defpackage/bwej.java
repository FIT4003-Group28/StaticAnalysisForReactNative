package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bwej  reason: default package */
/* loaded from: classes4.dex */
final class bwej implements degu<Boolean> {
    final /* synthetic */ Intent a;
    final /* synthetic */ bwel b;

    public bwej(bwel bwelVar, Intent intent) {
        this.b = bwelVar;
        this.a = intent;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        bwfs[] bwfsVarArr;
        if (bool.booleanValue()) {
            for (bwfs bwfsVar : (bwfs[]) dbsk.s(this.b.d)) {
                ff J = this.b.J();
                bwfsVar.a(J, this.b.ag, J.getPackageManager().resolveActivity(this.a, 0));
            }
        }
    }
}
