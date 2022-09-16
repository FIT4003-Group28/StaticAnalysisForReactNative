package defpackage;

import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: yxx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yxx implements Consumer {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ yxx(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? consumer.getClass() : consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            String str = this.a;
            int i = yxz.f;
            ((ssz) obj).a(str, -1);
            return;
        }
        String str2 = this.a;
        ssz sszVar = (ssz) obj;
        int i2 = yxz.f;
        if (!str2.equals(sszVar.a) || sszVar.b.e()) {
            return;
        }
        sszVar.b.a();
    }
}
