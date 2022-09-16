package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cjzg  reason: default package */
/* loaded from: classes4.dex */
class cjzg implements cjzf {
    private final cjyv<?> a;

    public cjzg(cjyv<?> cjyvVar) {
        this.a = cjyvVar;
    }

    @Override // defpackage.cjzf
    public cjyv<?> a() {
        return this.a;
    }

    @Override // defpackage.cjzf
    public Integer b() {
        return Integer.valueOf(this.a.b.c);
    }

    public boolean equals(@dzsi Object obj) {
        return obj != null && obj.getClass() == getClass() && dbsd.a(((cjzg) obj).a, this.a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
