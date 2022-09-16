package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
/* compiled from: PG */
/* renamed from: daj  reason: default package */
/* loaded from: classes3.dex */
public final class daj extends cyr {
    final Drawable a;
    int b;
    int c;

    public daj(Drawable drawable) {
        super("DrawableComponent");
        this.a = drawable;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new dcl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void P(cyv cyvVar, Object obj) {
        ((dcl) obj).a(this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void Q(cyv cyvVar, cyz cyzVar) {
        this.b = cyzVar.H();
        this.c = cyzVar.C();
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        dcl dclVar = (dcl) obj;
        Drawable drawable = this.a;
        Drawable drawable2 = dclVar.a;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            dclVar.b(false, false);
            dclVar.a.setCallback(null);
        }
        dclVar.a = drawable;
        if (dclVar.a != null) {
            dclVar.b(dclVar.isVisible(), false);
            dclVar.a.setCallback(dclVar);
        }
        dclVar.b = dclVar.a instanceof InsetDrawable;
        dclVar.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        dcl dclVar = (dcl) obj;
        if (dclVar.a != null) {
            dclVar.b(false, false);
            dclVar.a.setCallback(null);
        }
        dclVar.a = null;
        dclVar.b = false;
        dclVar.d = 0;
        dclVar.c = 0;
    }

    @Override // defpackage.czb
    protected final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    protected final boolean ai(cyr cyrVar, cyr cyrVar2) {
        return !czu.q(((daj) cyrVar).a, ((daj) cyrVar2).a);
    }

    @Override // defpackage.czb
    public final int aj() {
        return 2;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar != null && getClass() == cyrVar.getClass()) {
            return czu.q(this.a, ((daj) cyrVar).a);
        }
        return false;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }
}
