package defpackage;

import android.view.View;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: bjd  reason: default package */
/* loaded from: classes2.dex */
public final class bjd implements View.OnClickListener {
    final /* synthetic */ Preference a;

    public bjd(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.qC(view);
    }
}
