package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleHelp> CREATOR = new cods();
    public boolean A;
    public boolean B;
    public int C;
    String D;
    boolean E;
    public String F;
    boolean G;
    public codq H;
    public cocm I;
    final int a;
    String b;
    public Account c;
    public Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List<String> j;
    @Deprecated
    Bundle k;
    @Deprecated
    Bitmap l;
    @Deprecated
    byte[] m;
    @Deprecated
    int n;
    @Deprecated
    int o;
    String p;
    public Uri q;
    List<OverflowMenuItem> r;
    public ThemeSettings s;
    public List<OfflineSuggestion> t;
    boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    @Deprecated
    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List<String> list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List<OverflowMenuItem> list2, int i4, ThemeSettings themeSettings, List<OfflineSuggestion> list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6) {
        this.v = new ErrorReport();
        if (!TextUtils.isEmpty(str)) {
            this.a = i;
            this.z = i6;
            this.A = z4;
            this.B = z5;
            this.C = i7;
            this.D = str5;
            this.b = str;
            this.c = account;
            this.d = bundle;
            this.e = str2;
            this.f = str3;
            this.g = bitmap;
            this.h = z;
            this.i = z2;
            this.E = z6;
            this.j = list;
            this.y = pendingIntent;
            this.k = bundle2;
            this.l = bitmap2;
            this.m = bArr;
            this.n = i2;
            this.o = i3;
            this.p = str4;
            this.q = uri;
            this.r = list2;
            if (i < 4) {
                ThemeSettings themeSettings2 = new ThemeSettings();
                themeSettings2.a = i4;
                this.s = themeSettings2;
            } else {
                this.s = themeSettings == null ? new ThemeSettings() : themeSettings;
            }
            this.t = list3;
            this.u = z3;
            this.v = errorReport;
            if (errorReport != null) {
                errorReport.X = "GoogleHelp";
            }
            this.w = togglingData;
            this.x = i5;
            return;
        }
        throw new IllegalStateException("Help requires a non-empty appContext");
    }

    public static GoogleHelp a(String str) {
        return new GoogleHelp(15, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false);
    }

    public final Intent b() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.u(parcel, 3, this.c, i);
        cnwn.m(parcel, 4, this.d);
        cnwn.e(parcel, 5, this.h);
        cnwn.e(parcel, 6, this.i);
        cnwn.w(parcel, 7, this.j);
        cnwn.m(parcel, 10, this.k);
        cnwn.u(parcel, 11, this.l, i);
        cnwn.k(parcel, 14, this.p, false);
        cnwn.u(parcel, 15, this.q, i);
        cnwn.y(parcel, 16, this.r);
        cnwn.g(parcel, 17, 0);
        cnwn.y(parcel, 18, this.t);
        cnwn.l(parcel, 19, this.m, false);
        cnwn.g(parcel, 20, this.n);
        cnwn.g(parcel, 21, this.o);
        cnwn.e(parcel, 22, this.u);
        cnwn.u(parcel, 23, this.v, i);
        cnwn.u(parcel, 25, this.s, i);
        cnwn.k(parcel, 28, this.e, false);
        cnwn.u(parcel, 31, this.w, i);
        cnwn.g(parcel, 32, this.x);
        cnwn.u(parcel, 33, this.y, i);
        cnwn.k(parcel, 34, this.f, false);
        cnwn.u(parcel, 35, this.g, i);
        cnwn.g(parcel, 36, this.z);
        cnwn.e(parcel, 37, this.A);
        cnwn.e(parcel, 38, this.B);
        cnwn.g(parcel, 39, this.C);
        cnwn.k(parcel, 40, this.D, false);
        cnwn.e(parcel, 41, this.E);
        cnwn.k(parcel, 42, this.F, false);
        cnwn.e(parcel, 43, this.G);
        cnwn.c(parcel, d);
    }

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List<String> list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List<OverflowMenuItem> list2, int i4, ThemeSettings themeSettings, List<OfflineSuggestion> list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7) {
        this(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, themeSettings, list3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6);
        this.F = str6;
        this.G = z7;
    }
}
