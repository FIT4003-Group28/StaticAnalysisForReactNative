package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
/* compiled from: PG */
/* renamed from: fqk  reason: default package */
/* loaded from: classes3.dex */
public final class fqk implements View.OnLayoutChangeListener {
    private final ProgressBar a;
    private final tpj b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public fqk(ProgressBar progressBar, tpj tpjVar, int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        aqxo.p(i2 >= i);
        aqxo.p(i4 < i3 ? false : z);
        this.a = progressBar;
        this.b = tpjVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int round;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
        int i9 = this.g;
        int i10 = (i4 - i2) - i9;
        int i11 = this.d;
        int i12 = 0;
        if (i10 >= i11) {
            round = this.f;
        } else {
            int i13 = this.c;
            if (i10 <= i13) {
                round = this.e;
                i11 = i13;
            } else {
                i12 = i9 / 2;
                int i14 = this.f;
                int i15 = this.e;
                round = Math.round((((i14 - i15) / (i11 - i13)) * (i10 - i13)) + i15);
                i11 = -1;
            }
        }
        marginLayoutParams.height = i11;
        marginLayoutParams.bottomMargin = i12;
        marginLayoutParams.topMargin = i12;
        tpj tpjVar = this.b;
        if (round != tpjVar.g) {
            tpjVar.g = round;
            tpjVar.invalidateSelf();
        }
    }
}
