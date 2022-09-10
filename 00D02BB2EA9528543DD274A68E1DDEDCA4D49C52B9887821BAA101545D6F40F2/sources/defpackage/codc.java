package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
/* compiled from: PG */
/* renamed from: codc  reason: default package */
/* loaded from: classes5.dex */
public final class codc extends cla implements IInterface {
    public codc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
    }

    public final void e(FeedbackOptions feedbackOptions) {
        Parcel a = a();
        clc.e(a, feedbackOptions);
        Parcel Si = Si(7, a);
        clc.a(Si);
        Si.recycle();
    }

    public final void f(ErrorReport errorReport) {
        Parcel a = a();
        clc.e(a, errorReport);
        Parcel Si = Si(3, a);
        clc.a(Si);
        Si.recycle();
    }

    public final void g(ErrorReport errorReport) {
        Parcel a = a();
        clc.e(a, errorReport);
        Parcel Si = Si(1, a);
        clc.a(Si);
        Si.recycle();
    }
}
