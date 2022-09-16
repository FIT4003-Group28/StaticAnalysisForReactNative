package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.PeopleKitPickerResult;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwdm  reason: default package */
/* loaded from: classes4.dex */
final class bwdm implements cxov {
    final /* synthetic */ bwdr a;

    public bwdm(bwdr bwdrVar) {
        this.a = bwdrVar;
    }

    @Override // defpackage.cxov
    public final void q(SendKitPickerResult sendKitPickerResult) {
        final bwdr bwdrVar = this.a;
        if (!((PeopleKitPickerResult) sendKitPickerResult).d) {
            throw new IllegalStateException("PickerResults was not rehydrated for logging.");
        }
        ((PeopleKitPickerResult) sendKitPickerResult).a.j(1, ((PeopleKitPickerResult) sendKitPickerResult).b);
        PeopleKitPickerResult peopleKitPickerResult = (PeopleKitPickerResult) sendKitPickerResult;
        String str = peopleKitPickerResult.c.c;
        if (!dbsj.d(str)) {
            bwdrVar.at.a.a = str;
        }
        final StringBuilder sb = new StringBuilder();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (czha czhaVar : peopleKitPickerResult.c.b) {
            czgz b = czgz.b(czhaVar.b);
            if (b == null) {
                b = czgz.UNKNOWN_TYPE;
            }
            if (b == czgz.SMS) {
                sb.append(czhaVar.c);
                sb.append(",");
            } else if (b == czgz.EMAIL) {
                arrayList.add(czhaVar.c);
            } else if (b == czgz.IN_APP_GAIA) {
                arrayList2.add(czhaVar.c);
            } else if (b == czgz.IN_APP_PHONE) {
                dbsg<String> aR = bwdr.aR(czhaVar);
                if (!aR.a()) {
                    sb.append(czhaVar.c);
                    sb.append(",");
                } else {
                    arrayList2.add(aR.b());
                }
            } else if (b == czgz.IN_APP_EMAIL) {
                dbsg<String> aR2 = bwdr.aR(czhaVar);
                if (!aR2.a()) {
                    arrayList.add(czhaVar.c);
                } else {
                    arrayList2.add(aR2.b());
                }
            }
        }
        deha.q(bwdrVar.aS(bwdrVar.at), bvqj.b(new bvqg(bwdrVar, arrayList, arrayList2, sb) { // from class: bwdk
            private final bwdr a;
            private final List b;
            private final List c;
            private final StringBuilder d;

            {
                this.a = bwdrVar;
                this.b = arrayList;
                this.c = arrayList2;
                this.d = sb;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                boolean z;
                bwdr bwdrVar2 = this.a;
                final List list = this.b;
                final List list2 = this.c;
                StringBuilder sb2 = this.d;
                bwdq bwdqVar = (bwdq) obj;
                if (!list.isEmpty() || !list2.isEmpty()) {
                    cjql cjqlVar = cjql.a;
                    final bweo bweoVar = bwdqVar.a;
                    final bweh bwehVar = bwdrVar2.ao;
                    bwehVar.b.a(new btxt(bwehVar, list, list2, bweoVar) { // from class: bwee
                        private final bweh a;
                        private final List b;
                        private final List c;
                        private final bweo d;

                        {
                            this.a = bwehVar;
                            this.b = list;
                            this.c = list2;
                            this.d = bweoVar;
                        }

                        @Override // defpackage.btxt
                        public final void a(int i) {
                            final bweh bwehVar2 = this.a;
                            List<String> list3 = this.b;
                            List<String> list4 = this.c;
                            bweo bweoVar2 = this.d;
                            if (i == 1) {
                                gga ggaVar = bwehVar2.a;
                                djqz djqzVar = (djqz) djrc.e.bZ();
                                for (String str2 : list3) {
                                    djra bZ = djrb.c.bZ();
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    djrb djrbVar = (djrb) bZ.b;
                                    str2.getClass();
                                    djrbVar.a = 1;
                                    djrbVar.b = str2;
                                    djqzVar.a(bZ.bK());
                                }
                                for (String str3 : list4) {
                                    djra bZ2 = djrb.c.bZ();
                                    if (bZ2.c) {
                                        bZ2.bF();
                                        bZ2.c = false;
                                    }
                                    djrb djrbVar2 = (djrb) bZ2.b;
                                    str3.getClass();
                                    djrbVar2.a = 2;
                                    djrbVar2.b = str3;
                                    djqzVar.a(bZ2.bK());
                                }
                                List<bwen> list5 = bweoVar2.b;
                                ArrayList arrayList3 = new ArrayList();
                                for (bwen bwenVar : list5) {
                                    arrayList3.add(bwenVar.a());
                                }
                                dbsk.a(!arrayList3.isEmpty());
                                dqgz bZ3 = dqhj.h.bZ();
                                int d = bweoVar2.d();
                                if (bZ3.c) {
                                    bZ3.bF();
                                    bZ3.c = false;
                                }
                                dqhj dqhjVar = (dqhj) bZ3.b;
                                int i2 = d - 1;
                                if (d == 0) {
                                    throw null;
                                }
                                dqhjVar.b = i2;
                                dqhjVar.a |= 1;
                                dqhj dqhjVar2 = (dqhj) bZ3.b;
                                dsrj<dqhg> dsrjVar = dqhjVar2.e;
                                if (!dsrjVar.a()) {
                                    dqhjVar2.e = dsqw.cl(dsrjVar);
                                }
                                dsod.bv(arrayList3, dqhjVar2.e);
                                String b2 = ((bwen) bweoVar2.b.iterator().next()).b();
                                if (!dbsj.d(b2)) {
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    dqhj dqhjVar3 = (dqhj) bZ3.b;
                                    b2.getClass();
                                    dqhjVar3.a |= 8;
                                    dqhjVar3.f = b2;
                                }
                                String str4 = bweoVar2.a;
                                if (!dbsj.d(str4)) {
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    dqhj dqhjVar4 = (dqhj) bZ3.b;
                                    str4.getClass();
                                    dqhjVar4.a |= 2;
                                    dqhjVar4.c = str4;
                                }
                                String a = bweoVar2.a(ggaVar, bwfq.EMAIL);
                                String b3 = bweoVar2.b(ggaVar, bwfq.EMAIL);
                                if (!dbsj.d(b3) || !dbsj.d(a)) {
                                    dqhc bZ4 = dqhd.d.bZ();
                                    if (!dbsj.d(b3)) {
                                        if (bZ4.c) {
                                            bZ4.bF();
                                            bZ4.c = false;
                                        }
                                        dqhd dqhdVar = (dqhd) bZ4.b;
                                        b3.getClass();
                                        dqhdVar.a |= 1;
                                        dqhdVar.b = b3;
                                    }
                                    if (!dbsj.d(a)) {
                                        if (bZ4.c) {
                                            bZ4.bF();
                                            bZ4.c = false;
                                        }
                                        dqhd dqhdVar2 = (dqhd) bZ4.b;
                                        a.getClass();
                                        dqhdVar2.a |= 2;
                                        dqhdVar2.c = a;
                                    }
                                    dqhd bK = bZ4.bK();
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    dqhj dqhjVar5 = (dqhj) bZ3.b;
                                    bK.getClass();
                                    dqhjVar5.g = bK;
                                    dqhjVar5.a |= 16;
                                }
                                dqhj bK2 = bZ3.bK();
                                if (djqzVar.c) {
                                    djqzVar.bF();
                                    djqzVar.c = false;
                                }
                                djrc djrcVar = (djrc) djqzVar.b;
                                bK2.getClass();
                                djrcVar.b = bK2;
                                djrcVar.a |= 1;
                                dnqg bZ5 = dnqh.p.bZ();
                                dnmu dnmuVar = dnmu.PROPERTY_GMM;
                                if (bZ5.c) {
                                    bZ5.bF();
                                    bZ5.c = false;
                                }
                                dnqh dnqhVar = (dnqh) bZ5.b;
                                dnqhVar.l = dnmuVar.ap;
                                dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                                if (djqzVar.c) {
                                    djqzVar.bF();
                                    djqzVar.c = false;
                                }
                                djrc djrcVar2 = (djrc) djqzVar.b;
                                dnqh bK3 = bZ5.bK();
                                bK3.getClass();
                                djrcVar2.d = bK3;
                                djrcVar2.a |= 2;
                                bwehVar2.d.b((djrc) djqzVar.bK(), new bweg(bwehVar2), bwehVar2.c);
                                return;
                            }
                            bwehVar2.c.execute(new Runnable(bwehVar2) { // from class: bwef
                                private final bweh a;

                                {
                                    this.a = bwehVar2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    bweh bwehVar3 = this.a;
                                    bweh.a(bwehVar3.a.getString(R.string.SHARE_EMAIL_FAILURE_NO_INTERNET), bwehVar3.a);
                                }
                            });
                        }
                    });
                    if (!list.isEmpty()) {
                        bwdrVar2.af.j(cjqlVar, cjtd.a(dtyb.dq));
                    }
                    if (!list2.isEmpty()) {
                        bwdrVar2.af.j(cjqlVar, cjtd.a(dtyb.f22do));
                    }
                }
                bwdrVar2.f();
                String sb3 = sb2.toString();
                if (!dbsj.d(sb3)) {
                    cjql cjqlVar2 = cjql.a;
                    bweo bweoVar2 = bwdrVar2.at.a;
                    gga ggaVar = bwdrVar2.ae;
                    String valueOf = String.valueOf(sb3);
                    Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(valueOf.length() != 0 ? "sms:".concat(valueOf) : new String("sms:")));
                    String b2 = bweoVar2.b(ggaVar, bwfq.SMS);
                    if (!dbsj.d(b2)) {
                        intent.putExtra("subject", b2);
                        z = false;
                    } else {
                        z = true;
                    }
                    String a = bweoVar2.a(ggaVar, bwfq.SMS);
                    if (!dbsj.d(a)) {
                        intent.putExtra("sms_body", a);
                    } else if (z) {
                        throw new IllegalArgumentException();
                    }
                    bwdrVar2.aQ(cjqlVar2, intent, cjtd.a(dtyb.dr), true);
                }
            }
        }), dege.a);
    }

    @Override // defpackage.cxov
    public final void r(czha czhaVar) {
    }

    @Override // defpackage.cxov
    public final void s(czha czhaVar, boolean z) {
    }
}
