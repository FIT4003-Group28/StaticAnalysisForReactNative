package com.facebook.react.j0.b;

import android.content.Context;
import android.net.Uri;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Uri f5543a;

    /* renamed from: b  reason: collision with root package name */
    private String f5544b;

    /* renamed from: c  reason: collision with root package name */
    private double f5545c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5546d;

    public a(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public a(Context context, String str, double d2, double d3) {
        this.f5544b = str;
        this.f5545c = d2 * d3;
        this.f5543a = b(context);
    }

    private Uri a(Context context) {
        this.f5546d = true;
        return c.a().c(context, this.f5544b);
    }

    private Uri b(Context context) {
        try {
            Uri parse = Uri.parse(this.f5544b);
            return parse.getScheme() == null ? a(context) : parse;
        } catch (Exception unused) {
            return a(context);
        }
    }

    public double a() {
        return this.f5545c;
    }

    public String b() {
        return this.f5544b;
    }

    public Uri c() {
        Uri uri = this.f5543a;
        c.d.k.a.a.a(uri);
        return uri;
    }

    public boolean d() {
        return this.f5546d;
    }
}
