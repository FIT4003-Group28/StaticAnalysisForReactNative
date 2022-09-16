package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: lnl  reason: default package */
/* loaded from: classes7.dex */
final class lnl extends ckqk {
    final /* synthetic */ lnp a;

    public lnl(lnp lnpVar) {
        this.a = lnpVar;
    }

    @Override // defpackage.ckqk
    public final void a(Bitmap bitmap) {
        lnp lnpVar = this.a;
        lnpVar.e = bitmap;
        for (atuc atucVar : lnpVar.d) {
            atucVar.a(bitmap);
        }
    }
}
