package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: awtv  reason: default package */
/* loaded from: classes3.dex */
public class awtv implements awts {
    public boolean a = false;
    private final Context b;
    private final cqat c;
    private final jkf d;
    private final bnhz e;
    private final izl f;
    private final awtj g;
    private String h;

    public awtv(Context context, cqat cqatVar, jkf jkfVar, awtn awtnVar, bnhz bnhzVar, izl izlVar, awtj awtjVar) {
        this.b = context;
        this.c = cqatVar;
        this.d = jkfVar;
        this.e = bnhzVar;
        this.f = izlVar;
        this.g = awtjVar;
        this.h = awtj.b(context, cqatVar, awtnVar);
    }

    @Override // defpackage.awts
    public String a() {
        return this.h;
    }

    @Override // defpackage.awts
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.awts
    public cqkl c() {
        this.d.v();
        return cqkl.a;
    }

    @Override // defpackage.awts
    public izl d() {
        return this.f;
    }

    @Override // defpackage.awts
    @dzsi
    public String e() {
        if (!this.e.b().booleanValue()) {
            return null;
        }
        return this.e.a();
    }

    @Override // defpackage.awts
    @dzsi
    public cqtd f() {
        if (!this.e.b().booleanValue()) {
            return null;
        }
        return this.e.c();
    }

    public void g(awtn awtnVar) {
        this.h = awtj.b(this.b, this.c, awtnVar);
    }
}
