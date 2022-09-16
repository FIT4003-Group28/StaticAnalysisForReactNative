package defpackage;
/* compiled from: PG */
/* renamed from: aeza  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aeza implements amqo {
    public final /* synthetic */ aezb a;
    private final /* synthetic */ int b;

    public /* synthetic */ aeza(aezb aezbVar, int i) {
        this.b = i;
        this.a = aezbVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        return this.b != 0 ? this.a.a : this.a.b;
    }
}
