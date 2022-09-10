package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$GroupSmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage;
import com.google.android.apps.maps.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajgc  reason: default package */
/* loaded from: classes2.dex */
public final class ajgc extends fd implements ajid {
    public static final dcqe a = dcqe.c("ajgc");
    public ajtc ad;
    @dzsi
    public ajib b;
    public boolean c;
    public int d = 0;
    public int e;
    @dzsi
    public List<diss> f;
    @dzsi
    public List<disy> g;

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final void am() {
        this.c = false;
        super.am();
    }

    @Override // defpackage.fd
    public final void aq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.aq(str, fileDescriptor, printWriter, strArr);
        String name = ajgc.class.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append(name);
        sb.append(":");
        printWriter.println(sb.toString());
        boolean z = this.c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 17);
        sb2.append(str);
        sb2.append("  isCreated=");
        sb2.append(z);
        printWriter.println(sb2.toString());
        int i = this.d;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 19);
        sb3.append(str);
        sb3.append("  state=");
        sb3.append(i);
        printWriter.println(sb3.toString());
        int i2 = this.e;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 28);
        sb4.append(str);
        sb4.append("  responseStatus=");
        sb4.append(i2);
        printWriter.println(sb4.toString());
        String hexString = Integer.toHexString(System.identityHashCode(this.b));
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(hexString).length());
        sb5.append(str);
        sb5.append("  listener=");
        sb5.append(hexString);
        printWriter.println(sb5.toString());
    }

    public final void d(int i) {
        bvrj.UI_THREAD.c();
        this.d = i;
        e();
    }

    public final void e() {
        dbsg i;
        dbsg dbsgVar;
        ajib ajibVar = this.b;
        if (ajibVar != null) {
            fd fdVar = (fd) ajibVar;
            boolean z = false;
            if (!fdVar.D()) {
                ajga ajgaVar = (ajga) ajibVar;
                if (ajgaVar.ag) {
                    if (ajgaVar.an != 2) {
                        return;
                    }
                    ajgc ajgcVar = (ajgc) ajgaVar.ad;
                    int i2 = ajgcVar.d;
                    if (i2 == 0) {
                        ajgaVar.an = 0;
                        ajgaVar.h();
                        return;
                    } else if (i2 == 1) {
                        if (ajgaVar.af != null) {
                            return;
                        }
                        ProgressDialog progressDialog = new ProgressDialog(fdVar.H());
                        progressDialog.setProgressStyle(0);
                        progressDialog.setCancelable(false);
                        progressDialog.setIndeterminate(true);
                        progressDialog.setMessage(alp.a().b(fdVar.Rp(R.string.DATA_LOADING_IN_PROGRESS)));
                        progressDialog.show();
                        ajgaVar.af = progressDialog;
                        return;
                    } else if (i2 != 2) {
                        bvoo.h("Unexpected state: %s", Integer.valueOf(((ajgc) ajgaVar.ad).d));
                        return;
                    } else {
                        ajgaVar.an = 0;
                        dbsk.l(ajgcVar.d == 2);
                        ajhs ajhsVar = new ajhs(ajgcVar.e, ajgcVar.f, ajgcVar.g);
                        if (ajhsVar.a() != 0) {
                            int a2 = ajhsVar.a();
                            int i3 = a2 == 2 ? R.string.UPDATE_SHARES_OPERATION_FAILED_LONGER_SHARE_EXISTS : a2 == 3 ? R.string.UPDATE_SHARES_OPERATION_FAILED_SELF_SHARE : a2 == 4 ? R.string.CANT_SHARE_WITH_TARGET_PERMISSION_DENIED : R.string.UPDATE_SHARES_OPERATION_FAILED;
                            cztq a3 = cztt.a(ajgaVar.d);
                            a3.c = fdVar.Rp(i3);
                            a3.c();
                            ajgaVar.h();
                            List<diss> list = ajgaVar.ai;
                            dbsk.s(list);
                            ajgaVar.am = ajhz.e(2, list, dcdc.e(), dcdc.e());
                            ajgaVar.aJ();
                            return;
                        }
                        List<diss> b = ajhsVar.b();
                        dbsk.s(b);
                        List<disy> c = ajhsVar.c();
                        dbsk.s(c);
                        ajgaVar.ak = dcdc.r(c);
                        ajgaVar.al = new ArrayList();
                        dcdc<disy> dcdcVar = ajgaVar.ak;
                        dbsk.s(dcdcVar);
                        int size = dcdcVar.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            disy disyVar = dcdcVar.get(i4);
                            dqzv dqzvVar = disyVar.c;
                            if (dqzvVar == null) {
                                dqzvVar = dqzv.h;
                            }
                            if (dqzvVar.b != 1) {
                                dqzv dqzvVar2 = disyVar.c;
                                if (dqzvVar2 == null) {
                                    dqzvVar2 = dqzv.h;
                                }
                                dqyb dqybVar = dqzvVar2.b == 2 ? (dqyb) dqzvVar2.c : dqyb.j;
                                dqzv dqzvVar3 = disyVar.c;
                                if (dqzvVar3 == null) {
                                    dqzvVar3 = dqzv.h;
                                }
                                dbsk.l(dqzvVar3.b == 2);
                                if (((dqybVar.b == 6 ? (dqya) dqybVar.c : dqya.e).a & 2) == 0) {
                                    List<disy> list2 = ajgaVar.al;
                                    dbsk.s(list2);
                                    list2.add(disyVar);
                                }
                            }
                        }
                        dbsk.q(c.size() <= b.size(), "Unexpected size. createShareInfoList size=%s, createShareResults size=%s.", b.size(), c.size());
                        dccx G = dcdc.G(c.size());
                        for (disy disyVar2 : c) {
                            Context H = fdVar.H();
                            if ((disyVar2.a & 2) != 0) {
                                dqzv dqzvVar4 = disyVar2.c;
                                if (dqzvVar4 == null) {
                                    dqzvVar4 = dqzv.h;
                                }
                                dbsgVar = ajii.b(dqzvVar4, H, R.string.SMS_SHARE_TEXT);
                            } else {
                                dbsgVar = dbpy.a;
                            }
                            if (dbsgVar.a()) {
                                G.g((SmsController$SmsMessage) dbsgVar.b());
                            }
                        }
                        Context H2 = fdVar.H();
                        List<diss> list3 = ajgaVar.ai;
                        dbsk.s(list3);
                        if (!ajii.a(list3, false)) {
                            i = dbpy.a;
                        } else {
                            disy disyVar3 = (disy) dcft.s(c);
                            disx b2 = disx.b(disyVar3.b);
                            if (b2 == null) {
                                b2 = disx.UNKNOWN_STATUS;
                            }
                            boolean z2 = b2 == disx.SUCCESS;
                            disx b3 = disx.b(disyVar3.b);
                            if (b3 == null) {
                                b3 = disx.UNKNOWN_STATUS;
                            }
                            dbsk.p(z2, "Unexpected status: %s", b3);
                            dqzv dqzvVar5 = disyVar3.c;
                            if (dqzvVar5 == null) {
                                dqzvVar5 = dqzv.h;
                            }
                            dbsk.l(1 == ((dqzvVar5.b == 2 ? (dqyb) dqzvVar5.c : dqyb.j).a & 1));
                            dqzv dqzvVar6 = disyVar3.c;
                            if (dqzvVar6 == null) {
                                dqzvVar6 = dqzv.h;
                            }
                            if (!ajii.a(list3, false)) {
                                i = dbpy.a;
                            } else {
                                dcdc<String> c2 = ajii.c(list3);
                                Object[] objArr = new Object[1];
                                objArr[0] = (dqzvVar6.b == 2 ? (dqyb) dqzvVar6.c : dqyb.j).d;
                                i = dbsg.i(SmsController$GroupSmsMessage.f(c2, H2.getString(R.string.SMS_SHARE_TEXT, objArr)));
                            }
                        }
                        dcdc f = G.f();
                        if (f.isEmpty() || !i.a()) {
                            z = true;
                        }
                        dbsk.l(z);
                        if (f.isEmpty() && !i.a()) {
                            ajgaVar.i();
                            return;
                        } else if (i.a()) {
                            ajgaVar.ae.e((SmsController$GroupSmsMessage) i.b());
                            return;
                        } else {
                            ajgaVar.ae.h(f);
                            return;
                        }
                    }
                }
            }
            bvoo.h("onCreateSharesStateChange callback after saving state or when stopped.", new Object[0]);
        }
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        aG();
        if (bundle != null) {
            dbsk.l(bundle.containsKey("state"));
            int i = bundle.getInt("state");
            this.d = i;
            if (i == 1) {
                d(0);
            } else if (i == 2) {
                dbsk.l(bundle.containsKey("response_status"));
                int i2 = bundle.getInt("response_status");
                this.e = i2;
                if (i2 == 0) {
                    dbsk.l(bundle.containsKey("request_list"));
                    dbsk.l(bundle.containsKey("result_list"));
                    ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) bundle.getParcelable("request_list");
                    dbsk.s(protoBufUtil$ParcelableProtoList);
                    dbsk.l(!protoBufUtil$ParcelableProtoList.b());
                    this.f = protoBufUtil$ParcelableProtoList.a((dssr) diss.d.cu(7));
                    ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList2 = (ProtoBufUtil$ParcelableProtoList) bundle.getParcelable("result_list");
                    dbsk.s(protoBufUtil$ParcelableProtoList2);
                    dbsk.l(!protoBufUtil$ParcelableProtoList2.b());
                    this.g = protoBufUtil$ParcelableProtoList2.a((dssr) disy.d.cu(7));
                }
            }
        }
        if (this.b != null) {
            e();
        }
        this.c = true;
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putInt("state", this.d);
        if (this.d == 2) {
            bundle.putInt("response_status", this.e);
            if (this.e != 0) {
                return;
            }
            List<diss> list = this.f;
            dbsk.s(list);
            bundle.putParcelable("request_list", new ProtoBufUtil$ParcelableProtoList(list));
            List<disy> list2 = this.g;
            dbsk.s(list2);
            bundle.putParcelable("result_list", new ProtoBufUtil$ParcelableProtoList(list2));
        }
    }
}
