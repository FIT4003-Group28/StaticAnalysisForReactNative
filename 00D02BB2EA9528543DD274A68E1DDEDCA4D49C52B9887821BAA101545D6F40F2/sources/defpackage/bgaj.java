package defpackage;
/* compiled from: PG */
/* renamed from: bgaj  reason: default package */
/* loaded from: classes3.dex */
class bgaj implements cqkp {
    private final int a;

    private bgaj(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bgaj a(bega begaVar) {
        return new bgaj(dcze.a(32).b(begaVar.hashCode()).c());
    }

    public int hashCode() {
        return this.a;
    }
}
