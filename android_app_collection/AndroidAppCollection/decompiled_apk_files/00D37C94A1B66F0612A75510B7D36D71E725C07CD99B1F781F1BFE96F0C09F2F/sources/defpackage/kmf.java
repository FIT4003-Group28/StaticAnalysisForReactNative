package defpackage;

import android.widget.EdgeEffect;
import android.widget.TextView;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: kmf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kmf implements Consumer {
    public final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public /* synthetic */ kmf(float f, int i) {
        this.b = i;
        this.a = f;
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
            ((TextView) ((yye) obj).b).setAlpha(this.a);
        } else if (i == 1) {
            ((ffo) obj).setAlpha(this.a);
        } else {
            float f = this.a;
            int i2 = nff.b;
            ((EdgeEffect) obj).onPull(f);
        }
    }
}
