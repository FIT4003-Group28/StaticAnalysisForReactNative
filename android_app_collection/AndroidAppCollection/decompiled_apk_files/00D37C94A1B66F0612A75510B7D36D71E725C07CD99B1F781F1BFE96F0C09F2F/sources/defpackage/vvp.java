package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.libraries.video.media.VideoMetaData;
/* compiled from: PG */
/* renamed from: vvp  reason: default package */
/* loaded from: classes4.dex */
public final class vvp extends dp {
    private final vvo a = new vvo();

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        this.a.c = activity;
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.a.b();
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.a.c();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.a.d();
    }

    public final vvl a(VideoMetaData videoMetaData) {
        vvo vvoVar = this.a;
        vvm vvmVar = vvoVar.f;
        if (vvmVar == null || !videoMetaData.equals(vvmVar.a)) {
            vvm vvmVar2 = vvoVar.f;
            if (vvmVar2 != null) {
                vvmVar2.f();
            }
            vvoVar.f = new vvm(vvoVar, videoMetaData);
            return vvoVar.f;
        }
        return vvoVar.f;
    }

    public final void d(boolean z) {
        this.a.h = z;
    }

    @Override // defpackage.dp
    public final void lU() {
        super.lU();
        this.a.c = null;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        aC();
        this.a.a(bundle);
    }

    public final void n(vrt vrtVar) {
        vvo vvoVar = this.a;
        if (vvoVar.g != vrtVar) {
            vvm vvmVar = vvoVar.f;
            if (vvmVar != null) {
                vvmVar.g();
            }
            vvoVar.g = vrtVar;
            vvm vvmVar2 = vvoVar.f;
            if (vvmVar2 == null) {
                return;
            }
            vvmVar2.e();
        }
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        this.a.e(bundle);
    }
}
