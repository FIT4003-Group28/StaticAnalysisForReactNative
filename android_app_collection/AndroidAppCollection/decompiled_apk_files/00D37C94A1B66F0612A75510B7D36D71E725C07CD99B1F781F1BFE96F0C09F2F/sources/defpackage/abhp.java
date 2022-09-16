package defpackage;
/* compiled from: PG */
/* renamed from: abhp  reason: default package */
/* loaded from: classes.dex */
final class abhp implements Runnable {
    final /* synthetic */ abhr a;

    public abhp(abhr abhrVar) {
        this.a = abhrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.d.isEmpty()) {
            return;
        }
        abhq abhqVar = (abhq) this.a.d.remove();
        int i = 1;
        while (true) {
            abhr abhrVar = this.a;
            if (i >= abhrVar.f || abhrVar.d.isEmpty()) {
                break;
            }
            abhqVar.a.addAll(((abhq) this.a.d.remove()).a);
            i++;
        }
        this.a.h(abhqVar);
        this.a.d.size();
        abhr abhrVar2 = this.a;
        abhrVar2.c.postDelayed(this, abhrVar2.e);
    }
}
