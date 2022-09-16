package defpackage;
/* compiled from: PG */
/* renamed from: ayfd  reason: default package */
/* loaded from: classes2.dex */
final class ayfd implements Runnable {
    final /* synthetic */ ayat a;
    final /* synthetic */ ayfr b;
    final /* synthetic */ axzl c;

    public ayfd(ayfr ayfrVar, axzl axzlVar, ayat ayatVar, byte[] bArr) {
        this.b = ayfrVar;
        this.c = axzlVar;
        this.a = ayatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.k(this.c, this.a);
    }
}
