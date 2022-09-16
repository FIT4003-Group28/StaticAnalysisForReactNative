package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
/* compiled from: PG */
/* renamed from: qc  reason: default package */
/* loaded from: classes4.dex */
class qc extends pz {
    private qb d;
    private boolean e;

    public qc() {
        this(null, null);
    }

    @Override // defpackage.pz, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.pz
    /* renamed from: d */
    public qb c() {
        return new qb(this.d, this, null);
    }

    @Override // defpackage.pz
    public void e(py pyVar) {
        super.e(pyVar);
        if (pyVar instanceof qb) {
            this.d = (qb) pyVar;
        }
    }

    @Override // defpackage.pz, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.pz, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.e) {
            super.mutate();
            this.d.d();
            this.e = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pz, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m = this.d.m(iArr);
        if (m < 0) {
            m = this.d.m(StateSet.WILD_CARD);
        }
        return h(m) || onStateChange;
    }

    public qc(byte[] bArr) {
    }

    public qc(qb qbVar, Resources resources) {
        e(new qb(qbVar, this, resources));
        onStateChange(getState());
    }
}
