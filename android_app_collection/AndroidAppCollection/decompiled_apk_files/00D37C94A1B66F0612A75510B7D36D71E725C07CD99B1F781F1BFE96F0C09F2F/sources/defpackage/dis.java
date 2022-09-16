package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dis  reason: default package */
/* loaded from: classes3.dex */
public abstract class dis implements dlj {
    public Map a = null;
    private final Map b;

    /* JADX INFO: Access modifiers changed from: protected */
    public dis(dir dirVar) {
        this.b = dirVar.a;
    }

    @Override // defpackage.dlj
    public final int a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dlj
    public cyr b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dlj
    public final dip c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dlj
    public final diq d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dlj
    public final Object e(String str) {
        Map map = this.b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // defpackage.dlj
    public final void f() {
    }

    @Override // defpackage.dlj
    public final void g(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dlj
    public final boolean h() {
        Map map = this.b;
        if (map == null || !map.containsKey("is_full_span")) {
            return false;
        }
        return ((Boolean) this.b.get("is_full_span")).booleanValue();
    }

    @Override // defpackage.dlj
    public final boolean i() {
        Map map = this.b;
        if (map == null || !map.containsKey("is_sticky")) {
            return false;
        }
        return ((Boolean) this.b.get("is_sticky")).booleanValue();
    }

    @Override // defpackage.dlj
    public boolean j() {
        throw null;
    }

    @Override // defpackage.dlj
    public boolean k() {
        return false;
    }

    @Override // defpackage.dlj
    public void l() {
    }

    @Override // defpackage.dlj
    public void m() {
    }

    @Override // defpackage.dlj
    public void n() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dlj
    public final void o() {
    }
}
