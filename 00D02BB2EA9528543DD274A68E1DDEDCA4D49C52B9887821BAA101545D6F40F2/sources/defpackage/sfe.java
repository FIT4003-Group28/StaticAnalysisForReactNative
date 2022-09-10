package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: sfe  reason: default package */
/* loaded from: classes7.dex */
public class sfe implements saw {
    private final Context a;
    private final String b;
    private final String c;
    private boolean d = false;
    private final boolean e;
    @dzsi
    private final jhk f;
    private final cqkn<saw> g;
    private final dopk h;
    private final ckem i;

    public sfe(Context context, String str, String str2, boolean z, boolean z2, @dzsi jhk jhkVar, cqkn<saw> cqknVar, dopk dopkVar, ckem ckemVar) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.e = z2;
        this.f = jhkVar;
        this.g = cqknVar;
        this.h = dopkVar;
        this.i = ckemVar;
    }

    @Override // defpackage.saw
    public String a() {
        return this.b;
    }

    @Override // defpackage.saw
    public String b() {
        return this.c;
    }

    @Override // defpackage.saw
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.saw
    public void d(boolean z) {
        this.d = z;
    }

    @Override // defpackage.saw
    public cqkn<saw> e() {
        return this.g;
    }

    @Override // defpackage.saw
    @dzsi
    public jhk f() {
        return this.f;
    }

    @Override // defpackage.saw
    public dopk g() {
        return this.h;
    }

    @Override // defpackage.saw
    public Boolean h() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.saw
    public String i() {
        bvsi bvsiVar = new bvsi(this.a);
        bvsiVar.c(a());
        if (!TextUtils.isEmpty(b())) {
            bvsiVar.c(b());
        }
        return bvsiVar.toString();
    }

    @Override // defpackage.saw
    public ckem j() {
        return this.i;
    }
}
