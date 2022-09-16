package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: pv  reason: default package */
/* loaded from: classes4.dex */
public final class pv extends qc implements hn {
    private pq d;
    private pu e;
    private int f;
    private int g;
    private boolean h;

    public pv() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01db, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r19.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pv b(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv.b(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):pv");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.qc
    /* renamed from: a */
    public final pq d() {
        return new pq(this.d, this, null);
    }

    @Override // defpackage.qc, defpackage.pz
    public final void e(py pyVar) {
        super.e(pyVar);
        if (pyVar instanceof pq) {
            this.d = (pq) pyVar;
        }
    }

    @Override // defpackage.qc, defpackage.pz, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // defpackage.pz, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        pu puVar = this.e;
        if (puVar != null) {
            puVar.b();
            this.e = null;
            h(this.f);
            this.f = -1;
            this.g = -1;
        }
    }

    @Override // defpackage.qc, defpackage.pz, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.h) {
            super.mutate();
            this.d.d();
            this.h = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:
        if (h(r2) != false) goto L7;
     */
    @Override // defpackage.qc, defpackage.pz, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv.onStateChange(int[]):boolean");
    }

    @Override // defpackage.pz, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        pu puVar = this.e;
        if (puVar != null && (visible || z2)) {
            if (z) {
                puVar.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public pv(pq pqVar, Resources resources) {
        super(null);
        this.f = -1;
        this.g = -1;
        e(new pq(pqVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
