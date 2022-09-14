package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.filament.R;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cocn  reason: default package */
/* loaded from: classes5.dex */
public final class cocn implements Parcelable.Creator<ErrorReport> {
    public static final ErrorReport a(Parcel parcel) {
        int f = cnwm.f(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList<String> arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        while (parcel.dataPosition() < f) {
            int a = cnwm.a(parcel);
            switch (cnwm.b(a)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) cnwm.q(parcel, a, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = cnwm.o(parcel, a);
                    break;
                case 4:
                    i = cnwm.i(parcel, a);
                    break;
                case 5:
                    str2 = cnwm.o(parcel, a);
                    break;
                case 6:
                    str3 = cnwm.o(parcel, a);
                    break;
                case 7:
                    str4 = cnwm.o(parcel, a);
                    break;
                case 8:
                    str5 = cnwm.o(parcel, a);
                    break;
                case 9:
                    str6 = cnwm.o(parcel, a);
                    break;
                case 10:
                    str7 = cnwm.o(parcel, a);
                    break;
                case 11:
                    str8 = cnwm.o(parcel, a);
                    break;
                case 12:
                    i2 = cnwm.i(parcel, a);
                    break;
                case 13:
                    str9 = cnwm.o(parcel, a);
                    break;
                case 14:
                    str10 = cnwm.o(parcel, a);
                    break;
                case 15:
                    str11 = cnwm.o(parcel, a);
                    break;
                case 16:
                    str12 = cnwm.o(parcel, a);
                    break;
                case 17:
                    str13 = cnwm.o(parcel, a);
                    break;
                case 18:
                    strArr = cnwm.w(parcel, a);
                    break;
                case 19:
                    strArr2 = cnwm.w(parcel, a);
                    break;
                case 20:
                    strArr3 = cnwm.w(parcel, a);
                    break;
                case 21:
                    str14 = cnwm.o(parcel, a);
                    break;
                case 22:
                    str15 = cnwm.o(parcel, a);
                    break;
                case 23:
                    bArr = cnwm.s(parcel, a);
                    break;
                case 24:
                    i3 = cnwm.i(parcel, a);
                    break;
                case 25:
                    i4 = cnwm.i(parcel, a);
                    break;
                case 26:
                    i5 = cnwm.i(parcel, a);
                    break;
                case 27:
                    i6 = cnwm.i(parcel, a);
                    break;
                case 28:
                    str16 = cnwm.o(parcel, a);
                    break;
                case 29:
                    str17 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    str18 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    bundle = cnwm.r(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    z = cnwm.g(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    i7 = cnwm.i(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    i8 = cnwm.i(parcel, a);
                    break;
                case 35:
                    z2 = cnwm.g(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    str19 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    str20 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    i9 = cnwm.i(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    str21 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    str22 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    str23 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    str24 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    str25 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    str26 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    str27 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    bitmapTeleporter = (BitmapTeleporter) cnwm.q(parcel, a, BitmapTeleporter.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    str28 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    fileTeleporterArr = (FileTeleporter[]) cnwm.z(parcel, a, FileTeleporter.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    strArr4 = cnwm.w(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    z3 = cnwm.g(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    str29 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    themeSettings = (ThemeSettings) cnwm.q(parcel, a, ThemeSettings.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    logOptions = (LogOptions) cnwm.q(parcel, a, LogOptions.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    str30 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    z4 = cnwm.g(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    bundle2 = cnwm.r(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    arrayList = cnwm.A(parcel, a, RectF.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    z5 = cnwm.g(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    bitmap = (Bitmap) cnwm.q(parcel, a, Bitmap.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    str31 = cnwm.o(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    arrayList2 = cnwm.y(parcel, a);
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    i10 = cnwm.i(parcel, a);
                    break;
                default:
                    cnwm.d(parcel, a);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ErrorReport createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ErrorReport[] newArray(int i) {
        return new ErrorReport[i];
    }
}
