package defpackage;

import android.widget.TextView;
import j$.util.function.IntConsumer;
/* compiled from: PG */
/* renamed from: wev  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wev implements IntConsumer {
    public final /* synthetic */ TextView a;
    private final /* synthetic */ int b;

    public /* synthetic */ wev(TextView textView, int i) {
        this.b = i;
        this.a = textView;
    }

    @Override // j$.util.function.IntConsumer
    public final void accept(int i) {
        if (this.b == 0) {
            kz.s(this.a, i);
        } else {
            kz.s(this.a, i);
        }
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return this.b != 0 ? intConsumer.getClass() : intConsumer.getClass();
    }
}
