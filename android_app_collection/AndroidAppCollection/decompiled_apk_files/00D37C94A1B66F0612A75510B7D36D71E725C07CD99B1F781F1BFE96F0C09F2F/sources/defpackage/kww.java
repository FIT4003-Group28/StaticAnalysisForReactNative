package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kww  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kww implements View.OnClickListener {
    public final /* synthetic */ kwy a;
    private final /* synthetic */ int b;

    public /* synthetic */ kww(kwy kwyVar, int i) {
        this.b = i;
        this.a = kwyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        akhl akhlVar;
        akhl akhlVar2;
        if (this.b != 0) {
            kwy kwyVar = this.a;
            kvu kvuVar = kwyVar.z.k;
            if (kvuVar == null || (akhlVar2 = kwyVar.y) == null) {
                return;
            }
            int b = kwyVar.b();
            kvz kvzVar = kvuVar.a;
            kvzVar.ai.b(kvzVar.aL);
            if (eog.I(kvuVar.a.ag)) {
                kvuVar.a.oi().H(3, new acte(actj.SEARCH_SUGGESTION), null);
            }
            kvuVar.a.aI(akhlVar2.b, b);
            return;
        }
        kwy kwyVar2 = this.a;
        kvu kvuVar2 = kwyVar2.z.k;
        if (kvuVar2 == null || (akhlVar = kwyVar2.y) == null) {
            return;
        }
        kwyVar2.b();
        kvuVar2.a.ai.e();
        kvuVar2.a.aF();
        kvuVar2.a.aH.setText(akhlVar.b);
        zag.j(kvuVar2.a.aH);
        kvuVar2.a.be();
    }
}
