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
/* renamed from: rbk  reason: default package */
/* loaded from: classes4.dex */
public final class rbk implements Parcelable.Creator {
    public static void a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, feedbackOptions.a);
        tqj.v(parcel, 3, feedbackOptions.b);
        tqj.F(parcel, 5, feedbackOptions.c);
        tqj.E(parcel, 6, feedbackOptions.d, i);
        tqj.F(parcel, 7, feedbackOptions.e);
        tqj.E(parcel, 8, feedbackOptions.f, i);
        tqj.F(parcel, 9, feedbackOptions.g);
        tqj.J(parcel, 10, feedbackOptions.h);
        tqj.o(parcel, 11, feedbackOptions.i);
        tqj.E(parcel, 12, feedbackOptions.j, i);
        tqj.E(parcel, 13, feedbackOptions.k, i);
        tqj.o(parcel, 14, feedbackOptions.l);
        tqj.E(parcel, 15, feedbackOptions.m, i);
        tqj.F(parcel, 16, feedbackOptions.n);
        tqj.o(parcel, 17, feedbackOptions.o);
        tqj.t(parcel, 18, feedbackOptions.p);
        tqj.n(parcel, m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = tqj.Q(parcel);
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
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (tqj.M(readInt)) {
                case 2:
                    str = tqj.Y(parcel, readInt);
                    break;
                case 3:
                    bundle = tqj.S(parcel, readInt);
                    break;
                case 4:
                default:
                    tqj.ad(parcel, readInt);
                    break;
                case 5:
                    str2 = tqj.Y(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) tqj.U(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = tqj.Y(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) tqj.U(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = tqj.Y(parcel, readInt);
                    break;
                case 10:
                    arrayList = tqj.ab(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = tqj.ae(parcel, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) tqj.U(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) tqj.U(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = tqj.ae(parcel, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) tqj.U(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = tqj.Y(parcel, readInt);
                    break;
                case 17:
                    z3 = tqj.ae(parcel, readInt);
                    break;
                case 18:
                    j = tqj.R(parcel, readInt);
                    break;
            }
        }
        tqj.ac(parcel, Q);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
