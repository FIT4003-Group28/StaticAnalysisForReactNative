package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mhu  reason: default package */
/* loaded from: classes3.dex */
public final class mhu extends kqs {
    private final ajrx o;
    private final jra p;
    private final ajrp q;
    private jqz r;

    public mhu(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar, jra jraVar, jkv jkvVar) {
        super(context, ajmyVar, ajycVar, R.layout.compact_playlist_item, ajxzVar, null, jkvVar, null);
        this.o = gemVar;
        this.p = jraVar;
        gemVar.c(this.d);
        this.q = new ajrp(aafoVar, gemVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.o).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0216  */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhu.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.kqs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.q.c();
        jqz jqzVar = this.r;
        if (jqzVar != null) {
            jqzVar.r.cancel(false);
            jqzVar.c.m(jqzVar);
            jqzVar.f.b(jqzVar.k);
            zag.o(jqzVar.i, true);
            jqzVar.j.setTextColor(jqzVar.l);
            TextView textView = jqzVar.j;
            textView.setTypeface(textView.getTypeface(), 0);
            zag.o(jqzVar.j, false);
            ajrx ajrxVar = jqzVar.n;
            if (ajrxVar != null) {
                ajrxVar.d(jqzVar.e);
            }
            jqzVar.m = null;
            jqzVar.n = null;
            jqzVar.o = null;
            jqzVar.p = null;
            jqzVar.q = null;
            this.r = null;
        }
    }
}
