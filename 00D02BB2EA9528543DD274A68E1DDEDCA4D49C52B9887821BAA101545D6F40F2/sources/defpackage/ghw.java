package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ghw  reason: default package */
/* loaded from: classes6.dex */
public class ghw implements ghq {
    public final cjqy a;
    public int c;
    public final ghu d;
    public boolean e;
    @dzsi
    private ght g;
    private final boolean j;
    private float f = 1.0f;
    public final List<ghs<?>> b = new ArrayList();
    private final jco h = new ghv(this);
    private boolean i = false;
    private int k = 340;
    private int l = 340;

    public ghw(cjqy cjqyVar, ghu ghuVar, boolean z) {
        this.a = cjqyVar;
        this.d = ghuVar;
        this.j = z;
    }

    private final int u(@dzsi ght ghtVar) {
        if (ghtVar != null) {
            for (int i = 0; i < this.b.size(); i++) {
                if (ghtVar.equals(this.b.get(i).e())) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.ghq
    public List<ghs<?>> a() {
        return this.b;
    }

    @Override // defpackage.ghq
    public Integer c() {
        ght ghtVar = this.g;
        return Integer.valueOf(ghtVar != null ? u(ghtVar) : this.c);
    }

    @Override // defpackage.ghq
    public jco d() {
        return this.h;
    }

    @Override // defpackage.ghq
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.ghq
    public Boolean f() {
        int i = this.c;
        if (i < 0 || i >= this.b.size()) {
            return false;
        }
        return this.b.get(this.c).d();
    }

    @Override // defpackage.ghq
    public Boolean g() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.ghq
    public Boolean h() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.ghq
    public cqkl i() {
        this.d.c(this, u(this.g), 2, null);
        return cqkl.a;
    }

    @Override // defpackage.ghq
    @dzsi
    public cjtd j() {
        int i = this.c;
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(this.c).f();
    }

    @Override // defpackage.ghq
    public cqtc k() {
        double d = this.k;
        double d2 = this.l;
        return cqsv.f(d, d2, d, d2);
    }

    @Override // defpackage.ghq
    public cqtv l() {
        return cqrp.d(this.f * 33.0f);
    }

    @Override // defpackage.ghq
    @dzsi
    /* renamed from: m */
    public ghs b() {
        return null;
    }

    public void n(int i, boolean z) {
        this.c = i;
        this.e = z;
        boolean z2 = false;
        if (i > 0 && i < this.b.size()) {
            z2 = true;
        }
        this.g = Boolean.valueOf(z2).booleanValue() ? this.b.get(i).e() : null;
    }

    public void o(boolean z) {
        this.e = false;
    }

    public void p(@dzsi ght ghtVar, boolean z) {
        this.g = ghtVar;
        this.e = z;
        this.c = ghtVar != null ? u(ghtVar) : -1;
    }

    @dzsi
    public ght q() {
        return this.g;
    }

    public void r(boolean z) {
        this.i = z;
    }

    public void s(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    public void t(float f) {
        this.f = f;
    }
}
