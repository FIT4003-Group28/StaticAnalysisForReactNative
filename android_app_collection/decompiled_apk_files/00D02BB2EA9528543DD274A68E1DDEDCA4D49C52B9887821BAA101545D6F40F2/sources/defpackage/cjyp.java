package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cjyp  reason: default package */
/* loaded from: classes4.dex */
public class cjyp implements cjyo {
    private final List<cjyw> a = dchl.a();

    @Override // defpackage.cjyo
    public List<cjyw> a() {
        return this.a;
    }

    @Override // defpackage.cjyo
    public Boolean b() {
        return Boolean.valueOf(this.a.isEmpty());
    }

    public void c(cjyw cjywVar) {
        this.a.add(cjywVar);
    }

    public void d(int i) {
        this.a.remove(i);
    }
}
