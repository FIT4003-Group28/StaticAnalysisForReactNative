package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyqw  reason: default package */
/* loaded from: classes6.dex */
public final class dyqw implements dylo {
    final /* synthetic */ dyrz a;

    public dyqw(dyrz dyrzVar) {
        this.a = dyrzVar;
    }

    public final dylv a(dygz dygzVar) {
        dyhd dyhdVar = this.a.t;
        if (this.a.A.get()) {
            return this.a.y;
        }
        if (dyhdVar == null) {
            this.a.m.execute(new dyqu(this));
            return this.a.y;
        }
        dylv h = dyow.h(dyhdVar.a(), ((dytf) dygzVar).a.f());
        return h != null ? h : this.a.y;
    }
}
