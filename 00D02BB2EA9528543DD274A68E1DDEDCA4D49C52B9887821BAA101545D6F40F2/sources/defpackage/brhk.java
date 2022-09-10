package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: brhk  reason: default package */
/* loaded from: classes.dex */
public final class brhk extends afhx {
    public static final dbsl<afga> a = brhj.a;
    private final bqji b;

    public brhk(Intent intent, String str, bqji bqjiVar) {
        super(intent, str, afid.WRITE_REVIEW);
        this.b = bqjiVar;
    }

    public static dbsg<ilo> d(Intent intent) {
        if (intent.getData() != null) {
            Uri data = intent.getData();
            dbsk.s(data);
            if (data.isHierarchical()) {
                try {
                    Uri data2 = intent.getData();
                    dbsk.s(data2);
                    return dbsg.j(data2.getQueryParameter("placeid")).h(brhf.a).h(brhg.a).h(brhh.a).h(brhi.a);
                } catch (IllegalArgumentException unused) {
                    return dbpy.a;
                }
            }
        }
        return dbpy.a;
    }

    @Override // defpackage.afhx
    public final void a() {
        ddhv ddhvVar;
        dbsg<ilo> d = d(this.f);
        if (!d.a()) {
            return;
        }
        bqji bqjiVar = this.b;
        bwrs<ilo> a2 = bwrs.a(d.b());
        bqjf r = bqjh.r();
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.f.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        r.f(bZ.bK());
        Intent intent = this.f;
        if (intent.getData() == null) {
            ddhvVar = ddhv.UNKNOWN;
        } else {
            Uri data = intent.getData();
            dbsk.s(data);
            String queryParameter = data.getQueryParameter("source");
            if (queryParameter == null || !queryParameter.startsWith("g.page")) {
                ddhvVar = ddhv.INTENT_URL;
            } else {
                ddhvVar = ddhv.VANITY_URL;
            }
        }
        ((bqir) r).f = dbsg.i(ddhvVar);
        bqjiVar.b(a2, r.o());
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_REVIEWS_EDITOR;
    }
}
