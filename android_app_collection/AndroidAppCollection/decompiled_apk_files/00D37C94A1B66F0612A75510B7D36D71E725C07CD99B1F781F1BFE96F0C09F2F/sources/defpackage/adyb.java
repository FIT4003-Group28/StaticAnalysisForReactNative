package defpackage;
/* compiled from: PG */
/* renamed from: adyb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adyb implements amqo {
    public final /* synthetic */ aeov a;
    private final /* synthetic */ int b;

    public /* synthetic */ adyb(aeov aeovVar, int i) {
        this.b = i;
        this.a = aeovVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return Integer.valueOf(this.a.d.b());
            }
            if (i == 2) {
                return this.a.i();
            }
            if (i == 3) {
                aeov aeovVar = this.a;
                ylr.c();
                return aeovVar.d.n();
            }
            aeov aeovVar2 = this.a;
            ylr.c();
            return Integer.valueOf(aeovVar2.d.e());
        }
        return this.a.f;
    }
}
