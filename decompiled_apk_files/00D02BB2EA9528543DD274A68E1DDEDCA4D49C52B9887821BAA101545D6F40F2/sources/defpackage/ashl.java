package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ashl  reason: default package */
/* loaded from: classes2.dex */
final class ashl extends cqmr<asho> {
    final /* synthetic */ View a;
    final /* synthetic */ ashm b;

    public ashl(ashm ashmVar, View view) {
        this.b = ashmVar;
        this.a = view;
    }

    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(asho ashoVar, boolean z) {
        cpwy cpwyVar = this.b.a;
        if (cpwyVar != null && !gct.a(this.a.getContext().getResources().getConfiguration())) {
            cpwyVar.setIconType(0);
            this.b.a = null;
        }
    }
}
