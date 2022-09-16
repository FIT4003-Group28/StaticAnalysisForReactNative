package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zxw  reason: default package */
/* loaded from: classes4.dex */
final class zxw extends aljg {
    final /* synthetic */ zxz a;

    public zxw(zxz zxzVar) {
        this.a = zxzVar;
    }

    @Override // defpackage.aljg
    public final void b(View view, int i) {
        View view2;
        zxz zxzVar = this.a;
        if (zxzVar.af == null || (view2 = zxzVar.ae) == null) {
            return;
        }
        if (i == 3) {
            int height = view2.getHeight();
            zxz zxzVar2 = this.a;
            if (height >= zxzVar2.au) {
                zxzVar2.af.setElevation(zxzVar2.at);
                return;
            }
        }
        this.a.af.setElevation(0.0f);
    }

    @Override // defpackage.aljg
    public final void ms(View view, float f) {
    }
}
