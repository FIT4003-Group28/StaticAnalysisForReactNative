package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.processing.api.CancelSharesRetainController$Result;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import com.google.android.apps.maps.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: ajfp  reason: default package */
/* loaded from: classes2.dex */
public final class ajfp extends fd implements ajhu {
    public static final dcqe a = dcqe.c("ajfp");
    public ajsu ad;
    public aijc ae;
    public bvrb af;
    public akfa ag;
    public List<dqzv> b;
    @dzsi
    public String e;
    @dzsi
    public ajht f;
    public ArrayList<CancelSharesRetainController$Result> c = new ArrayList<>();
    private final List<dehn<Integer>> ah = new ArrayList();
    public int d = 0;
    public boolean g = false;
    private final Object ai = new Object();

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final void aq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.aq(str, fileDescriptor, printWriter, strArr);
        String name = ajfp.class.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append(name);
        sb.append(":");
        printWriter.println(sb.toString());
        int i = this.d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 19);
        sb2.append(str);
        sb2.append("  state=");
        sb2.append(i);
        printWriter.println(sb2.toString());
        List<dqzv> list = this.b;
        if (list != null) {
            String obj = list.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(obj).length());
            sb3.append(str);
            sb3.append("  pendingAcls=");
            sb3.append(obj);
            printWriter.println(sb3.toString());
        } else {
            printWriter.println(String.valueOf(str).concat("  pendingAcls= No Pending ACLS"));
        }
        String hexString = Integer.toHexString(System.identityHashCode(this.f));
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(hexString).length());
        sb4.append(str);
        sb4.append("  listener=");
        sb4.append(hexString);
        printWriter.println(sb4.toString());
    }

    public final void d(final btlu btluVar) {
        dcpe dcpeVar;
        dqzv dqzvVar;
        final dehn<Integer> dehnVar;
        dbsk.l(this.g);
        synchronized (this.ai) {
            dcpe listIterator = dcdc.r(this.b).listIterator();
            while (listIterator.hasNext()) {
                dqzv dqzvVar2 = (dqzv) listIterator.next();
                PersonId b = PersonId.b(dqzvVar2);
                aijc aijcVar = this.ae;
                dbsk.s(b);
                dbsg j = dbsg.j(aijcVar.e(btluVar, b));
                if (j.a()) {
                    final ajsu ajsuVar = this.ad;
                    final ahwl ahwlVar = (ahwl) j.b();
                    dcdc<dqzv> g = ahwlVar.g();
                    int i = 0;
                    if (!g.isEmpty()) {
                        dwdb bZ = dwdc.b.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dwdc dwdcVar = (dwdc) bZ.b;
                        dwdcVar.c();
                        dsod.bv(g, dwdcVar.a);
                        dwdc bK = bZ.bK();
                        if (ahwlVar.i()) {
                            ajsuVar.c.u(btluVar);
                        } else {
                            int size = g.size();
                            while (i < size) {
                                dqzv dqzvVar3 = g.get(i);
                                ajsuVar.c.o(btluVar, dqzvVar3);
                                ajsuVar.f.a(new aihq(new eapd(ajsuVar.e.b()), dqzvVar3, true), dbsg.i(btluVar));
                                i++;
                                listIterator = listIterator;
                                dqzvVar2 = dqzvVar2;
                            }
                        }
                        dcpeVar = listIterator;
                        dqzvVar = dqzvVar2;
                        deig d = deig.d();
                        ajsuVar.a.a().e = btluVar;
                        ajsuVar.a.c().a(bK, new ajss(ajsuVar, btluVar, ahwlVar, g, d), bvrj.UI_THREAD);
                        dehnVar = d;
                    } else {
                        dehnVar = deha.a(0);
                        dcpeVar = listIterator;
                        dqzvVar = dqzvVar2;
                    }
                    dehnVar.Pk(new Runnable(ajsuVar, dehnVar, btluVar, ahwlVar) { // from class: ajsq
                        private final ajsu a;
                        private final dehn b;
                        private final btlu c;
                        private final ahwl d;

                        {
                            this.a = ajsuVar;
                            this.b = dehnVar;
                            this.c = btluVar;
                            this.d = ahwlVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ajsu ajsuVar2 = this.a;
                            dehn dehnVar2 = this.b;
                            btlu btluVar2 = this.c;
                            ajsuVar2.g.add(new ajsn(btluVar2, ajsuVar2.e.b(), this.d.q(), dehnVar2.isCancelled() ? 3 : ((Integer) deha.s(dehnVar2)).intValue()));
                            if (dehnVar2.isCancelled()) {
                                ajsuVar2.c.u(btluVar2);
                            }
                        }
                    }, ajsuVar.d.h());
                    this.ah.add(dehnVar);
                    final dqzv dqzvVar4 = dqzvVar;
                    dehnVar.Pk(new Runnable(this, dehnVar, dqzvVar4) { // from class: ajfm
                        private final ajfp a;
                        private final dehn b;
                        private final dqzv c;

                        {
                            this.a = this;
                            this.b = dehnVar;
                            this.c = dqzvVar4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.f(this.b, this.c);
                        }
                    }, this.af.h());
                } else {
                    dcpeVar = listIterator;
                    this.c.add(CancelSharesRetainController$Result.c(1, dqzvVar2));
                    this.b.remove(dqzvVar2);
                }
                listIterator = dcpeVar;
            }
            final dehn b2 = deha.n(this.ah).b(new Callable(this) { // from class: ajfn
                private final ajfp a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ajfp ajfpVar = this.a;
                    dbsk.l(ajfpVar.b.isEmpty());
                    ajht ajhtVar = ajfpVar.f;
                    if (ajhtVar != null) {
                        ArrayList<CancelSharesRetainController$Result> arrayList = ajfpVar.c;
                        ajdz ajdzVar = (ajdz) ajhtVar;
                        ajdzVar.i();
                        if (((CancelSharesRetainController$Result) dcft.c(arrayList)).a() == 0) {
                            ajdzVar.aJ();
                            ajdzVar.ae.a().q();
                            return null;
                        }
                        ajdzVar.w(((fd) ajhtVar).Rp(R.string.UPDATE_SHARES_OPERATION_FAILED));
                        ajdzVar.aJ();
                        return null;
                    }
                    return null;
                }
            }, this.af.h());
            b2.Pk(new Runnable(b2) { // from class: ajfo
                private final dehn a;

                {
                    this.a = b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    deha.s(this.a);
                }
            }, this.af.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(dehn dehnVar, dqzv dqzvVar) {
        try {
            this.c.add(CancelSharesRetainController$Result.c(((Integer) deha.r(dehnVar)).intValue(), dqzvVar));
            this.b.remove(dqzvVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException unused2) {
            this.c.add(CancelSharesRetainController$Result.c(1, dqzvVar));
            this.b.remove(dqzvVar);
        }
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        aG();
        if (bundle == null) {
            return;
        }
        dbsk.l(bundle.containsKey("state"));
        this.d = bundle.getInt("state");
        dbsk.l(bundle.containsKey("results"));
        this.c = bundle.getParcelableArrayList("results");
        if (this.d == 0) {
            return;
        }
        ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) bundle.getParcelable("pending_acls");
        dbsk.s(protoBufUtil$ParcelableProtoList);
        dbsk.l(!protoBufUtil$ParcelableProtoList.b());
        this.b = protoBufUtil$ParcelableProtoList.a((dssr) dqzv.h.cu(7));
        dbsk.l(bundle.containsKey("account_id"));
        this.e = bundle.getString("account_id");
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        this.g = true;
        if (this.d != 0) {
            this.af.b(new Runnable(this) { // from class: ajfl
                private final ajfp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajfp ajfpVar = this.a;
                    dbsk.s(ajfpVar.e);
                    btlu n = ajfpVar.ag.n(ajfpVar.e);
                    dbsk.s(n);
                    if (!ajfpVar.g) {
                        return;
                    }
                    ajfpVar.d(n);
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putInt("state", this.d);
        bundle.putParcelableArrayList("results", this.c);
        bundle.putString("account_id", this.e);
        if (this.d != 0) {
            bundle.putParcelable("pending_acls", new ProtoBufUtil$ParcelableProtoList(this.b));
        }
        synchronized (this.ai) {
            for (dehn<Integer> dehnVar : this.ah) {
                dehnVar.cancel(true);
            }
            this.ah.clear();
            this.g = false;
        }
    }
}
