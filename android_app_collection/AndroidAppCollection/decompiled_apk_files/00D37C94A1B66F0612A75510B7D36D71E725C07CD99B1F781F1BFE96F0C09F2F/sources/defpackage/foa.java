package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
/* compiled from: PG */
/* renamed from: foa  reason: default package */
/* loaded from: classes3.dex */
public final class foa implements View.OnClickListener {
    public final ImageView a;
    private final ajxz b;
    private final akfb c;
    private final ajsk d;
    private avbl e;
    private acti f;
    private final SubscriptionNotificationOptionsDialogFragmentControllerImpl g;

    public foa(SubscriptionNotificationOptionsDialogFragmentControllerImpl subscriptionNotificationOptionsDialogFragmentControllerImpl, ajxz ajxzVar, akfb akfbVar, ajsk ajskVar, ImageView imageView) {
        this.g = subscriptionNotificationOptionsDialogFragmentControllerImpl;
        this.b = ajxzVar;
        this.c = akfbVar;
        this.d = ajskVar;
        this.a = imageView;
        imageView.setOnClickListener(this);
    }

    public final void a() {
        this.a.setVisibility(8);
    }

    public final void c() {
        argj argjVar;
        if (this.e == null) {
            return;
        }
        this.a.setVisibility(0);
        avbl avblVar = this.e;
        if ((avblVar.b & 128) == 0) {
            return;
        }
        akfb akfbVar = this.c;
        avbk avbkVar = avblVar.j;
        if (avbkVar == null) {
            avbkVar = avbk.a;
        }
        if (avbkVar.b == 102716411) {
            argjVar = (argj) avbkVar.c;
        } else {
            argjVar = argj.a;
        }
        ImageView imageView = this.a;
        avbk avbkVar2 = this.e.j;
        if (avbkVar2 == null) {
            avbkVar2 = avbk.a;
        }
        akfbVar.b(argjVar, imageView, avbkVar2, this.f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        avbl avblVar = this.e;
        if (avblVar != null) {
            acti actiVar = this.f;
            if (actiVar != null && (avblVar.b & 4) != 0) {
                actiVar.H(3, new acte(avblVar.e), null);
            }
            this.g.g(this.e);
        }
    }

    public final void b(avbl avblVar, acti actiVar) {
        this.e = avblVar;
        this.f = actiVar;
        if (avblVar == null || (avblVar.b & 16) == 0) {
            a();
            return;
        }
        if (actiVar != null) {
            actiVar.u(new acte(avblVar.e), null);
        }
        ImageView imageView = this.a;
        ajxz ajxzVar = this.b;
        arhs arhsVar = avblVar.g;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        imageView.setImageResource(ajxzVar.a(b));
        aovs aovsVar = avblVar.k;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((aovsVar.b & 1) == 0) {
            this.a.setContentDescription(null);
        } else {
            ImageView imageView2 = this.a;
            aovs aovsVar2 = avblVar.k;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar = aovsVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            imageView2.setContentDescription(aovrVar.c);
        }
        c();
        this.d.a(avblVar, this.a);
    }
}
