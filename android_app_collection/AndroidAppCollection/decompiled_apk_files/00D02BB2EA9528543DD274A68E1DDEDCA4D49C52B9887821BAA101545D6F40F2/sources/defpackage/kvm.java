package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kvm  reason: default package */
/* loaded from: classes7.dex */
public final class kvm implements dbty<akpe> {
    final /* synthetic */ kwf a;

    public kvm(kwf kwfVar) {
        this.a = kwfVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ akpe a() {
        kvl kvlVar = new kvl(this);
        kvh kvhVar = new kvh();
        kwf kwfVar = this.a;
        return new akoo(kvlVar, kvhVar, kwfVar.g, kwfVar.E, new dzsj(this) { // from class: kvk
            private final kvm a;

            {
                this.a = this;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.a.c.si();
            }
        }, this.a.c.rX(), this.a.c.rW(), this.a.c.tr(), this.a.c.tg());
    }
}
