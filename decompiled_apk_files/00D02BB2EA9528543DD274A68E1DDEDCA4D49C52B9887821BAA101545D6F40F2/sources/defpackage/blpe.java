package defpackage;
/* compiled from: PG */
/* renamed from: blpe  reason: default package */
/* loaded from: classes3.dex */
final class blpe implements btzi<dvrc, dvre> {
    public final btzi<dvrc, dvre> a;
    final /* synthetic */ blpf b;
    private final dvrc c;

    public blpe(blpf blpfVar, dvrc dvrcVar, btzi<dvrc, dvre> btziVar) {
        this.b = blpfVar;
        this.c = dvrcVar;
        this.a = btziVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvrc> btzrVar, btzy btzyVar) {
        if (this.b.n(this.c)) {
            blpf blpfVar = this.b;
            if (!((efh) blpfVar.d).b) {
                return;
            }
            blpfVar.f.b(new blpd(this, btzrVar, btzyVar), bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvrc> btzrVar, dvre dvreVar) {
        dvre dvreVar2 = dvreVar;
        if (this.b.n(this.c)) {
            blpf blpfVar = this.b;
            if (!((efh) blpfVar.d).b) {
                return;
            }
            blpfVar.f.b(new blpc(this, btzrVar, dvreVar2), bvrj.UI_THREAD);
        }
    }
}
