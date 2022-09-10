package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassificationManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bxuq  reason: default package */
/* loaded from: classes4.dex */
public final class bxuq {
    public final boolean a;
    public final long b;
    public final ckhe c;
    public final bxul d;
    public final btrm e;
    @dzsi
    public bxuk f;
    @dzsi
    public cryo g;
    @dzsi
    public final cryr h;
    private final boolean i;

    public bxuq(Context context, bxul bxulVar, dehq dehqVar, btvo btvoVar, ckcw ckcwVar, btrm btrmVar) {
        this.c = (ckhe) ckcwVar.a(ckjw.au);
        this.d = bxulVar;
        this.e = btrmVar;
        boolean z = true;
        boolean z2 = Build.VERSION.SDK_INT >= 28;
        this.i = z2;
        boolean z3 = btvoVar.getSuggestParameters().j && Build.VERSION.SDK_INT >= 28;
        this.a = (!z3 || !btvoVar.getSuggestParameters().u) ? false : z;
        this.b = btvoVar.getSuggestParameters().c;
        boolean z4 = btvoVar.getSuggestParameters().j;
        this.h = z2 ? new cryr(new cryt(new cryu(context, (ClipboardManager) context.getSystemService("clipboard")), ((TextClassificationManager) context.getSystemService(TextClassificationManager.class)).getTextClassifier(), dehqVar, z3)) : null;
    }

    public final dehn<Void> a() {
        if (!this.i) {
            this.f = null;
            return deha.a(null);
        }
        this.c.a();
        dbsk.s(this.h);
        final cryw<CharSequence> crywVar = this.h.a;
        return deee.g(deew.h(degp.q(deha.h(crywVar.a.c(new Callable(crywVar) { // from class: cryv
            private final cryw a;

            {
                this.a = crywVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cryw crywVar2 = this.a;
                return crywVar2.a(crywVar2.b.a());
            }
        }), 100L, TimeUnit.MILLISECONDS, crywVar.a)), new dbrn(this) { // from class: bxum
            private final bxuq a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final bxuq bxuqVar = this.a;
                cryo cryoVar = (cryo) obj;
                bxuqVar.c.c();
                bxuqVar.g = cryoVar;
                dcdc q = dcdc.q(dcft.i(bxuqVar.g.a(), new dbsl(bxuqVar) { // from class: bxuo
                    private final bxuq a;

                    {
                        this.a = bxuqVar;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj2) {
                        return ((crym) obj2).d() <= this.a.b;
                    }
                }));
                if (bxuqVar.a && !q.isEmpty()) {
                    if (((crym) q.get(0)).a() == cryl.RESTAURANT) {
                        bxuqVar.e.b(new bxub());
                    }
                    q = dcdc.q(dcft.i(q, bxup.a));
                }
                if (q.isEmpty()) {
                    bxuqVar.f = null;
                } else {
                    crym crymVar = (crym) q.get(0);
                    bxuk bxukVar = bxuqVar.f;
                    if (bxukVar == null || !bxukVar.g().equals(crymVar)) {
                        bxul bxulVar = bxuqVar.d;
                        ff ffVar = (ff) ((dxjd) bxulVar.a).a;
                        bxul.a(ffVar, 1);
                        dxio a = ((dxjh) bxulVar.b).a();
                        bxul.a(a, 2);
                        gft gftVar = (gft) ((dxjd) bxulVar.c).a;
                        bxul.a(gftVar, 3);
                        cjqy a2 = bxulVar.d.a();
                        bxul.a(a2, 4);
                        bxul.a(crymVar, 5);
                        bxuqVar.f = new bxuk(ffVar, a, gftVar, a2, crymVar);
                    }
                }
                if (cryoVar.b().a()) {
                    bxuqVar.e.b(new bxua());
                }
                return null;
            }
        }, dege.a), Throwable.class, new dbrn(this) { // from class: bxun
            private final bxuq a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bxuq bxuqVar = this.a;
                Throwable th = (Throwable) obj;
                bxuqVar.c.c();
                bxuqVar.f = null;
                return null;
            }
        }, dege.a);
    }
}
