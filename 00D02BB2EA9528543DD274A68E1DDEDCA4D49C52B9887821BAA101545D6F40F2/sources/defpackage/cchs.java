package defpackage;
/* compiled from: PG */
/* renamed from: cchs  reason: default package */
/* loaded from: classes4.dex */
public class cchs implements ccig {
    private final String a;
    private final String b;
    private final boolean c;

    public cchs(diob diobVar) {
        this.a = diobVar.a;
        this.b = diobVar.b;
        this.c = diobVar.c;
    }

    @Override // defpackage.ccig
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.ccig
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.ccig
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.ccig
    public Boolean d() {
        return Boolean.valueOf(!dbsj.d(this.b));
    }
}
