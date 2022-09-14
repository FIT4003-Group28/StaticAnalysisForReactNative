package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alyv  reason: default package */
/* loaded from: classes.dex */
public class alyv {
    public static final alyv a = new alyv(dcdc.e());
    private final dcfc<Integer> b;

    public alyv(List<Integer> list) {
        this.b = dcfc.Q(dcbg.b(list).o(alyu.a).z());
    }

    public int a() {
        return 22;
    }

    public int b(float f) {
        Integer floor = this.b.floor(Integer.valueOf((int) Math.floor(f)));
        if (floor == null) {
            return -1;
        }
        return floor.intValue();
    }

    public int c(int i) {
        Integer lower;
        dcfc<Integer> dcfcVar = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (dcfcVar.contains(valueOf) && (lower = this.b.lower(valueOf)) != null) {
            return lower.intValue();
        }
        return -1;
    }

    public int d(int i) {
        Integer higher;
        dcfc<Integer> dcfcVar = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (dcfcVar.contains(valueOf) && (higher = this.b.higher(valueOf)) != null) {
            return higher.intValue();
        }
        return -1;
    }

    public int e() {
        if (this.b.isEmpty()) {
            return -1;
        }
        return this.b.last().intValue();
    }
}
