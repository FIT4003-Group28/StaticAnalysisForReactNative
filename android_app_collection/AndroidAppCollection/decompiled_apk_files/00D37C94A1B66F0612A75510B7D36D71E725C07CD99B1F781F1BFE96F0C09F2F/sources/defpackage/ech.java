package defpackage;
/* compiled from: PG */
/* renamed from: ech  reason: default package */
/* loaded from: classes3.dex */
public final class ech extends lg {
    final /* synthetic */ eci a;

    public ech(eci eciVar) {
        this.a = eciVar;
    }

    @Override // defpackage.lg
    public final void c() {
        ajsf ajsfVar = this.a.c;
        if (ajsfVar != null) {
            int b = ajsfVar.b();
            for (int i = 0; i < b; i++) {
                eci eciVar = this.a;
                eciVar.a(eciVar.c.getItem(i));
            }
        }
    }

    @Override // defpackage.lg
    public final void f(int i, int i2) {
        if (this.a.c != null) {
            int i3 = i2 + i;
            while (i < i3) {
                eci eciVar = this.a;
                eciVar.a(eciVar.c.getItem(i));
                i++;
            }
        }
    }
}
