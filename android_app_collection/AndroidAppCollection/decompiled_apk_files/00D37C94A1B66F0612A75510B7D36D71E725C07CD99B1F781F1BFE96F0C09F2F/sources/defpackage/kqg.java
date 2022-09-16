package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: kqg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kqg implements akbi {
    public final /* synthetic */ kqk a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqg(kqk kqkVar) {
        this.a = kqkVar;
    }

    public /* synthetic */ kqg(kqk kqkVar, int i) {
        this.b = i;
        this.a = kqkVar;
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        if (this.b == 0) {
            kqk kqkVar = this.a;
            zag.i(kqkVar.ao);
            String trim = kqkVar.ao.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                abat d = kqkVar.ai.d();
                d.i();
                d.u(trim);
                if (kqk.aE(kqkVar.an)) {
                    int bX = awwc.bX(kqkVar.an.e);
                    if (bX == 0) {
                        bX = 1;
                    }
                    d.c = bX;
                } else {
                    d.c = kqkVar.aq.b();
                }
                for (String str : kqkVar.am) {
                    d.t(str);
                }
                if (!kqkVar.al.f.isEmpty()) {
                    d.a = kqkVar.al.f;
                }
                if (!TextUtils.isEmpty(kqkVar.al.g)) {
                    d.b = kqkVar.al.g;
                }
                kqkVar.ai.g(d, new kqj(kqkVar));
            }
            if ((kqkVar.al.b & 8) != 0) {
                kqkVar.ak.d(new kqd());
            }
            kqkVar.dismiss();
            return;
        }
        kqk kqkVar2 = this.a;
        zag.i(kqkVar2.ao);
        kqkVar2.dismiss();
    }
}
