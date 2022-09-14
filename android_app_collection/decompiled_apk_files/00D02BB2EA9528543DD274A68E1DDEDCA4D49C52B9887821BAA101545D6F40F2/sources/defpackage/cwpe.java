package defpackage;
/* compiled from: PG */
/* renamed from: cwpe  reason: default package */
/* loaded from: classes5.dex */
public final class cwpe extends cwqg {
    public cwqk a;
    public cwqj b;
    public cwla c;
    public Boolean d;

    @Override // defpackage.cwqg
    public final void a(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.cwqg
    public final void b(cwqj cwqjVar) {
        if (cwqjVar != null) {
            this.b = cwqjVar;
            return;
        }
        throw new NullPointerException("Null onDismissCallback");
    }

    @Override // defpackage.cwqg
    public final void c(cwqk cwqkVar) {
        if (cwqkVar != null) {
            this.a = cwqkVar;
            return;
        }
        throw new NullPointerException("Null onViewCreatedCallback");
    }

    @Override // defpackage.cwqg
    public final void d(cwla cwlaVar) {
        if (cwlaVar != null) {
            this.c = cwlaVar;
            return;
        }
        throw new NullPointerException("Null visualElements");
    }
}
