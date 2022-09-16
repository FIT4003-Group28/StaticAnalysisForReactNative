package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* compiled from: PG */
/* renamed from: rpp  reason: default package */
/* loaded from: classes4.dex */
public final class rpp extends rpf {
    public rpp(rpn rpnVar) {
        super(rpnVar);
    }

    public static final void C(StringBuilder sb, String str, rqm rqmVar) {
        if (rqmVar == null) {
            return;
        }
        v(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (rqmVar.c.size() != 0) {
            v(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l : rqmVar.c) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (rqmVar.b.size() != 0) {
            v(sb, 4);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : rqmVar.b) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (rqmVar.d.size() != 0) {
            v(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (rqe rqeVar : rqmVar.d) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append((rqeVar.b & 1) != 0 ? Integer.valueOf(rqeVar.c) : null);
                sb.append(":");
                sb.append((rqeVar.b & 2) != 0 ? Long.valueOf(rqeVar.d) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (rqmVar.e.size() != 0) {
            v(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (rqn rqnVar : rqmVar.e) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append((rqnVar.b & 1) != 0 ? Integer.valueOf(rqnVar.c) : null);
                sb.append(": [");
                int i9 = 0;
                for (Long l3 : rqnVar.d) {
                    long longValue = l3.longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        v(sb, 3);
        sb.append("}\n");
    }

    public static final void D(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        v(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object E(rqg rqgVar, String str) {
        rqi x = x(rqgVar, str);
        if (x != null) {
            int i = x.b;
            if ((i & 2) != 0) {
                return x.d;
            }
            if ((i & 4) != 0) {
                return Long.valueOf(x.e);
            }
            if ((i & 16) != 0) {
                return Double.valueOf(x.g);
            }
            if (x.h.size() <= 0) {
                return null;
            }
            aopu<rqi> aopuVar = x.h;
            ArrayList arrayList = new ArrayList();
            for (rqi rqiVar : aopuVar) {
                if (rqiVar != null) {
                    Bundle bundle = new Bundle();
                    for (rqi rqiVar2 : rqiVar.h) {
                        int i2 = rqiVar2.b;
                        if ((i2 & 2) != 0) {
                            bundle.putString(rqiVar2.c, rqiVar2.d);
                        } else if ((i2 & 4) != 0) {
                            bundle.putLong(rqiVar2.c, rqiVar2.e);
                        } else if ((i2 & 16) != 0) {
                            bundle.putDouble(rqiVar2.c, rqiVar2.g);
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

    public static final void F(StringBuilder sb, int i, String str, rpw rpwVar) {
        if (rpwVar == null) {
            return;
        }
        v(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if ((rpwVar.b & 1) != 0) {
            int b = rpy.b(rpwVar.c);
            D(sb, i, "comparison_type", (b == 0 || b == 1) ? "UNKNOWN_COMPARISON_TYPE" : b != 2 ? b != 3 ? b != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN");
        }
        if ((rpwVar.b & 2) != 0) {
            D(sb, i, "match_as_float", Boolean.valueOf(rpwVar.d));
        }
        if ((rpwVar.b & 4) != 0) {
            D(sb, i, "comparison_value", rpwVar.e);
        }
        if ((rpwVar.b & 8) != 0) {
            D(sb, i, "min_comparison_value", rpwVar.f);
        }
        if ((rpwVar.b & 16) != 0) {
            D(sb, i, "max_comparison_value", rpwVar.g);
        }
        v(sb, i);
        sb.append("}\n");
    }

    static Bundle c(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(c((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArrayList(str, arrayList2);
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static EventParcel e(dqk dqkVar) {
        Object obj;
        Bundle c = c(dqkVar.e(), true);
        String obj2 = (!c.containsKey("_o") || (obj = c.get("_o")) == null) ? "app" : obj.toString();
        String b = rmm.b(dqkVar.d());
        if (b == null) {
            b = dqkVar.d();
        }
        return new EventParcel(b, new EventParams(c), obj2, dqkVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoqt h(aoqt aoqtVar, byte[] bArr) {
        aoos b = aoos.b();
        if (b != null) {
            return aoqtVar.mo38mergeFrom(bArr, b);
        }
        return aoqtVar.mo35mergeFrom(bArr);
    }

    static List j(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                aopa createBuilder = rqi.a.createBuilder();
                for (String str : bundle.keySet()) {
                    aopa createBuilder2 = rqi.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    rqi rqiVar = (rqi) createBuilder2.instance;
                    str.getClass();
                    rqiVar.b |= 1;
                    rqiVar.c = str;
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        long longValue = ((Long) obj).longValue();
                        createBuilder2.copyOnWrite();
                        rqi rqiVar2 = (rqi) createBuilder2.instance;
                        rqiVar2.b |= 4;
                        rqiVar2.e = longValue;
                    } else if (obj instanceof String) {
                        String str2 = (String) obj;
                        createBuilder2.copyOnWrite();
                        rqi rqiVar3 = (rqi) createBuilder2.instance;
                        str2.getClass();
                        rqiVar3.b |= 2;
                        rqiVar3.d = str2;
                    } else if (obj instanceof Double) {
                        double doubleValue = ((Double) obj).doubleValue();
                        createBuilder2.copyOnWrite();
                        rqi rqiVar4 = (rqi) createBuilder2.instance;
                        rqiVar4.b |= 16;
                        rqiVar4.g = doubleValue;
                    }
                    createBuilder.copyOnWrite();
                    rqi rqiVar5 = (rqi) createBuilder.instance;
                    rqi rqiVar6 = (rqi) createBuilder2.mo39build();
                    rqiVar6.getClass();
                    rqiVar5.a();
                    rqiVar5.h.add(rqiVar6);
                }
                if (((rqi) createBuilder.instance).h.size() > 0) {
                    arrayList.add((rqi) createBuilder.mo39build());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List l(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r7 >= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        r4.add(m((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r7 >= r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        r4.add(m((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        r4.add(m((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        r0.put(r2, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map m(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L30
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L30
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L54
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = 0
        L40:
            if (r7 >= r5) goto L82
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L51
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = m(r8, r6)
            r4.add(r8)
        L51:
            int r7 = r7 + 1
            goto L40
        L54:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L75
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = 0
        L5f:
            if (r7 >= r5) goto L82
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L72
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = m(r8, r6)
            r4.add(r8)
        L72:
            int r7 = r7 + 1
            goto L5f
        L75:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L82
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = m(r3, r6)
            r4.add(r3)
        L82:
            r0.put(r2, r4)
            goto Ld
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpp.m(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void u(rqf rqfVar, String str, Object obj) {
        List unmodifiableList = Collections.unmodifiableList(((rqg) rqfVar.instance).i());
        int i = 0;
        while (true) {
            if (i >= unmodifiableList.size()) {
                i = -1;
                break;
            } else if (str.equals(((rqi) unmodifiableList.get(i)).c)) {
                break;
            } else {
                i++;
            }
        }
        aopa createBuilder = rqi.a.createBuilder();
        createBuilder.copyOnWrite();
        rqi rqiVar = (rqi) createBuilder.instance;
        rqiVar.b |= 1;
        rqiVar.c = str;
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            createBuilder.copyOnWrite();
            rqi rqiVar2 = (rqi) createBuilder.instance;
            rqiVar2.b |= 4;
            rqiVar2.e = longValue;
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            createBuilder.copyOnWrite();
            rqi rqiVar3 = (rqi) createBuilder.instance;
            str2.getClass();
            rqiVar3.b |= 2;
            rqiVar3.d = str2;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            createBuilder.copyOnWrite();
            rqi rqiVar4 = (rqi) createBuilder.instance;
            rqiVar4.b |= 16;
            rqiVar4.g = doubleValue;
        } else if (obj instanceof Bundle[]) {
            createBuilder.n(j((Bundle[]) obj));
        }
        if (i >= 0) {
            rqfVar.copyOnWrite();
            ((rqg) rqfVar.instance).A(i, (rqi) createBuilder.mo39build());
            return;
        }
        rqfVar.e(createBuilder);
    }

    public static final void v(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean w(EventParcel eventParcel, AppMetadata appMetadata) {
        qnm.b(eventParcel);
        qnm.b(appMetadata);
        return !TextUtils.isEmpty(appMetadata.b) || !TextUtils.isEmpty(appMetadata.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final rqi x(rqg rqgVar, String str) {
        for (rqi rqiVar : rqgVar.i()) {
            if (rqiVar.c.equals(str)) {
                return rqiVar;
            }
        }
        return null;
    }

    public static final String y(boolean z, boolean z2, boolean z3) {
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
    public static int z(aopa aopaVar, String str) {
        for (int i = 0; i < ((rqk) aopaVar.instance).f.size(); i++) {
            if (str.equals(aopaVar.p(i).d)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(aopa aopaVar, Object obj) {
        qnm.b(obj);
        aopaVar.copyOnWrite();
        rqi rqiVar = (rqi) aopaVar.instance;
        rqi rqiVar2 = rqi.a;
        rqiVar.b &= -3;
        rqiVar.d = rqi.a.d;
        aopaVar.copyOnWrite();
        rqi rqiVar3 = (rqi) aopaVar.instance;
        rqiVar3.b &= -5;
        rqiVar3.e = 0L;
        aopaVar.copyOnWrite();
        rqi rqiVar4 = (rqi) aopaVar.instance;
        rqiVar4.b &= -17;
        rqiVar4.g = 0.0d;
        aopaVar.copyOnWrite();
        ((rqi) aopaVar.instance).h = rqi.emptyProtobufList();
        if (obj instanceof String) {
            String str = (String) obj;
            aopaVar.copyOnWrite();
            rqi rqiVar5 = (rqi) aopaVar.instance;
            str.getClass();
            rqiVar5.b |= 2;
            rqiVar5.d = str;
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            aopaVar.copyOnWrite();
            rqi rqiVar6 = (rqi) aopaVar.instance;
            rqiVar6.b |= 4;
            rqiVar6.e = longValue;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            aopaVar.copyOnWrite();
            rqi rqiVar7 = (rqi) aopaVar.instance;
            rqiVar7.b |= 16;
            rqiVar7.g = doubleValue;
        } else if (obj instanceof Bundle[]) {
            aopaVar.n(j((Bundle[]) obj));
        } else {
            aG().c.b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(aopa aopaVar, Object obj) {
        aopaVar.copyOnWrite();
        rqo rqoVar = (rqo) aopaVar.instance;
        rqo rqoVar2 = rqo.a;
        rqoVar.b &= -5;
        rqoVar.e = rqo.a.e;
        aopaVar.copyOnWrite();
        rqo rqoVar3 = (rqo) aopaVar.instance;
        rqoVar3.b &= -9;
        rqoVar3.f = 0L;
        aopaVar.copyOnWrite();
        rqo rqoVar4 = (rqo) aopaVar.instance;
        rqoVar4.b &= -33;
        rqoVar4.g = 0.0d;
        if (obj instanceof String) {
            aopaVar.copyOnWrite();
            rqo rqoVar5 = (rqo) aopaVar.instance;
            rqoVar5.b |= 4;
            rqoVar5.e = (String) obj;
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            aopaVar.copyOnWrite();
            rqo rqoVar6 = (rqo) aopaVar.instance;
            rqoVar6.b |= 8;
            rqoVar6.f = longValue;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            aopaVar.copyOnWrite();
            rqo rqoVar7 = (rqo) aopaVar.instance;
            rqoVar7.b |= 32;
            rqoVar7.g = doubleValue;
        } else {
            aG().c.b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(byte[] bArr) {
        qnm.b(bArr);
        N().n();
        MessageDigest ax = rps.ax();
        if (ax == null) {
            aG().c.a("Failed to get MD5");
            return 0L;
        }
        return rps.q(ax.digest(bArr));
    }

    @Override // defpackage.rpf
    protected final void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable d(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (qxz unused) {
            aG().c.a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rqg f(rjx rjxVar) {
        rqf e = rqg.e();
        long j = rjxVar.e;
        e.copyOnWrite();
        ((rqg) e.instance).B(j);
        Iterator it = rjxVar.f.iterator();
        while (it.hasNext()) {
            String mo416next = ((rjz) it).mo416next();
            aopa createBuilder = rqi.a.createBuilder();
            createBuilder.copyOnWrite();
            rqi rqiVar = (rqi) createBuilder.instance;
            mo416next.getClass();
            rqiVar.b |= 1;
            rqiVar.c = mo416next;
            Object b = rjxVar.f.b(mo416next);
            qnm.b(b);
            A(createBuilder, b);
            e.e(createBuilder);
        }
        return (rqg) e.mo39build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List k(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                aG().f.b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    aG().f.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
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

    public final void o(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rqi rqiVar = (rqi) it.next();
            if (rqiVar != null) {
                v(sb, i2);
                sb.append("param {\n");
                Double d = null;
                D(sb, i2, "name", (rqiVar.b & 1) != 0 ? L().d(rqiVar.c) : null);
                D(sb, i2, "string_value", (rqiVar.b & 2) != 0 ? rqiVar.d : null);
                D(sb, i2, "int_value", (rqiVar.b & 4) != 0 ? Long.valueOf(rqiVar.e) : null);
                if ((rqiVar.b & 16) != 0) {
                    d = Double.valueOf(rqiVar.g);
                }
                D(sb, i2, "double_value", d);
                if (rqiVar.h.size() > 0) {
                    o(sb, i2, rqiVar.h);
                }
                v(sb, i2);
                sb.append("}\n");
            }
        }
    }

    public final void p(StringBuilder sb, int i, rpv rpvVar) {
        String str;
        if (rpvVar == null) {
            return;
        }
        v(sb, i);
        sb.append("filter {\n");
        if ((rpvVar.b & 4) != 0) {
            D(sb, i, "complement", Boolean.valueOf(rpvVar.e));
        }
        if ((rpvVar.b & 8) != 0) {
            D(sb, i, "param_name", L().d(rpvVar.f));
        }
        if ((rpvVar.b & 1) != 0) {
            int i2 = i + 1;
            rpz rpzVar = rpvVar.c;
            if (rpzVar == null) {
                rpzVar = rpz.a;
            }
            if (rpzVar != null) {
                v(sb, i2);
                sb.append("string_filter {\n");
                if ((rpzVar.b & 1) != 0) {
                    int a = rpy.a(rpzVar.c);
                    if (a != 0) {
                        switch (a) {
                            case 1:
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        D(sb, i2, "match_type", str);
                    }
                    str = "UNKNOWN_MATCH_TYPE";
                    D(sb, i2, "match_type", str);
                }
                if ((rpzVar.b & 2) != 0) {
                    D(sb, i2, "expression", rpzVar.d);
                }
                if ((rpzVar.b & 4) != 0) {
                    D(sb, i2, "case_sensitive", Boolean.valueOf(rpzVar.e));
                }
                if (rpzVar.f.size() > 0) {
                    v(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : rpzVar.f) {
                        v(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                v(sb, i2);
                sb.append("}\n");
            }
        }
        if ((rpvVar.b & 2) != 0) {
            int i3 = i + 1;
            rpw rpwVar = rpvVar.d;
            if (rpwVar == null) {
                rpwVar = rpw.a;
            }
            F(sb, i3, "number_filter", rpwVar);
        }
        v(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        Q();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] t(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            aG().c.b("Failed to gzip content", e);
            throw e;
        }
    }
}
