package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bwx  reason: default package */
/* loaded from: classes2.dex */
public final class bwx {
    public Map a;
    public Map b;
    public Map c;
    public age d;
    public agb e;
    public List f;
    public Rect g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public final aej m = new aej();
    private final HashSet n = new HashSet();
    public int l = 0;

    public final float a() {
        return (b() / this.j) * 1000.0f;
    }

    public final float b() {
        return this.i - this.h;
    }

    public final cbg c(long j) {
        return (cbg) this.e.f(j);
    }

    public final void d(String str) {
        cda.a(str);
        this.n.add(str);
    }

    public final void e(int i) {
        this.l += i;
    }

    public final void f() {
        this.k = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (cbg cbgVar : this.f) {
            sb.append(cbgVar.a("\t"));
        }
        return sb.toString();
    }
}
