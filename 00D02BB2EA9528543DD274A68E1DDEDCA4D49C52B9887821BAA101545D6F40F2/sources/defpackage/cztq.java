package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cztq  reason: default package */
/* loaded from: classes5.dex */
public final class cztq {
    public final cztz a;
    public final Context b;
    public String c;
    public List<czts> d;
    public czua g;
    public cztr e = cztr.LONG;
    public final List<czuc> f = cztt.a;
    public final int h = 80;

    public cztq(cztz cztzVar) {
        this.d = new ArrayList();
        Application application = cztzVar.e;
        dbsk.s(application);
        this.b = application;
        this.a = cztzVar;
        this.d = new ArrayList();
    }

    public final cztq a(int i, View.OnClickListener onClickListener) {
        f(this.b.getString(i), onClickListener);
        return this;
    }

    public final cztt b() {
        return new cztt(this);
    }

    public final void c() {
        b().b();
    }

    public final void d(cztr cztrVar) {
        dbsk.s(cztrVar);
        this.e = cztrVar;
    }

    public final void e(int i, Object... objArr) {
        this.c = this.b.getString(i, objArr);
    }

    public final void f(String str, View.OnClickListener onClickListener) {
        dbsk.n(this.d.size() < 3, "You can only add %s buttons.", 3);
        this.d.add(new czts(str, onClickListener));
    }
}
