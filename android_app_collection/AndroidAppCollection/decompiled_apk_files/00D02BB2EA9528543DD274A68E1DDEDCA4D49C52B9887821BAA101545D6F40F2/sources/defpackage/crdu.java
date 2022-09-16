package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crdu  reason: default package */
/* loaded from: classes5.dex */
public final class crdu {
    public final cksq a;
    private final crfj b;
    @dzsi
    private crdg c;

    public crdu(crfj crfjVar, @dzsi crdg crdgVar, cksq cksqVar) {
        this.b = crfjVar;
        this.c = crdgVar;
        this.a = cksqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crfk b() {
        return this.b.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        crdg crdgVar = this.c;
        if (crdgVar != null) {
            crdgVar.f();
            this.c = null;
        }
    }
}
