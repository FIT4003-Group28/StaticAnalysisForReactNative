package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
/* compiled from: PG */
/* renamed from: sn  reason: default package */
/* loaded from: classes.dex */
final class sn extends sy {
    aik<Long> a;
    ain<Integer> b;

    public sn(sn snVar, ss ssVar, Resources resources) {
        super(snVar, ssVar, resources);
        if (snVar != null) {
            this.a = snVar.a;
            this.b = snVar.b;
            return;
        }
        this.a = new aik<>();
        this.b = new ain<>();
    }

    public static long d(int i, int i2) {
        return i2 | (i << 32);
    }

    @Override // defpackage.sy, defpackage.sv
    public final void a() {
        this.a = this.a.clone();
        this.b = this.b.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int[] iArr) {
        int n = super.n(iArr);
        return n >= 0 ? n : super.n(StateSet.WILD_CARD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(int i) {
        if (i < 0) {
            return 0;
        }
        return this.b.c(i, 0).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2, Drawable drawable, boolean z) {
        int f = super.f(drawable);
        long d = d(i, i2);
        long j = true != z ? 0L : 8589934592L;
        long j2 = f;
        this.a.j(d, Long.valueOf(j2 | j));
        if (z) {
            this.a.j(d(i2, i), Long.valueOf(4294967296L | j2 | j));
        }
    }

    @Override // defpackage.sy, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new ss(this, null);
    }

    @Override // defpackage.sy, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new ss(this, resources);
    }
}
