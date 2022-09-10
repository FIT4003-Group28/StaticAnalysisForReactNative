package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;
/* compiled from: PG */
/* renamed from: atu  reason: default package */
/* loaded from: classes2.dex */
public final class atu extends aug {
    int ad;
    private CharSequence[] ae;
    private CharSequence[] af;

    private final ListPreference aO() {
        return (ListPreference) aN();
    }

    @Override // defpackage.aug
    public final void aL(boolean z) {
        int i;
        if (!z || (i = this.ad) < 0) {
            return;
        }
        String charSequence = this.af[i].toString();
        ListPreference aO = aO();
        if (!aO.I(charSequence)) {
            return;
        }
        aO.Rj(charSequence);
    }

    @Override // defpackage.aug
    protected final void aM(qx qxVar) {
        CharSequence[] charSequenceArr = this.ae;
        int i = this.ad;
        att attVar = new att(this);
        qt qtVar = qxVar.a;
        qtVar.n = charSequenceArr;
        qtVar.p = attVar;
        qtVar.u = i;
        qtVar.t = true;
        qxVar.h(null, null);
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            ListPreference aO = aO();
            if (aO.g == null || aO.h == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.ad = aO.o(aO.i);
            this.ae = aO.g;
            this.af = aO.h;
            return;
        }
        this.ad = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.ae = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.af = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ad);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ae);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.af);
    }
}
