package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: agqq  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class agqq implements cqjb {
    static final cqjb a = new agqq();

    private agqq() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqss f;
        agww agwwVar = (agww) cqkpVar;
        dcqe dcqeVar = agqs.a;
        cqtd[] cqtdVarArr = new cqtd[3];
        cqtdVarArr[0] = cqrt.j(iup.e(R.raw.localstream_bookmark_frame_svg), agwwVar.e().booleanValue() ? cqta.f() : agqs.b);
        cqtd e = iup.e(R.raw.localstream_bookmark_background_svg);
        if (agwwVar.e().booleanValue()) {
            f = agwwVar.d();
        } else {
            f = cqta.f();
        }
        cqtdVarArr[1] = cqrt.j(e, f);
        cqtdVarArr[2] = iva.e(agwwVar.c(), cqrt.j(agwwVar.c(), agwwVar.e().booleanValue() ? ibl.b() : cqta.f()));
        return cqtt.d(cqtdVarArr).a(context);
    }
}
