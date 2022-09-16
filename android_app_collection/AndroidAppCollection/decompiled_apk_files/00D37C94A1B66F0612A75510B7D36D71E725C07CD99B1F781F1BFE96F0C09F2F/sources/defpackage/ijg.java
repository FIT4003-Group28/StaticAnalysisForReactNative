package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ijg  reason: default package */
/* loaded from: classes3.dex */
public final class ijg implements afzf {
    final /* synthetic */ EditVideoActivity a;

    public ijg(EditVideoActivity editVideoActivity) {
        this.a = editVideoActivity;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error while making the metadata editor request.", cffVar);
        this.a.finish();
        zag.q(this.a, R.string.error_generic, 1);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arwq arwqVar = (arwq) obj;
        EditVideoActivity editVideoActivity = this.a;
        if (editVideoActivity.u) {
            return;
        }
        if (arwqVar == null) {
            editVideoActivity.finish();
            zag.q(this.a, R.string.error_generic, 1);
            return;
        }
        editVideoActivity.t = arwqVar;
        editVideoActivity.runOnUiThread(new Runnable() { // from class: ijf
            @Override // java.lang.Runnable
            public final void run() {
                ijg.this.a.t();
            }
        });
    }
}
