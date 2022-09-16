package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lep  reason: default package */
/* loaded from: classes7.dex */
public final class lep implements Runnable {
    final /* synthetic */ les a;

    public lep(les lesVar) {
        this.a = lesVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.r.getCarParameters().j) {
            les lesVar = this.a;
            lesVar.k.k(lesVar.h.i(new mbr(lesVar.a, lesVar, lesVar.b)));
            return;
        }
        les lesVar2 = this.a;
        lesVar2.k.k(lesVar2.h.m());
    }
}
