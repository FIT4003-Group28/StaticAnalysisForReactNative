package defpackage;

import android.content.DialogInterface;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: acgq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acgq implements DialogInterface.OnClickListener {
    public final /* synthetic */ LiveCreationActivity a;
    public final /* synthetic */ acti b;
    private final /* synthetic */ int c;

    public /* synthetic */ acgq(LiveCreationActivity liveCreationActivity, acti actiVar) {
        this.a = liveCreationActivity;
        this.b = actiVar;
    }

    public /* synthetic */ acgq(LiveCreationActivity liveCreationActivity, acti actiVar, int i) {
        this.c = i;
        this.a = liveCreationActivity;
        this.b = actiVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.c != 0) {
            LiveCreationActivity liveCreationActivity = this.a;
            acti actiVar = this.b;
            if (actiVar != null) {
                actiVar.H(3, new acte(acuo.b(29220)), null);
            }
            liveCreationActivity.S = false;
            akdr.c(liveCreationActivity);
            return;
        }
        LiveCreationActivity liveCreationActivity2 = this.a;
        acti actiVar2 = this.b;
        if (actiVar2 == null) {
            return;
        }
        actiVar2.H(3, new acte(acuo.b(29221)), null);
        liveCreationActivity2.S = false;
        liveCreationActivity2.onBackPressed();
    }
}
