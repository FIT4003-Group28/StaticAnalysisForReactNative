package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: bfde  reason: default package */
/* loaded from: classes3.dex */
public abstract class bfde implements bfch, jkk {
    private final dxio<cjqq> a;
    public final Activity b;
    public String d = "";
    protected boolean e = false;
    public int f = 0;
    private boolean g = false;
    private int h = 1;
    public final bfdd c = new bfdd(this);

    public bfde(Activity activity, cqhn cqhnVar, cqhu cqhuVar, dxio<cjqq> dxioVar) {
        this.b = activity;
        this.a = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A() {
        this.g = true;
        this.h = 2;
        cqkx.p(this);
        this.e = false;
    }

    @Override // defpackage.jkk
    public void g(int i) {
        if (i != this.f) {
            this.f = i;
            cqkx.p(this);
        }
    }

    @Override // defpackage.bfch
    public Boolean i() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.bfch
    public String m() {
        return this.d;
    }

    @Override // defpackage.bfch
    @dzsi
    public cqfc u(bfcg bfcgVar) {
        if (this.g) {
            this.g = false;
            final int i = this.h;
            return new cqfc(this, i) { // from class: bfdc
                private final bfde a;
                private final int b;

                {
                    this.a = this;
                    this.b = i;
                }

                @Override // defpackage.cqfc
                public final void a(View view, boolean z) {
                    bfde bfdeVar = this.a;
                    boolean z2 = true;
                    if (this.b != 1) {
                        z2 = false;
                    }
                    int i2 = bfdeVar.f;
                    bfdd bfddVar = bfdeVar.c;
                    int height = z2 ? i2 : view.getHeight() + i2;
                    if (z2) {
                        i2 += view.getHeight();
                    }
                    view.setTranslationY(i2);
                    view.animate().setDuration(250L).translationY(height).setListener(new bexu(bfddVar, view, z2)).start();
                }
            };
        }
        return null;
    }

    @Override // defpackage.bfch
    public Integer v() {
        return Integer.valueOf(this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(cjtd cjtdVar) {
        this.e = true;
        this.g = true;
        this.h = 1;
        this.a.a().g().d(cjtdVar);
        cqkx.p(this);
    }
}
