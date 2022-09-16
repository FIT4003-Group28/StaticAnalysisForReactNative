package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: aklm  reason: default package */
/* loaded from: classes.dex */
public final class aklm extends ajwd implements aklk, akoo {
    private final Context a;
    private final aafo b;
    private final ajsm c;

    public aklm(avnk avnkVar, Context context, aafo aafoVar) {
        this.a = context;
        this.b = aafoVar;
        ajsm ajsmVar = new ajsm();
        this.c = ajsmVar;
        avnkVar.getClass();
        ajsmVar.add(avnkVar);
    }

    @Override // defpackage.aklk
    public final void b(List list) {
    }

    @Override // defpackage.aklk
    public final void c(ajsa ajsaVar) {
        ajsaVar.f(avnk.class, new akov(this.a, this.b));
    }

    @Override // defpackage.akoo
    public final void d(arag aragVar) {
        ajsm ajsmVar = this.c;
        aopa mo52toBuilder = ((avnk) this.c.get(0)).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        avnk avnkVar = (avnk) mo52toBuilder.instance;
        aragVar.getClass();
        avnkVar.d = aragVar;
        avnkVar.b |= 2;
        ajsmVar.set(0, mo52toBuilder.mo39build());
        this.c.l();
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.c;
    }
}
