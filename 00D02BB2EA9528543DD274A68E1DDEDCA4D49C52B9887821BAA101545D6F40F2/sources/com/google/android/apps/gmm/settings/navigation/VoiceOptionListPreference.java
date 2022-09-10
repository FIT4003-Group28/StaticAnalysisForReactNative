package com.google.android.apps.gmm.settings.navigation;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class VoiceOptionListPreference extends ListPreference implements btkz {
    @dzsi
    public CharSequence[] D;
    @dzsi
    public boolean[] E;

    public VoiceOptionListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.preferenceStyle);
        this.D = null;
        this.E = null;
    }

    @Override // defpackage.btkz
    public final aug m() {
        String str = ((ListPreference) this).i;
        dbsk.s(str);
        btff btffVar = new btff();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("selectedEntryValue", str);
        bundle.putCharSequenceArray("entries", (CharSequence[]) dbsk.s(((ListPreference) this).g));
        bundle.putCharSequenceArray("entryValues", (CharSequence[]) dbsk.s(((ListPreference) this).h));
        bundle.putCharSequenceArray("entrySummaries", (CharSequence[]) dbsk.s(this.D));
        bundle.putBooleanArray("entryIsRecommended", (boolean[]) dbsk.s(this.E));
        btffVar.B(bundle);
        return btffVar;
    }
}
