package defpackage;
/* compiled from: PG */
/* renamed from: phi  reason: default package */
/* loaded from: classes4.dex */
public abstract class phi implements pjz {
    public final pks a = new pks();

    private final int h() {
        int o = o();
        if (o == 1) {
            return 0;
        }
        return o;
    }

    public final boolean P() {
        return a() != -1;
    }

    public final boolean Q() {
        pkt s = s();
        if (s.z()) {
            return false;
        }
        int l = l();
        int h = h();
        H();
        return s.t(l, h) != -1;
    }

    public final boolean R() {
        pkt s = s();
        return !s.z() && s.y(l(), this.a).d();
    }

    public final boolean S() {
        pkt s = s();
        return !s.z() && s.y(l(), this.a).h;
    }

    @Override // defpackage.pjz
    public final int a() {
        pkt s = s();
        if (s.z()) {
            return -1;
        }
        int l = l();
        int h = h();
        H();
        return s.d(l, h, false);
    }

    @Override // defpackage.pjz
    public final void b(long j) {
        x(l(), j);
    }

    @Override // defpackage.pjz
    public final boolean g() {
        return m() == 3 && D() && n() == 0;
    }
}
