package defpackage;
/* compiled from: PG */
/* renamed from: aadd  reason: default package */
/* loaded from: classes.dex */
public final class aadd {
    public final ayoi a;
    public volatile arhd b;
    public final aadb c;

    public aadd(ayoi ayoiVar, aadb aadbVar) {
        this.a = ayoiVar;
        this.c = aadbVar;
        ayoiVar.as(new ayqb() { // from class: aadc
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aadd.this.b = (arhd) obj;
            }
        });
    }

    public final arhd a() {
        return this.b == null ? (arhd) this.a.an(arhd.a).U() : this.b;
    }
}
