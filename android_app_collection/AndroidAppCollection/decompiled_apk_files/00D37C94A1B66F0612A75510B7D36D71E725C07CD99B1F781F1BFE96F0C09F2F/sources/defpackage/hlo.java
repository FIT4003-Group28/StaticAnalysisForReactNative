package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: hlo  reason: default package */
/* loaded from: classes3.dex */
final class hlo implements hpy {
    final /* synthetic */ hlp a;
    private final View b;

    public hlo(hlp hlpVar, View view) {
        this.a = hlpVar;
        this.b = view;
    }

    @Override // defpackage.hpy
    public final float a() {
        int i;
        if (this.a.d()) {
            hlp hlpVar = this.a;
            int i2 = 0;
            if (hlpVar.s) {
                i = hlpVar.c.a();
            } else if (hlpVar.t) {
                i = hlpVar.d.a();
            } else {
                zep.b("getChooseFilterOpenHeight: No open ChooseFilterViews");
                i = 0;
            }
            hlp hlpVar2 = this.a;
            if (hlpVar2.a) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hlpVar2.g.getLayoutParams();
                if (marginLayoutParams != null) {
                    i2 = marginLayoutParams.bottomMargin;
                }
                i2 = hlpVar2.m - (i2 + ((hlpVar2.g.getHeight() - hlpVar2.l) / 2));
            }
            return -(i + i2);
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final float b() {
        return this.b.getTranslationY();
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.b;
    }

    @Override // defpackage.hpy
    public final void e() {
    }

    @Override // defpackage.hpy
    public final void f() {
    }
}
