package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.filament.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cods  reason: default package */
/* loaded from: classes5.dex */
public final class cods implements Parcelable.Creator<GoogleHelp> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleHelp createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList<String> arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    account = (Account) cnwm.q(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = cnwm.r(parcel, readInt);
                    break;
                case 5:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 6:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 7:
                    arrayList = cnwm.y(parcel, readInt);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                default:
                    cnwm.d(parcel, readInt);
                    break;
                case 10:
                    bundle2 = cnwm.r(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) cnwm.q(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = cnwm.A(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = cnwm.i(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = cnwm.A(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 20:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 21:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 22:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) cnwm.q(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) cnwm.q(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    togglingData = (TogglingData) cnwm.q(parcel, readInt, TogglingData.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    i5 = cnwm.i(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    pendingIntent = (PendingIntent) cnwm.q(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) cnwm.q(parcel, readInt, Bitmap.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    i6 = cnwm.i(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    z4 = cnwm.g(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    z5 = cnwm.g(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    i7 = cnwm.i(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    z6 = cnwm.g(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    str6 = cnwm.o(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    z7 = cnwm.g(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleHelp[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
