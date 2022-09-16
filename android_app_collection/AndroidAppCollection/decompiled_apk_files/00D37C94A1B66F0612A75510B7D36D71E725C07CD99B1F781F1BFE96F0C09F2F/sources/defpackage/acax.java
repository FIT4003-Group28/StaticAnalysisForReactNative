package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: acax  reason: default package */
/* loaded from: classes.dex */
final class acax implements afzf {
    private final Handler a;
    private final abzm b;

    public acax(Handler handler, abzm abzmVar) {
        this.a = handler;
        this.b = abzmVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        abxa.b().n(7, 1, cffVar);
        abzm abzmVar = this.b;
        if (abzmVar != null) {
            this.a.post(new acaw(abzmVar, 1));
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arxm arxmVar = (arxm) obj;
        if ((arxmVar.b & 4) != 0) {
            arxp arxpVar = arxmVar.d;
            if (arxpVar == null) {
                arxpVar = arxp.a;
            }
            int B = akpq.B(arxpVar.c);
            if (B == 0 || B == 1) {
                abxa.b().m(6);
                abzm abzmVar = this.b;
                if (abzmVar == null) {
                    return;
                }
                this.a.post(new acaw(abzmVar));
                return;
            }
        }
        abxa.b().n(7, 1, null);
        abzm abzmVar2 = this.b;
        if (abzmVar2 != null) {
            this.a.post(new acaw(abzmVar2, 1));
        }
    }
}
