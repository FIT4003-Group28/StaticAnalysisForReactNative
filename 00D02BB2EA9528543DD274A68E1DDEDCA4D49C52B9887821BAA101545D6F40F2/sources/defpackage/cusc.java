package defpackage;
/* compiled from: PG */
/* renamed from: cusc  reason: default package */
/* loaded from: classes5.dex */
final class cusc implements degu {
    final /* synthetic */ cusd a;

    public cusc(cusd cusdVar) {
        this.a = cusdVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final void b(Object obj) {
        synchronized (this.a) {
            cusd cusdVar = this.a;
            cusdVar.d = (cuss) cusdVar.a.a(obj);
            cusd cusdVar2 = this.a;
            if (!cusdVar2.c) {
                cusdVar2.d.q(cusdVar2.b);
            }
        }
    }
}
