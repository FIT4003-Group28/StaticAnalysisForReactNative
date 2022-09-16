package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: acgm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acgm implements Runnable {
    public final /* synthetic */ LiveCreationActivity a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ acgm(LiveCreationActivity liveCreationActivity, int i) {
        this.a = liveCreationActivity;
        this.b = i;
    }

    public /* synthetic */ acgm(LiveCreationActivity liveCreationActivity, int i, int i2) {
        this.c = i2;
        this.a = liveCreationActivity;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.ap(this.b - 1);
            return;
        }
        LiveCreationActivity liveCreationActivity = this.a;
        int i = this.b;
        SharedPreferences.Editor edit = liveCreationActivity.C.edit();
        edit.putInt("SHARED_PREF_PORTRAIT_COUNT_KEY", i);
        edit.commit();
    }
}
