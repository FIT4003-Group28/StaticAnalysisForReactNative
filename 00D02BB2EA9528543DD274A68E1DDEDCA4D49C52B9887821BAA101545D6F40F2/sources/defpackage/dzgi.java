package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzgi  reason: default package */
/* loaded from: classes6.dex */
public final class dzgi<T> implements dzak, dzfk {
    final dyzw<? super T> a;
    final dzgj<T> b;
    boolean c;
    boolean d;
    dzfl<Object> e;
    boolean f;
    volatile boolean g;
    long h;

    public dzgi(dyzw<? super T> dyzwVar, dzgj<T> dzgjVar) {
        this.a = dyzwVar;
        this.b = dzgjVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (!this.g) {
            this.g = true;
            this.b.h(this);
        }
    }

    @Override // defpackage.dzfk, defpackage.dzbb
    public final boolean a(Object obj) {
        if (!this.g) {
            dyzw<? super T> dyzwVar = this.a;
            if (obj == dzfr.a) {
                dyzwVar.e();
                return true;
            } else if (obj instanceof dzfq) {
                dyzwVar.d(((dzfq) obj).a);
                return true;
            } else {
                dyzwVar.c(obj);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Object obj, long j) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                if (this.h == j) {
                    return;
                }
                if (this.d) {
                    dzfl<Object> dzflVar = this.e;
                    if (dzflVar == null) {
                        dzflVar = new dzfl<>();
                        this.e = dzflVar;
                    }
                    dzflVar.a(obj);
                    return;
                }
                this.c = true;
                this.f = true;
            }
        }
        a(obj);
    }
}
