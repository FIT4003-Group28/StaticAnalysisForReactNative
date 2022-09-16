package defpackage;
/* compiled from: PG */
/* renamed from: ayeh  reason: default package */
/* loaded from: classes2.dex */
final class ayeh extends ayfb {
    final /* synthetic */ ayat a;
    final /* synthetic */ ayel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayeh(ayel ayelVar, ayat ayatVar) {
        super(ayelVar.b.d);
        this.b = ayelVar;
        this.a = ayatVar;
    }

    @Override // defpackage.ayfb
    public final void a() {
        int i = aynn.a;
        ayel ayelVar = this.b;
        if (ayelVar.a != null) {
            return;
        }
        ayelVar.c.b(this.a);
    }
}
