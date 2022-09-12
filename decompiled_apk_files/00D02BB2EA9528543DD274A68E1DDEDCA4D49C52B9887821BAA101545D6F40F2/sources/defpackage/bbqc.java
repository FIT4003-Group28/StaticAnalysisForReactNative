package defpackage;
/* compiled from: PG */
/* renamed from: bbqc  reason: default package */
/* loaded from: classes3.dex */
final class bbqc implements bbqe {
    boolean a = false;
    final /* synthetic */ bbqe b;

    public bbqc(bbqe bbqeVar) {
        this.b = bbqeVar;
    }

    @Override // defpackage.bbqe
    public final void a(String str) {
        if (!this.a) {
            this.b.a(str);
            this.a = true;
        }
    }
}
