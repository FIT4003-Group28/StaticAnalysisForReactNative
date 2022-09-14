package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ccdr  reason: default package */
/* loaded from: classes4.dex */
public class ccdr implements ccby {
    private final View.OnAttachStateChangeListener a;
    private dcdc<cqix<cccu>> b = dcdc.e();
    private boolean c;

    public ccdr(bvpe bvpeVar) {
        this.a = bvpeVar.b;
    }

    @Override // defpackage.ccby
    public Boolean a() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.ccby
    public dcdc<cqix<cccu>> b() {
        return this.b;
    }

    @Override // defpackage.ccby
    public void c(dcdc<cqix<cccu>> dcdcVar) {
        int k = dcbg.b(dcdcVar).o(ccdq.a).k();
        this.c = k > 0;
        this.b = dcdcVar;
        boolean z = k == 1;
        int size = dcdcVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cqix<cccu> cqixVar = dcdcVar.get(i2);
            if (cqixVar.b().a().booleanValue()) {
                cqixVar.b().i(z);
                cccu b = cqixVar.b();
                ccbl ccblVar = new ccbl();
                int i3 = i + 1;
                ccblVar.a = Integer.valueOf(i);
                ccblVar.b = Integer.valueOf(k);
                String str = ccblVar.a == null ? " cardPosition" : "";
                if (ccblVar.b == null) {
                    str = str.concat(" totalNumCards");
                }
                if (!str.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                ccbm ccbmVar = new ccbm(ccblVar.a.intValue(), ccblVar.b.intValue());
                dbsk.m(ccbmVar.b() > 0, "Non-positive totalNumCards");
                dbsk.m(ccbmVar.a() >= 0 && ccbmVar.a() < ccbmVar.b(), "cardPosition (zero-indexed) is out of range.");
                b.n(ccbmVar);
                i = i3;
            }
        }
    }

    @Override // defpackage.ccby
    @dzsi
    public View.OnAttachStateChangeListener d() {
        return this.a;
    }
}
