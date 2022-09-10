package defpackage;

import android.graphics.Rect;
import android.text.format.DateFormat;
import android.view.View;
/* compiled from: PG */
/* renamed from: dmjp  reason: default package */
/* loaded from: classes6.dex */
final class dmjp extends bqf {
    final /* synthetic */ dmjq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmjp(dmjq dmjqVar, View view) {
        super(dmjqVar, view);
        this.g = dmjqVar;
    }

    @Override // defpackage.bqf
    protected final void B(int i, Rect rect) {
        dmjq dmjqVar = this.g;
        int i2 = dmjqVar.g;
        int i3 = dmjqVar.M;
        int i4 = dmjqVar.v;
        int i5 = dmjqVar.e;
        int i6 = i5 + i5 + i3;
        int h = (i - 1) + dmjqVar.h();
        int i7 = this.g.A;
        int i8 = (i2 - (i3 / 2)) + ((h % i7) * i6);
        int i9 = ((i5 + i4) - (i4 / 2)) + ((h / i7) * i4);
        if (dmjq.q()) {
            int i10 = this.g.t - i8;
            rect.set(i10 - i6, i9, i10, i4 + i9);
            return;
        }
        rect.set(i8, i9, i6 + i8, i4 + i9);
    }

    @Override // defpackage.bqf
    protected final CharSequence C(int i) {
        dmjq dmjqVar = this.g;
        dmjqVar.L.set(i, dmjqVar.r, dmjqVar.s);
        this.g.L.normalize(false);
        return DateFormat.format("EEEE dd MMMM yyyy", this.g.L.toMillis(false));
    }
}
