package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anjp  reason: default package */
/* loaded from: classes.dex */
public final class anjp implements aniq {
    final /* synthetic */ anjs a;
    final /* synthetic */ aniq b;

    public anjp(anjs anjsVar, aniq aniqVar) {
        this.a = anjsVar;
        this.b = aniqVar;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        if (!this.a.compareAndSet(anjr.NOT_RUN, anjr.STARTED)) {
            return anlz.o();
        }
        return this.b.a();
    }

    public final String toString() {
        return this.b.toString();
    }
}
