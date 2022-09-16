package defpackage;

import android.widget.EdgeEffect;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: khu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class khu implements Consumer {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ khu(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0 && i != 1 && i != 2 && i != 3 && i == 4) {
            return consumer.getClass();
        }
        return consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((ffo) obj).m(this.a);
        } else if (i == 1) {
            ((ffo) obj).A(this.a);
        } else if (i == 2) {
            ((ffo) obj).n(this.a);
        } else if (i == 3) {
            ((ffo) obj).u(this.a);
        } else if (i == 4) {
            ((ffo) obj).w(this.a);
        } else {
            int i2 = this.a;
            int i3 = nff.b;
            ((EdgeEffect) obj).onAbsorb(i2);
        }
    }
}
