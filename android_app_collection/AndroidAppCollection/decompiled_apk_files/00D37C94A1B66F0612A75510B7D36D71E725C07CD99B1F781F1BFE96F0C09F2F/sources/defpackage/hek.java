package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: hek  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hek implements DialogInterface.OnClickListener {
    public final /* synthetic */ hes a;
    private final /* synthetic */ int b;

    public /* synthetic */ hek(hes hesVar) {
        this.a = hesVar;
    }

    public /* synthetic */ hek(hes hesVar, int i) {
        this.b = i;
        this.a = hesVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            hes hesVar = this.a;
            hesVar.ai.e();
            hesVar.ai.g(hhw.h(hesVar.ao));
            ampq r = hesVar.r();
            if (r.h()) {
                hesVar.aj.l((auus) r.c());
            } else {
                afus.b(1, 6, "[ShortsCreation][Android][Music]Pivot music cleared after showing dialog");
            }
            ampq s = hesVar.s();
            if (s.h() && (1 & ((auux) s.c()).b) != 0) {
                hesVar.aq.p(((auux) s.c()).c);
            }
            hesVar.aE();
        } else if (i2 == 1) {
            hes hesVar2 = this.a;
            hesVar2.aq.r(hhw.h(hesVar2.ao));
            hesVar2.ai.f();
            hesVar2.aE();
        } else if (i2 != 2) {
            hes hesVar3 = this.a;
            hesVar3.aq.r(hhw.h(hesVar3.ao));
            hesVar3.ai.f();
            hesVar3.aE();
        } else {
            hes hesVar4 = this.a;
            hesVar4.ai.e();
            hesVar4.aj.j();
            hesVar4.ai.g(hhw.h(hesVar4.ao));
            hesVar4.aE();
        }
    }
}
