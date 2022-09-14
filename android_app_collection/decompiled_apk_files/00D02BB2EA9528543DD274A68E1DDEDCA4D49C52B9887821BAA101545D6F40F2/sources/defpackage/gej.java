package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: gej  reason: default package */
/* loaded from: classes6.dex */
final class gej extends gh {
    final /* synthetic */ gek a;

    public gej(gek gekVar) {
        this.a = gekVar;
    }

    @Override // defpackage.gh
    public final void a(gn gnVar, fd fdVar) {
        if (this.a.a.equals(fdVar)) {
            gnVar.an(this);
        }
    }

    @Override // defpackage.gh
    public final void c(fd fdVar, @dzsi Bundle bundle) {
        if (this.a.a.equals(fdVar)) {
            gek gekVar = this.a;
            if (gekVar.c != null) {
                return;
            }
            if (bundle == null) {
                bundle = fdVar.o;
            }
            jjn jjnVar = null;
            if (bundle != null && bundle.containsKey("savedExpandingState")) {
                jjnVar = jjn.values()[bundle.getInt("savedExpandingState")];
            }
            gekVar.c = jjnVar;
        }
    }

    @Override // defpackage.gh
    public final void e(fd fdVar) {
        if (this.a.a.equals(fdVar)) {
            gek gekVar = this.a;
            if (gekVar.c != null || gekVar.b.l() == null) {
                return;
            }
            gek gekVar2 = this.a;
            gekVar2.c = gekVar2.b.l().L();
        }
    }

    @Override // defpackage.gh
    public final void g(fd fdVar, Bundle bundle) {
        jjn jjnVar;
        if (!this.a.a.equals(fdVar) || (jjnVar = this.a.c) == null) {
            return;
        }
        bundle.putInt("savedExpandingState", jjnVar.ordinal());
    }
}
