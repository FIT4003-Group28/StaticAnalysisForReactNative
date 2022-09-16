package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bjc  reason: default package */
/* loaded from: classes2.dex */
public final class bjc extends bjk {
    final Set ae = new HashSet();
    boolean af;
    CharSequence[] ag;
    CharSequence[] ah;

    private final MultiSelectListPreference aL() {
        return (MultiSelectListPreference) aJ();
    }

    @Override // defpackage.bjk
    public final void aF(boolean z) {
        if (z && this.af) {
            MultiSelectListPreference aL = aL();
            if (aL.Q(this.ae)) {
                aL.k(this.ae);
            }
        }
        this.af = false;
    }

    @Override // defpackage.bjk
    protected final void jR(nw nwVar) {
        int length = this.ah.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ae.contains(this.ah[i].toString());
        }
        CharSequence[] charSequenceArr = this.ag;
        bjb bjbVar = new bjb(this);
        ns nsVar = nwVar.a;
        nsVar.o = charSequenceArr;
        nsVar.w = bjbVar;
        nsVar.s = zArr;
        nsVar.t = true;
    }

    @Override // defpackage.bjk, defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle == null) {
            MultiSelectListPreference aL = aL();
            if (aL.g == null || aL.h == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.ae.clear();
            this.ae.addAll(aL.i);
            this.af = false;
            this.ag = aL.g;
            this.ah = aL.h;
            return;
        }
        this.ae.clear();
        this.ae.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.af = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.ag = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.ah = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // defpackage.bjk, defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ae));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.af);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ag);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.ah);
    }
}
