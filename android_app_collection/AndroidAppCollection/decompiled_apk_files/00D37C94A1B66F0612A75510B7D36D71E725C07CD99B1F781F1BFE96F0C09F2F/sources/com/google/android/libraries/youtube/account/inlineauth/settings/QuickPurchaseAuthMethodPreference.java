package com.google.android.libraries.youtube.account.inlineauth.settings;

import android.app.Activity;
import android.content.Context;
import androidx.preference.ListPreference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseAuthMethodPreference;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class QuickPurchaseAuthMethodPreference extends ListPreference implements wbi {
    public int G;
    public List H;
    public final akjm I;

    public QuickPurchaseAuthMethodPreference(Context context, akjm akjmVar) {
        super(context);
        this.G = -1;
        this.H = null;
        this.I = akjmVar;
    }

    @Override // defpackage.wbi
    public final void a() {
    }

    @Override // defpackage.wbi
    public final void b() {
        ((Activity) this.j).runOnUiThread(new Runnable() { // from class: wdt
            @Override // java.lang.Runnable
            public final void run() {
                QuickPurchaseAuthMethodPreference quickPurchaseAuthMethodPreference = QuickPurchaseAuthMethodPreference.this;
                int i = quickPurchaseAuthMethodPreference.G;
                if (i >= 0) {
                    quickPurchaseAuthMethodPreference.f(i);
                    quickPurchaseAuthMethodPreference.n(((auro) quickPurchaseAuthMethodPreference.H.get(quickPurchaseAuthMethodPreference.G)).c);
                    int i2 = 0;
                    while (i2 < quickPurchaseAuthMethodPreference.H.size()) {
                        quickPurchaseAuthMethodPreference.I.e((auro) quickPurchaseAuthMethodPreference.H.get(i2), i2 == quickPurchaseAuthMethodPreference.G);
                        i2++;
                    }
                }
            }
        });
    }
}
