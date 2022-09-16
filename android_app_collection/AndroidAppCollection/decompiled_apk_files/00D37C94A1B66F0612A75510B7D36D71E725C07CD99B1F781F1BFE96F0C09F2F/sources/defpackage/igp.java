package defpackage;

import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: igp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class igp implements Consumer {
    public final /* synthetic */ igq a;
    private final /* synthetic */ int b;

    public /* synthetic */ igp(igq igqVar, int i) {
        this.b = i;
        this.a = igqVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? consumer.getClass() : consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            this.a.j((hqh) obj);
            return;
        }
        igq igqVar = this.a;
        String valueOf = String.valueOf((cff) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("fetch browseResponseModel failed");
        sb.append(valueOf);
        afus.b(2, 24, sb.toString());
        igqVar.z();
    }
}
