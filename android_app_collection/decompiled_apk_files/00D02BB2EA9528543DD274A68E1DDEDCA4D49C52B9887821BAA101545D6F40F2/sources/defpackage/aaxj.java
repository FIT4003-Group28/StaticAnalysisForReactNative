package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aaxj  reason: default package */
/* loaded from: classes2.dex */
public class aaxj implements aawo {
    public final dbty<Boolean> a;
    private final aaxt c;
    private final List<aawu> b = new ArrayList();
    private final dbty<cjtd> d = dbud.a(new dbty(this) { // from class: aaxi
        private final aaxj a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            aaxj aaxjVar = this.a;
            cjta b = cjtd.b();
            b.d = dtxo.bD;
            if (aaxjVar.a.a().booleanValue()) {
                b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            }
            return b.a();
        }
    });

    public aaxj(final btvo btvoVar, aaxt aaxtVar) {
        this.c = aaxtVar;
        this.a = dbud.a(new dbty(btvoVar) { // from class: aaxh
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dkiy enableFeatureParameters = this.a.getEnableFeatureParameters();
                return Boolean.valueOf(enableFeatureParameters.g == 399 ? ((Boolean) enableFeatureParameters.h).booleanValue() : false);
            }
        });
    }

    @Override // defpackage.aawo
    public List<aawu> a() {
        return this.b;
    }

    @Override // defpackage.aawo
    public cjtd b() {
        return this.d.a();
    }

    @Override // defpackage.aakt
    public Boolean c() {
        boolean z = false;
        if (!this.b.isEmpty() && !this.a.a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void d(diwb diwbVar) {
        this.b.clear();
        for (dpzw dpzwVar : diwbVar.m) {
            List<aawu> list = this.b;
            aaxt aaxtVar = this.c;
            dxio a = ((dxjh) aaxtVar.a).a();
            aaxt.a(a, 1);
            aaxv a2 = aaxtVar.b.a();
            aaxt.a(a2, 2);
            Activity activity = (Activity) ((dxjd) aaxtVar.c).a;
            aaxt.a(activity, 3);
            aaxt.a(dpzwVar, 4);
            list.add(new aaxs(a, a2, activity, dpzwVar));
        }
    }
}
