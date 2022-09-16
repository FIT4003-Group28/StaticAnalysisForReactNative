package defpackage;
/* compiled from: PG */
/* renamed from: gjy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gjy implements amqo {
    public final /* synthetic */ gjz a;
    public final /* synthetic */ epr b;
    private final /* synthetic */ int c;

    public /* synthetic */ gjy(gjz gjzVar, epr eprVar) {
        this.a = gjzVar;
        this.b = eprVar;
    }

    public /* synthetic */ gjy(gjz gjzVar, epr eprVar, int i) {
        this.c = i;
        this.a = gjzVar;
        this.b = eprVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        if (this.c == 0) {
            return this.b.a(new gjx(1));
        }
        return this.b.a(new gjx());
    }
}
