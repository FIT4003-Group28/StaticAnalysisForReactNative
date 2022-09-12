package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public class FeedbackOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeedbackOptions> CREATOR = new cocx();
    public String a;
    public Bundle b;
    public String c;
    public ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List<FileTeleporter> h;
    public boolean i;
    public ThemeSettings j;
    public LogOptions k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List<FileTeleporter> list, boolean z, ThemeSettings themeSettings, LogOptions logOptions, boolean z2, Bitmap bitmap, String str5, boolean z3, long j) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
        this.d = applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list;
        this.i = z;
        this.j = themeSettings;
        this.k = logOptions;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cocx.a(this, parcel, i);
    }
}
