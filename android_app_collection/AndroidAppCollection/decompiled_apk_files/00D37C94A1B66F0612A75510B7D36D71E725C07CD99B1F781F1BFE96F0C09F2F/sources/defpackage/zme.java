package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zme  reason: default package */
/* loaded from: classes4.dex */
final class zme implements View.OnClickListener {
    final /* synthetic */ zmf a;

    public zme(zmf zmfVar) {
        this.a = zmfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.a.a.F()) {
            return;
        }
        this.a.c.H(3, new acte(actj.UPLOAD_VIDEO_FLASH_TOGGLE), this.a.d);
        zmf zmfVar = this.a;
        zmfVar.g(!zmfVar.a.E(), true, true);
    }
}
