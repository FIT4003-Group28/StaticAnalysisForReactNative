package defpackage;
/* compiled from: PG */
/* renamed from: ahmh  reason: default package */
/* loaded from: classes.dex */
public abstract class ahmh implements ahmf {
    private ahmf a;
    public boolean l;

    @Override // defpackage.ahmf
    public void qS(boolean z) {
        this.l = z;
    }

    @Override // defpackage.ahmf
    public final void u(ahmf ahmfVar) {
        this.a = ahmfVar;
    }

    @Override // defpackage.ahmf
    public boolean v() {
        ahmf ahmfVar;
        return this.l || ((ahmfVar = this.a) != null && ahmfVar.v());
    }
}
