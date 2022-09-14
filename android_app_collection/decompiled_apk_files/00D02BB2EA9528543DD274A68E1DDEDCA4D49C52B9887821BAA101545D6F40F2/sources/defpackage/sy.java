package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
/* compiled from: PG */
/* renamed from: sy  reason: default package */
/* loaded from: classes.dex */
class sy extends sv {
    int[][] K;

    public sy(sy syVar, sz szVar, Resources resources) {
        super(syVar, szVar, resources);
        if (syVar != null) {
            this.K = syVar.K;
        } else {
            this.K = new int[this.i.length];
        }
    }

    @Override // defpackage.sv
    public void a() {
        int length = this.K.length;
        int[][] iArr = new int[length];
        while (true) {
            length--;
            if (length < 0) {
                this.K = iArr;
                return;
            } else {
                int[] iArr2 = this.K[length];
                iArr[length] = iArr2 != null ? (int[]) iArr2.clone() : null;
            }
        }
    }

    @Override // defpackage.sv
    public final void l(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        System.arraycopy(this.i, 0, drawableArr, 0, i);
        this.i = drawableArr;
        int[][] iArr = new int[i2];
        System.arraycopy(this.K, 0, iArr, 0, i);
        this.K = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n(int[] iArr) {
        int[][] iArr2 = this.K;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new sz(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new sz(this, resources);
    }
}
