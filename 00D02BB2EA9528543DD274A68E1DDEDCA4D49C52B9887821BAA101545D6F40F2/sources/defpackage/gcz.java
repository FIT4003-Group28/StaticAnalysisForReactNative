package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: gcz  reason: default package */
/* loaded from: classes6.dex */
public final class gcz {
    public final Context a;
    public final cjqy b;
    public final cjqq c;
    public CharSequence d = "";
    public CharSequence e = "";
    public boolean f = true;
    public boolean g = true;
    public int h = 2132018255;
    @dzsi
    public cjtd i = null;
    @dzsi
    public gda j = null;
    @dzsi
    public gda k = null;
    @dzsi
    public gcx l = null;
    @dzsi
    public View m = null;

    public gcz(Context context, cjqy cjqyVar, cjqq cjqqVar) {
        this.a = context;
        this.b = cjqyVar;
        this.c = cjqqVar;
    }

    public final gde a() {
        return new gde(this, this.i);
    }

    public final gde b() {
        gde a = a();
        a.show();
        return a;
    }

    public final void c() {
        this.g = false;
    }

    public final void d(int i) {
        this.e = this.a.getString(i);
    }

    public final void e(int i, @dzsi cjtd cjtdVar, gdd gddVar) {
        this.k = new gda(this.a.getString(i), cjtdVar, gddVar);
    }

    public final void f(cjtd cjtdVar, gdd gddVar) {
        this.l = new gcx(cjtdVar, gddVar);
    }

    public final void g(gdd gddVar) {
        this.l = new gcx(null, gddVar);
    }

    public final void h(int i, @dzsi cjtd cjtdVar, gdd gddVar) {
        this.j = new gda(this.a.getString(i), cjtdVar, gddVar);
    }

    public final void i(int i) {
        this.d = this.a.getString(i);
    }

    @Deprecated
    public final void j() {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        this.h = typedValue.resourceId;
    }
}
