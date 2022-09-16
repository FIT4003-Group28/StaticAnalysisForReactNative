package defpackage;

import android.content.Context;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: fil  reason: default package */
/* loaded from: classes3.dex */
public final class fil extends cyr {
    @dfs(a = 13)
    azqb a;
    @dfs(a = 13)
    fio b;

    public fil() {
        super("InlinePlayerTracker");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new ImageView(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void P(cyv cyvVar, Object obj) {
        ImageView imageView = (ImageView) obj;
        azqb azqbVar = this.a;
        fio fioVar = this.b;
        String.valueOf(String.valueOf(imageView)).length();
        if (fioVar == null) {
            afus.b(2, 2, "InlinePlayerViewPositionBroadcaster cannot be null during onBind.");
        } else {
            fioVar.b(new fim(imageView, azqbVar));
        }
    }

    @Override // defpackage.czb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void as(Object obj) {
        ImageView imageView = (ImageView) obj;
        fio fioVar = this.b;
        String.valueOf(String.valueOf(imageView)).length();
        if (fioVar == null) {
            return;
        }
        fioVar.b(null);
        imageView.setImageDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void au(aflw aflwVar) {
        if (aflwVar == null) {
            return;
        }
        this.b = (fio) aflwVar.f(fio.class);
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        fil filVar = (fil) cyrVar;
        if (this.k == filVar.k) {
            return true;
        }
        azqb azqbVar = this.a;
        if (azqbVar == null ? filVar.a != null : !azqbVar.equals(filVar.a)) {
            return false;
        }
        fio fioVar = this.b;
        return fioVar == null ? filVar.b == null : fioVar.equals(filVar.b);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }
}
