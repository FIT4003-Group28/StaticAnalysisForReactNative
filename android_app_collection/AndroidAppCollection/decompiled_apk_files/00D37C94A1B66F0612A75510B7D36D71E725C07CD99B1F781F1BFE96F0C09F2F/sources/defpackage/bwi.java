package defpackage;
/* compiled from: PG */
/* renamed from: bwi  reason: default package */
/* loaded from: classes2.dex */
final class bwi extends bwb {
    @Override // defpackage.bwb
    public final void a(bwj bwjVar, bwj bwjVar2) {
        bwjVar.c = bwjVar2;
    }

    @Override // defpackage.bwb
    public final void b(bwj bwjVar, Thread thread) {
        bwjVar.b = thread;
    }

    @Override // defpackage.bwb
    public final boolean c(bwk bwkVar, bwf bwfVar, bwf bwfVar2) {
        synchronized (bwkVar) {
            if (bwkVar.e == bwfVar) {
                bwkVar.e = bwfVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.bwb
    public final boolean d(bwk bwkVar, Object obj, Object obj2) {
        synchronized (bwkVar) {
            if (bwkVar.d == obj) {
                bwkVar.d = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.bwb
    public final boolean e(bwk bwkVar, bwj bwjVar, bwj bwjVar2) {
        synchronized (bwkVar) {
            if (bwkVar.f == bwjVar) {
                bwkVar.f = bwjVar2;
                return true;
            }
            return false;
        }
    }
}
