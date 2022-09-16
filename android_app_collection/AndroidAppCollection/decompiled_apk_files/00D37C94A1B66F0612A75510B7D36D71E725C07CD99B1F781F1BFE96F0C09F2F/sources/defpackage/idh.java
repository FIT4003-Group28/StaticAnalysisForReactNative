package defpackage;

import android.text.style.ClickableSpan;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: idh  reason: default package */
/* loaded from: classes3.dex */
public final class idh implements ajgf {
    final /* synthetic */ idj a;

    public idh(idj idjVar) {
        this.a = idjVar;
    }

    @Override // defpackage.ajgf
    public final ClickableSpan a(apzg apzgVar) {
        int bC;
        aulr aulrVar = this.a.w;
        return new idg(this.a.g, apzgVar, aulrVar == null || (aulrVar.b & 4096) == 0 || (bC = awwc.bC(aulrVar.o)) == 0 || bC != 12);
    }
}
