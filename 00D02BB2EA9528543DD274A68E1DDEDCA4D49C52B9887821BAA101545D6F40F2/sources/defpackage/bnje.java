package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayDeque;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnje  reason: default package */
/* loaded from: classes3.dex */
public final class bnje {
    public final Activity a;
    public final dzsj<beqf> b;
    public ilo c;
    private final cqat d;
    private final dzsj<axwp> e;
    private final dzsj<bmdv> f;
    private final dzsj<biko> g;
    private final btvo h;
    private final bvsx i;
    private final long j;
    @dzsi
    private bikf k;
    private final boolean l;
    private final bnjd m;
    @dzsi
    private bkjb n;

    public bnje(Activity activity, cqat cqatVar, dzsj<bmdv> dzsjVar, dzsj<axwp> dzsjVar2, dzsj<beqf> dzsjVar3, dzsj<biko> dzsjVar4, btvo btvoVar, ilo iloVar, bnjd bnjdVar) {
        this.a = activity;
        this.d = cqatVar;
        this.e = dzsjVar2;
        this.f = dzsjVar;
        this.b = dzsjVar3;
        this.g = dzsjVar4;
        this.h = btvoVar;
        this.i = new bvsx(activity.getResources());
        this.c = iloVar;
        this.k = dzsjVar4.a().a(iloVar, activity);
        boolean z = false;
        if (iloVar.bX().n.isEmpty()) {
            this.j = 0L;
        } else {
            this.j = iloVar.bX().n.get(0).b;
        }
        this.m = bnjdVar;
        if (bnjdVar.f() && iloVar.bM()) {
            z = true;
        }
        this.l = z;
    }

    @dzsi
    private final dgmo d() {
        dvyw h = this.c.h();
        dgmq dgmqVar = h.ba;
        if (dgmqVar == null) {
            dgmqVar = dgmq.b;
        }
        if (dgmqVar.a.size() > 0) {
            dgmq dgmqVar2 = h.ba;
            if (dgmqVar2 == null) {
                dgmqVar2 = dgmq.b;
            }
            return dgmqVar2.a.get(0);
        }
        return null;
    }

    private final void e(bnjh bnjhVar, dvwp dvwpVar) {
        if ((dvwpVar.a & 64) != 0) {
            ddho d = cjth.d(dvwpVar.d);
            cjta b = cjtd.b();
            ddes bZ = ddet.D.bZ();
            ddeo bZ2 = ddep.f.bZ();
            dtbk g = this.c.ai().g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddep ddepVar = (ddep) bZ2.b;
            g.getClass();
            ddepVar.b = g;
            ddepVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            ddep bK = bZ2.bK();
            bK.getClass();
            ddetVar.c = bK;
            ddetVar.a |= 1;
            b.s(bZ.bK());
            b.d = d;
            if (dvwpVar.e) {
                b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            }
            ((bnio) bnjhVar).f = b.a();
        }
    }

    private static String f(@dzsi dvwz dvwzVar, @dzsi dqii dqiiVar) {
        String str;
        if (dvwzVar != null && (dvwzVar.a & 1) != 0) {
            str = dvwzVar.b;
        } else if (dqiiVar == null || (dqiiVar.a & 8) == 0) {
            return "";
        } else {
            str = dqiiVar.d;
        }
        return g(str);
    }

    private static String g(String str) {
        if (str.startsWith("//")) {
            String valueOf = String.valueOf(str);
            return valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:");
        }
        return str;
    }

    private static cqtd h(baab baabVar) {
        baab baabVar2 = baab.FAVORITES;
        int ordinal = baabVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 5) {
            return cqrt.g(baam.a(baabVar), ibm.b());
        }
        String valueOf = String.valueOf(baabVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Unsupported list type ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    private static cqtd i(baab baabVar) {
        baab baabVar2 = baab.FAVORITES;
        int ordinal = baabVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 5) {
            return cqtt.g(baam.c(baabVar));
        }
        String valueOf = String.valueOf(baabVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Unsupported list type ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    private final jaz j() {
        String c;
        bnjh n = bnji.n();
        bnio bnioVar = (bnio) n;
        bnioVar.c = cqrt.g(2131232445, ibm.m());
        if (!this.m.b() || this.j != 0) {
            c = this.f.a().c(this.j, this.c.aT());
        } else {
            c = this.a.getResources().getString(R.string.USER_LIST_DEFAULT_VISIT_JUSTIFICATION);
        }
        bnioVar.a = c;
        bnioVar.h = Integer.valueOf(this.m.a());
        return n.a();
    }

    public final void a(ilo iloVar) {
        this.c = iloVar;
        this.k = this.g.a().a(iloVar, this.a);
        this.n = bkjb.m(iloVar, false, false);
    }

    public final List<jaz> b(int i) {
        bikf bikfVar;
        bkjb bkjbVar;
        String str;
        String string;
        cqtd i2;
        bkjb bkjbVar2;
        String string2;
        if (this.c.ad() != null) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        int i3 = 5;
        baab baabVar = null;
        int i4 = 2;
        int i5 = 0;
        if (this.m.e()) {
            if (this.m.b() && this.m.c()) {
                F.g(j());
            }
            if (this.m.b() && !this.m.c()) {
                F.g(j());
            }
            dvwr dvwrVar = this.c.h().bj;
            if (dvwrVar == null) {
                dvwrVar = dvwr.b;
            }
            if (dvwrVar.a.size() > 0) {
                dvwr dvwrVar2 = this.c.h().bj;
                if (dvwrVar2 == null) {
                    dvwrVar2 = dvwr.b;
                }
                for (dvwp dvwpVar : dvwrVar2.a) {
                    baab baabVar2 = baab.FAVORITES;
                    int a = dvwn.a(dvwpVar.b);
                    int i6 = a - 1;
                    if (a == 0) {
                        throw null;
                    }
                    if (i6 == 0) {
                        dvwz dvwzVar = dvwpVar.b == 1 ? (dvwz) dvwpVar.c : dvwz.d;
                        bnjh n = bnji.n();
                        bnio bnioVar = (bnio) n;
                        bnioVar.d = f(dvwzVar, null);
                        bnioVar.a = dbrz.e("  •  ").g(dvwzVar.c);
                        bnioVar.h = Integer.valueOf(this.m.a());
                        e(n, dvwpVar);
                        if (dvwpVar.e) {
                            bnioVar.g = false;
                        }
                        F.g(n.a());
                    } else if (i6 == 1) {
                        dqie dqieVar = dvwpVar.b == 2 ? (dqie) dvwpVar.c : dqie.d;
                        bnjh n2 = bnji.n();
                        dgly dglyVar = dqieVar.c;
                        if (dglyVar == null) {
                            dglyVar = dgly.c;
                        }
                        bnio bnioVar2 = (bnio) n2;
                        bnioVar2.a = acls.a(dglyVar);
                        bnioVar2.h = Integer.valueOf(this.m.a());
                        int i7 = dqieVar.a;
                        if (i7 == 2) {
                            int a2 = dqid.a(((Integer) dqieVar.b).intValue());
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            int i8 = a2 - 1;
                            if (i8 != 1) {
                                if (i8 == 3) {
                                    bnioVar2.c = h(baab.FAVORITES);
                                    i2 = i(baab.FAVORITES);
                                } else if (i8 == 4) {
                                    bnioVar2.c = h(baab.WANT_TO_GO);
                                    i2 = i(baab.WANT_TO_GO);
                                } else if (i8 == 5) {
                                    bnioVar2.c = h(baab.STARRED_PLACES);
                                    i2 = i(baab.STARRED_PLACES);
                                } else if (i8 == 6) {
                                    bnioVar2.c = h(baab.CUSTOM);
                                    i2 = i(baab.CUSTOM);
                                }
                                bnioVar2.e = i2;
                            } else {
                                bnioVar2.c = cqrt.g(2131231652, ibm.R());
                            }
                        } else if (i7 == 3) {
                            bnioVar2.d = g((String) dqieVar.b);
                        }
                        e(n2, dvwpVar);
                        if (dvwpVar.e) {
                            bnioVar2.g = false;
                        }
                        F.g(n2.a());
                    } else if (i6 == i4) {
                        dgfs dgfsVar = (dvwpVar.b == 3 ? (dqii) dvwpVar.c : dqii.e).c;
                        if (dgfsVar == null) {
                            dgfsVar = dgfs.f;
                        }
                        byee byeeVar = new byee(dgfsVar, this.c.aT(), this.c.an(), this.c.ao());
                        if (byeeVar.d()) {
                            Activity activity = this.a;
                            Object[] objArr = new Object[i4];
                            objArr[0] = (dvwpVar.b == 3 ? (dqii) dvwpVar.c : dqii.e).b;
                            Activity activity2 = this.a;
                            cqat cqatVar = this.d;
                            bydl g = bydm.g(activity2);
                            g.b(ibm.I().b(activity2));
                            objArr[1] = new bydr(activity2, cqatVar, g.a()).a(byeeVar);
                            string2 = activity.getString(R.string.SELECTED_SECONDARY_HOURS, objArr);
                        } else {
                            Activity activity3 = this.a;
                            Object[] objArr2 = new Object[1];
                            objArr2[0] = (dvwpVar.b == 3 ? (dqii) dvwpVar.c : dqii.e).b;
                            string2 = activity3.getString(R.string.SELECTED_SECONDARY_HOURS_ONLY_LABEL, objArr2);
                        }
                        bnjh n3 = bnji.n();
                        bnio bnioVar3 = (bnio) n3;
                        bnioVar3.d = f(null, dvwpVar.b == 3 ? (dqii) dvwpVar.c : dqii.e);
                        bnioVar3.a = string2;
                        bnioVar3.f = cjtd.a(dtyb.ba);
                        bnioVar3.h = Integer.valueOf(this.m.a());
                        bnioVar3.g = Boolean.valueOf(!dvwpVar.e);
                        F.g(n3.a());
                    } else if (i6 == 3) {
                        final dhtg dhtgVar = dvwpVar.b == 6 ? (dhtg) dvwpVar.c : dhtg.f;
                        bnjh n4 = bnji.n();
                        bnio bnioVar4 = (bnio) n4;
                        bnioVar4.d = dhtgVar.a;
                        bnioVar4.a = dhtgVar.b;
                        bnioVar4.b = dhtgVar.c;
                        bnioVar4.i = 1;
                        final Runnable runnable = new Runnable(this, dhtgVar) { // from class: bniz
                            private final bnje a;
                            private final dhtg b;

                            {
                                this.a = this;
                                this.b = dhtgVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                dgeo dgeoVar;
                                bnje bnjeVar = this.a;
                                dhtg dhtgVar2 = this.b;
                                Toast.makeText(bnjeVar.a, (int) R.string.UNKNOWN_ERROR, 0).show();
                                dgep dgepVar = dhtgVar2.d;
                                if (dgepVar == null) {
                                    dgepVar = dgep.f;
                                }
                                if (dgepVar.b == 4) {
                                    dgeoVar = (dgeo) dgepVar.c;
                                } else {
                                    dgeoVar = dgeo.c;
                                }
                                bvoo.j(new bvon("URL: %s", dgeoVar.b));
                            }
                        };
                        n4.b(new Runnable(this, dhtgVar, runnable) { // from class: bnja
                            private final bnje a;
                            private final dhtg b;
                            private final Runnable c;

                            {
                                this.a = this;
                                this.b = dhtgVar;
                                this.c = runnable;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                bnje bnjeVar = this.a;
                                dhtg dhtgVar2 = this.b;
                                Runnable runnable2 = this.c;
                                beqf a3 = bnjeVar.b.a();
                                dgep dgepVar = dhtgVar2.d;
                                if (dgepVar == null) {
                                    dgepVar = dgep.f;
                                }
                                int c = a3.c(dgepVar, 6, bwrs.a(bnjeVar.c), dcdc.r(dhtgVar2.e));
                                int i9 = c - 1;
                                baab baabVar3 = baab.FAVORITES;
                                if (c != 0) {
                                    if (i9 != 0 && i9 != 2) {
                                        return;
                                    }
                                    bnjeVar.a.runOnUiThread(runnable2);
                                    return;
                                }
                                throw null;
                            }
                        });
                        e(n4, dvwpVar);
                        F.g(n4.a());
                    } else if (i6 != 4) {
                        if (i6 == i3 && this.m.g() && (bkjbVar2 = this.n) != null) {
                            F.g(bkjbVar2);
                        }
                    } else if (this.h.getCategoricalSearchParameters().w()) {
                        bnjh n5 = bnji.n();
                        bnio bnioVar5 = (bnio) n5;
                        bnioVar5.i = Integer.valueOf(i4);
                        dsrj<dgii> dsrjVar = (dvwpVar.b == 7 ? (dghq) dvwpVar.c : dghq.b).a;
                        dccx F2 = dcdc.F();
                        for (dgii dgiiVar : dsrjVar) {
                            F2.g(cqgr.fT(new bmiy(), new bmja(dgiiVar)));
                        }
                        n5.d(F2.f());
                        bnioVar5.g = Boolean.valueOf(!dvwpVar.e);
                        e(n5, dvwpVar);
                        F.g(n5.a());
                    }
                    i3 = 5;
                    i4 = 2;
                }
            }
        } else {
            if (this.m.b()) {
                F.g(j());
            }
            if (!this.m.d()) {
                azwv a3 = this.e.a().a(azxb.f(this.c.ai(), this.c.aj()));
                if (a3 != null) {
                    dcde C = dcbg.b(a3.n()).C(bnjb.a);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    dcdc h = C.h(baab.CUSTOM);
                    int size = h.size();
                    azwu azwuVar = null;
                    for (int i9 = 0; i9 < size; i9++) {
                        azwu azwuVar2 = (azwu) h.get(i9);
                        if (!azwuVar2.f()) {
                            baabVar = baab.CUSTOM;
                            arrayDeque.addFirst(azwuVar2.c());
                        } else if (azwuVar == null) {
                            azwuVar = azwuVar2;
                        }
                    }
                    if (!this.l) {
                        if (a3.f()) {
                            baabVar = baab.STARRED_PLACES;
                            arrayDeque.addFirst(this.a.getString(R.string.DEFAULT_LIST_STARRED_PLACES));
                        }
                        if (C.m(baab.WANT_TO_GO)) {
                            baab baabVar3 = baab.WANT_TO_GO;
                            arrayDeque.addFirst(this.a.getString(R.string.DEFAULT_LIST_WANT_TO_GO));
                            baabVar = baabVar3;
                        }
                        if (C.m(baab.FAVORITES)) {
                            baabVar = baab.FAVORITES;
                            arrayDeque.addFirst(this.a.getString(R.string.DEFAULT_LIST_FAVORITES));
                        }
                    }
                    if (!arrayDeque.isEmpty() && baabVar != null) {
                        bnjh n6 = bnji.n();
                        bnio bnioVar6 = (bnio) n6;
                        bnioVar6.c = h(baabVar);
                        bnioVar6.e = i(baabVar);
                        dbsk.a(!arrayDeque.isEmpty());
                        int size2 = arrayDeque.size();
                        if (size2 == 1) {
                            Activity activity4 = this.a;
                            String str2 = (String) arrayDeque.pollFirst();
                            dbsk.s(str2);
                            string = activity4.getString(R.string.SAVED_IN_LIST, new Object[]{str2});
                        } else if (size2 != 2) {
                            Activity activity5 = this.a;
                            String str3 = (String) arrayDeque.pollFirst();
                            dbsk.s(str3);
                            int i10 = size2 - 1;
                            string = activity5.getString(R.string.SAVED_IN_THREE_OR_MORE_LISTS, new Object[]{str3, this.a.getResources().getQuantityString(R.plurals.SAVED_IN_MORE_LISTS_COUNT, i10, Integer.valueOf(i10))});
                        } else {
                            Activity activity6 = this.a;
                            String str4 = (String) arrayDeque.pollFirst();
                            dbsk.s(str4);
                            String str5 = (String) arrayDeque.pollFirst();
                            dbsk.s(str5);
                            string = activity6.getString(R.string.SAVED_IN_TWO_LISTS, new Object[]{str4, str5});
                        }
                        bnioVar6.a = string;
                        int ordinal = baabVar.ordinal();
                        bnioVar6.f = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? cjtd.b : cjtd.a(dtyb.bg) : cjtd.a(dtyb.bu) : cjtd.a(dtyb.bx) : cjtd.a(dtyb.bh);
                        bnioVar6.h = Integer.valueOf(this.m.a());
                        F.g(n6.a());
                    } else if (azwuVar != null) {
                        bnjh n7 = bnji.n();
                        bnio bnioVar7 = (bnio) n7;
                        bnioVar7.c = h(baab.CUSTOM);
                        bnioVar7.e = i(baab.CUSTOM);
                        bnioVar7.a = azwuVar.c();
                        bnioVar7.f = cjtd.a(dtyb.bi);
                        bnioVar7.h = Integer.valueOf(this.m.a());
                        F.g(n7.a());
                    }
                }
                if (d() != null) {
                    bnjh n8 = bnji.n();
                    dgmo d = d();
                    String str6 = "";
                    if (d == null) {
                        str = str6;
                    } else {
                        str = d.c;
                        if (str.startsWith("//")) {
                            String valueOf = String.valueOf(str);
                            str = valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:");
                        }
                    }
                    bnio bnioVar8 = (bnio) n8;
                    bnioVar8.d = str;
                    dgmo d2 = d();
                    if (d2 != null) {
                        str6 = d2.a;
                    }
                    bnioVar8.a = str6;
                    bnioVar8.h = Integer.valueOf(this.m.a());
                    F.g(n8.a());
                }
            }
            dbsk.s(this.k);
            if (Boolean.valueOf(!dbsj.d(bikfVar.a())).booleanValue()) {
                bnjh n9 = bnji.n();
                bikf bikfVar2 = this.k;
                dbsk.s(bikfVar2);
                bnio bnioVar9 = (bnio) n9;
                bnioVar9.c = cqrt.f(bikfVar2.b());
                bikf bikfVar3 = this.k;
                dbsk.s(bikfVar3);
                bnioVar9.a = dbsj.e(bikfVar3.a());
                bnioVar9.h = Integer.valueOf(this.m.a());
                F.g(n9.a());
            }
            if (!dbsj.d(this.c.ab())) {
                bnjh c = c();
                c.c(Integer.valueOf(this.m.a()));
                F.g(c.a());
            }
            if (this.m.g() && (bkjbVar = this.n) != null) {
                F.g(bkjbVar);
            }
        }
        dcdc<jaz> f = F.f();
        dccx F3 = dcdc.F();
        for (jaz jazVar : f) {
            if (!jazVar.i().booleanValue()) {
                F3.g(jazVar);
            } else if (i5 < i) {
                F3.g(jazVar);
                i5++;
            }
        }
        return F3.f();
    }

    public final bnjh c() {
        bnjh n = bnji.n();
        bnio bnioVar = (bnio) n;
        bnioVar.c = cqrt.g(2131231652, ibm.R());
        String ab = this.c.ab();
        CharSequence charSequence = "";
        if (!dbsj.d(ab)) {
            if (bfdq.a(this.c.ac(), this.d)) {
                charSequence = this.a.getString(R.string.SEARCH_LIST_GAS_PRICE_ASTERISK);
            }
            bvsu c = this.i.c(R.string.SEARCH_LIST_GAS_PRICE_LABELED);
            bvsv a = this.i.a(ab);
            a.i();
            c.a(a, this.i.c(R.string.PLACE_GAS_PRICE_REGULAR), charSequence);
            charSequence = c.c();
        }
        bnioVar.a = charSequence;
        bnioVar.f = cjtd.a(dtyb.bn);
        return n;
    }
}
