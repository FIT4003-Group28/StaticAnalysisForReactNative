package defpackage;
/* compiled from: PG */
/* renamed from: tdz  reason: default package */
/* loaded from: classes7.dex */
public class tdz implements tdh {
    private boolean a = false;

    @Override // defpackage.tdh
    public Boolean h() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.tdh
    public Boolean i() {
        return false;
    }

    @Override // defpackage.tdh
    public Boolean j() {
        return false;
    }

    public void k(boolean z) {
        if (this.a != z) {
            this.a = z;
            cqkx.p(this);
        }
    }
}
