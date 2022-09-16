package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: sww  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class sww implements dll {
    public final /* synthetic */ tfw a;
    public final /* synthetic */ tcu b;
    public final /* synthetic */ tda c;
    public final /* synthetic */ tfw d;
    public final /* synthetic */ int e;
    private final /* synthetic */ int f;

    public /* synthetic */ sww(tfw tfwVar, tcu tcuVar, tda tdaVar, tfw tfwVar2, int i) {
        this.a = tfwVar;
        this.b = tcuVar;
        this.c = tdaVar;
        this.d = tfwVar2;
        this.e = i;
    }

    public /* synthetic */ sww(tfw tfwVar, tcu tcuVar, tda tdaVar, tfw tfwVar2, int i, int i2) {
        this.f = i2;
        this.a = tfwVar;
        this.b = tcuVar;
        this.c = tdaVar;
        this.d = tfwVar2;
        this.e = i;
    }

    @Override // defpackage.dll
    public final void a(View view, int i) {
        if (this.f != 0) {
            tfw tfwVar = this.a;
            tcu tcuVar = this.b;
            tda tdaVar = this.c;
            tfw tfwVar2 = this.d;
            int i2 = this.e;
            if (i == 0) {
                if (tfwVar == null) {
                    return;
                }
                tck.g(view, tcuVar, tfwVar.a(), tdaVar.u, tdaVar.r, null);
                return;
            }
            if (tfwVar2 != null) {
                tck.g(view, tcuVar, tfwVar2.a(), tdaVar.u, tdaVar.r, null);
            }
            if (i2 != 2) {
                return;
            }
            tck.f(tdaVar);
            return;
        }
        tfw tfwVar3 = this.a;
        tcu tcuVar2 = this.b;
        tda tdaVar2 = this.c;
        tfw tfwVar4 = this.d;
        int i3 = this.e;
        if (i == 0) {
            if (tfwVar3 == null) {
                return;
            }
            tck.g(view, tcuVar2, tfwVar3.a(), tdaVar2.u, tdaVar2.r, null);
            return;
        }
        if (tfwVar4 != null) {
            tck.g(view, tcuVar2, tfwVar4.a(), tdaVar2.u, tdaVar2.r, null);
        }
        if (i3 != 2) {
            return;
        }
        tck.f(tdaVar2);
    }
}
