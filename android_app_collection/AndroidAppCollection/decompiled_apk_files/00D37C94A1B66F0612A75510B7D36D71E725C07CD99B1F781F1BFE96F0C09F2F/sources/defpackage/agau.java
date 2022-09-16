package defpackage;

import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: agau  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agau implements Consumer {
    public final /* synthetic */ aafo a;
    private final /* synthetic */ int b;

    public /* synthetic */ agau(aafo aafoVar, int i) {
        this.b = i;
        this.a = aafoVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            this.a.a((apzg) obj);
        } else {
            this.a.a((apzg) obj);
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? consumer.getClass() : consumer.getClass();
    }
}
