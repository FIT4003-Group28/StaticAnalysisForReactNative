package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayyj  reason: default package */
/* loaded from: classes3.dex */
abstract class ayyj implements ayyi {
    final LinkedHashMap<akqi, ayyg> a = new LinkedHashMap<>();
    protected boolean b = true;
    private boolean c = false;

    @Override // defpackage.ayyi
    public void a() {
        throw null;
    }

    @Override // defpackage.ayyi
    public void b() {
        throw null;
    }

    @Override // defpackage.ayyi
    public List<ayyg> e() {
        return new ArrayList(this.a.values());
    }

    @Override // defpackage.ayyi
    public cqkl f() {
        l(true);
        return cqkl.a;
    }

    @Override // defpackage.ayyi
    public cqkl h() {
        this.c = !this.c;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ayyi
    public Boolean i() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.ayyi
    public Boolean k() {
        return Boolean.valueOf(this.b);
    }

    protected abstract void l(boolean z);
}
