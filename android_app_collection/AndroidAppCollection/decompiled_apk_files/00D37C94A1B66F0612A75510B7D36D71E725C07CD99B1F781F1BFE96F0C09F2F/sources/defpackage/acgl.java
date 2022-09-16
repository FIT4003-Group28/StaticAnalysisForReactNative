package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: acgl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acgl implements Runnable {
    public final /* synthetic */ LiveCreationActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ acgl(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public /* synthetic */ acgl(LiveCreationActivity liveCreationActivity, int i) {
        this.b = i;
        this.a = liveCreationActivity;
    }

    public acgl(LiveCreationActivity liveCreationActivity, int i, byte[] bArr) {
        this.b = i;
        this.a = liveCreationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            LiveCreationActivity liveCreationActivity = this.a;
            if (liveCreationActivity.K != null) {
                if (!liveCreationActivity.P) {
                    ex l = liveCreationActivity.G.l();
                    l.m(liveCreationActivity.K);
                    l.a();
                }
                liveCreationActivity.K.aF(null);
                liveCreationActivity.K = null;
            }
            liveCreationActivity.w();
        } else if (i == 1) {
            LiveCreationActivity liveCreationActivity2 = this.a;
            new abtc(liveCreationActivity2, liveCreationActivity2.r).c();
        } else if (i == 2) {
            LiveCreationActivity liveCreationActivity3 = this.a;
            liveCreationActivity3.aB(liveCreationActivity3.M, "EDIT_THUMBNAIL_FRAGMENT_NAME");
        } else if (i == 3) {
            LiveCreationActivity liveCreationActivity4 = this.a;
            acgj acgjVar = new acgj(liveCreationActivity4);
            ylx.o(liveCreationActivity4, liveCreationActivity4.aa.a(), new heo(acgjVar, 3), new heo(acgjVar, 2));
        } else if (i == 4) {
            this.a.aJ();
        } else {
            if (this.a.u.i()) {
                LiveCreationActivity liveCreationActivity5 = this.a;
                liveCreationActivity5.aq(liveCreationActivity5.r.c());
            } else {
                SharedPreferences.Editor edit = this.a.C.edit();
                edit.putLong("SHARED_PREF_LS_TIMESTAMP_KEY", this.a.r.c());
                edit.commit();
            }
            this.a.U.postDelayed(this, LiveCreationActivity.d);
        }
    }
}
