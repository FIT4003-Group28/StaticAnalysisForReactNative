package defpackage;

import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdjz  reason: default package */
/* loaded from: classes3.dex */
public class bdjz implements bdjw, bdjt {
    private final List<bdju> b;
    private final bdjv c;
    private bbvn e;
    private dwgq d = dwgq.UNKNOWN_UGC_COMPLAINT_CATEGORY;
    public String a = "";

    public bdjz(cqhn cqhnVar, bdjv bdjvVar, bbvn bbvnVar) {
        this.e = bbvn.d;
        dccx F = dcdc.F();
        F.g(dwgq.UGC_OFFENSIVE);
        F.g(dwgq.UGC_COPYRIGHT);
        F.g(dwgq.UGC_PRIVATE);
        F.g(dwgq.UGC_IMAGE_QUALITY);
        if (!bbvnVar.c) {
            F.g(dwgq.UGC_IRRELEVANT_BUSINESS);
        }
        if (!bbvnVar.b) {
            F.g(dwgq.UGC_OTHER);
        }
        dcdc f = F.f();
        dccx dccxVar = new dccx();
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dwgq.UGC_OFFENSIVE, Integer.valueOf((int) R.string.IMAGERY_RAP_OFFENSIVE));
        dcdgVar.f(dwgq.UGC_COPYRIGHT, Integer.valueOf((int) R.string.IMAGERY_RAP_COPYRIGHT_OR_LEGAL_ISSUE));
        dcdgVar.f(dwgq.UGC_PRIVATE, Integer.valueOf((int) R.string.IMAGERY_RAP_PRIVACY));
        dcdgVar.f(dwgq.UGC_IMAGE_QUALITY, Integer.valueOf((int) R.string.IMAGERY_RAP_QUALITY));
        dcdgVar.f(dwgq.UGC_IRRELEVANT_BUSINESS, Integer.valueOf((int) R.string.IMAGERY_RAP_NOT_OF_PLACE));
        dcdgVar.f(dwgq.UGC_OTHER, Integer.valueOf((int) R.string.IMAGERY_RAP_OTHER));
        dcdn b = dcdgVar.b();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            dwgq dwgqVar = (dwgq) f.get(i);
            Integer num = (Integer) b.get(dwgqVar);
            if (num == null) {
                String valueOf = String.valueOf(dwgqVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Cannot find category from the map: ");
                sb.append(valueOf);
                bvoo.f(new IllegalStateException(sb.toString()));
            } else {
                dccxVar.g(new bdjx(num.intValue(), dwgqVar, this));
            }
        }
        this.b = dccxVar.f();
        this.c = bdjvVar;
        this.e = bbvnVar;
    }

    @Override // defpackage.bdjt
    public void a(bdju bdjuVar) {
        if (this.d == bdjuVar.b()) {
            return;
        }
        this.d = bdjuVar.b();
        Iterator<bdju> it = this.b.iterator();
        while (it.hasNext()) {
            bdju next = it.next();
            next.d(next == bdjuVar);
        }
        cqkx.p(this);
        if (!c().booleanValue()) {
            return;
        }
        this.c.g();
    }

    @Override // defpackage.bdjw
    public List<bdju> b() {
        return this.b;
    }

    @Override // defpackage.bdjw
    public Boolean c() {
        return Boolean.valueOf(g() == dwgq.UGC_OTHER);
    }

    @Override // defpackage.bdjw
    public Boolean d() {
        return Boolean.valueOf(this.e.b);
    }

    @Override // defpackage.bdjw
    public cqgl e() {
        return new cqgl(this) { // from class: bdjy
            private final bdjz a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                bdjz bdjzVar = this.a;
                boolean d = dbsj.d(bdjzVar.a);
                boolean d2 = dbsj.d(charSequence.toString());
                bdjzVar.a = charSequence.toString();
                if (d != d2) {
                    cqkx.p(bdjzVar);
                }
            }
        };
    }

    public CharSequence f() {
        return this.a;
    }

    public dwgq g() {
        return this.d;
    }
}
