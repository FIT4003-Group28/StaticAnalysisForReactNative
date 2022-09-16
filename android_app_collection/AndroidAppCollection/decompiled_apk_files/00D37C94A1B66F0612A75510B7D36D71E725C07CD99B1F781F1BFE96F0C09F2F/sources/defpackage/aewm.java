package defpackage;
/* compiled from: PG */
/* renamed from: aewm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aewm implements amqo {
    public final /* synthetic */ aewx a;
    private final /* synthetic */ int b;

    public /* synthetic */ aewm(aewx aewxVar, int i) {
        this.b = i;
        this.a = aewxVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? this.a.l : Long.valueOf(this.a.f());
        }
        return Long.valueOf(this.a.g());
    }
}
