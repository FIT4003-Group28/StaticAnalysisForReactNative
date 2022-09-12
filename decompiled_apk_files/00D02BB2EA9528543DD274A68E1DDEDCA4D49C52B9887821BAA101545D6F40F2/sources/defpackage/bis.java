package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bis  reason: default package */
/* loaded from: classes3.dex */
public final class bis {
    public Map<String, List<bno>> b;
    public Map<String, bjs> c;
    public Map<String, blw> d;
    public List<bmb> e;
    public ain<blx> f;
    public aik<bno> g;
    public List<bno> h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public final bkb a = new bkb();
    private final HashSet<String> o = new HashSet<>();
    public int n = 0;

    public final void a(String str) {
        bpo.a(str);
        this.o.add(str);
    }

    public final void b(int i) {
        this.n += i;
    }

    public final void c(boolean z) {
        this.a.a = z;
    }

    public final bno d(long j) {
        return this.g.b(j);
    }

    public final float e() {
        return (g() / this.l) * 1000.0f;
    }

    public final bmb f(String str) {
        this.e.size();
        for (int i = 0; i < this.e.size(); i++) {
            bmb bmbVar = this.e.get(i);
            if (!bmbVar.a.equalsIgnoreCase(str)) {
                if (bmbVar.a.endsWith("\r")) {
                    String str2 = bmbVar.a;
                    if (!str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                    }
                }
            }
            return bmbVar;
        }
        return null;
    }

    public final float g() {
        return this.k - this.j;
    }

    public final void h() {
        this.m = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (bno bnoVar : this.h) {
            sb.append(bnoVar.a("\t"));
        }
        return sb.toString();
    }
}
