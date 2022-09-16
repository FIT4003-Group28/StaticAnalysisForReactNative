package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cveb  reason: default package */
/* loaded from: classes5.dex */
public final class cveb extends AsyncTask<Void, Void, dcdc<cved>> {
    public static final /* synthetic */ int c = 0;
    public final Map<cvec, cvdu> a;
    final cveo b;
    private final List<cugu> d;
    private final Map<ContactId, cufj> e;
    private final boolean f;

    public cveb(List list, Map map, boolean z, Map map2, cveo cveoVar) {
        this.d = list;
        this.e = map;
        this.f = z;
        this.b = cveoVar;
        this.a = map2;
    }

    public static boolean a(cugu cuguVar, cugu cuguVar2) {
        return TimeUnit.MICROSECONDS.toMillis(cuguVar2.d().longValue() - cuguVar.d().longValue()) > 3600000 && cuguVar2.g() != cugo.OUTGOING_SENDING;
    }

    public static boolean b(cugu cuguVar) {
        int a = cuguVar.f().a();
        if (a != 0) {
            return a == 3 && cuguVar.f().b().a().equals("rich_card");
        }
        throw null;
    }

    private static int c(int i, cugu cuguVar, cugu cuguVar2, cugu cuguVar3, cvea cveaVar) {
        boolean z = cuguVar3 != null && cveaVar.a(cuguVar3, cuguVar);
        boolean z2 = cuguVar2 != null && cveaVar.a(cuguVar, cuguVar2);
        return i != 1 ? i != 2 ? (i == 3 && z) ? 3 : 0 : z2 ? z ? 2 : 1 : z ? 3 : 0 : z2 ? 1 : 0;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ dcdc<cved> doInBackground(Void[] voidArr) {
        Object cvdlVar;
        List<cugu> list = this.d;
        cstq.a();
        dcdc z = dcbg.b(list).s(new dbrn(this) { // from class: cvdy
            private final cveb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cveb cvebVar = this.a;
                cugu cuguVar = (cugu) obj;
                cugt cugtVar = cugt.DEFAULT_RENDERING_TYPE;
                int ordinal = cuguVar.k().a().ordinal();
                if (ordinal == 0) {
                    if (!cveb.b(cuguVar)) {
                        return cuguVar;
                    }
                    if (cvebVar.a.containsKey(cvec.RICH_CARD_BUBBLE) && cvebVar.a.get(cvec.RICH_CARD_BUBBLE).g(cuguVar)) {
                        return cuguVar;
                    }
                    cugi n = cuguVar.n();
                    n.u(cuguVar.e().c(""));
                    n.b(192);
                    return n.a();
                } else if (ordinal != 1) {
                    return cuguVar;
                } else {
                    if (cvebVar.a.containsKey(cvec.TOMBSTONE_BUBBLE) && cvebVar.a.get(cvec.TOMBSTONE_BUBBLE).g(cuguVar)) {
                        return cuguVar;
                    }
                    cugi n2 = cuguVar.n();
                    n2.u(cuguVar.e().c(""));
                    n2.r();
                    n2.b(192);
                    return n2.a();
                }
            }
        }).z();
        dccx F = dcdc.F();
        int i = 0;
        boolean z2 = false;
        while (i < z.size()) {
            cugu cuguVar = null;
            cugu cuguVar2 = i > 0 ? (cugu) z.get(i - 1) : null;
            cugu cuguVar3 = (cugu) z.get(i);
            i++;
            if (i < z.size()) {
                cuguVar = (cugu) z.get(i);
            }
            cugo g = cuguVar3.g();
            boolean z3 = cuguVar != null && a(cuguVar, cuguVar3);
            cugo g2 = cuguVar3.g();
            int c2 = (g2.equals(cugo.OUTGOING_FAILED_TO_DELIVER) || g2.equals(cugo.OUTGOING_FAILED_SEND)) ? 0 : c(2, cuguVar3, cuguVar2, cuguVar, cvdz.a);
            int c3 = c(c2, cuguVar3, cuguVar2, cuguVar, cvdx.a);
            boolean z4 = (!g.equals(cugo.OUTGOING_SENDING) && ((c2 == 3 || c2 == 0) && !z2)) || g.equals(cugo.OUTGOING_FAILED_SEND) || g.equals(cugo.OUTGOING_FAILED_TO_DELIVER);
            z2 |= z3;
            cvco cvcoVar = new cvco();
            cvcoVar.a = dbsg.i(cuguVar3);
            cufj cufjVar = this.e.get(cuguVar3.b());
            if (cufjVar == null) {
                throw new NullPointerException("Null senderProfile");
            }
            cvcoVar.b = cufjVar;
            cvcoVar.c = Integer.valueOf(c3);
            cvcoVar.d = Boolean.valueOf(z3);
            cvcoVar.b(z4);
            cvcy a = cvcoVar.a();
            if (cuguVar3.k().a() == cugt.TOMBSTONE) {
                a.getClass();
                cvdlVar = new cvdo(a);
            } else if (b(cuguVar3)) {
                cvcx f = a.f();
                f.b(true);
                cvcy a2 = f.a();
                a2.getClass();
                cvdlVar = new cvdm(a2);
            } else {
                a.getClass();
                cvdlVar = new cvdl(a);
            }
            F.g(cvdlVar);
        }
        return F.f();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(dcdc<cved> dcdcVar) {
        dcdc<cved> dcdcVar2 = dcdcVar;
        cveo cveoVar = this.b;
        boolean z = this.f;
        cves cvesVar = cveoVar.a;
        if (cvesVar.k.isEmpty()) {
            cvesVar.e.a(z, cvesVar.e(dcdcVar2));
            return;
        }
        dehn q = degp.q(deha.a(dcdcVar2));
        dcdc<cvdv> dcdcVar3 = cvesVar.k;
        int size = dcdcVar3.size();
        for (int i = 0; i < size; i++) {
            final cvdv cvdvVar = dcdcVar3.get(i);
            q = deew.g(q, new defg(cvdvVar) { // from class: cvep
                private final cvdv a;

                {
                    this.a = cvdvVar;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    return this.a.j((dcdc) obj);
                }
            }, dege.a);
        }
        deha.q(q, new cver(cvesVar, z, dcdcVar2), dege.a);
        cvfc cvfcVar = cvesVar.j;
        if (cvfcVar.i) {
            return;
        }
        cvfcVar.i = true;
        cvfcVar.o(cvfcVar.l);
    }
}
