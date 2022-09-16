package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
/* compiled from: PG */
/* renamed from: lhq  reason: default package */
/* loaded from: classes3.dex */
public final class lhq {
    public final Activity a;
    public final aafo b;
    public final SettingsDataAccess c;
    public final acti d;
    public final ohp e;

    public lhq(Activity activity, aafo aafoVar, SettingsDataAccess settingsDataAccess, acti actiVar, ohp ohpVar) {
        this.a = activity;
        this.b = aafoVar;
        this.c = settingsDataAccess;
        this.d = actiVar;
        this.e = ohpVar;
    }

    public final String a(int i) {
        return this.a.getString(i);
    }
}
