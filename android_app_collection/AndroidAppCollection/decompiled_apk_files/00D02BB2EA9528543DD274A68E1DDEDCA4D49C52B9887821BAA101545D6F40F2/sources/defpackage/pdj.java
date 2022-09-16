package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: pdj  reason: default package */
/* loaded from: classes7.dex */
final class pdj extends ckqk {
    final /* synthetic */ augc a;
    final /* synthetic */ pdk b;

    public pdj(pdk pdkVar, augc augcVar) {
        this.b = pdkVar;
        this.a = augcVar;
    }

    @Override // defpackage.ckqk
    public final void a(Bitmap bitmap) {
        auhi auhiVar = this.b.b;
        augc augcVar = this.a;
        augcVar.m = bitmap;
        auhiVar.j(augcVar.a());
    }

    @Override // defpackage.ckqk
    public final void b() {
        this.b.b.j(this.a.a());
    }
}
