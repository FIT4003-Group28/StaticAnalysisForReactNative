package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: dqo  reason: default package */
/* loaded from: classes3.dex */
public final class dqo implements Iterable, dqz, dqv {
    final SortedMap a;
    final Map b;

    public dqo() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    public final int b() {
        return this.a.size();
    }

    public final int c() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.a.lastKey()).intValue() + 1;
    }

    @Override // defpackage.dqz
    public final dqz d() {
        dqo dqoVar = new dqo();
        for (Map.Entry entry : this.a.entrySet()) {
            if (entry.getValue() instanceof dqv) {
                dqoVar.a.put((Integer) entry.getKey(), (dqz) entry.getValue());
            } else {
                dqoVar.a.put((Integer) entry.getKey(), ((dqz) entry.getValue()).d());
            }
        }
        return dqoVar;
    }

    public final dqz e(int i) {
        dqz dqzVar;
        if (i < c()) {
            return (!s(i) || (dqzVar = (dqz) this.a.get(Integer.valueOf(i))) == null) ? f : dqzVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dqo)) {
            return false;
        }
        dqo dqoVar = (dqo) obj;
        if (c() != dqoVar.c()) {
            return false;
        }
        if (this.a.isEmpty()) {
            return dqoVar.a.isEmpty();
        }
        for (int intValue = ((Integer) this.a.firstKey()).intValue(); intValue <= ((Integer) this.a.lastKey()).intValue(); intValue++) {
            if (!e(intValue).equals(dqoVar.e(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dqv
    public final dqz f(String str) {
        dqz dqzVar;
        if ("length".equals(str)) {
            return new dqr(Double.valueOf(c()));
        }
        return (!t(str) || (dqzVar = (dqz) this.b.get(str)) == null) ? f : dqzVar;
    }

    @Override // defpackage.dqz
    public final Boolean g() {
        return true;
    }

    @Override // defpackage.dqz
    public final Double h() {
        if (this.a.size() == 1) {
            return e(0).h();
        }
        if (this.a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.dqz
    public final String i() {
        return toString();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dqn(this);
    }

    public final String j(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            for (int i = 0; i < c(); i++) {
                dqz e = e(i);
                sb.append(str);
                if (!(e instanceof drd) && !(e instanceof dqx)) {
                    sb.append(e.i());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator k() {
        return this.a.keySet().iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [dqo] */
    /* JADX WARN: Type inference failed for: r0v108, types: [drc] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v111, types: [dqr] */
    /* JADX WARN: Type inference failed for: r0v29, types: [dqr] */
    /* JADX WARN: Type inference failed for: r0v30, types: [dqr] */
    /* JADX WARN: Type inference failed for: r0v31, types: [dqr] */
    /* JADX WARN: Type inference failed for: r0v47, types: [dqz] */
    /* JADX WARN: Type inference failed for: r0v51, types: [dqr] */
    /* JADX WARN: Type inference failed for: r0v52, types: [dqr] */
    /* JADX WARN: Type inference failed for: r0v53, types: [dqr] */
    /* JADX WARN: Type inference failed for: r0v63, types: [dqo] */
    /* JADX WARN: Type inference failed for: r0v64, types: [dqo] */
    /* JADX WARN: Type inference failed for: r0v68, types: [dqz] */
    /* JADX WARN: Type inference failed for: r0v70, types: [dqr] */
    /* JADX WARN: Type inference failed for: r0v73, types: [dqz] */
    /* JADX WARN: Type inference failed for: r0v75, types: [dqz] */
    /* JADX WARN: Type inference failed for: r0v79, types: [dqz] */
    /* JADX WARN: Type inference failed for: r0v81, types: [dqo] */
    /* JADX WARN: Type inference failed for: r0v89, types: [dqz] */
    /* JADX WARN: Type inference failed for: r0v92, types: [dqz] */
    /* JADX WARN: Type inference failed for: r0v93, types: [dqz] */
    /* JADX WARN: Type inference failed for: r0v94, types: [dqz] */
    @Override // defpackage.dqz
    public final dqz kr(String str, dpu dpuVar, List list) {
        char c;
        dqo dqoVar;
        ?? dqrVar;
        String str2;
        dqz drcVar;
        dqo dqoVar2;
        double min;
        dqs dqsVar;
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            switch (str.hashCode()) {
                case -1776922004:
                    if (str.equals("toString")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1274492040:
                    if (str.equals("filter")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -934873754:
                    if (str.equals("reduce")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -895859076:
                    if (str.equals("splice")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -678635926:
                    if (str.equals("forEach")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -277637751:
                    if (str.equals("unshift")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 107868:
                    if (str.equals("map")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 111185:
                    if (str.equals("pop")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3267882:
                    if (str.equals("join")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3452698:
                    if (str.equals("push")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3536116:
                    if (str.equals("some")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 3536286:
                    if (str.equals("sort")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 96891675:
                    if (str.equals("every")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109407362:
                    if (str.equals("shift")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1099846370:
                    if (str.equals("reverse")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            double d = 0.0d;
            switch (c) {
                case 0:
                    dqz d2 = d();
                    if (list.isEmpty()) {
                        return d2;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        dqz b = dpuVar.b((dqz) it.next());
                        if (!(b instanceof dqq)) {
                            dqo dqoVar3 = (dqo) d2;
                            int c2 = dqoVar3.c();
                            if (b instanceof dqo) {
                                dqo dqoVar4 = (dqo) b;
                                Iterator k = dqoVar4.k();
                                while (k.hasNext()) {
                                    Integer num = (Integer) k.next();
                                    dqoVar3.q(num.intValue() + c2, dqoVar4.e(num.intValue()));
                                }
                            } else {
                                dqoVar3.q(c2, b);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                    return d2;
                case 1:
                    dqt.l("every", 1, list);
                    dqz b2 = dpuVar.b((dqz) list.get(0));
                    if (!(b2 instanceof dqy)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c() != 0 && ehi.l(this, dpuVar, (dqy) b2, false, true).c() != c()) {
                        return dqz.l;
                    }
                    return dqz.k;
                case 2:
                    dqt.l("filter", 1, list);
                    dqz b3 = dpuVar.b((dqz) list.get(0));
                    if (!(b3 instanceof dqy)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (b() == 0) {
                        return new dqo();
                    }
                    dqz d3 = d();
                    dqo l = ehi.l(this, dpuVar, (dqy) b3, null, true);
                    dqo dqoVar5 = new dqo();
                    Iterator k2 = l.k();
                    while (k2.hasNext()) {
                        dqoVar5.n(((dqo) d3).e(((Integer) k2.next()).intValue()));
                    }
                    return dqoVar5;
                case 3:
                    dqt.l("forEach", 1, list);
                    dqz b4 = dpuVar.b((dqz) list.get(0));
                    if (!(b4 instanceof dqy)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (b() == 0) {
                        return dqz.f;
                    }
                    ehi.m(this, dpuVar, (dqy) b4);
                    return dqz.f;
                case 4:
                    dqoVar = this;
                    dqt.o("indexOf", 2, list);
                    dqz dqzVar = dqz.f;
                    if (!list.isEmpty()) {
                        dqzVar = dpuVar.b((dqz) list.get(0));
                    }
                    if (list.size() > 1) {
                        double e = dqt.e(dpuVar.b((dqz) list.get(1)).h().doubleValue());
                        if (e >= c()) {
                            dqrVar = new dqr(Double.valueOf(-1.0d));
                            return dqrVar;
                        } else if (e < 0.0d) {
                            double c3 = c();
                            Double.isNaN(c3);
                            d = c3 + e;
                        } else {
                            d = e;
                        }
                    }
                    Iterator k3 = k();
                    while (true) {
                        if (k3.hasNext()) {
                            int intValue = ((Integer) k3.next()).intValue();
                            double d4 = intValue;
                            if (d4 >= d && dqt.q(dqoVar.e(intValue), dqzVar)) {
                                dqrVar = new dqr(Double.valueOf(d4));
                            }
                        } else {
                            dqrVar = new dqr(Double.valueOf(-1.0d));
                        }
                    }
                    return dqrVar;
                case 5:
                    dqoVar = this;
                    dqt.o("join", 1, list);
                    if (c() == 0) {
                        dqrVar = dqz.m;
                        return dqrVar;
                    }
                    if (list.size() > 0) {
                        dqz b5 = dpuVar.b((dqz) list.get(0));
                        str2 = ((b5 instanceof dqx) || (b5 instanceof drd)) ? "" : b5.i();
                    } else {
                        str2 = ",";
                    }
                    drcVar = new drc(dqoVar.j(str2));
                    return drcVar;
                case 6:
                    dqoVar = this;
                    dqt.o("lastIndexOf", 2, list);
                    dqz dqzVar2 = dqz.f;
                    if (!list.isEmpty()) {
                        dqzVar2 = dpuVar.b((dqz) list.get(0));
                    }
                    double c4 = c() - 1;
                    if (list.size() > 1) {
                        dqz b6 = dpuVar.b((dqz) list.get(1));
                        c4 = Double.isNaN(b6.h().doubleValue()) ? c() - 1 : dqt.e(b6.h().doubleValue());
                        if (c4 < 0.0d) {
                            double c5 = c();
                            Double.isNaN(c5);
                            c4 += c5;
                        }
                    }
                    if (c4 < 0.0d) {
                        dqrVar = new dqr(Double.valueOf(-1.0d));
                    } else {
                        int min2 = (int) Math.min(c(), c4);
                        while (true) {
                            if (min2 >= 0) {
                                if (!dqoVar.s(min2) || !dqt.q(dqoVar.e(min2), dqzVar2)) {
                                    min2--;
                                } else {
                                    dqrVar = new dqr(Double.valueOf(min2));
                                }
                            } else {
                                dqrVar = new dqr(Double.valueOf(-1.0d));
                            }
                        }
                    }
                    return dqrVar;
                case 7:
                    dqoVar = this;
                    dqt.l("map", 1, list);
                    dqz b7 = dpuVar.b((dqz) list.get(0));
                    if (!(b7 instanceof dqy)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c() == 0) {
                        dqrVar = new dqo();
                    } else {
                        dqrVar = ehi.m(dqoVar, dpuVar, (dqy) b7);
                    }
                    return dqrVar;
                case '\b':
                    dqoVar = this;
                    dqt.l("pop", 0, list);
                    int c6 = c();
                    if (c6 == 0) {
                        dqrVar = dqz.f;
                        return dqrVar;
                    }
                    int i = c6 - 1;
                    drcVar = dqoVar.e(i);
                    dqoVar.p(i);
                    return drcVar;
                case '\t':
                    dqoVar = this;
                    if (!list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            dqoVar.n(dpuVar.b((dqz) it2.next()));
                        }
                    }
                    dqrVar = new dqr(Double.valueOf(c()));
                    return dqrVar;
                case '\n':
                    dqoVar = this;
                    dqrVar = ehi.n(dqoVar, dpuVar, list, true);
                    return dqrVar;
                case 11:
                    dqoVar = this;
                    dqrVar = ehi.n(dqoVar, dpuVar, list, false);
                    return dqrVar;
                case '\f':
                    dqoVar2 = this;
                    dqt.l("reverse", 0, list);
                    int c7 = c();
                    if (c7 != 0) {
                        for (int i2 = 0; i2 < c7 / 2; i2++) {
                            if (dqoVar2.s(i2)) {
                                dqz e2 = dqoVar2.e(i2);
                                dqoVar2.q(i2, null);
                                int i3 = (c7 - 1) - i2;
                                if (dqoVar2.s(i3)) {
                                    dqoVar2.q(i2, dqoVar2.e(i3));
                                }
                                dqoVar2.q(i3, e2);
                            }
                        }
                    }
                    return dqoVar2;
                case '\r':
                    dqoVar = this;
                    dqt.l("shift", 0, list);
                    if (c() == 0) {
                        dqrVar = dqz.f;
                        return dqrVar;
                    }
                    drcVar = dqoVar.e(0);
                    dqoVar.p(0);
                    return drcVar;
                case 14:
                    dqoVar = this;
                    dqt.o("slice", 2, list);
                    if (list.isEmpty()) {
                        dqrVar = d();
                    } else {
                        double c8 = c();
                        double e3 = dqt.e(dpuVar.b((dqz) list.get(0)).h().doubleValue());
                        if (e3 < 0.0d) {
                            Double.isNaN(c8);
                            min = Math.max(e3 + c8, 0.0d);
                        } else {
                            min = Math.min(e3, c8);
                        }
                        if (list.size() == 2) {
                            double e4 = dqt.e(dpuVar.b((dqz) list.get(1)).h().doubleValue());
                            if (e4 < 0.0d) {
                                Double.isNaN(c8);
                                c8 = Math.max(c8 + e4, 0.0d);
                            } else {
                                c8 = Math.min(c8, e4);
                            }
                        }
                        dqrVar = new dqo();
                        for (int i4 = (int) min; i4 < c8; i4++) {
                            dqrVar.n(dqoVar.e(i4));
                        }
                    }
                    return dqrVar;
                case 15:
                    dqoVar = this;
                    dqt.l("some", 1, list);
                    dqz b8 = dpuVar.b((dqz) list.get(0));
                    if (!(b8 instanceof dqs)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c() == 0) {
                        dqrVar = dqz.l;
                    } else {
                        dqs dqsVar2 = (dqs) b8;
                        Iterator k4 = k();
                        while (true) {
                            if (k4.hasNext()) {
                                int intValue2 = ((Integer) k4.next()).intValue();
                                if (dqoVar.s(intValue2) && dqsVar2.a(dpuVar, Arrays.asList(dqoVar.e(intValue2), new dqr(Double.valueOf(intValue2)), dqoVar)).g().booleanValue()) {
                                    dqrVar = dqz.k;
                                }
                            } else {
                                dqrVar = dqz.l;
                            }
                        }
                    }
                    return dqrVar;
                case 16:
                    dqoVar2 = this;
                    dqt.o("sort", 1, list);
                    if (c() >= 2) {
                        List<dqz> m = m();
                        if (!list.isEmpty()) {
                            dqz b9 = dpuVar.b((dqz) list.get(0));
                            if (!(b9 instanceof dqs)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            dqsVar = (dqs) b9;
                        } else {
                            dqsVar = null;
                        }
                        Collections.sort(m, new drj(dqsVar, dpuVar));
                        o();
                        int i5 = 0;
                        for (dqz dqzVar3 : m) {
                            dqoVar2.q(i5, dqzVar3);
                            i5++;
                        }
                    }
                    return dqoVar2;
                case 17:
                    dqoVar = this;
                    if (list.isEmpty()) {
                        dqrVar = new dqo();
                        return dqrVar;
                    }
                    int e5 = (int) dqt.e(dpuVar.b((dqz) list.get(0)).h().doubleValue());
                    if (e5 < 0) {
                        e5 = Math.max(0, e5 + c());
                    } else if (e5 > c()) {
                        e5 = c();
                    }
                    int c9 = c();
                    dqo dqoVar6 = new dqo();
                    if (list.size() > 1) {
                        int max = Math.max(0, (int) dqt.e(dpuVar.b((dqz) list.get(1)).h().doubleValue()));
                        if (max > 0) {
                            for (int i6 = e5; i6 < Math.min(c9, e5 + max); i6++) {
                                dqoVar6.n(dqoVar.e(e5));
                                dqoVar.p(e5);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i7 = 2; i7 < list.size(); i7++) {
                                dqz b10 = dpuVar.b((dqz) list.get(i7));
                                if (b10 instanceof dqq) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                int i8 = (e5 + i7) - 2;
                                if (i8 >= 0) {
                                    if (i8 >= c()) {
                                        dqoVar.q(i8, b10);
                                    } else {
                                        for (int intValue3 = ((Integer) dqoVar.a.lastKey()).intValue(); intValue3 >= i8; intValue3--) {
                                            SortedMap sortedMap = dqoVar.a;
                                            Integer valueOf = Integer.valueOf(intValue3);
                                            dqz dqzVar4 = (dqz) sortedMap.get(valueOf);
                                            if (dqzVar4 != null) {
                                                dqoVar.q(intValue3 + 1, dqzVar4);
                                                dqoVar.a.remove(valueOf);
                                            }
                                        }
                                        dqoVar.q(i8, b10);
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder(32);
                                    sb.append("Invalid value index: ");
                                    sb.append(i8);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                    } else {
                        while (e5 < c9) {
                            dqoVar6.n(dqoVar.e(e5));
                            dqoVar.q(e5, null);
                            e5++;
                        }
                    }
                    return dqoVar6;
                case 18:
                    dqoVar = this;
                    dqt.l("toString", 0, list);
                    dqrVar = new drc(toString());
                    return dqrVar;
                case 19:
                    if (!list.isEmpty()) {
                        dqo dqoVar7 = new dqo();
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            dqz b11 = dpuVar.b((dqz) it3.next());
                            if (!(b11 instanceof dqq)) {
                                dqoVar7.n(b11);
                            } else {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                        }
                        int c10 = dqoVar7.c();
                        Iterator k5 = k();
                        while (k5.hasNext()) {
                            Integer num2 = (Integer) k5.next();
                            dqoVar7.q(num2.intValue() + c10, e(num2.intValue()));
                        }
                        dqoVar = this;
                        o();
                        Iterator k6 = dqoVar7.k();
                        while (k6.hasNext()) {
                            Integer num3 = (Integer) k6.next();
                            dqoVar.q(num3.intValue(), dqoVar7.e(num3.intValue()));
                        }
                    } else {
                        dqoVar = this;
                    }
                    dqrVar = new dqr(Double.valueOf(c()));
                    return dqrVar;
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        return dqt.a(this, new drc(str), dpuVar, list);
    }

    @Override // defpackage.dqz
    public final Iterator l() {
        return new dqm(this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public final List m() {
        ArrayList arrayList = new ArrayList(c());
        for (int i = 0; i < c(); i++) {
            arrayList.add(e(i));
        }
        return arrayList;
    }

    public final void n(dqz dqzVar) {
        q(c(), dqzVar);
    }

    public final void o() {
        this.a.clear();
    }

    public final void p(int i) {
        int intValue = ((Integer) this.a.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        this.a.remove(Integer.valueOf(i));
        if (i == intValue) {
            SortedMap sortedMap = this.a;
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            this.a.put(valueOf, dqz.f);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) this.a.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.a;
            Integer valueOf2 = Integer.valueOf(i);
            dqz dqzVar = (dqz) sortedMap2.get(valueOf2);
            if (dqzVar != null) {
                this.a.put(Integer.valueOf(i - 1), dqzVar);
                this.a.remove(valueOf2);
            }
        }
    }

    @Override // defpackage.dqv
    public final void r(String str, dqz dqzVar) {
        if (dqzVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, dqzVar);
        }
    }

    public final boolean s(int i) {
        if (i < 0 || i > ((Integer) this.a.lastKey()).intValue()) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.a.containsKey(Integer.valueOf(i));
    }

    @Override // defpackage.dqv
    public final boolean t(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    public final String toString() {
        return j(",");
    }

    public final void q(int i, dqz dqzVar) {
        if (i <= 32468) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Out of bounds index: ");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (dqzVar == null) {
                this.a.remove(Integer.valueOf(i));
                return;
            } else {
                this.a.put(Integer.valueOf(i), dqzVar);
                return;
            }
        }
        throw new IllegalStateException("Array too large");
    }

    public dqo(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                q(i, (dqz) list.get(i));
            }
        }
    }

    public dqo(dqz... dqzVarArr) {
        this(Arrays.asList(dqzVarArr));
    }
}
