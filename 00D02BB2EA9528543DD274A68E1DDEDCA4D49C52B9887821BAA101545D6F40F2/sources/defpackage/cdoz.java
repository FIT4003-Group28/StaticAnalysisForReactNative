package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.ugc.post.editor.AutoValue_StructuredQuestionAnswer;
import com.google.android.apps.gmm.ugc.post.editor.StructuredQuestionAnswer;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cdoz  reason: default package */
/* loaded from: classes4.dex */
public final class cdoz extends tj<cdom, cdoy> {
    private static final tt<cdom> f = new cdow();
    public final cdjt e;

    public cdoz(cdjt cdjtVar) {
        super(f);
        this.e = cdjtVar;
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ acl d(ViewGroup viewGroup, int i) {
        return new cdoy(this, viewGroup);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(acl aclVar, int i) {
        final cdoy cdoyVar = (cdoy) aclVar;
        final cdom cdomVar = (cdom) this.a.e.get(i);
        cdoyVar.s.setText(cdomVar.a());
        cdoyVar.s.setChecked(cdomVar.b());
        cdoyVar.s.setOnClickListener(new View.OnClickListener(cdoyVar, cdomVar) { // from class: cdox
            private final cdoy a;
            private final cdom b;

            {
                this.a = cdoyVar;
                this.b = cdomVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cdoy cdoyVar2 = this.a;
                cdom cdomVar2 = this.b;
                cdjt cdjtVar = cdoyVar2.t.e;
                drfq d = cdomVar2.d();
                cdjw cdjwVar = cdjtVar.a;
                cdov cdovVar = cdjwVar.b;
                dbsk.s(cdovVar);
                dcdc<cdom> h = cdovVar.a.h();
                dbsk.s(h);
                HashSet hashSet = new HashSet(dcbg.b(h).o(cdos.a).s(cdot.a).B());
                if (cdovVar.d && !hashSet.isEmpty() && !hashSet.contains(d)) {
                    hashSet.clear();
                }
                if (!hashSet.remove(d)) {
                    hashSet.add(d);
                }
                cdovVar.a.g(dcbg.b(h).s(new dbrn(hashSet) { // from class: cdou
                    private final Set a;

                    {
                        this.a = hashSet;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        cdom cdomVar3 = (cdom) obj;
                        return cdomVar3.f(this.a.contains(cdomVar3.d()));
                    }
                }).z());
                cdms cdmsVar = cdjwVar.a;
                if (cdmsVar != null) {
                    dcdc<cdom> h2 = cdjwVar.b.a.h();
                    dbsk.s(h2);
                    drfq drfqVar = cdjwVar.b.e;
                    dbsk.s(drfqVar);
                    cdkb<StructuredQuestionAnswer> cdkbVar = cdmsVar.n;
                    StructuredQuestionAnswer h3 = cdkbVar.h();
                    dbsk.s(h3);
                    dcep B = dcbg.b(h2).o(cdmb.a).s(cdmc.a).B();
                    dcgn<drfq, drfq> b = h3.b();
                    b.N(drfqVar, B);
                    dcgn O = dcgn.O();
                    for (Map.Entry<drfq, drfq> entry : b.d()) {
                        O.n(bvrt.b(entry.getKey()), bvrt.b(entry.getValue()));
                    }
                    cdkbVar.g(new AutoValue_StructuredQuestionAnswer(O));
                }
            }
        });
    }
}
