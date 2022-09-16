package com.facebook.react.views.b;

import android.content.Context;
import android.net.Uri;
/* compiled from: ImageSource.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Uri f3949a;

    /* renamed from: b  reason: collision with root package name */
    private String f3950b;

    /* renamed from: c  reason: collision with root package name */
    private double f3951c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3952d;

    public a(Context context, String str, double d2, double d3) {
        this.f3950b = str;
        this.f3951c = d2 * d3;
        this.f3949a = a(context);
    }

    public a(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public String a() {
        return this.f3950b;
    }

    public Uri b() {
        return (Uri) com.facebook.j.a.a.b(this.f3949a);
    }

    public double c() {
        return this.f3951c;
    }

    public boolean d() {
        return this.f3952d;
    }

    private Uri a(Context context) {
        try {
            Uri parse = Uri.parse(this.f3950b);
            return parse.getScheme() == null ? b(context) : parse;
        } catch (Exception unused) {
            return b(context);
        }
    }

    private Uri b(Context context) {
        this.f3952d = true;
        return c.a().c(context, this.f3950b);
    }
}
