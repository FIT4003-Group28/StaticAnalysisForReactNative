package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.e.a.b.d.g.i1;
import c.e.a.b.d.g.k1;
import c.e.a.b.d.g.m1;
import c.e.a.b.d.g.q1;
import com.google.android.gms.common.internal.x.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
public final class v9 extends o9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v9(r9 r9Var) {
        super(r9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(m1.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.n(); i++) {
            if (str.equals(aVar.d(i).p())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Builder extends c.e.a.b.d.g.n6> Builder a(Builder builder, byte[] bArr) {
        c.e.a.b.d.g.p4 b2 = c.e.a.b.d.g.p4.b();
        if (b2 != null) {
            builder.a(bArr, b2);
            return builder;
        }
        builder.a(bArr);
        return builder;
    }

    private static String a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Long> a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    private static List<c.e.a.b.d.g.k1> a(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                k1.a A = c.e.a.b.d.g.k1.A();
                for (String str : bundle.keySet()) {
                    k1.a A2 = c.e.a.b.d.g.k1.A();
                    A2.a(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        A2.a(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        A2.b((String) obj);
                    } else if (obj instanceof Double) {
                        A2.a(((Double) obj).doubleValue());
                    }
                    A.a(A2);
                }
                if (A.m() > 0) {
                    arrayList.add((c.e.a.b.d.g.k1) A.i());
                }
            }
        }
        return arrayList;
    }

    private static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void a(StringBuilder sb, int i, c.e.a.b.d.g.s0 s0Var) {
        if (s0Var == null) {
            return;
        }
        a(sb, i);
        sb.append("filter {\n");
        if (s0Var.r()) {
            a(sb, i, "complement", Boolean.valueOf(s0Var.s()));
        }
        if (s0Var.t()) {
            a(sb, i, "param_name", i().b(s0Var.u()));
        }
        if (s0Var.n()) {
            int i2 = i + 1;
            c.e.a.b.d.g.v0 o = s0Var.o();
            if (o != null) {
                a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (o.n()) {
                    a(sb, i2, "match_type", o.o().name());
                }
                if (o.p()) {
                    a(sb, i2, "expression", o.q());
                }
                if (o.r()) {
                    a(sb, i2, "case_sensitive", Boolean.valueOf(o.s()));
                }
                if (o.u() > 0) {
                    a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str : o.t()) {
                        a(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                a(sb, i2);
                sb.append("}\n");
            }
        }
        if (s0Var.p()) {
            a(sb, i + 1, "number_filter", s0Var.q());
        }
        a(sb, i);
        sb.append("}\n");
    }

    private static void a(StringBuilder sb, int i, String str, c.e.a.b.d.g.o1 o1Var, String str2) {
        if (o1Var == null) {
            return;
        }
        a(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (o1Var.q() != 0) {
            a(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : o1Var.p()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (o1Var.o() != 0) {
            a(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : o1Var.n()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (o1Var.s() != 0) {
            a(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (c.e.a.b.d.g.h1 h1Var : o1Var.r()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(h1Var.n() ? Integer.valueOf(h1Var.o()) : null);
                sb.append(":");
                sb.append(h1Var.p() ? Long.valueOf(h1Var.q()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (o1Var.u() != 0) {
            a(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (c.e.a.b.d.g.p1 p1Var : o1Var.t()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(p1Var.n() ? Integer.valueOf(p1Var.o()) : null);
                sb.append(": [");
                int i10 = 0;
                for (Long l3 : p1Var.p()) {
                    long longValue = l3.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        a(sb, 3);
        sb.append("}\n");
    }

    private final void a(StringBuilder sb, int i, String str, c.e.a.b.d.g.t0 t0Var) {
        if (t0Var == null) {
            return;
        }
        a(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (t0Var.n()) {
            a(sb, i, "comparison_type", t0Var.o().name());
        }
        if (t0Var.p()) {
            a(sb, i, "match_as_float", Boolean.valueOf(t0Var.q()));
        }
        if (t0Var.r()) {
            a(sb, i, "comparison_value", t0Var.s());
        }
        if (t0Var.t()) {
            a(sb, i, "min_comparison_value", t0Var.u());
        }
        if (t0Var.v()) {
            a(sb, i, "max_comparison_value", t0Var.x());
        }
        a(sb, i);
        sb.append("}\n");
    }

    private static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        a(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void a(StringBuilder sb, int i, List<c.e.a.b.d.g.k1> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (c.e.a.b.d.g.k1 k1Var : list) {
            if (k1Var != null) {
                a(sb, i2);
                sb.append("param {\n");
                Double d2 = null;
                if (!c.e.a.b.d.g.k9.a() || !l().a(r.E0)) {
                    a(sb, i2, "name", i().b(k1Var.o()));
                    a(sb, i2, "string_value", k1Var.q());
                    a(sb, i2, "int_value", k1Var.r() ? Long.valueOf(k1Var.s()) : null);
                    if (k1Var.v()) {
                        d2 = Double.valueOf(k1Var.x());
                    }
                    a(sb, i2, "double_value", d2);
                } else {
                    a(sb, i2, "name", k1Var.n() ? i().b(k1Var.o()) : null);
                    a(sb, i2, "string_value", k1Var.p() ? k1Var.q() : null);
                    a(sb, i2, "int_value", k1Var.r() ? Long.valueOf(k1Var.s()) : null);
                    if (k1Var.v()) {
                        d2 = Double.valueOf(k1Var.x());
                    }
                    a(sb, i2, "double_value", d2);
                    if (k1Var.z() > 0) {
                        a(sb, i2, k1Var.y());
                    }
                }
                a(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(p pVar, fa faVar) {
        com.google.android.gms.common.internal.s.a(pVar);
        com.google.android.gms.common.internal.s.a(faVar);
        return !TextUtils.isEmpty(faVar.f7304c) || !TextUtils.isEmpty(faVar.s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.e.a.b.d.g.k1 b(c.e.a.b.d.g.i1 i1Var, String str) {
        for (c.e.a.b.d.g.k1 k1Var : i1Var.n()) {
            if (k1Var.o().equals(str)) {
                return k1Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(byte[] bArr) {
        com.google.android.gms.common.internal.s.a(bArr);
        j().g();
        MessageDigest y = z9.y();
        if (y == null) {
            c().s().a("Failed to get MD5");
            return 0L;
        }
        return z9.a(y.digest(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends Parcelable> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (b.a unused) {
            c().s().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c.e.a.b.d.g.i1 a(m mVar) {
        i1.a x = c.e.a.b.d.g.i1.x();
        x.b(mVar.f7478e);
        Iterator<String> it = mVar.f7479f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            k1.a A = c.e.a.b.d.g.k1.A();
            A.a(next);
            a(A, mVar.f7479f.a(next));
            x.a(A);
        }
        return (c.e.a.b.d.g.i1) x.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(c.e.a.b.d.g.i1 i1Var, String str) {
        c.e.a.b.d.g.k1 b2 = b(i1Var, str);
        if (b2 != null) {
            if (b2.p()) {
                return b2.q();
            }
            if (b2.r()) {
                return Long.valueOf(b2.s());
            }
            if (b2.v()) {
                return Double.valueOf(b2.x());
            }
            if (!c.e.a.b.d.g.k9.a() || !l().a(r.G0) || b2.z() <= 0) {
                return null;
            }
            List<c.e.a.b.d.g.k1> y = b2.y();
            ArrayList arrayList = new ArrayList();
            for (c.e.a.b.d.g.k1 k1Var : y) {
                if (k1Var != null) {
                    Bundle bundle = new Bundle();
                    for (c.e.a.b.d.g.k1 k1Var2 : k1Var.y()) {
                        if (k1Var2.p()) {
                            bundle.putString(k1Var2.o(), k1Var2.q());
                        } else if (k1Var2.r()) {
                            bundle.putLong(k1Var2.o(), k1Var2.s());
                        } else if (k1Var2.v()) {
                            bundle.putDouble(k1Var2.o(), k1Var2.x());
                        }
                    }
                    if (!bundle.isEmpty()) {
                        arrayList.add(bundle);
                    }
                }
            }
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(c.e.a.b.d.g.l1 l1Var) {
        if (l1Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (c.e.a.b.d.g.m1 m1Var : l1Var.n()) {
            if (m1Var != null) {
                a(sb, 1);
                sb.append("bundle {\n");
                if (m1Var.n()) {
                    a(sb, 1, "protocol_version", Integer.valueOf(m1Var.P()));
                }
                a(sb, 1, "platform", m1Var.j0());
                if (m1Var.r0()) {
                    a(sb, 1, "gmp_version", Long.valueOf(m1Var.o()));
                }
                if (m1Var.p()) {
                    a(sb, 1, "uploading_gmp_version", Long.valueOf(m1Var.q()));
                }
                if (m1Var.S()) {
                    a(sb, 1, "dynamite_version", Long.valueOf(m1Var.T()));
                }
                if (m1Var.J()) {
                    a(sb, 1, "config_version", Long.valueOf(m1Var.K()));
                }
                a(sb, 1, "gmp_app_id", m1Var.B());
                a(sb, 1, "admob_app_id", m1Var.R());
                a(sb, 1, "app_id", m1Var.p0());
                a(sb, 1, "app_version", m1Var.q0());
                if (m1Var.G()) {
                    a(sb, 1, "app_version_major", Integer.valueOf(m1Var.H()));
                }
                a(sb, 1, "firebase_instance_id", m1Var.F());
                if (m1Var.v()) {
                    a(sb, 1, "dev_cert_hash", Long.valueOf(m1Var.x()));
                }
                a(sb, 1, "app_store", m1Var.o0());
                if (m1Var.Z()) {
                    a(sb, 1, "upload_timestamp_millis", Long.valueOf(m1Var.a0()));
                }
                if (m1Var.b0()) {
                    a(sb, 1, "start_timestamp_millis", Long.valueOf(m1Var.c0()));
                }
                if (m1Var.d0()) {
                    a(sb, 1, "end_timestamp_millis", Long.valueOf(m1Var.e0()));
                }
                if (m1Var.f0()) {
                    a(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(m1Var.g0()));
                }
                if (m1Var.h0()) {
                    a(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(m1Var.i0()));
                }
                a(sb, 1, "app_instance_id", m1Var.u());
                a(sb, 1, "resettable_device_id", m1Var.r());
                a(sb, 1, "device_id", m1Var.I());
                a(sb, 1, "ds_id", m1Var.N());
                if (m1Var.s()) {
                    a(sb, 1, "limited_ad_tracking", Boolean.valueOf(m1Var.t()));
                }
                a(sb, 1, "os_version", m1Var.k0());
                a(sb, 1, "device_model", m1Var.l0());
                a(sb, 1, "user_default_language", m1Var.m0());
                if (m1Var.w()) {
                    a(sb, 1, "time_zone_offset_minutes", Integer.valueOf(m1Var.n0()));
                }
                if (m1Var.y()) {
                    a(sb, 1, "bundle_sequential_index", Integer.valueOf(m1Var.z()));
                }
                if (m1Var.C()) {
                    a(sb, 1, "service_upload", Boolean.valueOf(m1Var.D()));
                }
                a(sb, 1, "health_monitor", m1Var.A());
                if (!l().a(r.M0) && m1Var.L() && m1Var.M() != 0) {
                    a(sb, 1, "android_id", Long.valueOf(m1Var.M()));
                }
                if (m1Var.O()) {
                    a(sb, 1, "retry_counter", Integer.valueOf(m1Var.Q()));
                }
                List<c.e.a.b.d.g.q1> X = m1Var.X();
                if (X != null) {
                    for (c.e.a.b.d.g.q1 q1Var : X) {
                        if (q1Var != null) {
                            a(sb, 2);
                            sb.append("user_property {\n");
                            Double d2 = null;
                            a(sb, 2, "set_timestamp_millis", q1Var.n() ? Long.valueOf(q1Var.o()) : null);
                            a(sb, 2, "name", i().c(q1Var.p()));
                            a(sb, 2, "string_value", q1Var.r());
                            a(sb, 2, "int_value", q1Var.s() ? Long.valueOf(q1Var.t()) : null);
                            if (q1Var.u()) {
                                d2 = Double.valueOf(q1Var.v());
                            }
                            a(sb, 2, "double_value", d2);
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<c.e.a.b.d.g.g1> E = m1Var.E();
                String p0 = m1Var.p0();
                if (E != null) {
                    for (c.e.a.b.d.g.g1 g1Var : E) {
                        if (g1Var != null) {
                            a(sb, 2);
                            sb.append("audience_membership {\n");
                            if (g1Var.n()) {
                                a(sb, 2, "audience_id", Integer.valueOf(g1Var.o()));
                            }
                            if (g1Var.s()) {
                                a(sb, 2, "new_audience", Boolean.valueOf(g1Var.t()));
                            }
                            a(sb, 2, "current_data", g1Var.p(), p0);
                            if (g1Var.q()) {
                                a(sb, 2, "previous_data", g1Var.r(), p0);
                            }
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<c.e.a.b.d.g.i1> V = m1Var.V();
                if (V != null) {
                    for (c.e.a.b.d.g.i1 i1Var : V) {
                        if (i1Var != null) {
                            a(sb, 2);
                            sb.append("event {\n");
                            a(sb, 2, "name", i().a(i1Var.p()));
                            if (i1Var.q()) {
                                a(sb, 2, "timestamp_millis", Long.valueOf(i1Var.r()));
                            }
                            if (i1Var.s()) {
                                a(sb, 2, "previous_timestamp_millis", Long.valueOf(i1Var.t()));
                            }
                            if (i1Var.u()) {
                                a(sb, 2, "count", Integer.valueOf(i1Var.v()));
                            }
                            if (i1Var.o() != 0) {
                                a(sb, 2, i1Var.n());
                            }
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                a(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(c.e.a.b.d.g.r0 r0Var) {
        if (r0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (r0Var.n()) {
            a(sb, 0, "filter_id", Integer.valueOf(r0Var.o()));
        }
        a(sb, 0, "event_name", i().a(r0Var.p()));
        String a2 = a(r0Var.u(), r0Var.v(), r0Var.y());
        if (!a2.isEmpty()) {
            a(sb, 0, "filter_type", a2);
        }
        if (r0Var.s()) {
            a(sb, 1, "event_count_filter", r0Var.t());
        }
        if (r0Var.r() > 0) {
            sb.append("  filters {\n");
            for (c.e.a.b.d.g.s0 s0Var : r0Var.q()) {
                a(sb, 2, s0Var);
            }
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(c.e.a.b.d.g.u0 u0Var) {
        if (u0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (u0Var.n()) {
            a(sb, 0, "filter_id", Integer.valueOf(u0Var.o()));
        }
        a(sb, 0, "property_name", i().c(u0Var.p()));
        String a2 = a(u0Var.r(), u0Var.s(), u0Var.u());
        if (!a2.isEmpty()) {
            a(sb, 0, "filter_type", a2);
        }
        a(sb, 1, u0Var.q());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Long> a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                c().v().a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    c().v().a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(i1.a aVar, String str, Object obj) {
        List<c.e.a.b.d.g.k1> j = aVar.j();
        int i = 0;
        while (true) {
            if (i >= j.size()) {
                i = -1;
                break;
            } else if (str.equals(j.get(i).o())) {
                break;
            } else {
                i++;
            }
        }
        k1.a A = c.e.a.b.d.g.k1.A();
        A.a(str);
        if (obj instanceof Long) {
            A.a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            A.b((String) obj);
        } else if (obj instanceof Double) {
            A.a(((Double) obj).doubleValue());
        } else if (c.e.a.b.d.g.k9.a() && l().a(r.G0) && (obj instanceof Bundle[])) {
            A.a(a((Bundle[]) obj));
        }
        if (i >= 0) {
            aVar.a(i, A);
        } else {
            aVar.a(A);
        }
    }

    final void a(k1.a aVar, Object obj) {
        com.google.android.gms.common.internal.s.a(obj);
        aVar.j();
        aVar.k();
        aVar.l();
        aVar.n();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else if (!c.e.a.b.d.g.k9.a() || !l().a(r.G0) || !(obj instanceof Bundle[])) {
            c().s().a("Ignoring invalid (type) event param value", obj);
        } else {
            aVar.a(a((Bundle[]) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(q1.a aVar, Object obj) {
        com.google.android.gms.common.internal.s.a(obj);
        aVar.j();
        aVar.k();
        aVar.l();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            c().s().a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(b().a() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e2) {
            c().s().a("Failed to ungzip content", e2);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] c(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            c().s().a("Failed to gzip content", e2);
            throw e2;
        }
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean s() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Integer> t() {
        Map<String, String> a2 = r.a(this.f7595b.d());
        if (a2 == null || a2.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = r.P.a(null).intValue();
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            c().v().a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e2) {
                    c().v().a("Experiment ID NumberFormatException", e2);
                }
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        return null;
    }
}
