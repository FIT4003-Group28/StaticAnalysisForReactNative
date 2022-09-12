package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.File;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ErrorReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ErrorReport> CREATOR = new cocn();
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public FileTeleporter[] U;
    public String[] V;
    public boolean W;
    public String X;
    public ThemeSettings Y;
    public LogOptions Z;
    public ApplicationErrorReport a;
    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List<RectF> ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List<String> ah;
    public int ai;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.g(parcel, 4, this.c);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.k(parcel, 6, this.e, false);
        cnwn.k(parcel, 7, this.f, false);
        cnwn.k(parcel, 8, this.g, false);
        cnwn.k(parcel, 9, this.h, false);
        cnwn.k(parcel, 10, this.i, false);
        cnwn.k(parcel, 11, this.j, false);
        cnwn.g(parcel, 12, this.k);
        cnwn.k(parcel, 13, this.l, false);
        cnwn.k(parcel, 14, this.m, false);
        cnwn.k(parcel, 15, this.n, false);
        cnwn.k(parcel, 16, this.o, false);
        cnwn.k(parcel, 17, this.p, false);
        cnwn.v(parcel, 18, this.q);
        cnwn.v(parcel, 19, this.r);
        cnwn.v(parcel, 20, this.s);
        cnwn.k(parcel, 21, this.t, false);
        cnwn.k(parcel, 22, this.u, false);
        cnwn.l(parcel, 23, this.v, false);
        cnwn.g(parcel, 24, this.w);
        cnwn.g(parcel, 25, this.x);
        cnwn.g(parcel, 26, this.y);
        cnwn.g(parcel, 27, this.z);
        cnwn.k(parcel, 28, this.A, false);
        cnwn.k(parcel, 29, this.B, false);
        cnwn.k(parcel, 30, this.C, false);
        cnwn.m(parcel, 31, this.D);
        cnwn.e(parcel, 32, this.E);
        cnwn.g(parcel, 33, this.F);
        cnwn.g(parcel, 34, this.G);
        cnwn.e(parcel, 35, this.H);
        cnwn.k(parcel, 36, this.I, false);
        cnwn.k(parcel, 37, this.J, false);
        cnwn.g(parcel, 38, this.K);
        cnwn.k(parcel, 39, this.L, false);
        cnwn.k(parcel, 40, this.M, false);
        cnwn.k(parcel, 41, this.N, false);
        cnwn.k(parcel, 42, this.O, false);
        cnwn.k(parcel, 43, this.P, false);
        cnwn.k(parcel, 44, this.Q, false);
        cnwn.k(parcel, 45, this.R, false);
        cnwn.u(parcel, 46, this.S, i);
        cnwn.k(parcel, 47, this.T, false);
        cnwn.x(parcel, 48, this.U, i);
        cnwn.v(parcel, 49, this.V);
        cnwn.e(parcel, 50, this.W);
        cnwn.k(parcel, 51, this.X, false);
        cnwn.u(parcel, 52, this.Y, i);
        cnwn.u(parcel, 53, this.Z, i);
        cnwn.k(parcel, 54, this.aa, false);
        cnwn.e(parcel, 55, this.ab);
        cnwn.m(parcel, 56, this.ac);
        cnwn.y(parcel, 57, this.ad);
        cnwn.e(parcel, 58, this.ae);
        cnwn.u(parcel, 59, this.af, i);
        cnwn.k(parcel, 60, this.ag, false);
        cnwn.w(parcel, 61, this.ah);
        cnwn.g(parcel, 62, this.ai);
        cnwn.c(parcel, d);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List<RectF> list, boolean z5, Bitmap bitmap, String str31, List<String> list2, int i10) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = fileTeleporterArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = themeSettings;
        this.Z = logOptions;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
    }

    public ErrorReport(FeedbackOptions feedbackOptions, File file) {
        this.a = new ApplicationErrorReport();
        if (feedbackOptions == null) {
            return;
        }
        Bundle bundle = feedbackOptions.b;
        if (bundle != null && bundle.size() > 0) {
            this.D = feedbackOptions.b;
        }
        if (!TextUtils.isEmpty(feedbackOptions.a)) {
            this.B = feedbackOptions.a;
        }
        if (!TextUtils.isEmpty(feedbackOptions.c)) {
            this.b = feedbackOptions.c;
        }
        ApplicationErrorReport applicationErrorReport = feedbackOptions.d;
        ApplicationErrorReport.CrashInfo crashInfo = applicationErrorReport == null ? null : applicationErrorReport.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        ThemeSettings themeSettings = feedbackOptions.j;
        if (themeSettings != null) {
            this.Y = themeSettings;
        }
        if (!TextUtils.isEmpty(feedbackOptions.e)) {
            this.P = feedbackOptions.e;
        }
        if (!TextUtils.isEmpty(feedbackOptions.g)) {
            this.a.packageName = feedbackOptions.g;
        }
        if (!TextUtils.isEmpty(feedbackOptions.n)) {
            this.ag = feedbackOptions.n;
        }
        Bitmap bitmap = feedbackOptions.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        if (file != null) {
            BitmapTeleporter bitmapTeleporter = feedbackOptions.f;
            if (bitmapTeleporter != null) {
                this.S = bitmapTeleporter;
                bitmapTeleporter.d = file;
            }
            List<FileTeleporter> list = feedbackOptions.h;
            if (list != null && !list.isEmpty()) {
                for (FileTeleporter fileTeleporter : list) {
                    fileTeleporter.d = file;
                }
                this.U = (FileTeleporter[]) list.toArray(new FileTeleporter[feedbackOptions.h.size()]);
            }
        }
        LogOptions logOptions = feedbackOptions.k;
        if (logOptions != null) {
            this.Z = logOptions;
        }
        this.W = feedbackOptions.i;
        this.ae = feedbackOptions.l;
        this.E = feedbackOptions.o;
    }
}
