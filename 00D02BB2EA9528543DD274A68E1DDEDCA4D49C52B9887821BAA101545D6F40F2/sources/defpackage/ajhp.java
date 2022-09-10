package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: ajhp  reason: default package */
/* loaded from: classes2.dex */
public final class ajhp extends fd implements ajik {
    public static final dcqe a = dcqe.c("ajhp");
    public akfa ad;
    private dehn<dqzv> ae;
    public int b = 0;
    public dqzv c;
    public String d;
    public ajij e;
    public ajtg f;
    public bvrb g;

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final void aq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.aq(str, fileDescriptor, printWriter, strArr);
        String name = ajhp.class.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append(name);
        sb.append(":");
        printWriter.println(sb.toString());
        int i = this.b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 19);
        sb2.append(str);
        sb2.append("  state=");
        sb2.append(i);
        printWriter.println(sb2.toString());
        String valueOf = String.valueOf(this.c);
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(valueOf).length());
        sb3.append(str);
        sb3.append("  pendingShareAcl=");
        sb3.append(valueOf);
        printWriter.println(sb3.toString());
        String hexString = Integer.toHexString(System.identityHashCode(this.e));
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(hexString).length());
        sb4.append(str);
        sb4.append("  listener=");
        sb4.append(hexString);
        printWriter.println(sb4.toString());
    }

    public final void d(final btlu btluVar) {
        dbsk.l(this.b == 1);
        dbsk.l(this.c != null);
        final ajtg ajtgVar = this.f;
        final dqzv dqzvVar = this.c;
        dbsk.s(dqzvVar);
        ditf bZ = ditg.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ditg ditgVar = (ditg) bZ.b;
        dqzvVar.getClass();
        ditgVar.b = dqzvVar;
        ditgVar.a |= 1;
        final deig d = deig.d();
        ajtgVar.f.a(new aihq(new eapd(ajtgVar.e.b()), dqzvVar, true), dbsg.i(btluVar));
        ajtgVar.a.a().e = btluVar;
        ajtgVar.a.c().a(bZ.bK(), new ajte(ajtgVar, btluVar, dqzvVar, d), bvrj.UI_THREAD);
        d.Pk(new Runnable(ajtgVar, btluVar, dqzvVar, d) { // from class: ajtd
            private final ajtg a;
            private final btlu b;
            private final dqzv c;
            private final deig d;

            {
                this.a = ajtgVar;
                this.b = btluVar;
                this.c = dqzvVar;
                this.d = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajtg ajtgVar2 = this.a;
                ajtgVar2.d.add(new ajsp(this.b, ajtgVar2.e.b(), this.c, (dqzv) deha.s(this.d)));
            }
        }, ajtgVar.b.h());
        this.ae = d;
        d.Pk(new Runnable(this) { // from class: ajho
            private final ajhp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        }, this.g.h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        try {
            dehn<dqzv> dehnVar = this.ae;
            dbsk.s(dehnVar);
            dqzv dqzvVar = (dqzv) deha.r(dehnVar);
            ajij ajijVar = this.e;
            if (ajijVar == null) {
                return;
            }
            ajijVar.g(dbsg.j(dqzvVar));
        } catch (CancellationException unused) {
        } catch (ExecutionException unused2) {
            ajij ajijVar2 = this.e;
            if (ajijVar2 == null) {
                return;
            }
            ajijVar2.g(dbpy.a);
        }
    }

    @Override // defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        aG();
        if (bundle == null) {
            return;
        }
        dbsk.l(bundle.containsKey("state"));
        int i = bundle.getInt("state");
        this.b = i;
        if (i != 0) {
            this.b = 0;
            return;
        }
        dbsk.l(bundle.containsKey("account_id"));
        this.d = bundle.getString("account_id");
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        if (this.b != 0) {
            this.g.b(new Runnable(this) { // from class: ajhn
                private final ajhp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajhp ajhpVar = this.a;
                    dbsk.s(ajhpVar.d);
                    btlu n = ajhpVar.ad.n(ajhpVar.d);
                    dbsk.s(n);
                    if (ajhpVar.D()) {
                        return;
                    }
                    ajhpVar.d(n);
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putInt("state", this.b);
        bundle.putString("account_id", this.d);
        dehn<dqzv> dehnVar = this.ae;
        if (dehnVar == null || dehnVar.isDone()) {
            return;
        }
        this.ae.cancel(true);
    }
}
