package defpackage;
/* compiled from: PG */
/* renamed from: crsk  reason: default package */
/* loaded from: classes5.dex */
final class crsk implements btzi<dkcw, dkcy> {
    final /* synthetic */ boolean a;
    final /* synthetic */ dqkr b;
    final /* synthetic */ crsn c;
    final /* synthetic */ int d;

    public crsk(crsn crsnVar, boolean z, int i, dqkr dqkrVar) {
        this.c = crsnVar;
        this.a = z;
        this.d = i;
        this.b = dqkrVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dkcw> btzrVar, btzy btzyVar) {
        int i = crsn.b;
        btzyVar.p.toString();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dkcw> btzrVar, dkcy dkcyVar) {
        dkcy dkcyVar2 = dkcyVar;
        if (this.a) {
            this.c.k(this.d, this.b, dkcyVar2.a);
        }
    }
}
