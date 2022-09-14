package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cocx  reason: default package */
/* loaded from: classes5.dex */
public final class cocx implements Parcelable.Creator<FeedbackOptions> {
    public static void a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, feedbackOptions.a, false);
        cnwn.m(parcel, 3, feedbackOptions.b);
        cnwn.k(parcel, 5, feedbackOptions.c, false);
        cnwn.u(parcel, 6, feedbackOptions.d, i);
        cnwn.k(parcel, 7, feedbackOptions.e, false);
        cnwn.u(parcel, 8, feedbackOptions.f, i);
        cnwn.k(parcel, 9, feedbackOptions.g, false);
        cnwn.y(parcel, 10, feedbackOptions.h);
        cnwn.e(parcel, 11, feedbackOptions.i);
        cnwn.u(parcel, 12, feedbackOptions.j, i);
        cnwn.u(parcel, 13, feedbackOptions.k, i);
        cnwn.e(parcel, 14, feedbackOptions.l);
        cnwn.u(parcel, 15, feedbackOptions.m, i);
        cnwn.k(parcel, 16, feedbackOptions.n, false);
        cnwn.e(parcel, 17, feedbackOptions.o);
        cnwn.h(parcel, 18, feedbackOptions.p);
        cnwn.c(parcel, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FeedbackOptions createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    bundle = cnwm.r(parcel, readInt);
                    break;
                case 4:
                default:
                    cnwm.d(parcel, readInt);
                    break;
                case 5:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) cnwm.q(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) cnwm.q(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 10:
                    arrayList = cnwm.A(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) cnwm.q(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) cnwm.q(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) cnwm.q(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case 17:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case 18:
                    j = cnwm.k(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FeedbackOptions[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
