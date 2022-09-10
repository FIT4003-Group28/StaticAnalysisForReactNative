package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dsqc  reason: default package */
/* loaded from: classes.dex */
final class dsqc extends dsqb<dsqu> {
    @Override // defpackage.dsqb
    public final boolean a(dssj dssjVar) {
        return dssjVar instanceof dsqs;
    }

    @Override // defpackage.dsqb
    public final dsqh<dsqu> b(Object obj) {
        return ((dsqs) obj).V;
    }

    @Override // defpackage.dsqb
    public final dsqh<dsqu> c(Object obj) {
        return ((dsqs) obj).e();
    }

    @Override // defpackage.dsqb
    public final void d(Object obj) {
        b(obj).b();
    }

    @Override // defpackage.dsqb
    public final <UT, UB> UB e(dssw dsswVar, Object obj, dsqa dsqaVar, dsqh<dsqu> dsqhVar, UB ub, dstx<UT, UB> dstxVar) {
        Object valueOf;
        Object l;
        ArrayList arrayList;
        dsqv dsqvVar = (dsqv) obj;
        int a = dsqvVar.a();
        dsqu dsquVar = dsqvVar.d;
        if (!dsquVar.d || !dsquVar.e) {
            if (dsqvVar.e() == dsur.ENUM) {
                int h = dsswVar.h();
                if (dsqvVar.d.a.a(h) == null) {
                    return (UB) dstd.v(a, h, ub, dstxVar);
                }
                valueOf = Integer.valueOf(h);
            } else {
                switch (dsqvVar.e().ordinal()) {
                    case 0:
                        valueOf = Double.valueOf(dsswVar.d());
                        break;
                    case 1:
                        valueOf = Float.valueOf(dsswVar.e());
                        break;
                    case 2:
                        valueOf = Long.valueOf(dsswVar.g());
                        break;
                    case 3:
                        valueOf = Long.valueOf(dsswVar.f());
                        break;
                    case 4:
                        valueOf = Integer.valueOf(dsswVar.h());
                        break;
                    case 5:
                        valueOf = Long.valueOf(dsswVar.i());
                        break;
                    case 6:
                        valueOf = Integer.valueOf(dsswVar.j());
                        break;
                    case 7:
                        valueOf = Boolean.valueOf(dsswVar.k());
                        break;
                    case 8:
                        valueOf = dsswVar.l();
                        break;
                    case 9:
                        valueOf = dsswVar.q(dsqvVar.c.getClass(), dsqaVar);
                        break;
                    case 10:
                        valueOf = dsswVar.o(dsqvVar.c.getClass(), dsqaVar);
                        break;
                    case 11:
                        valueOf = dsswVar.s();
                        break;
                    case 12:
                        valueOf = Integer.valueOf(dsswVar.t());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        valueOf = Integer.valueOf(dsswVar.v());
                        break;
                    case 15:
                        valueOf = Long.valueOf(dsswVar.w());
                        break;
                    case 16:
                        valueOf = Integer.valueOf(dsswVar.x());
                        break;
                    case 17:
                        valueOf = Long.valueOf(dsswVar.y());
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (dsqvVar.f()) {
                dsqhVar.n(dsqvVar.d, valueOf);
            } else {
                int ordinal = dsqvVar.e().ordinal();
                if ((ordinal == 9 || ordinal == 10) && (l = dsqhVar.l(dsqvVar.d)) != null) {
                    valueOf = dsrk.g(l, valueOf);
                }
                dsqhVar.m(dsqvVar.d, valueOf);
            }
        } else {
            dsur dsurVar = dsur.DOUBLE;
            switch (dsqvVar.e().ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    dsswVar.z(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    dsswVar.A(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    dsswVar.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    dsswVar.B(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    dsswVar.D(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    dsswVar.E(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    dsswVar.F(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    dsswVar.G(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    String valueOf2 = String.valueOf(dsqvVar.d.c);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 23);
                    sb.append("Type cannot be packed: ");
                    sb.append(valueOf2);
                    throw new IllegalStateException(sb.toString());
                case 12:
                    arrayList = new ArrayList();
                    dsswVar.N(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    dsswVar.O(arrayList);
                    ub = (UB) dstd.t(a, arrayList, dsqvVar.d.a, ub, dstxVar);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    dsswVar.P(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    dsswVar.Q(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    dsswVar.R(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    dsswVar.S(arrayList);
                    break;
            }
            dsqhVar.m(dsqvVar.d, arrayList);
        }
        return ub;
    }

    @Override // defpackage.dsqb
    public final int f(Map.Entry<?, ?> entry) {
        return ((dsqu) entry.getKey()).b;
    }

    @Override // defpackage.dsqb
    public final Object g(dsqa dsqaVar, dssj dssjVar, int i) {
        return dsqaVar.d(dssjVar, i);
    }

    @Override // defpackage.dsqb
    public final void h(dssw dsswVar, Object obj, dsqa dsqaVar, dsqh<dsqu> dsqhVar) {
        dsqv dsqvVar = (dsqv) obj;
        dsqhVar.m(dsqvVar.d, dsswVar.o(dsqvVar.c.getClass(), dsqaVar));
    }

    @Override // defpackage.dsqb
    public final void i(dspd dspdVar, Object obj, dsqa dsqaVar, dsqh<dsqu> dsqhVar) {
        dsqv dsqvVar = (dsqv) obj;
        dssj bJ = dsqvVar.c.NH().bJ();
        ByteBuffer wrap = ByteBuffer.wrap(dspdVar.G());
        if (wrap.hasArray()) {
            dson dsonVar = new dson(wrap);
            dsst.a.b(bJ).f(bJ, dsonVar, dsqaVar);
            dsqhVar.m(dsqvVar.d, bJ);
            if (dsonVar.a() != Integer.MAX_VALUE) {
                throw dsrm.e();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // defpackage.dsqb
    public final void j(dspq dspqVar, Map.Entry<?, ?> entry) {
        dsqu dsquVar = (dsqu) entry.getKey();
        if (dsquVar.d) {
            dsur dsurVar = dsur.DOUBLE;
            switch (dsquVar.c.ordinal()) {
                case 0:
                    dstd.G(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 1:
                    dstd.H(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 2:
                    dstd.I(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 3:
                    dstd.J(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 4:
                    dstd.N(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 5:
                    dstd.L(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 6:
                    dstd.Q(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 7:
                    dstd.T(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 8:
                    dstd.U(dsquVar.b, (List) entry.getValue(), dspqVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    dstd.X(dsquVar.b, (List) entry.getValue(), dspqVar, dsst.a.a(list.get(0).getClass()));
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    dstd.W(dsquVar.b, (List) entry.getValue(), dspqVar, dsst.a.a(list2.get(0).getClass()));
                    return;
                case 11:
                    dstd.V(dsquVar.b, (List) entry.getValue(), dspqVar);
                    return;
                case 12:
                    dstd.O(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 13:
                    dstd.N(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 14:
                    dstd.R(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 15:
                    dstd.M(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 16:
                    dstd.P(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                case 17:
                    dstd.K(dsquVar.b, (List) entry.getValue(), dspqVar, dsquVar.e);
                    return;
                default:
                    return;
            }
        }
        dsur dsurVar2 = dsur.DOUBLE;
        switch (dsquVar.c.ordinal()) {
            case 0:
                dspqVar.e(dsquVar.b, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                dspqVar.d(dsquVar.b, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                dspqVar.b(dsquVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                dspqVar.g(dsquVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                dspqVar.h(dsquVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                dspqVar.i(dsquVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                dspqVar.j(dsquVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                dspqVar.k(dsquVar.b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                dspqVar.l(dsquVar.b, (String) entry.getValue());
                return;
            case 9:
                dspqVar.r(dsquVar.b, entry.getValue(), dsst.a.a(entry.getValue().getClass()));
                return;
            case 10:
                dspqVar.q(dsquVar.b, entry.getValue(), dsst.a.a(entry.getValue().getClass()));
                return;
            case 11:
                dspqVar.m(dsquVar.b, (dspd) entry.getValue());
                return;
            case 12:
                dspqVar.n(dsquVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                dspqVar.h(dsquVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                dspqVar.a(dsquVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                dspqVar.c(dsquVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                dspqVar.o(dsquVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                dspqVar.p(dsquVar.b, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
