package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.google.android.apps.gmm.map.model.directions.LaneGuidance;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: amuo  reason: default package */
/* loaded from: classes2.dex */
public class amuo {
    public static final /* synthetic */ int S = 0;
    private static final int W = dovu.values().length;
    public final List<amup> A;
    public final List<amup> B;
    public final List<dozz> C;
    public final List<amut> D;
    public final int E;
    public final List<LaneGuidance> F;
    public final List<dpdf> G;
    @dzsi
    public final dnfi H;
    @dzsi
    public final dozc I;
    @dzsi
    public final String J;
    @dzsi
    public final String K;
    @dzsi
    public final String L;
    public final List<dpdj> M;
    public final boolean N;
    public final dcdc<amtn> O;
    @dzsi
    public final String P;
    @dzsi
    public amuo Q;
    @dzsi
    public amuo R;
    private final String T;
    private final List<amup> U;
    private final List<amup> V;
    @dzsi
    public final dpec a;
    @dzsi
    public final amuq b;
    public final akra c;
    public final dgau d;
    public final dpdn e;
    public final dpdp f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public int k;
    public final int l;
    public final int m;
    public final float n;
    public final float o;
    public final Spanned p;
    public final String q;
    public final boolean r;
    @dzsi
    public final CharSequence s;
    public final boolean t;
    @dzsi
    public final amup u;
    @dzsi
    public final amup v;
    @dzsi
    public final amup w;
    @dzsi
    public final amup x;
    @dzsi
    public final amup y;
    public final List<amup> z;

    /* JADX INFO: Access modifiers changed from: protected */
    public amuo(amun amunVar) {
        dgau dgauVar = amunVar.a;
        dbsk.s(dgauVar);
        this.d = dgauVar;
        dpdn dpdnVar = amunVar.b;
        dbsk.s(dpdnVar);
        this.e = dpdnVar;
        dpdp dpdpVar = amunVar.c;
        dbsk.s(dpdpVar);
        this.f = dpdpVar;
        this.g = amunVar.d;
        this.h = amunVar.e;
        akra akraVar = amunVar.f;
        dbsk.s(akraVar);
        this.c = akraVar;
        this.i = amunVar.g;
        this.j = amunVar.h;
        String str = amunVar.i;
        dbsk.s(str);
        this.T = str;
        this.s = amunVar.j;
        this.t = amunVar.k;
        this.k = amunVar.l;
        this.l = amunVar.m;
        this.m = amunVar.n;
        this.n = amunVar.o;
        this.o = amunVar.p;
        List<amup> list = amunVar.q;
        dbsk.s(list);
        this.U = list;
        List<dozz> list2 = amunVar.r;
        dbsk.s(list2);
        this.C = list2;
        List<amut> list3 = amunVar.s;
        dbsk.s(list3);
        this.D = list3;
        List<LaneGuidance> list4 = amunVar.t;
        dbsk.s(list4);
        this.F = list4;
        List<dpdf> list5 = amunVar.u;
        dbsk.s(list5);
        this.G = list5;
        this.a = amunVar.w;
        this.b = amunVar.x;
        this.H = amunVar.y;
        this.K = amunVar.A;
        this.L = amunVar.B;
        this.J = amunVar.z;
        this.I = amunVar.v;
        this.r = amunVar.D;
        List<dpdj> list6 = amunVar.E;
        dbsk.s(list6);
        this.M = list6;
        this.N = amunVar.F;
        this.O = amunVar.G;
        this.P = amunVar.H;
        int i = -1;
        int i2 = 0;
        for (amut amutVar : list3) {
            dbsk.m(amutVar.g == null, "Attempted to reassign Step for existing StepGuidance");
            amutVar.g = this;
            if (i == -1) {
                i = amutVar.a == doxu.PREPARE ? i2 : -1;
            }
            i2++;
        }
        this.E = i;
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.V = new ArrayList();
        this.B = new ArrayList();
        List<amup> list7 = this.U;
        int i3 = W;
        amup[][] amupVarArr = new amup[i3];
        int[] iArr = new int[i3];
        int size = list7.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = list7.get(i4).b().o;
            iArr[i5] = iArr[i5] + 1;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = iArr[i6];
            if (i7 > 0) {
                amupVarArr[i6] = new amup[i7];
            }
        }
        for (amup amupVar : dchl.l(list7)) {
            amupVar.a = this;
            int i8 = amupVar.b().o;
            amup[] amupVarArr2 = amupVarArr[i8];
            int i9 = iArr[i8] - 1;
            iArr[i8] = i9;
            amupVarArr2[i9] = amupVar;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            dbsk.l(iArr[i10] == 0);
        }
        if (this.d != dgau.UTURN) {
            l(amupVarArr, dovu.TYPE_TO_ROAD_NAME, this.z);
        } else {
            l(amupVarArr, dovu.TYPE_AT_ROAD_NAME, this.z);
            l(amupVarArr, dovu.TYPE_TO_ROAD_NAME, this.A);
        }
        l(amupVarArr, dovu.TYPE_TOWARD_NAME, this.A);
        l(amupVarArr, dovu.TYPE_TOWARD_ROAD_NAME, this.A);
        l(amupVarArr, dovu.TYPE_FOLLOW_ROAD_NAME, this.V);
        l(amupVarArr, dovu.TYPE_INTERSECTION, this.B);
        if (this.d == dgau.DESTINATION) {
            amup j = j(amupVarArr, dovu.TYPE_TITLE);
            if (j != null) {
                this.z.add(j);
            }
            l(amupVarArr, dovu.TYPE_ADDRESS, this.A);
        }
        this.u = j(amupVarArr, dovu.TYPE_EXIT_NUMBER);
        this.v = j(amupVarArr, dovu.TYPE_EXIT_NAME);
        this.w = j(amupVarArr, dovu.TYPE_TRANSIT_SIGNPOST);
        this.x = j(amupVarArr, dovu.TYPE_TRANSIT_ENTRANCE_NAME);
        this.y = j(amupVarArr, dovu.TYPE_TRANSIT_EXIT_NAME);
        String str2 = this.T;
        List<amup> list8 = this.U;
        SpannableString spannableString = new SpannableString(str2);
        if (!Bidi.requiresBidi(str2.toCharArray(), 0, str2.length())) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list8);
            Collections.sort(arrayList, amum.a);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                amup amupVar2 = (amup) arrayList.get(i11);
                String c = amupVar2.c();
                if (c.length() != 0) {
                    int i12 = -1;
                    do {
                        i12 = str2.indexOf(c, i12 + 1);
                        if (i12 < 0) {
                            break;
                        }
                    } while (spannableString.getSpans(i12, c.length() + i12, Object.class).length != 0);
                    if (i12 >= 0) {
                        spannableString.setSpan(amupVar2, i12, c.length() + i12, 33);
                    }
                }
            }
        }
        this.p = spannableString;
        String str3 = amunVar.C;
        if (str3 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
            for (Object obj : spannableStringBuilder.getSpans(0, spannableString.length(), amup.class)) {
                amup amupVar3 = (amup) obj;
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(amupVar3), spannableStringBuilder.getSpanEnd(amupVar3), (CharSequence) amupVar3.d());
            }
            str3 = spannableStringBuilder.toString();
        }
        this.q = str3;
    }

    public static amun i() {
        amun amunVar = new amun();
        amunVar.a = dgau.MANEUVER_UNKNOWN;
        amunVar.b = dpdn.SIDE_UNSPECIFIED;
        amunVar.c = dpdp.TURN_UNKNOWN;
        amunVar.f = akra.e(dcyn.a, dcyn.a);
        amunVar.i = "";
        return amunVar;
    }

    @dzsi
    private static amup j(amup[][] amupVarArr, dovu dovuVar) {
        amup[] amupVarArr2 = amupVarArr[dovuVar.o];
        if (amupVarArr2 == null || amupVarArr2.length <= 0) {
            return null;
        }
        return amupVarArr2[0];
    }

    private final dbsb k() {
        StringBuilder sb = new StringBuilder();
        for (dozz dozzVar : this.C) {
            sb.append(dozzVar.g);
            sb.append(",");
        }
        dbsb b = dbsc.b(this);
        b.c();
        b.b("location", this.c.T());
        b.b("maneuverType", this.d);
        b.b("turnSide", this.e);
        b.f("roundaboutTurnAngle", this.g);
        b.f("stepNumber", this.i);
        b.f("polylineVertexOffset", this.j);
        b.f("distanceFromPrevStepMeters", this.k);
        b.f("timeFromPrevStepSeconds", this.m);
        b.e("incomingBearing", this.n);
        b.e("outgoingBearing", this.o);
        b.b("text", this.p);
        b.b("secondaryText", this.s);
        b.b("exitNumber", this.u);
        b.b("exitName", this.v);
        b.b("directCues", this.z);
        String str = null;
        b.b("indirectCues", this.A.isEmpty() ? null : this.A);
        b.b("followCues", this.V.isEmpty() ? null : this.V);
        b.b("intersectionCues", this.B.isEmpty() ? null : this.B);
        b.b("notices", this.C.isEmpty() ? null : sb.toString());
        b.b("stepGuidances", this.D);
        b.b("level", this.H);
        b.b("stepIconId", this.K);
        b.b("stepIconDescription", this.L);
        b.b("ved", this.J);
        b.b("laneGuidances", this.F.isEmpty() ? null : this.F);
        b.b("navigationPopups", this.G.isEmpty() ? null : this.G);
        if (!this.q.isEmpty()) {
            str = this.q;
        }
        b.b("spokenText", str);
        b.h("namesValidForEntireStep", this.r);
        b.b("drivingSide", this.I);
        b.h("isSyntheticPolyline", this.N);
        b.b("stepId", this.P);
        return b;
    }

    private static void l(amup[][] amupVarArr, dovu dovuVar, List<amup> list) {
        amup[] amupVarArr2 = amupVarArr[dovuVar.o];
        if (amupVarArr2 != null) {
            for (amup amupVar : amupVarArr2) {
                dbsk.s(amupVar);
                list.add(amupVar);
            }
        }
    }

    @dzsi
    public final amut a() {
        for (amut amutVar : this.D) {
            if (amutVar.a == doxu.ACT) {
                return amutVar;
            }
        }
        return null;
    }

    @dzsi
    public final amup b() {
        Iterator<amup> it = (this.V.isEmpty() ? this.z : this.V).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public final boolean c() {
        return this.u != null;
    }

    public final boolean d() {
        return this.v != null;
    }

    public final boolean e() {
        return this.x != null;
    }

    public final boolean f() {
        return this.y != null;
    }

    public final String g() {
        dbsb k = k();
        k.f("#speedLimitChanges", this.M.size());
        return k.toString();
    }

    public final amun h() {
        amun amunVar = new amun();
        amunVar.a = this.d;
        amunVar.b = this.e;
        amunVar.c = this.f;
        amunVar.d = this.g;
        amunVar.e = this.h;
        amunVar.f = this.c;
        amunVar.g = this.i;
        amunVar.h = this.j;
        amunVar.i = this.T;
        amunVar.j = this.s;
        amunVar.k = this.t;
        amunVar.l = this.k;
        amunVar.n = this.m;
        amunVar.o = this.n;
        amunVar.p = this.o;
        amunVar.q = this.U;
        amunVar.r = this.C;
        amunVar.t = this.F;
        amunVar.w = this.a;
        amunVar.x = this.b;
        amunVar.y = this.H;
        amunVar.z = this.J;
        amunVar.A = this.K;
        amunVar.B = this.L;
        amunVar.C = this.q;
        amunVar.D = this.r;
        amunVar.v = this.I;
        amunVar.E = new ArrayList(this.M);
        amunVar.F = this.N;
        amunVar.G = this.O;
        amunVar.H = this.P;
        dccx F = dcdc.F();
        for (amut amutVar : this.D) {
            amus amusVar = new amus();
            amusVar.a = amutVar.a;
            amusVar.b = amutVar.b;
            amusVar.c = amutVar.c;
            amusVar.d = amutVar.d;
            amusVar.e = amutVar.e;
            amusVar.f = amutVar.f;
            amusVar.g = amutVar.h;
            amusVar.h = amutVar.g;
            for (dbty<dbsg<amuw>> dbtyVar : amutVar.i) {
                amusVar.b(dbtyVar);
            }
            amusVar.h = null;
            F.g(amusVar.a());
        }
        amunVar.s = F.f();
        return amunVar;
    }

    public final String toString() {
        dbsb k = k();
        k.b("speedLimitChanges", this.M);
        k.b("summary", this.a);
        return k.toString();
    }
}
