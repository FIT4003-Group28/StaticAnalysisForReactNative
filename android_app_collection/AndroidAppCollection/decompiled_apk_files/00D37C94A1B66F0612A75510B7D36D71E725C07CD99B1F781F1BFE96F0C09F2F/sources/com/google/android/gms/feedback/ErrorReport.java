package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
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
/* loaded from: classes2.dex */
public class ErrorReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qxv(7);
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;

    /* renamed from: J  reason: collision with root package name */
    public String f159J;
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
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
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
        int m = tqj.m(parcel);
        tqj.E(parcel, 2, this.a, i);
        tqj.F(parcel, 3, this.b);
        tqj.s(parcel, 4, this.c);
        tqj.F(parcel, 5, this.d);
        tqj.F(parcel, 6, this.e);
        tqj.F(parcel, 7, this.f);
        tqj.F(parcel, 8, this.g);
        tqj.F(parcel, 9, this.h);
        tqj.F(parcel, 10, this.i);
        tqj.F(parcel, 11, this.j);
        tqj.s(parcel, 12, this.k);
        tqj.F(parcel, 13, this.l);
        tqj.F(parcel, 14, this.m);
        tqj.F(parcel, 15, this.n);
        tqj.F(parcel, 16, this.o);
        tqj.F(parcel, 17, this.p);
        tqj.G(parcel, 18, this.q);
        tqj.G(parcel, 19, this.r);
        tqj.G(parcel, 20, this.s);
        tqj.F(parcel, 21, this.t);
        tqj.F(parcel, 22, this.u);
        tqj.w(parcel, 23, this.v);
        tqj.s(parcel, 24, this.w);
        tqj.s(parcel, 25, this.x);
        tqj.s(parcel, 26, this.y);
        tqj.s(parcel, 27, this.z);
        tqj.F(parcel, 28, this.A);
        tqj.F(parcel, 29, this.B);
        tqj.F(parcel, 30, this.C);
        tqj.v(parcel, 31, this.D);
        tqj.o(parcel, 32, this.E);
        tqj.s(parcel, 33, this.F);
        tqj.s(parcel, 34, this.G);
        tqj.o(parcel, 35, this.H);
        tqj.F(parcel, 36, this.I);
        tqj.F(parcel, 37, this.f159J);
        tqj.s(parcel, 38, this.K);
        tqj.F(parcel, 39, this.L);
        tqj.F(parcel, 40, this.M);
        tqj.F(parcel, 41, this.N);
        tqj.F(parcel, 42, this.O);
        tqj.F(parcel, 43, this.P);
        tqj.F(parcel, 44, this.Q);
        tqj.F(parcel, 45, this.R);
        tqj.E(parcel, 46, this.S, i);
        tqj.F(parcel, 47, this.T);
        tqj.I(parcel, 48, this.U, i);
        tqj.G(parcel, 49, this.V);
        tqj.o(parcel, 50, this.W);
        tqj.F(parcel, 51, this.X);
        tqj.E(parcel, 52, this.Y, i);
        tqj.E(parcel, 53, this.Z, i);
        tqj.F(parcel, 54, this.aa);
        tqj.o(parcel, 55, this.ab);
        tqj.v(parcel, 56, this.ac);
        tqj.J(parcel, 57, this.ad);
        tqj.o(parcel, 58, this.ae);
        tqj.E(parcel, 59, this.af, i);
        tqj.F(parcel, 60, this.ag);
        tqj.H(parcel, 61, this.ah);
        tqj.s(parcel, 62, this.ai);
        tqj.n(parcel, m);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10) {
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
        this.f159J = str20;
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
        Bundle bundle = feedbackOptions.b;
        if (bundle != null && !bundle.isEmpty()) {
            this.D = feedbackOptions.b;
        }
        if (!TextUtils.isEmpty(feedbackOptions.a)) {
            this.B = feedbackOptions.a;
        }
        if (!TextUtils.isEmpty(feedbackOptions.c)) {
            this.b = feedbackOptions.c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = feedbackOptions.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.f159J = crashInfo.throwFileName;
        }
        ThemeSettings themeSettings = feedbackOptions.j;
        if (themeSettings != null) {
            this.Y = themeSettings;
        }
        if (!TextUtils.isEmpty(feedbackOptions.e)) {
            this.P = feedbackOptions.e;
        }
        String str = feedbackOptions.g;
        if (!TextUtils.isEmpty(str)) {
            this.a.packageName = str;
        }
        if (!TextUtils.isEmpty(feedbackOptions.n)) {
            this.ag = feedbackOptions.n;
        }
        Bitmap bitmap = feedbackOptions.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        if (file != null) {
            this.S = feedbackOptions.f;
            List<FileTeleporter> list = feedbackOptions.h;
            if (list != null && !list.isEmpty()) {
                for (FileTeleporter fileTeleporter : list) {
                    fileTeleporter.d = file;
                }
                this.U = (FileTeleporter[]) list.toArray(new FileTeleporter[0]);
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
