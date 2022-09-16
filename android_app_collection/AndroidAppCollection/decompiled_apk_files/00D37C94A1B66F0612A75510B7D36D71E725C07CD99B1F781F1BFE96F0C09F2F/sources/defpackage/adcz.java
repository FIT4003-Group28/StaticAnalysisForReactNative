package defpackage;

import android.widget.Toast;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adcz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adcz implements zdt {
    public final /* synthetic */ addf a;
    private final /* synthetic */ int b;

    public /* synthetic */ adcz(addf addfVar) {
        this.a = addfVar;
    }

    public /* synthetic */ adcz(addf addfVar, int i) {
        this.b = i;
        this.a = addfVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            addf addfVar = this.a;
            Void r3 = (Void) obj;
            addfVar.a();
            if (addfVar.d.b() != 0) {
                return;
            }
            aczo.a(addfVar.a.mJ(), PairWithTvActivity.class, 0);
            return;
        }
        Throwable th = (Throwable) obj;
        Toast.makeText(this.a.a.mJ(), (int) R.string.mdx_pref_delete_tv_codes_remove_error, 1).show();
    }
}
