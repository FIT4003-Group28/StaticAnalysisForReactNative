package com.google.android.apps.gmm.settings.notification;

import android.content.Context;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ManageNotificationsPreference extends Preference {
    public final Context a;
    public final dxio<afha> b;
    private final cqkj c;
    private final btfv d;

    public ManageNotificationsPreference(Context context, cqkj cqkjVar, dxio<afha> dxioVar) {
        super(context);
        this.a = context;
        this.d = new btfu(this);
        this.c = cqkjVar;
        this.b = dxioVar;
        this.y = R.layout.manage_notifications_preference_layout;
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        this.c.c(new btft(), (ViewGroup) aveVar.C(R.id.manage_notifications_layout)).e(this.d);
    }
}
