package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: roa  reason: default package */
/* loaded from: classes4.dex */
public final class roa extends rjv {
    final /* synthetic */ rom b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roa(rom romVar, rml rmlVar) {
        super(rmlVar);
        this.b = romVar;
    }

    @Override // defpackage.rjv
    public final void b() {
        rom romVar = this.b;
        romVar.n();
        if (!romVar.z()) {
            return;
        }
        romVar.aG().k.a("Inactivity, disconnecting from the service");
        romVar.o();
    }
}
