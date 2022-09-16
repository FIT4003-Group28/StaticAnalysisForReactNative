package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: kho  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kho implements Consumer {
    public final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public /* synthetic */ kho(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0 && i == 1) {
            return consumer.getClass();
        }
        return consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((ffo) obj).t(this.a);
        } else if (i == 1) {
            ((ffo) obj).g(this.a);
        } else {
            TextView textView = (TextView) obj;
            textView.setMaxWidth(this.a.getLayoutParams().width);
            zgd.t(textView, zgd.r(-2), ViewGroup.LayoutParams.class);
        }
    }
}
