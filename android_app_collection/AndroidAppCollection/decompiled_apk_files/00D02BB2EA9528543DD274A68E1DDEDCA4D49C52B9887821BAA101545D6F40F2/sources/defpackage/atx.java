package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: atx  reason: default package */
/* loaded from: classes2.dex */
public final class atx extends aug {
    final Set<String> ad = new HashSet();
    boolean ae;
    CharSequence[] af;
    CharSequence[] ag;

    private final MultiSelectListPreference aO() {
        return (MultiSelectListPreference) aN();
    }

    @Override // defpackage.aug
    public final void aL(boolean z) {
        if (z && this.ae) {
            MultiSelectListPreference aO = aO();
            if (aO.I(this.ad)) {
                aO.m(this.ad);
            }
        }
        this.ae = false;
    }

    @Override // defpackage.aug
    protected final void aM(qx qxVar) {
        int length = this.ag.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ad.contains(this.ag[i].toString());
        }
        CharSequence[] charSequenceArr = this.af;
        atw atwVar = new atw(this);
        qt qtVar = qxVar.a;
        qtVar.n = charSequenceArr;
        qtVar.v = atwVar;
        qtVar.r = zArr;
        qtVar.s = true;
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            MultiSelectListPreference aO = aO();
            if (aO.g == null || aO.h == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.ad.clear();
            this.ad.addAll(aO.i);
            this.ae = false;
            this.af = aO.g;
            this.ag = aO.h;
            return;
        }
        this.ad.clear();
        this.ad.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.ae = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.af = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.ag = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ad));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ae);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.af);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.ag);
    }
}
