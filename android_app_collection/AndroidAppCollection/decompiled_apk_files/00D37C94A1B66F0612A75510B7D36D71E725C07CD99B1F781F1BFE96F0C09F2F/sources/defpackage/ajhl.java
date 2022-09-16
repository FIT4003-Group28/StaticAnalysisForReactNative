package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajhl  reason: default package */
/* loaded from: classes.dex */
public final class ajhl implements ajru {
    public ajhh a;
    private dci b;
    private final Context c;
    private final ajke d;
    private aypf e;
    private boolean f;
    private final swq g;

    public ajhl(Context context, swq swqVar, ajjr ajjrVar) {
        this.c = context;
        this.g = swqVar;
        this.d = ajjrVar.a();
    }

    @Override // defpackage.ajru
    public final View a() {
        if (this.b == null) {
            this.b = new dci(this.c);
        }
        return this.b;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, ajhh ajhhVar) {
        e(ajrsVar, ajhhVar, false);
    }

    public final void e(ajrs ajrsVar, ajhh ajhhVar, boolean z) {
        View a = a();
        ((ComponentHost) a).setTag(R.id.elements_navigation_args, ajrsVar.e());
        Object c = ajrsVar.c("PresenterPreparerContextDecoratorKey");
        if (c instanceof ajhj) {
            ((dci) a).G(((ajhj) c).a());
            this.f = false;
            return;
        }
        dci dciVar = (dci) a;
        cyv cyvVar = dciVar.t;
        final acti actiVar = ajrsVar.a;
        final asjj asjjVar = ajrsVar.c;
        ajhh ajhhVar2 = this.a;
        if (ajhhVar2 == null) {
            ajhhVar2 = ajhhVar;
        }
        tdy a2 = tdz.a(this.g.a);
        tem a3 = ten.a();
        a3.b(this.d.B);
        a2.f = a3.a();
        a2.b(z);
        if (this.d.l) {
            acte acteVar = null;
            if (ajhhVar instanceof ajhh) {
                aqtb aqtbVar = ajhhVar.a;
                if ((aqtbVar.b & 8) != 0 && aqtbVar.e.d() > 0) {
                    acteVar = new acte(aqtbVar.e);
                }
            }
            cyvVar.a();
            a2.d = new acuq(actiVar, acteVar);
        }
        tcz a4 = tda.a();
        a4.p = a2.a();
        a4.a = a;
        a4.l = amuk.r(ajjh.d(ajhhVar2, asjjVar));
        tda a5 = a4.a();
        aypf aypfVar = this.e;
        if (aypfVar != null) {
            aypfVar.qr();
        }
        aypf aypfVar2 = new aypf();
        this.e = aypfVar2;
        czf c2 = ComponentTree.c(cyvVar, this.g.b(cyvVar, a5, ajhhVar, new tdi() { // from class: ajjj
            @Override // defpackage.tdi
            public final tdh a(tdq tdqVar) {
                return new ajjk(tdqVar, acti.this, asjjVar);
            }
        }, aypfVar2));
        c2.d = z;
        dciVar.G(c2.a());
        this.f = true;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        dci dciVar = this.b;
        if (dciVar != null) {
            if (this.f) {
                dciVar.E();
            }
            this.b.K();
            this.b.G(null);
            this.b.setTag(R.id.elements_navigation_args, null);
        }
        aypf aypfVar = this.e;
        if (aypfVar != null) {
            aypfVar.qr();
            this.e = null;
        }
    }
}
