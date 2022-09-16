package defpackage;
/* compiled from: PG */
/* renamed from: njg  reason: default package */
/* loaded from: classes3.dex */
public final class njg extends iy implements fqc {
    private final eo a;
    private vew b;

    public njg(eo eoVar) {
        this.a = eoVar;
    }

    private final void M() {
        vew vewVar = this.b;
        if (vewVar == null || !vewVar.at()) {
            return;
        }
        this.b.ku();
    }

    @Override // defpackage.iy
    public final void K(dp dpVar) {
        if (dpVar instanceof vew) {
            M();
            this.b = (vew) dpVar;
        }
    }

    @Override // defpackage.fqc
    public final void a() {
        M();
        this.b = null;
        ed edVar = this.a.j;
        synchronized (edVar.a) {
            int size = edVar.a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((ec) edVar.a.get(i)).b == this) {
                    edVar.a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    @Override // defpackage.fqc
    public final void b() {
        this.a.ak(this, true);
    }
}
