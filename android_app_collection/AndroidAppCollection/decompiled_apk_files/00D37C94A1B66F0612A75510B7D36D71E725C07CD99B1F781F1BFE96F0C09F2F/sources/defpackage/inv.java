package defpackage;

import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: inv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class inv implements Consumer {
    public final /* synthetic */ lcs a;

    public /* synthetic */ inv(lcs lcsVar) {
        this.a = lcsVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.a.j = (String) obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }
}
