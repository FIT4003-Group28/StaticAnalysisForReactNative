package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: fiv  reason: default package */
/* loaded from: classes3.dex */
public final class fiv extends cyr {
    @dfs(a = 13)
    String a;
    @dfs(a = 13)
    axnm b;
    @dfs(a = 13)
    Integer c;
    @dfs(a = 13)
    Boolean d;
    @dfs(a = 13)
    teb e;
    @dfs(a = 13)
    Integer f;
    @dfs(a = 13)
    awmt g;

    public fiv() {
        super("Slider");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new fix(context);
    }

    @Override // defpackage.czb
    public final void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        int size;
        if (View.MeasureSpec.getMode(i) != 0) {
            size = View.MeasureSpec.getSize(i);
            ddjVar.a = size;
        } else {
            size = (int) ((cyvVar.b().getDisplayMetrics().density * 40.0f) + 0.5f);
            ddjVar.a = size;
        }
        double d = size;
        Double.isNaN(d);
        ddjVar.b = (int) (d * 0.1d);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        fix fixVar = (fix) obj;
        Integer num = this.f;
        Integer num2 = this.c;
        Boolean bool = this.d;
        awmt awmtVar = this.g;
        String str = this.a;
        axnm axnmVar = this.b;
        teb tebVar = this.e;
        fixVar.a.setMax(num.intValue());
        fixVar.a.setProgress(num2.intValue());
        fixVar.b = axnmVar;
        fixVar.c = awmtVar;
        fixVar.a.setEnabled(bool.booleanValue());
        fixVar.d = tebVar;
        if (str != null && !str.isEmpty()) {
            fixVar.a.setContentDescription(str);
        }
        fixVar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        fix fixVar = (fix) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.czb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    protected final boolean ai(cyr cyrVar, cyr cyrVar2) {
        fiv fivVar = (fiv) cyrVar;
        fiv fivVar2 = (fiv) cyrVar2;
        Boolean bool = null;
        dad dadVar = new dad(fivVar.f, fivVar2 == null ? null : fivVar2.f);
        dad dadVar2 = new dad(fivVar.c, fivVar2 == null ? null : fivVar2.c);
        Boolean bool2 = fivVar.d;
        if (fivVar2 != null) {
            bool = fivVar2.d;
        }
        dad dadVar3 = new dad(bool2, bool);
        return (((Integer) dadVar.a).equals(dadVar.b) ^ true) || (((Integer) dadVar2.a).equals(dadVar2.b) ^ true) || (((Boolean) dadVar3.a).equals(dadVar3.b) ^ true);
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        fiv fivVar = (fiv) cyrVar;
        if (this.k == fivVar.k) {
            return true;
        }
        String str = this.a;
        if (str == null ? fivVar.a != null : !str.equals(fivVar.a)) {
            return false;
        }
        axnm axnmVar = this.b;
        if (axnmVar == null ? fivVar.b != null : !axnmVar.equals(fivVar.b)) {
            return false;
        }
        Integer num = this.c;
        if (num == null ? fivVar.c != null : !num.equals(fivVar.c)) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null ? fivVar.d != null : !bool.equals(fivVar.d)) {
            return false;
        }
        teb tebVar = this.e;
        if (tebVar == null ? fivVar.e != null : !tebVar.equals(fivVar.e)) {
            return false;
        }
        Integer num2 = this.f;
        if (num2 == null ? fivVar.f != null : !num2.equals(fivVar.f)) {
            return false;
        }
        awmt awmtVar = this.g;
        return awmtVar == null ? fivVar.g == null : awmtVar.equals(fivVar.g);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }
}
