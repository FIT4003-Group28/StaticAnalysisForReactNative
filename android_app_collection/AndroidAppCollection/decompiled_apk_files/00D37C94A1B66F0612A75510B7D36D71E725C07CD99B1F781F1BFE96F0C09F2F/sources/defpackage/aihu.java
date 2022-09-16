package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: aihu  reason: default package */
/* loaded from: classes.dex */
public class aihu {
    public final int a;
    public final int b;
    protected final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final SparseArray i;
    private final int j;
    private final long k;
    private final long l;

    public aihu(String str, int i, String str2, long j) {
        boolean z = true;
        aqxo.p(str != null);
        aqxo.p(str2 != null);
        aqxo.p(i >= 0);
        aqxo.p(j >= 0);
        this.g = str;
        this.h = i;
        this.l = j;
        String[] split = str2.split("#", -1);
        aqxo.p(split.length == 8);
        int parseInt = Integer.parseInt(split[0]);
        this.a = parseInt;
        int parseInt2 = Integer.parseInt(split[1]);
        this.b = parseInt2;
        int parseInt3 = Integer.parseInt(split[2]);
        this.j = parseInt3;
        int parseInt4 = Integer.parseInt(split[3]);
        this.c = parseInt4;
        int parseInt5 = Integer.parseInt(split[4]);
        this.d = parseInt5;
        this.k = Long.parseLong(split[5]);
        this.e = split[6];
        this.f = split[7];
        aqxo.p(parseInt > 0);
        aqxo.p(parseInt2 > 0);
        if (j > 0) {
            aqxo.p(parseInt3 > 0);
        }
        aqxo.p(parseInt4 > 0);
        aqxo.p(parseInt5 <= 0 ? false : z);
        this.i = new SparseArray();
    }

    public int a(long j) {
        int round;
        int b = b() - 1;
        long j2 = this.k;
        if (j2 == 0) {
            round = Math.round(b() * (((float) j) / ((float) this.l)));
        } else {
            round = Math.round(((float) j) / ((float) j2));
        }
        return Math.max(0, Math.min(b, round));
    }

    public int b() {
        return this.j;
    }

    public final int c() {
        return this.c * this.d;
    }

    public int d() {
        if (b() > 0) {
            return (int) Math.ceil(b() / c());
        }
        return 0;
    }
}
