package defpackage;

import android.graphics.Rect;
import android.text.format.DateFormat;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: dmkv  reason: default package */
/* loaded from: classes6.dex */
final class dmkv extends bqf {
    final /* synthetic */ dmkw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmkv(dmkw dmkwVar, View view) {
        super(dmkwVar, view);
        this.g = dmkwVar;
    }

    @Override // defpackage.bqf
    protected final void B(int i, Rect rect) {
        dmkw dmkwVar = this.g;
        int i2 = dmkwVar.v;
        float f = dmkwVar.L;
        int h = (i - 1) + dmkwVar.h();
        dmkw dmkwVar2 = this.g;
        int i3 = dmkwVar2.A;
        int i4 = h / i3;
        int i5 = (int) ((h % i3) * f);
        int i6 = dmkwVar2.d + (i4 * i2);
        if (dmkw.r()) {
            int i7 = this.g.t - i5;
            rect.set((int) (i7 - f), i6, i7, i2 + i6);
            return;
        }
        rect.set(i5, i6, (int) (i5 + f), i2 + i6);
    }

    @Override // defpackage.bqf
    protected final CharSequence C(int i) {
        dmkw dmkwVar = this.g;
        dmkwVar.M.set(i, dmkwVar.r, dmkwVar.s);
        this.g.M.normalize(false);
        return DateFormat.format("EEEE dd MMMM yyyy", this.g.M.toMillis(false));
    }

    @Override // defpackage.bqf, defpackage.ams
    protected final void v(List<Integer> list) {
        for (int i = this.g.N; i <= this.g.O; i++) {
            list.add(Integer.valueOf(i));
        }
    }
}
