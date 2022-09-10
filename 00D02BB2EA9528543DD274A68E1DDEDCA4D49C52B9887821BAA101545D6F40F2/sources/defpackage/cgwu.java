package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgwu  reason: default package */
/* loaded from: classes4.dex */
public class cgwu implements cguz {
    protected final Activity a;
    protected final String b;
    protected final cgwj c;
    @dzsi
    private final String d;
    private final boolean e;

    public cgwu(Activity activity, @dzsi String str, String str2, boolean z, cgwj cgwjVar) {
        this.a = activity;
        this.d = str;
        this.b = str2;
        this.e = z;
        this.c = cgwjVar;
    }

    @Override // defpackage.cguz
    @dzsi
    public CharSequence a() {
        return this.d;
    }

    @Override // defpackage.cguz
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.cguz
    public CharSequence c() {
        return this.b;
    }

    @Override // defpackage.cguz
    public Boolean d() {
        return false;
    }

    @Override // defpackage.cguz
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.cguz
    public cqkl f() {
        return cqkl.a;
    }

    @Override // defpackage.cguz
    @dzsi
    public cjtd g() {
        return null;
    }

    @Override // defpackage.cguz
    @dzsi
    public cqtd h() {
        return null;
    }
}
