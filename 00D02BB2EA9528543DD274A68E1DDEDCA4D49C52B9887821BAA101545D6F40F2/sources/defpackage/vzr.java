package defpackage;
/* compiled from: PG */
/* renamed from: vzr  reason: default package */
/* loaded from: classes7.dex */
public final class vzr implements zto, akzy {
    public final btrm a;
    public final akpm b;
    public boolean c = false;
    private final vzq d;
    private final amub e;

    public vzr(vzq vzqVar, btrm btrmVar, akpm akpmVar, amub amubVar) {
        this.d = vzqVar;
        this.a = btrmVar;
        this.b = akpmVar;
        this.e = amubVar;
    }

    private final void b(int i, int i2) {
        this.d.a(i, i2);
    }

    @Override // defpackage.zto
    public final void OL(int i) {
        b(4, i);
    }

    @Override // defpackage.akzy
    public final void a(alad aladVar) {
        if (this.c) {
            akrn V = this.e.V(aladVar.j, akqx.a(aladVar.k) * 200.0f);
            if (V == null) {
                b(1, 0);
            } else {
                b(3, (int) this.e.M(V));
            }
            this.c = false;
        }
    }
}
