package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aljj  reason: default package */
/* loaded from: classes.dex */
final class aljj implements kj {
    final /* synthetic */ aljo a;

    public aljj(aljo aljoVar) {
        this.a = aljoVar;
    }

    @Override // defpackage.kj
    public final mb a(View view, mb mbVar) {
        aljo aljoVar = this.a;
        aljg aljgVar = aljoVar.g;
        if (aljgVar != null) {
            aljoVar.b.y(aljgVar);
        }
        aljo aljoVar2 = this.a;
        aljoVar2.g = new aljn(aljoVar2.c, mbVar);
        aljo aljoVar3 = this.a;
        aljoVar3.b.w(aljoVar3.g);
        return mbVar;
    }
}
