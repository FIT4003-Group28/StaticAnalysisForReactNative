package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;
/* compiled from: PG */
/* renamed from: bja  reason: default package */
/* loaded from: classes2.dex */
public class bja extends bjk {
    int ae;
    private CharSequence[] af;
    private CharSequence[] ag;

    private ListPreference aL() {
        return (ListPreference) aJ();
    }

    @Override // defpackage.bjk
    public void aF(boolean z) {
        int i;
        if (!z || (i = this.ae) < 0) {
            return;
        }
        String charSequence = this.ag[i].toString();
        ListPreference aL = aL();
        if (!aL.Q(charSequence)) {
            return;
        }
        aL.o(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bjk
    public void jR(nw nwVar) {
        CharSequence[] charSequenceArr = this.af;
        int i = this.ae;
        biz bizVar = new biz(this);
        ns nsVar = nwVar.a;
        nsVar.o = charSequenceArr;
        nsVar.q = bizVar;
        nsVar.v = i;
        nsVar.u = true;
        nwVar.l(null, null);
    }

    @Override // defpackage.bjk, defpackage.dh, defpackage.dp
    public void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle == null) {
            ListPreference aL = aL();
            if (aL.g == null || aL.h == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.ae = aL.k(aL.i);
            this.af = aL.g;
            this.ag = aL.h;
            return;
        }
        this.ae = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.af = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.ag = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // defpackage.bjk, defpackage.dh, defpackage.dp
    public void oz(Bundle bundle) {
        super.oz(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ae);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.af);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ag);
    }
}
