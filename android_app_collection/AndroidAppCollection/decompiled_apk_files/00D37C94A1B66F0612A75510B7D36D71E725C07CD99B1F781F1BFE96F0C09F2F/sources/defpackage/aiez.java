package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: aiez  reason: default package */
/* loaded from: classes.dex */
final class aiez implements aies {
    final /* synthetic */ aifa a;
    private final Set b = new CopyOnWriteArraySet();

    public aiez(aifa aifaVar) {
        this.a = aifaVar;
    }

    @Override // defpackage.aies
    public final void a(int i, int i2, int i3) {
        synchronized (this.a) {
            int b = this.a.b(0, i2);
            this.a.d();
            d(b, i3);
        }
    }

    @Override // defpackage.aies
    public final void b(int i) {
        synchronized (this.a) {
            int b = this.a.b(1, 0);
            int b2 = this.a.b(0, i);
            this.a.d();
            if (b != b2) {
                for (ymy ymyVar : this.b) {
                    ymyVar.e(b, b2);
                }
            }
        }
    }

    @Override // defpackage.aies
    public final void c(int i, int i2) {
        synchronized (this.a) {
            int b = this.a.b(0, 0);
            this.a.d();
            e(b, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i, int i2) {
        for (ymy ymyVar : this.b) {
            ymyVar.pk(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        for (ymy ymyVar : this.b) {
            ymyVar.d(i, i2);
        }
    }
}
