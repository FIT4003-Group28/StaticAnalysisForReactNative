package defpackage;

import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: zoi  reason: default package */
/* loaded from: classes7.dex */
final class zoi implements View.OnLayoutChangeListener {
    final /* synthetic */ zom a;

    public zoi(zom zomVar) {
        this.a = zomVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(final View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        zom zomVar = this.a;
        boolean z = zomVar.c;
        zomVar.c = ((TextView) view).getLineCount() >= 2;
        zom zomVar2 = this.a;
        if (z != zomVar2.c) {
            cqkx.p(zomVar2);
            view.getClass();
            view.post(new Runnable(view) { // from class: zoh
                private final View a;

                {
                    this.a = view;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.requestLayout();
                }
            });
        }
    }
}
