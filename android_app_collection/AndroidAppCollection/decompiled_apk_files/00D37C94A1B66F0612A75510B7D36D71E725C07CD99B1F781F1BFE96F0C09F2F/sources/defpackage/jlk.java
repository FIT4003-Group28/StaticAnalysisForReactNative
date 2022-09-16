package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jlk  reason: default package */
/* loaded from: classes3.dex */
public final class jlk implements fpf {
    public View a;
    private final Context b;
    private final akfo c;
    private final afvn d;
    private akfq e;

    public jlk(Context context, akfo akfoVar, afvn afvnVar) {
        this.b = context;
        this.c = akfoVar;
        this.d = afvnVar;
    }

    @Override // defpackage.fpc
    public final int c() {
        return 2800;
    }

    @Override // defpackage.fpc
    public final void d() {
    }

    @Override // defpackage.fpc
    public final void e() {
        if (this.a == null) {
            return;
        }
        akfo akfoVar = this.c;
        if (this.e == null) {
            akfp a = akfoVar.a();
            a.a = this.a;
            a.c = this.b.getResources().getString(R.string.offline_thumbnail_overlay_tooltip_details);
            a.h(1);
            a.c(2);
            a.f = new iyd(2);
            a.l();
            this.e = a.a();
        }
        akfoVar.c(this.e);
    }

    @Override // defpackage.fpf
    public final boolean f() {
        return this.d.t();
    }
}
