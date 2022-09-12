package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bdem  reason: default package */
/* loaded from: classes3.dex */
final class bdem implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ Callable a;

    public bdem(Callable callable) {
        this.a = callable;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(final View view) {
        view.setOnTouchListener(new bdvl((ImageView) view, ViewConfiguration.get(view.getContext()).getScaledDoubleTapSlop(), view.getResources().getInteger(17694720), this.a, new dbrn(view) { // from class: bdel
            private final View a;

            {
                this.a = view;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                View view2 = this.a;
                int i = bdem.b;
                return new aljd(view2.getContext().getApplicationContext(), (aliy) obj);
            }
        }));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.setOnTouchListener(null);
    }
}
