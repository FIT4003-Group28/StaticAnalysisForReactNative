package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: kkv  reason: default package */
/* loaded from: classes3.dex */
public final class kkv extends aizc implements fgd {
    public final axnm a;
    public final ajhl b;
    public final int c;
    public kku d;
    public aqtb e;
    public ViewGroup f;
    public ViewGroup g;
    public View h;
    public int i;
    public int j;
    public apay k;
    public ajhh l;
    private final aafo m;
    private ezx n;

    public kkv(Context context, axnm axnmVar, ajhl ajhlVar, aafo aafoVar, int i) {
        super(context);
        this.b = ajhlVar;
        aafoVar.getClass();
        this.m = aafoVar;
        axnmVar.getClass();
        this.a = axnmVar;
        this.c = i;
        d();
    }

    private final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        return hashMap;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void d() {
        this.l = null;
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.g.removeAllViews();
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.f = null;
            this.g = null;
            this.h = null;
        }
        if (this.e != null) {
            this.b.qZ(null);
            this.e = null;
        }
        this.i = 0;
        this.j = 0;
        this.k = null;
    }

    public final void e() {
        ezx ezxVar = this.n;
        if (ezxVar == null || this.k == null) {
            return;
        }
        if (ezxVar.k()) {
            this.m.d(this.k.d, f());
        } else if (this.n.b()) {
            this.m.d(this.k.b, f());
        } else {
            this.m.d(this.k.c, f());
        }
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        ezx ezxVar2 = this.n;
        if (ezxVar2 == null || ezxVar != ezxVar2) {
            this.n = ezxVar;
            e();
        }
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return etk.f(ezxVar);
    }
}
