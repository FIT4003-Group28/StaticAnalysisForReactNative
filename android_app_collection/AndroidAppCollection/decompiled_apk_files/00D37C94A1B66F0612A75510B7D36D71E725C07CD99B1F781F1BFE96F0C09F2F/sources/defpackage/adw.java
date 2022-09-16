package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: adw  reason: default package */
/* loaded from: classes.dex */
public final class adw extends acz {
    public final WeakReference a;

    public adw(ady adyVar) {
        this.a = new WeakReference(adyVar);
    }

    @Override // defpackage.acz
    public final void a(int i, CharSequence charSequence) {
        if (this.a.get() == null || ((ady) this.a.get()).k || !((ady) this.a.get()).j) {
            return;
        }
        ((ady) this.a.get()).k(new adb(i, charSequence));
    }

    @Override // defpackage.acz
    public final void b() {
        if (this.a.get() == null || !((ady) this.a.get()).j) {
            return;
        }
        ((ady) this.a.get()).l(true);
    }

    @Override // defpackage.acz
    public final void c(adr adrVar) {
        if (this.a.get() == null || !((ady) this.a.get()).j) {
            return;
        }
        int i = -1;
        if (adrVar.b == -1) {
            ads adsVar = adrVar.a;
            int d = ((ady) this.a.get()).d();
            if ((d & 32767) != 0 && !acy.c(d)) {
                i = 2;
            }
            adrVar = new adr(adsVar, i);
        }
        ((ady) this.a.get()).m(adrVar);
    }
}
