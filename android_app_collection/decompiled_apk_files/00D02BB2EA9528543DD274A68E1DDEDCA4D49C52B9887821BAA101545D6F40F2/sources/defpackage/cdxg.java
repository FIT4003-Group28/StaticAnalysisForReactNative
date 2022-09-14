package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cdxg  reason: default package */
/* loaded from: classes4.dex */
public final class cdxg extends tp {
    private final List<cdxd> a;
    private final List<cdxd> b;

    public cdxg(List<cdxd> list, List<cdxd> list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.tp
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.tp
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.tp
    public final boolean c(int i, int i2) {
        return this.a.get(i).d() == this.b.get(i2).d();
    }

    @Override // defpackage.tp
    public final boolean d(int i, int i2) {
        return this.a.get(i).equals(this.b.get(i2)) && this.a.size() == this.b.size();
    }

    @Override // defpackage.tp
    public final Object e(int i, int i2) {
        if (!this.a.get(i).b().equals(cdxc.MEDIA)) {
            return null;
        }
        return new cdxf(this.a.get(i).c(), this.b.get(i2).c(), this.a.size() != this.b.size());
    }
}
