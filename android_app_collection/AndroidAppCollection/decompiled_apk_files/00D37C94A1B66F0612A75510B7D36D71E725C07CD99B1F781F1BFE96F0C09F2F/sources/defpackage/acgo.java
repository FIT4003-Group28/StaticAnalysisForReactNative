package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: acgo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acgo implements DialogInterface.OnClickListener {
    public final /* synthetic */ LiveCreationActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ acgo(LiveCreationActivity liveCreationActivity, int i) {
        this.b = i;
        this.a = liveCreationActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            LiveCreationActivity.an(this.a, Uri.parse("https://support.google.com/youtube/answer/2474026"));
        } else if (i2 == 1) {
            LiveCreationActivity liveCreationActivity = this.a;
            if (acly.c(liveCreationActivity)) {
                acly.e(liveCreationActivity);
                liveCreationActivity.finish();
                return;
            }
            liveCreationActivity.s(true);
            liveCreationActivity.R = false;
            liveCreationActivity.aw();
        } else {
            this.a.finish();
        }
    }
}
