package defpackage;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
/* compiled from: PG */
/* renamed from: aoei  reason: default package */
/* loaded from: classes2.dex */
public class aoei implements aoeg {
    private final eaph a = new eaph(0, eaou.b);
    private final Context b;
    private final cqat c;
    private final Runnable d;
    private final String e;
    private final String f;
    private dbsg<eapi> g;
    private boolean h;

    public aoei(Context context, cqat cqatVar, Runnable runnable, String str, String str2, dbsg<eapi> dbsgVar, boolean z) {
        this.b = context;
        this.c = cqatVar;
        this.d = runnable;
        this.e = str;
        this.f = str2;
        this.g = dbsgVar;
        this.h = z;
    }

    @Override // defpackage.aoeg
    public Boolean a() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.aoeg
    public String b() {
        if (!a().booleanValue()) {
            return this.f;
        }
        if (!this.g.a()) {
            return this.e;
        }
        return apka.b(this.b, this.g.b().A(this.a.a(eaou.b)));
    }

    @Override // defpackage.aoeg
    public cqkl c() {
        if (a().booleanValue()) {
            eapi c = this.g.c(this.a.c());
            new TimePickerDialog(this.b, new aoeh(this), c.c(), c.d(), DateFormat.is24HourFormat(this.b)).show();
        }
        return cqkl.a;
    }

    public dbsg<eapi> d() {
        return this.g;
    }

    public void e(dbsg<eapi> dbsgVar) {
        if (!this.g.equals(dbsgVar)) {
            this.g = dbsgVar;
            this.d.run();
            cqkx.p(this);
        }
    }

    public void f() {
        long b = this.c.b();
        e(dbsg.i(new eapi(b, aogc.m(b))));
    }

    public void g(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (!z) {
                f();
            }
            this.d.run();
            cqkx.p(this);
        }
    }
}
