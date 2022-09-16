package defpackage;

import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: os  reason: default package */
/* loaded from: classes4.dex */
public final class os implements ss {
    final /* synthetic */ ot a;
    private final /* synthetic */ int b;

    public os(ot otVar) {
        this.a = otVar;
    }

    public os(ot otVar, int i) {
        this.b = i;
        this.a = otVar;
    }

    @Override // defpackage.ss
    public final boolean b(sf sfVar) {
        Window.Callback H;
        if (this.b == 0) {
            if (sfVar == sfVar.a()) {
                ot otVar = this.a;
                if (otVar.r && (H = otVar.H()) != null && !this.a.x) {
                    H.onMenuOpened(108, sfVar);
                }
            }
            return true;
        }
        Window.Callback H2 = this.a.H();
        if (H2 != null) {
            H2.onMenuOpened(108, sfVar);
        }
        return true;
    }

    @Override // defpackage.ss
    public final void a(sf sfVar, boolean z) {
        if (this.b == 0) {
            sf a = sfVar.a();
            or F = this.a.F(a != sfVar ? a : sfVar);
            if (F == null) {
                return;
            }
            if (a != sfVar) {
                this.a.J(F.a, F, a);
                this.a.L(F, true);
                return;
            }
            this.a.L(F, z);
            return;
        }
        this.a.K(sfVar);
    }
}
