package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nge  reason: default package */
/* loaded from: classes3.dex */
public final class nge implements fpf {
    public final fcu a;
    public View b;
    public boolean c;
    public nfy d;
    private final Context e;
    private final akfo f;
    private final ezf g;
    private akfq h;

    public nge(Context context, fcu fcuVar, akfo akfoVar, ezf ezfVar) {
        this.e = context;
        this.a = fcuVar;
        this.f = akfoVar;
        this.g = ezfVar;
    }

    private final akfq g() {
        if (this.h == null) {
            akfp a = this.f.a();
            a.a = this.b;
            a.b = this.e.getString(R.string.offline_stub_header_tooltip_tutorial_title);
            a.c = this.e.getString(R.string.offline_stub_header_tooltip_tutorial_subtitle);
            a.h(1);
            a.c(1);
            a.f = new ngd(this);
            a.l();
            this.h = a.a();
        }
        return this.h;
    }

    public final void a(View view) {
        this.b = view;
        this.h = null;
        d();
    }

    public final boolean b() {
        return this.a.f();
    }

    @Override // defpackage.fpc
    public final int c() {
        return 5001;
    }

    @Override // defpackage.fpc
    public final void d() {
        this.f.b(g());
    }

    @Override // defpackage.fpc
    public final void e() {
        if (f()) {
            this.f.c(g());
        }
    }

    @Override // defpackage.fpf
    public final boolean f() {
        return this.c && this.b != null && !this.g.k() && b();
    }
}
