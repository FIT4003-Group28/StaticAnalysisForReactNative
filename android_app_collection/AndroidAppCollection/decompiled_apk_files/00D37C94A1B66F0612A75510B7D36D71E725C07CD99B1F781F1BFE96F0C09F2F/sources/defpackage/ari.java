package defpackage;
/* compiled from: PG */
/* renamed from: ari  reason: default package */
/* loaded from: classes2.dex */
class ari extends arf {
    final /* synthetic */ arx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ari(arx arxVar) {
        super(arxVar);
        this.e = arxVar;
    }

    @Override // defpackage.arf, defpackage.arb
    public void b() {
        this.b = new arh(this, this.e);
        this.b.onCreate();
    }
}
