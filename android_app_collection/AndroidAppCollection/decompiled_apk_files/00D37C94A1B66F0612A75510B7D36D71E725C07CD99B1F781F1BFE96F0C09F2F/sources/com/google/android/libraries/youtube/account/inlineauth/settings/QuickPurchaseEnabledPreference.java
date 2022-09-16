package com.google.android.libraries.youtube.account.inlineauth.settings;

import android.app.Activity;
import android.content.Context;
import androidx.preference.SwitchPreference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseEnabledPreference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class QuickPurchaseEnabledPreference extends SwitchPreference implements wbi {
    public final wdv c;
    public final akjm d;
    public final aurg e;
    public final boolean f;

    public QuickPurchaseEnabledPreference(Context context, boolean z, wdv wdvVar, akjm akjmVar, aurg aurgVar) {
        super(context);
        this.f = z;
        this.c = wdvVar;
        this.e = aurgVar;
        this.d = akjmVar;
    }

    @Override // defpackage.wbi
    public final void a() {
    }

    @Override // defpackage.wbi
    public final void b() {
        ((Activity) this.j).runOnUiThread(new Runnable() { // from class: wdu
            @Override // java.lang.Runnable
            public final void run() {
                QuickPurchaseEnabledPreference quickPurchaseEnabledPreference = QuickPurchaseEnabledPreference.this;
                quickPurchaseEnabledPreference.k(true);
                quickPurchaseEnabledPreference.d.d(quickPurchaseEnabledPreference.e, true);
                quickPurchaseEnabledPreference.c.a(quickPurchaseEnabledPreference.f, true);
            }
        });
    }
}
