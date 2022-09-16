package defpackage;
/* compiled from: PG */
/* renamed from: aiak  reason: default package */
/* loaded from: classes2.dex */
final class aiak implements akag {
    final /* synthetic */ btlu a;
    final /* synthetic */ deig b;
    final /* synthetic */ aiar c;

    public aiak(aiar aiarVar, btlu btluVar, deig deigVar) {
        this.c = aiarVar;
        this.a = btluVar;
        this.b = deigVar;
    }

    private final void c() {
        akah a = this.c.b.a(this.a);
        if (!((ajzf) a).a) {
            akai akaiVar = this.c.b;
            akaiVar.c.writeLock().lock();
            try {
                if (akaiVar.i.remove(this) && akaiVar.i.isEmpty()) {
                    akaiVar.d.a(akaiVar.g);
                    akaiVar.f.e(akaiVar.j);
                    akaiVar.e.d(akaiVar.h);
                }
                akaiVar.c.writeLock().unlock();
                this.b.j(a);
            } catch (Throwable th) {
                akaiVar.c.writeLock().unlock();
                throw th;
            }
        }
    }

    @Override // defpackage.akag
    public final void a(btlu btluVar) {
        if (this.a.equals(btluVar)) {
            c();
        }
    }

    @Override // defpackage.akag
    public final void b() {
        c();
    }
}
