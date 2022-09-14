package defpackage;

import android.app.Activity;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: aaza  reason: default package */
/* loaded from: classes2.dex */
public class aaza implements aayx {
    private final dxio<afha> a;
    private final String b;
    private final String c;
    private final String d;
    @dzsi
    private final String e;
    private final String f;
    private final String g;
    private final Activity h;

    public aaza(Activity activity, dxio<afha> dxioVar, String str, String str2, String str3, @dzsi String str4, String str5, String str6) {
        this.h = activity;
        this.a = dxioVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.aayx
    public String b() {
        return this.c;
    }

    @Override // defpackage.aayx
    public String c() {
        return this.d;
    }

    @Override // defpackage.aayx
    @dzsi
    public String d() {
        return this.e;
    }

    @Override // defpackage.aayx
    public jic e() {
        String str = this.g;
        return new jic(str, jfv.a(str), 0, 0);
    }

    @Override // defpackage.aayx
    public cqkl f() {
        this.a.a().l(this.h, Uri.parse(this.f), 2);
        return cqkl.a;
    }

    @Override // defpackage.aayx
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtxo.ch;
        b.g(this.b);
        return b.a();
    }
}
