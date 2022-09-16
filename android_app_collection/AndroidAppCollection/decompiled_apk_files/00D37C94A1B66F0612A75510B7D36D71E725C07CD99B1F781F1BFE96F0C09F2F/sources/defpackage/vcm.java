package defpackage;
/* compiled from: PG */
/* renamed from: vcm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vcm implements amqo {
    public final /* synthetic */ vco a;
    private final /* synthetic */ int b;

    public /* synthetic */ vcm(vco vcoVar, int i) {
        this.b = i;
        this.a = vcoVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        if (this.b == 0) {
            return this.a.b();
        }
        return this.a.c();
    }
}
