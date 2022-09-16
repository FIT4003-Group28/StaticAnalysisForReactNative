package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: reg  reason: default package */
/* loaded from: classes4.dex */
public final class reg extends rek {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ long c;
    final /* synthetic */ GoogleHelp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reg(qsx qsxVar, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(qsxVar);
        this.a = feedbackOptions;
        this.b = bundle;
        this.c = j;
        this.d = googleHelp;
    }

    @Override // defpackage.rej
    protected final void b(rep repVar) {
        try {
            FeedbackOptions feedbackOptions = this.a;
            Bundle bundle = this.b;
            long j = this.c;
            GoogleHelp googleHelp = this.d;
            ref refVar = new ref(this);
            Parcel pv = repVar.pv();
            dve.g(pv, feedbackOptions);
            dve.g(pv, bundle);
            pv.writeLong(j);
            dve.g(pv, googleHelp);
            dve.i(pv, refVar);
            repVar.py(10, pv);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            l(rel.a);
        }
    }
}
