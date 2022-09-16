package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adpj  reason: default package */
/* loaded from: classes.dex */
public final class adpj extends Handler {
    final /* synthetic */ adpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpj(adpl adplVar, Looper looper) {
        super(looper);
        this.a = adplVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 3) {
            if (!this.a.ab()) {
                return;
            }
            int a = this.a.j.a();
            if (a == 2 || a == 1) {
                this.a.j.j(true);
            }
            String valueOf = String.valueOf(this.a.x.e);
            if (valueOf.length() != 0) {
                "Connecting to ".concat(valueOf);
            }
            adpl adplVar = this.a;
            adib an = adplVar.an(adplVar.x);
            if (an == null || (!an.h() && !an.b.h())) {
                String str = adpl.a;
                String valueOf2 = String.valueOf(this.a.x.e);
                zep.c(str, valueOf2.length() != 0 ? "Couldn't obtain token for ".concat(valueOf2) : new String("Couldn't obtain token for "));
                this.a.D(atcv.MDX_SESSION_DISCONNECT_REASON_CLOUD_NO_LOUNGE_TOKEN);
                return;
            }
            adpl adplVar2 = this.a;
            int i2 = adplVar2.w.am.i;
            if (i2 == 0) {
                throw null;
            }
            if (i2 != 3) {
                adplVar2.ak.c(11);
            }
            adpl adplVar3 = this.a;
            adplVar3.at(an, adplVar3.F);
            return;
        }
        final boolean z = false;
        if (i == 4) {
            if (this.a.aE()) {
                return;
            }
            String valueOf3 = String.valueOf(this.a.x.e);
            if (valueOf3.length() != 0) {
                "Disconnecting from ".concat(valueOf3);
            }
            boolean z2 = ((adph) message.obj).a;
            if (z2 && !this.a.ad()) {
                adpl adplVar4 = this.a;
                if (adplVar4.u) {
                    zag.r(this.a.e, adplVar4.e.getString(R.string.shared_queue_disconnect_toast), 1);
                }
            }
            adpl adplVar5 = this.a;
            adplVar5.ar(adplVar5.e, z2);
            if (z2 && this.a.ad()) {
                z = true;
            }
            this.a.aB(2);
            this.a.o.c("c_d");
            this.a.g.d(new adai());
            this.a.p.c("mdx_off");
            adpl adplVar6 = this.a;
            if (adplVar6.r == 1 && adplVar6.I != null) {
                adplVar6.I.post(new adpc(adplVar6));
            }
            if (this.a.w.am.i == 4) {
                return;
            }
            final ConditionVariable conditionVariable = new ConditionVariable();
            ylr.b();
            this.a.f.post(new Runnable() { // from class: adpi
                @Override // java.lang.Runnable
                public final void run() {
                    adpj adpjVar = adpj.this;
                    boolean z3 = z;
                    ConditionVariable conditionVariable2 = conditionVariable;
                    adpjVar.a.w.av(z3);
                    conditionVariable2.open();
                }
            });
            conditionVariable.block();
        } else if (i != 5 || this.a.aE() || this.a.aF()) {
        } else {
            this.a.aB(3);
            String valueOf4 = String.valueOf(this.a.x.e);
            if (valueOf4.length() != 0) {
                "Received gracefulReconnect from ".concat(valueOf4);
            }
            adpl adplVar7 = this.a;
            adplVar7.ar(adplVar7.e, false);
            this.a.j.g();
            String valueOf5 = String.valueOf(this.a.x.e);
            if (valueOf5.length() != 0) {
                "Reconnecting to ".concat(valueOf5);
            }
            adpl adplVar8 = this.a;
            adib an2 = adplVar8.an(adplVar8.x);
            if (an2 == null || !an2.h()) {
                String str2 = adpl.a;
                String valueOf6 = String.valueOf(this.a.x.e);
                zep.c(str2, valueOf6.length() != 0 ? "Couldn't obtain token for ".concat(valueOf6) : new String("Couldn't obtain token for "));
                this.a.D(atcv.MDX_SESSION_DISCONNECT_REASON_CLOUD_NO_LOUNGE_TOKEN);
                return;
            }
            adpl adplVar9 = this.a;
            adplVar9.at(an2, adplVar9.F);
        }
    }
}
