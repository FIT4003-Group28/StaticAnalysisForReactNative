package defpackage;
/* compiled from: PG */
/* renamed from: zrn  reason: default package */
/* loaded from: classes7.dex */
public class zrn extends zra {
    private final zrm b;

    public zrn(vux vuxVar, String str, boolean z, zqz zqzVar, zrm zrmVar, ddho ddhoVar) {
        super(vuxVar, str, z, zqzVar, ddhoVar);
        this.b = zrmVar;
    }

    @Override // defpackage.zra, defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        boolean z = !this.a;
        this.a = z;
        if (z) {
            this.b.a();
        }
        cqkx.p(this);
        return cqkl.a;
    }

    public void m() {
        this.a = false;
        cqkx.p(this);
    }
}
