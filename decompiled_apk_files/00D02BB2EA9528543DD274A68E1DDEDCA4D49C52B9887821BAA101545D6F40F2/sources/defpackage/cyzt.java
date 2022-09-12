package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cyzt  reason: default package */
/* loaded from: classes5.dex */
public final class cyzt implements cyuc {
    public static final Comparator<cywm> a = cyzr.a;
    public final Context b;
    public final ClientConfigInternal c;
    public final cych d;
    public final cyuj e;
    public final cyph f;
    private final dehp g;
    private final cycl<dbsg<cyqe>> h;

    public cyzt(Context context, ClientConfigInternal clientConfigInternal, cych cychVar, cyuj cyujVar, cyph cyphVar, dehp dehpVar, cycl<dbsg<cyqe>> cyclVar) {
        this.b = context;
        this.c = clientConfigInternal;
        this.d = cychVar;
        this.e = cyujVar;
        this.f = cyphVar;
        this.g = dehpVar;
        this.h = cyclVar;
    }

    @Override // defpackage.cyuc
    public final dehn<cyts> a(final cytq cytqVar) {
        final dehn<dbsg<cyqe>> a2;
        if (cyzj.i(this.b)) {
            ClientConfigInternal clientConfigInternal = cytqVar.f;
            if (!clientConfigInternal.x && (clientConfigInternal.l.contains(cydt.EMAIL) || cytqVar.f.l.contains(cydt.PHONE_NUMBER))) {
                dbtp b = this.f.b();
                final dehn c = this.g.c(new Callable(this, cytqVar) { // from class: cyzq
                    private final cyzt a;
                    private final cytq b;

                    {
                        this.a = this;
                        this.b = cytqVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cyzt cyztVar = this.a;
                        cytq cytqVar2 = this.b;
                        return cyzj.a(cyztVar.b, cytqVar2.b, cyztVar.c, cyztVar.e, cyztVar.f, cytqVar2.k);
                    }
                });
                if (!dyaz.e()) {
                    a2 = deha.a(dbpy.a);
                } else {
                    a2 = this.h.b();
                }
                dehn<cyts> b2 = deha.m(c, a2).b(new Callable(this, c, a2) { // from class: cyzp
                    private final cyzt a;
                    private final dehn b;
                    private final dehn c;

                    {
                        this.a = this;
                        this.b = c;
                        this.c = a2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dbsg i;
                        cyxh cyxhVar;
                        dcdc dcdcVar;
                        int i2;
                        dcdc<cyvy> dcdcVar2;
                        int i3;
                        cyzt cyztVar = this.a;
                        dehn dehnVar = this.b;
                        dehn dehnVar2 = this.c;
                        dcdc dcdcVar3 = (dcdc) deha.r(dehnVar);
                        dbsg dbsgVar = (dbsg) deha.r(dehnVar2);
                        if (!dbsgVar.a()) {
                            i = dbpy.a;
                        } else {
                            dudy dudyVar = ((cyqe) dbsgVar.b()).d;
                            if (dudyVar == null) {
                                i = dbpy.a;
                            } else {
                                dccx F = dcdc.F();
                                for (dudx dudxVar : dudyVar.c) {
                                    cyxi d = cyxj.d();
                                    int a3 = dudv.a(dudxVar.a);
                                    if (a3 == 0) {
                                        a3 = 1;
                                    }
                                    int i4 = a3 - 1;
                                    switch (i4) {
                                        case 1:
                                            cyxhVar = cyxh.TIMES_CONTACTED;
                                            break;
                                        case 2:
                                            cyxhVar = cyxh.SECONDS_SINCE_LAST_TIME_CONTACTED;
                                            break;
                                        case 3:
                                            cyxhVar = cyxh.IS_SECONDARY_GOOGLE_ACCOUNT;
                                            break;
                                        case 4:
                                            cyxhVar = cyxh.FIELD_TIMES_USED;
                                            break;
                                        case 5:
                                            cyxhVar = cyxh.FIELD_SECONDS_SINCE_LAST_TIME_USED;
                                            break;
                                        case 6:
                                            cyxhVar = cyxh.IS_CONTACT_STARRED;
                                            break;
                                        case 7:
                                            cyxhVar = cyxh.HAS_POSTAL_ADDRESS;
                                            break;
                                        case 8:
                                            cyxhVar = cyxh.HAS_NICKNAME;
                                            break;
                                        case 9:
                                            cyxhVar = cyxh.HAS_BIRTHDAY;
                                            break;
                                        case 10:
                                            cyxhVar = cyxh.HAS_CUSTOM_RINGTONE;
                                            break;
                                        case 11:
                                            cyxhVar = cyxh.HAS_AVATAR;
                                            break;
                                        case 12:
                                            cyxhVar = cyxh.IS_SENT_TO_VOICEMAIL;
                                            break;
                                        case 13:
                                            cyxhVar = cyxh.IS_PINNED;
                                            break;
                                        case 14:
                                            cyxhVar = cyxh.PINNED_POSITION;
                                            break;
                                        case 15:
                                            cyxhVar = cyxh.NUM_COMMUNICATION_CHANNELS;
                                            break;
                                        case 16:
                                            cyxhVar = cyxh.NUM_RAW_CONTACTS;
                                            break;
                                        case 17:
                                            cyxhVar = cyxh.FIELD_IS_PRIMARY;
                                            break;
                                        case 18:
                                            cyxhVar = cyxh.FIELD_IS_SUPER_PRIMARY;
                                            break;
                                        default:
                                            String valueOf = String.valueOf(Integer.toString(i4));
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                                            sb.append("No mapping for ");
                                            sb.append(valueOf);
                                            sb.append(".");
                                            throw new IllegalArgumentException(sb.toString());
                                    }
                                    d.c(cyxhVar);
                                    d.d(dudxVar.b);
                                    d.b(dudxVar.c);
                                    F.g(d.a());
                                }
                                i = dbsg.i(new cyyz(cyztVar.d.a, F.f()));
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        int size = dcdcVar3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            cyzl cyzlVar = (cyzl) dcdcVar3.get(i5);
                            dshz bZ = dsia.e.bZ();
                            dcdc<cyvy> e = cyzlVar.e();
                            int size2 = e.size();
                            int i6 = 0;
                            boolean z = true;
                            while (i6 < size2) {
                                cyvy cyvyVar = e.get(i6);
                                dsgr bZ2 = dsgt.f.bZ();
                                dsgu bZ3 = dsgv.f.bZ();
                                if (bZ3.c) {
                                    bZ3.bF();
                                    bZ3.c = false;
                                }
                                dsgv dsgvVar = (dsgv) bZ3.b;
                                dsgvVar.a |= 8;
                                dsgvVar.e = z;
                                if (cyzlVar.d() != null) {
                                    dsid bZ4 = dsig.d.bZ();
                                    String c2 = cyzlVar.d().c();
                                    dcdcVar = dcdcVar3;
                                    if (bZ4.c) {
                                        bZ4.bF();
                                        bZ4.c = false;
                                    }
                                    dsig dsigVar = (dsig) bZ4.b;
                                    c2.getClass();
                                    i2 = size;
                                    dsigVar.a |= 1;
                                    dsigVar.b = c2;
                                    dsig dsigVar2 = (dsig) bZ4.b;
                                    dsigVar2.c = 3;
                                    dsigVar2.a |= 2;
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    dsgv dsgvVar2 = (dsgv) bZ3.b;
                                    dsig bK = bZ4.bK();
                                    bK.getClass();
                                    dsgvVar2.b = bK;
                                    dsgvVar2.a |= 1;
                                } else {
                                    dcdcVar = dcdcVar3;
                                    i2 = size;
                                }
                                if (!cyzlVar.c().isEmpty()) {
                                    dshu bZ5 = dshv.e.bZ();
                                    String a4 = cyzlVar.c().get(0).a();
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dshv dshvVar = (dshv) bZ5.b;
                                    a4.getClass();
                                    dshvVar.a |= 1;
                                    dshvVar.b = a4;
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    dsgv dsgvVar3 = (dsgv) bZ3.b;
                                    dshv bK2 = bZ5.bK();
                                    bK2.getClass();
                                    dsgvVar3.c = bK2;
                                    dsgvVar3.a |= 2;
                                }
                                if (i.a()) {
                                    dcdcVar2 = e;
                                    i3 = size2;
                                    double a5 = ((cyyz) i.b()).a(cyzlVar.f(), true);
                                    dsgc bZ6 = dsgd.d.bZ();
                                    if (bZ6.c) {
                                        bZ6.bF();
                                        bZ6.c = false;
                                    }
                                    dsgd dsgdVar = (dsgd) bZ6.b;
                                    dsgdVar.a |= 2;
                                    dsgdVar.c = a5;
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    dsgv dsgvVar4 = (dsgv) bZ3.b;
                                    dsgd bK3 = bZ6.bK();
                                    bK3.getClass();
                                    dsgvVar4.d = bK3;
                                    dsgvVar4.a |= 4;
                                } else {
                                    dcdcVar2 = e;
                                    i3 = size2;
                                }
                                dsgv bK4 = bZ3.bK();
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                dsgt dsgtVar = (dsgt) bZ2.b;
                                bK4.getClass();
                                dsgtVar.d = bK4;
                                dsgtVar.a |= 1;
                                if (cyvyVar.a() == cyfj.EMAIL) {
                                    dsgw bZ7 = dshb.f.bZ();
                                    String b3 = cyvyVar.b();
                                    if (bZ7.c) {
                                        bZ7.bF();
                                        bZ7.c = false;
                                    }
                                    dshb dshbVar = (dshb) bZ7.b;
                                    b3.getClass();
                                    dshbVar.a |= 1;
                                    dshbVar.b = b3;
                                    if (bZ2.c) {
                                        bZ2.bF();
                                        bZ2.c = false;
                                    }
                                    dsgt dsgtVar2 = (dsgt) bZ2.b;
                                    dshb bK5 = bZ7.bK();
                                    bK5.getClass();
                                    dsgtVar2.c = bK5;
                                    dsgtVar2.b = 2;
                                } else if (cyvyVar.a() == cyfj.PHONE_NUMBER) {
                                    dsib bZ8 = dsic.d.bZ();
                                    String b4 = cyvyVar.b();
                                    if (bZ8.c) {
                                        bZ8.bF();
                                        bZ8.c = false;
                                    }
                                    dsic dsicVar = (dsic) bZ8.b;
                                    b4.getClass();
                                    dsicVar.a |= 1;
                                    dsicVar.b = b4;
                                    if (!cyvyVar.d().isEmpty()) {
                                        String d2 = cyvyVar.d();
                                        if (bZ8.c) {
                                            bZ8.bF();
                                            bZ8.c = false;
                                        }
                                        dsic dsicVar2 = (dsic) bZ8.b;
                                        d2.getClass();
                                        dsicVar2.a |= 2;
                                        dsicVar2.c = d2;
                                    }
                                    if (bZ2.c) {
                                        bZ2.bF();
                                        bZ2.c = false;
                                    }
                                    dsgt dsgtVar3 = (dsgt) bZ2.b;
                                    dsic bK6 = bZ8.bK();
                                    bK6.getClass();
                                    dsgtVar3.c = bK6;
                                    dsgtVar3.b = 3;
                                } else {
                                    i6++;
                                    e = dcdcVar2;
                                    dcdcVar3 = dcdcVar;
                                    size = i2;
                                    size2 = i3;
                                }
                                bZ.a(bZ2);
                                z = false;
                                i6++;
                                e = dcdcVar2;
                                dcdcVar3 = dcdcVar;
                                size = i2;
                                size2 = i3;
                            }
                            dcdc dcdcVar4 = dcdcVar3;
                            int i7 = size;
                            if (i.a()) {
                                double a6 = ((cyyz) i.b()).a(cyzlVar.f(), true);
                                dsgc bZ9 = dsgd.d.bZ();
                                if (bZ9.c) {
                                    bZ9.bF();
                                    bZ9.c = false;
                                }
                                dsgd dsgdVar2 = (dsgd) bZ9.b;
                                dsgdVar2.a |= 2;
                                dsgdVar2.c = a6;
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dsia dsiaVar = (dsia) bZ.b;
                                dsgd bK7 = bZ9.bK();
                                bK7.getClass();
                                dsiaVar.b = bK7;
                                dsiaVar.a |= 1;
                            }
                            dsgi bZ10 = dsgk.c.bZ();
                            if (bZ10.c) {
                                bZ10.bF();
                                bZ10.c = false;
                            }
                            dsgk dsgkVar = (dsgk) bZ10.b;
                            dsia bK8 = bZ.bK();
                            bK8.getClass();
                            dsgkVar.b = bK8;
                            dsgkVar.a = 1;
                            cywm cywmVar = new cywm(bZ10.bK());
                            cywmVar.e(cygl.DEVICE);
                            arrayList.add(cywmVar);
                            i5++;
                            dcdcVar3 = dcdcVar4;
                            size = i7;
                        }
                        cytr c3 = cyts.c();
                        c3.b(dcdc.w(cyzt.a, arrayList));
                        c3.e = cyes.SUCCESS;
                        c3.f = cyer.DEVICE_CONTACTS;
                        return c3.a();
                    }
                }, dege.a);
                if (dyaz.f()) {
                    deha.q(b2, new cyzs(this, cytqVar, b, b2), dege.a);
                }
                return b2;
            }
        }
        cytr c2 = cyts.c();
        c2.b(dcdc.e());
        c2.e = cyes.SKIPPED;
        c2.f = cyer.DEVICE_CONTACTS;
        return deha.a(c2.a());
    }

    @Override // defpackage.cyuc
    public final cyer b() {
        return cyer.DEVICE_CONTACTS;
    }

    @Override // defpackage.cyuc
    public final dehn<Void> c() {
        return dehk.a;
    }

    @Override // defpackage.cyuc
    public final void d(cydz cydzVar) {
    }
}
