package defpackage;
/* compiled from: PG */
/* renamed from: crds  reason: default package */
/* loaded from: classes5.dex */
final class crds implements crbb {
    final /* synthetic */ crbb a;
    final /* synthetic */ crdt b;

    public crds(crdt crdtVar, crbb crbbVar) {
        this.b = crdtVar;
        this.a = crbbVar;
    }

    @Override // defpackage.crbb
    public final void a(crbc crbcVar) {
        this.a.a(this.b);
    }

    @Override // defpackage.crbb
    public final void b(crbc crbcVar) {
        crdt crdtVar = this.b;
        crdtVar.a = null;
        this.a.b(crdtVar);
    }
}
