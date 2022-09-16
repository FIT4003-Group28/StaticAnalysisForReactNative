package defpackage;

import android.view.View;
import com.google.android.apps.gmm.settings.navigation.InlineButtonPreference;
/* compiled from: PG */
/* renamed from: btdv  reason: default package */
/* loaded from: classes4.dex */
public final class btdv implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ InlineButtonPreference b;

    public btdv(InlineButtonPreference inlineButtonPreference, int i) {
        this.b = inlineButtonPreference;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InlineButtonPreference inlineButtonPreference = this.b;
        int i = this.a;
        if (inlineButtonPreference.d != i) {
            inlineButtonPreference.d = i;
            inlineButtonPreference.m();
            btdw btdwVar = btdw.values()[i];
            aub aubVar = inlineButtonPreference.e;
            if (aubVar == null) {
                return;
            }
            aubVar.a(inlineButtonPreference, btdwVar);
        }
    }
}
