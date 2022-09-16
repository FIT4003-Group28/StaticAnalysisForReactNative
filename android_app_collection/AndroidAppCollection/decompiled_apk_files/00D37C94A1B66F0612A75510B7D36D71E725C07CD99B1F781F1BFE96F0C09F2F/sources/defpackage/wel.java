package defpackage;

import android.content.res.ColorStateList;
import android.widget.TextView;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: wel  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wel implements Consumer {
    public final /* synthetic */ TextView a;
    private final /* synthetic */ int b;

    public /* synthetic */ wel(TextView textView, int i) {
        this.b = i;
        this.a = textView;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.setTextColor((ColorStateList) obj);
        } else if (i == 1) {
            this.a.setTextColor((ColorStateList) obj);
        } else {
            this.a.setTextColor((ColorStateList) obj);
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0 && i == 1) {
            return consumer.getClass();
        }
        return consumer.getClass();
    }
}
