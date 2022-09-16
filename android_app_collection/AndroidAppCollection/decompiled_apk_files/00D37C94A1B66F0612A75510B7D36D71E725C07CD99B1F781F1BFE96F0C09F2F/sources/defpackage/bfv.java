package defpackage;
/* compiled from: PG */
/* renamed from: bfv  reason: default package */
/* loaded from: classes2.dex */
final class bfv extends bgj {
    final String a;
    final bfu b;

    public bfv(String str, bfu bfuVar) {
        this.a = str;
        this.b = bfuVar;
    }

    @Override // defpackage.bgj
    public final void b(int i) {
        bfu bfuVar;
        String str = this.a;
        if (str == null || (bfuVar = this.b) == null) {
            return;
        }
        bfuVar.d(str, i);
    }

    @Override // defpackage.bgj
    public final void c(int i) {
        bfu bfuVar;
        String str = this.a;
        if (str == null || (bfuVar = this.b) == null) {
            return;
        }
        bfuVar.e(str, i);
    }
}
