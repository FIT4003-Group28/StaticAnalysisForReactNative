package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
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
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rdu();
    boolean A;
    public boolean B;
    int C;
    String D;
    boolean E;
    String F;
    boolean G;
    public tzh H;
    final int a;
    String b;
    public Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;
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
    List r;
    ThemeSettings s;
    List t;
    public boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    @Deprecated
    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6) {
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.E(parcel, 3, this.c, i);
        tqj.v(parcel, 4, this.d);
        tqj.o(parcel, 5, this.h);
        tqj.o(parcel, 6, this.i);
        tqj.H(parcel, 7, this.j);
        tqj.v(parcel, 10, this.k);
        tqj.E(parcel, 11, this.l, i);
        tqj.F(parcel, 14, this.p);
        tqj.E(parcel, 15, this.q, i);
        tqj.J(parcel, 16, this.r);
        tqj.s(parcel, 17, 0);
        tqj.J(parcel, 18, this.t);
        tqj.w(parcel, 19, this.m);
        tqj.s(parcel, 20, this.n);
        tqj.s(parcel, 21, this.o);
        tqj.o(parcel, 22, this.u);
        tqj.E(parcel, 23, this.v, i);
        tqj.E(parcel, 25, this.s, i);
        tqj.F(parcel, 28, this.e);
        tqj.E(parcel, 31, this.w, i);
        tqj.s(parcel, 32, this.x);
        tqj.E(parcel, 33, this.y, i);
        tqj.F(parcel, 34, this.f);
        tqj.E(parcel, 35, this.g, i);
        tqj.s(parcel, 36, this.z);
        tqj.o(parcel, 37, this.A);
        tqj.o(parcel, 38, this.B);
        tqj.s(parcel, 39, this.C);
        tqj.F(parcel, 40, this.D);
        tqj.o(parcel, 41, this.E);
        tqj.F(parcel, 42, this.F);
        tqj.o(parcel, 43, this.G);
        tqj.n(parcel, m);
    }

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7) {
        this(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, themeSettings, list3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6);
        this.F = str6;
        this.G = z7;
    }
}
