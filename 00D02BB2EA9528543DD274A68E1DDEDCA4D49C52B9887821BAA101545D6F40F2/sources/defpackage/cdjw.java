package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.ugc.post.editor.StructuredQuestionAnswer;
import com.google.android.apps.maps.R;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cdjw  reason: default package */
/* loaded from: classes4.dex */
public final class cdjw extends ges {
    public cdms a;
    public cdov b;
    private cdoz c;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.chips_fragment, viewGroup, false);
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        fd fdVar = this.D;
        if (fdVar != null) {
            cdms cdmsVar = (cdms) new au(fdVar).a(cdms.class);
            this.a = cdmsVar;
            cdmsVar.n.b(x(), new aa(this) { // from class: cdjv
                private final cdjw a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    StructuredQuestionAnswer structuredQuestionAnswer = (StructuredQuestionAnswer) obj;
                    cdov cdovVar = this.a.b;
                    dbsk.s(cdovVar);
                    drfq drfqVar = cdovVar.e;
                    if (drfqVar == null) {
                        return;
                    }
                    final Set<drfq> c = structuredQuestionAnswer.b().f(drfqVar);
                    z<dcdc<cdom>> zVar = cdovVar.a;
                    dcdc<cdom> h = zVar.h();
                    dbsk.s(h);
                    zVar.g(dcbg.b(h).s(new dbrn(c) { // from class: cdor
                        private final Set a;

                        {
                            this.a = c;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            cdom cdomVar = (cdom) obj2;
                            return cdomVar.f(this.a.contains(cdomVar.d()));
                        }
                    }).z());
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.chipList);
        recyclerView.setAdapter(this.c);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(H()));
        recyclerView.setItemAnimator(null);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        this.b = (cdov) new au(this).a(cdov.class);
        this.c = new cdoz(new cdjt(this));
        cdov cdovVar = this.b;
        Serializable serializable = this.o.getSerializable("component");
        dbsk.s(serializable);
        cdop cdopVar = (cdop) serializable;
        z<dcdc<cdom>> zVar = cdovVar.a;
        dcbg b = dcbg.b(cdopVar.b());
        boolean c = cdopVar.c();
        int k = b.o(cdon.a).k();
        if (!c && k > 1) {
            b = b.s(cdoo.a);
        }
        zVar.g(((cdoi) cdop.f(cdopVar.a(), b.z(), c, cdopVar.e())).a);
        cdovVar.d = !cdopVar.c();
        cdovVar.e = cdopVar.e();
        z<dcdc<cdom>> zVar2 = this.b.a;
        final cdoz cdozVar = this.c;
        cdozVar.getClass();
        zVar2.b(this, new aa(cdozVar) { // from class: cdju
            private final cdoz a;

            {
                this.a = cdozVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.a((dcdc) obj);
            }
        });
    }
}
