package defpackage;
/* compiled from: PG */
/* renamed from: zvb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zvb implements ayqb {
    public final /* synthetic */ zvh a;
    private final /* synthetic */ int b;

    public /* synthetic */ zvb(zvh zvhVar, int i) {
        this.b = i;
        this.a = zvhVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.aj = (amuk) obj;
            return;
        }
        zvh zvhVar = this.a;
        zvhVar.q(zwc.a(zvhVar.aj, (zvu) obj));
    }
}
