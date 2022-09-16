package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bynp  reason: default package */
/* loaded from: classes4.dex */
public final class bynp implements btzi<dkcw, dkcy> {
    final /* synthetic */ bynq a;

    public bynp(bynq bynqVar) {
        this.a = bynqVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dkcw> btzrVar, btzy btzyVar) {
        c(btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dkcw> btzrVar, dkcy dkcyVar) {
        c(null);
    }

    public final void c(@dzsi bttq bttqVar) {
        bynn bynnVar;
        cqkf<byng> cqkfVar;
        if (!this.a.d.a() || !this.a.x().booleanValue()) {
            return;
        }
        if (bttqVar == null) {
            bynq bynqVar = this.a;
            bynqVar.r = true;
            cqkx.p(bynqVar);
            return;
        }
        bynq bynqVar2 = this.a;
        bynqVar2.n = false;
        bynqVar2.o = false;
        bynqVar2.p = false;
        bynqVar2.q = false;
        cqkx.p(bynqVar2);
        String string = this.a.e.getString(R.string.NETWORK_UNAVAILABLE);
        if (string == null || TextUtils.isEmpty(string) || (bynnVar = this.a.s) == null) {
            return;
        }
        bykr bykrVar = (bykr) bynnVar;
        byky bykyVar = bykrVar.a;
        if (!bykyVar.aD || (cqkfVar = bykyVar.d) == null || cqkfVar.c() == null) {
            return;
        }
        dafk a = ckos.a(bykrVar.a.d.c(), string, 0);
        ((TextView) a.e.findViewById(R.id.snackbar_text)).setTextColor(bykrVar.a.Rn().getColor(R.color.gmm_white));
        a.c();
    }
}
