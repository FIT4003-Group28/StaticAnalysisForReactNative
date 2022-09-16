package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.ListPreference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lie  reason: default package */
/* loaded from: classes3.dex */
public final class lie extends lii {
    public azqb af;
    public int ag;

    public static lie aL(String str) {
        lie lieVar = new lie();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        lieVar.ae(bundle);
        return lieVar;
    }

    private final ListPreference aO() {
        return (ListPreference) aJ();
    }

    @Override // defpackage.bja, defpackage.bjk
    public final void aF(boolean z) {
        int i;
        ListPreference aO = aO();
        CharSequence[] charSequenceArr = aO.h;
        if (!z || (i = this.ag) < 0 || i >= charSequenceArr.length) {
            return;
        }
        String charSequence = charSequenceArr[i].toString();
        if (!aO.Q(charSequence)) {
            return;
        }
        aO.o(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bja, defpackage.bjk
    public final void jR(nw nwVar) {
        super.jR(nwVar);
        nwVar.d(LayoutInflater.from(nwVar.a()).inflate(R.layout.hide_controls_custom_title, (ViewGroup) null));
        int k = aO().k(N(R.string.pref_hide_controls_value_system_setting));
        nwVar.m(new lic(mJ(), aO().g, this.ag, k, this.af), this.ag, new DialogInterface.OnClickListener() { // from class: lid
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                lie lieVar = lie.this;
                lieVar.ag = i;
                ((bjk) lieVar).ai = -1;
                dialogInterface.dismiss();
            }
        });
    }

    @Override // defpackage.bja, defpackage.bjk, defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle == null) {
            ListPreference aO = aO();
            this.ag = aO.k(aO.i);
            return;
        }
        this.ag = bundle.getInt("SAVE_STATE_INDEX_KEY", 0);
    }

    @Override // defpackage.bja, defpackage.bjk, defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        bundle.putInt("SAVE_STATE_INDEX_KEY", this.ag);
    }
}
