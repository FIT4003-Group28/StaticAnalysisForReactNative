package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: rdu  reason: default package */
/* loaded from: classes4.dex */
public final class rdu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = tqj.Q(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
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
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (tqj.M(readInt)) {
                case 1:
                    i = tqj.O(parcel, readInt);
                    break;
                case 2:
                    str = tqj.Y(parcel, readInt);
                    break;
                case 3:
                    account = (Account) tqj.U(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = tqj.S(parcel, readInt);
                    break;
                case 5:
                    z = tqj.ae(parcel, readInt);
                    break;
                case 6:
                    z2 = tqj.ae(parcel, readInt);
                    break;
                case 7:
                    arrayList = tqj.aa(parcel, readInt);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    tqj.ad(parcel, readInt);
                    break;
                case 10:
                    bundle2 = tqj.S(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) tqj.U(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = tqj.Y(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) tqj.U(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = tqj.ab(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = tqj.O(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = tqj.ab(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = tqj.af(parcel, readInt);
                    break;
                case 20:
                    i2 = tqj.O(parcel, readInt);
                    break;
                case 21:
                    i3 = tqj.O(parcel, readInt);
                    break;
                case 22:
                    z3 = tqj.ae(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) tqj.U(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) tqj.U(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = tqj.Y(parcel, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) tqj.U(parcel, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = tqj.O(parcel, readInt);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) tqj.U(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = tqj.Y(parcel, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) tqj.U(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = tqj.O(parcel, readInt);
                    break;
                case 37:
                    z4 = tqj.ae(parcel, readInt);
                    break;
                case 38:
                    z5 = tqj.ae(parcel, readInt);
                    break;
                case 39:
                    i7 = tqj.O(parcel, readInt);
                    break;
                case 40:
                    str5 = tqj.Y(parcel, readInt);
                    break;
                case 41:
                    z6 = tqj.ae(parcel, readInt);
                    break;
                case 42:
                    str6 = tqj.Y(parcel, readInt);
                    break;
                case 43:
                    z7 = tqj.ae(parcel, readInt);
                    break;
            }
        }
        tqj.ac(parcel, Q);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
