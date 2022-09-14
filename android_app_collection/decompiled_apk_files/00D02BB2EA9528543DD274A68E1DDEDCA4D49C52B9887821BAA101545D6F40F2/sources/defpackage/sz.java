package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
/* compiled from: PG */
/* renamed from: sz  reason: default package */
/* loaded from: classes.dex */
class sz extends sw {
    private sy d;
    private boolean e;

    public sz() {
        this(null, null);
    }

    @Override // defpackage.sw, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.sw
    public void c(sv svVar) {
        super.c(svVar);
        if (svVar instanceof sy) {
            this.d = (sy) svVar;
        }
    }

    @Override // defpackage.sw
    /* renamed from: d */
    public sy e() {
        return new sy(this.d, this, null);
    }

    @Override // defpackage.sw, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.sw, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.e) {
            super.mutate();
            this.d.a();
            this.e = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sw, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int n = this.d.n(iArr);
        if (n < 0) {
            n = this.d.n(StateSet.WILD_CARD);
        }
        return g(n) || onStateChange;
    }

    public sz(byte[] bArr) {
    }

    public sz(sy syVar, Resources resources) {
        c(new sy(syVar, this, resources));
        onStateChange(getState());
    }
}
