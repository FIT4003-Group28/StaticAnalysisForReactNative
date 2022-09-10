package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cssx  reason: default package */
/* loaded from: classes5.dex */
public final class cssx extends tj<cumf, cuue> implements cuuf {
    public final cuug e;
    public final Map<String, Integer> f;
    public final SparseArray<cumh> g;
    public int h;
    private final ConversationId i;
    private final cuue j;
    private final cusr<dcdc<cugb>> k;
    private cuss<dcdc<cugb>> l;
    private final ctcu m;

    public cssx(cuug cuugVar, Context context, ConversationId conversationId, ctcu ctcuVar) {
        super(new cssv());
        this.k = new cusr(this) { // from class: cssu
            private final cssx a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                cssx cssxVar = this.a;
                dcdc dcdcVar = (dcdc) obj;
                ArrayList arrayList = new ArrayList();
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    cugb cugbVar = (cugb) dcdcVar.get(i);
                    cumf cumfVar = null;
                    if (cugbVar.a().f().a() == 3) {
                        String a = cugbVar.a().f().b().a();
                        if ((!cssxVar.f.containsKey(a) ? null : cssxVar.g.get(cssxVar.f.get(a).intValue())) != null) {
                            dbsg<cukp> b = cuiq.b(cugbVar.a());
                            if (!b.a()) {
                                cstl.a("PhotosAttchPrev");
                            } else {
                                cumfVar = new cumf(b.b(), cugbVar.a().a());
                            }
                        }
                    }
                    if (cumfVar != null) {
                        arrayList.add(cumfVar);
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    cumf cumfVar2 = (cumf) arrayList.get(i2);
                    int size2 = arrayList.size();
                    cumfVar2.c = i2;
                    cumfVar2.d = size2;
                }
                cssxVar.a(arrayList);
            }
        };
        this.h = 0;
        this.e = cuugVar;
        this.i = conversationId;
        this.m = ctcuVar;
        this.f = new HashMap();
        this.g = new SparseArray<>();
        this.j = new cssw(new View(context));
        cuugVar.setPresenter(this);
    }

    @Override // defpackage.cuvu
    public final void A() {
        cuss<dcdc<cugb>> cussVar = this.l;
        if (cussVar != null) {
            cussVar.g(this.k);
            this.l = null;
        }
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ acl d(ViewGroup viewGroup, int i) {
        cumh cumhVar = this.g.get(i);
        return cumhVar == null ? this.j : new cumj(cumhVar.a, cumhVar.c, new cumg(cumhVar));
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(acl aclVar, int i) {
        ((cuue) aclVar).C(b(i));
    }

    @Override // defpackage.abg
    public final int i(int i) {
        b(i);
        if (this.f.get("photos") == null) {
            throw new IllegalStateException("getItemViewType - AttachmentPreviewsInterface not provided to handle attachment type: ".concat("photos"));
        }
        return this.f.get("photos").intValue();
    }

    @Override // defpackage.cuuf
    public final abg<cuue> y() {
        return this;
    }

    @Override // defpackage.cuvu
    public final void z() {
        cuss<dcdc<cugb>> a = this.m.a(this.i);
        this.l = a;
        a.q(this.k);
    }
}
