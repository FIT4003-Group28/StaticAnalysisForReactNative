package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anki  reason: default package */
/* loaded from: classes2.dex */
public final class anki implements angx {
    public final Activity a;
    public final eeu b;
    public final apkn c;

    public anki(Activity activity, eeu eeuVar, apkn apknVar) {
        this.a = activity;
        this.b = eeuVar;
        this.c = apknVar;
    }

    @Override // defpackage.angx
    public final void k(duxy duxyVar, duya duyaVar) {
        int a = dnqj.a(duyaVar.b);
        if (a != 0 && a == 1) {
            final AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.a).setTitle(this.a.getString(R.string.MAPS_ACTIVITY_LOCATION_HISTORY_DELETED)).setMessage(this.a.getString(R.string.MAPS_ACTIVITY_LOCATION_HISTORY_DELETED_EXPLANATION)).setNeutralButton(this.a.getString(R.string.MAPS_ACTIVITY_GO_TO_WAA_BUTTON), new ankh(this)).setPositiveButton(this.a.getString(R.string.DONE), new ankg());
            this.a.runOnUiThread(new Runnable(this, positiveButton) { // from class: ankf
                private final anki a;
                private final AlertDialog.Builder b;

                {
                    this.a = this;
                    this.b = positiveButton;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    anki ankiVar = this.a;
                    AlertDialog.Builder builder = this.b;
                    if (!((efh) ankiVar.b).b) {
                        return;
                    }
                    builder.show();
                }
            });
        }
    }

    @Override // defpackage.angx
    public final void l() {
        final String string = this.a.getString(R.string.MAPS_ACTIVITY_ERROR_COULDNT_DELETE_LOCATION_HISTORY);
        this.a.runOnUiThread(new Runnable(this, string) { // from class: anke
            private final anki a;
            private final String b;

            {
                this.a = this;
                this.b = string;
            }

            @Override // java.lang.Runnable
            public final void run() {
                anki ankiVar = this.a;
                String str = this.b;
                if (!((efh) ankiVar.b).b) {
                    return;
                }
                Toast.makeText(ankiVar.a, str, 0).show();
            }
        });
    }
}
