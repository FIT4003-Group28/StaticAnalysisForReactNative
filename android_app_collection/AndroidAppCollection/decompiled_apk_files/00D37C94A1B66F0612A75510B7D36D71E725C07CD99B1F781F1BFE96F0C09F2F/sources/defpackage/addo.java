package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
/* compiled from: PG */
/* renamed from: addo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class addo implements View.OnClickListener {
    public final /* synthetic */ addu a;
    private final /* synthetic */ int b;

    public /* synthetic */ addo(addu adduVar) {
        this.a = adduVar;
    }

    public /* synthetic */ addo(addu adduVar, int i) {
        this.b = i;
        this.a = adduVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            addu adduVar = this.a;
            if (!adduVar.u) {
                adduVar.g.H(3, new acte(acuo.b(27851)), null);
                adduVar.a.mJ().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                return;
            }
            adduVar.g.H(3, new acte(acuo.b(27852)), null);
            adduVar.a();
        } else if (i == 1) {
            final addu adduVar2 = this.a;
            final bhc bhcVar = (bhc) view.getTag();
            if (!bhcVar.m()) {
                adduVar2.g.H(3, new acte(acuo.b(27847)), null);
                if (adduVar2.f.a(false, new adez() { // from class: addp
                    @Override // defpackage.adez
                    public final void a() {
                        addu.this.b(bhcVar);
                    }
                }, "")) {
                    return;
                }
                adduVar2.b(bhcVar);
                return;
            }
            adduVar2.g.H(3, new acte(acuo.b(27848)), null);
            adduVar2.d.S();
        } else if (i == 2) {
            addu adduVar3 = this.a;
            adduVar3.g.H(3, new acte(acuo.b(27849)), null);
            aczo.a(adduVar3.a.mJ(), PairWithTvActivity.class, 1);
        } else if (i == 3) {
            addu adduVar4 = this.a;
            adduVar4.g.H(3, new acte(acuo.b(27853)), null);
            aczo.a(adduVar4.a.mJ(), PairWithTvActivity.class, 2);
        } else {
            addu adduVar5 = this.a;
            adduVar5.g.H(3, new acte(acuo.b(27852)), null);
            adduVar5.a();
        }
    }
}
