package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pq  reason: default package */
/* loaded from: classes4.dex */
public final class pq extends qb {
    agb a;
    age b;

    public pq(pq pqVar, pv pvVar, Resources resources) {
        super(pqVar, pvVar, resources);
        if (pqVar != null) {
            this.a = pqVar.a;
            this.b = pqVar.b;
            return;
        }
        this.a = new agb();
        this.b = new age();
    }

    public static long c(int i, int i2) {
        return i2 | (i << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((Integer) this.b.f(i, 0)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int[] iArr) {
        int m = super.m(iArr);
        return m >= 0 ? m : super.m(StateSet.WILD_CARD);
    }

    @Override // defpackage.qb, defpackage.py
    public final void d() {
        this.a = this.a.clone();
        this.b = this.b.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2, Drawable drawable, boolean z) {
        int f = super.f(drawable);
        long c = c(i, i2);
        long j = true != z ? 0L : 8589934592L;
        long j2 = f;
        this.a.i(c, Long.valueOf(j2 | j));
        if (z) {
            this.a.i(c(i2, i), Long.valueOf(4294967296L | j2 | j));
        }
    }

    @Override // defpackage.qb, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new pv(this, null);
    }

    @Override // defpackage.qb, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new pv(this, resources);
    }
}
