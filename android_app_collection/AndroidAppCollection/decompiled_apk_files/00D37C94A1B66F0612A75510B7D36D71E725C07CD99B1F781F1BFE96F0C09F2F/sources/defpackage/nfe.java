package defpackage;

import android.widget.EdgeEffect;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: nfe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nfe implements Consumer {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    private final /* synthetic */ int c;

    public /* synthetic */ nfe(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public /* synthetic */ nfe(float f, float f2, int i) {
        this.c = i;
        this.a = f;
        this.b = f2;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.c != 0 ? consumer.getClass() : consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.c == 0) {
            float f = this.a;
            float f2 = this.b;
            int i = nff.b;
            ((EdgeEffect) obj).onPullDistance(f, f2);
            return;
        }
        float f3 = this.a;
        float f4 = this.b;
        int i2 = nff.b;
        ((EdgeEffect) obj).onPull(f3, f4);
    }
}
