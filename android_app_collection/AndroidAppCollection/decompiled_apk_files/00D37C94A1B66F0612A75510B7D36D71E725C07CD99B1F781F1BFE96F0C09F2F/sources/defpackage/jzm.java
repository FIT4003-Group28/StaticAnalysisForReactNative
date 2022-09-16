package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jzm  reason: default package */
/* loaded from: classes3.dex */
final class jzm implements View.OnLayoutChangeListener {
    final /* synthetic */ jzn a;
    private final int b;
    private int c;

    public jzm(jzn jznVar) {
        this.a = jznVar;
        this.b = jznVar.getResources().getDimensionPixelSize(R.dimen.app_related_end_screen_item_padding);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (this.c != i9) {
            this.c = i9;
            jzn jznVar = this.a;
            jznVar.a = (i9 - jznVar.e) - this.b;
            jznVar.j(jznVar.c.a, false, 0);
        }
    }
}
