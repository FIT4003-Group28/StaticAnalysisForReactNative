package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hkm  reason: default package */
/* loaded from: classes3.dex */
public final class hkm implements abv {
    final /* synthetic */ hkn a;

    public hkm(hkn hknVar) {
        this.a = hknVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        hkn hknVar = this.a;
        if (!hknVar.a) {
            hknVar.a = true;
            ((ReelCameraActivity) hknVar).c = ((dwq) hknVar.lI()).hM();
        }
    }
}
