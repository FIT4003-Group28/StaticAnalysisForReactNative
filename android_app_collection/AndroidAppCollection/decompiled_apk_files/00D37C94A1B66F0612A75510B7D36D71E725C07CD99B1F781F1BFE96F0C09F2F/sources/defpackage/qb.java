package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
/* compiled from: PG */
/* renamed from: qb  reason: default package */
/* loaded from: classes4.dex */
class qb extends py {
    int[][] K;

    public qb(qb qbVar, qc qcVar, Resources resources) {
        super(qbVar, qcVar, resources);
        if (qbVar != null) {
            this.K = qbVar.K;
        } else {
            this.K = new int[this.i.length];
        }
    }

    @Override // defpackage.py
    public void d() {
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

    @Override // defpackage.py
    public final void j(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        Drawable[] drawableArr2 = this.i;
        if (drawableArr2 != null) {
            System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
        }
        this.i = drawableArr;
        int[][] iArr = new int[i2];
        System.arraycopy(this.K, 0, iArr, 0, i);
        this.K = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m(int[] iArr) {
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
        return new qc(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new qc(this, resources);
    }
}
