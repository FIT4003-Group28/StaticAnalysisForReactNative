package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aigt  reason: default package */
/* loaded from: classes.dex */
public final class aigt {
    public String a;
    public ajfq b;
    public ajff c;
    public aitv d;
    public final aiha e;
    public ajbk f;
    public boolean g;
    public aigz h;
    final Map i = new HashMap();
    public aijy j;

    public aigt(aiha aihaVar) {
        this.e = aihaVar;
    }

    public final void a(aynx aynxVar) {
        aypf aypfVar = new aypf();
        aypfVar.d(aynxVar.h(aiwv.l(1)).Z(new aigr(this, 3)));
        aypfVar.d(aynxVar.n().P(aaku.s).Z(new aigr(this)));
        aypfVar.d(aiwv.k(aynxVar, ahja.q).h(aiwv.l(1)).Z(new aigr(this, 1)));
        aypfVar.d(aiwv.j(aynxVar, ahja.r).Z(new aigr(this, 2)));
    }

    public final void b() {
        this.j = null;
        this.g = false;
    }

    public final void c(String str, String str2, long j, boolean z, boolean z2) {
        PlayerResponseModel playerResponseModel;
        ajfp d = this.b.d(str);
        ajfp d2 = this.b.d(str2);
        if (d == null || d2 == null || d.f == null || (playerResponseModel = d2.f) == null) {
            return;
        }
        ahho ahhoVar = new ahho(str, str2, playerResponseModel.B(), this.a, j, z, z2, d.f);
        this.c.ay().c(ahhoVar);
        String e = ahhoVar.e();
        if (ahhoVar.i()) {
            if (d(e)) {
                aitv aitvVar = this.d;
                aitvVar.f = true;
                aitvVar.h(ahhoVar.b(), ahhoVar.e(), ahhoVar.c(), 0);
            } else if (d(e)) {
            } else {
                aitv aitvVar2 = this.d;
                if (!aitvVar2.f) {
                    return;
                }
                aitvVar2.f = false;
            }
        } else if (!d(ahhoVar.e())) {
            this.d.f = true;
        } else {
            aitv aitvVar3 = this.d;
            if (!aitvVar3.f) {
                return;
            }
            aitvVar3.i();
            this.d.f = false;
        }
    }

    public final boolean d(String str) {
        return str.equals(this.a);
    }
}
