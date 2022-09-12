package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhxj  reason: default package */
/* loaded from: classes3.dex */
public final class bhxj {
    final /* synthetic */ bhxy a;

    public bhxj(bhxy bhxyVar) {
        this.a = bhxyVar;
    }

    public final void a(boolean z, axwu axwuVar, String str, @dzsi String str2, @dzsi ddho ddhoVar) {
        bhxy bhxyVar = this.a;
        bhxyVar.m = true;
        bhxy bhxyVar2 = this.a;
        bhxyVar.d.a().ac(bhxyVar2.i, axwuVar, bhxyVar2, z, str, str2, ddhoVar, null, bhxyVar2.f.c(), null);
    }

    public final void b(axwu axwuVar) {
        bhxy bhxyVar = this.a;
        bhxyVar.m = true;
        ilo c = bhxyVar.f.c();
        if (c == null || c.bk() == null) {
            return;
        }
        bhxy bhxyVar2 = this.a;
        this.a.d.a().Q(bhxyVar2.i, axwuVar, bhxyVar2, true, c.bk().longValue());
    }
}
