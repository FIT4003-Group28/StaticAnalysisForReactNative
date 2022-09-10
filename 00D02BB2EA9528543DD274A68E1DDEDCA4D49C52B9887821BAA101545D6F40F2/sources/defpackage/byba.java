package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: byba  reason: default package */
/* loaded from: classes4.dex */
public final class byba implements dbwx<amfu, akuh> {
    final /* synthetic */ bybf a;

    public byba(bybf bybfVar) {
        this.a = bybfVar;
    }

    @Override // defpackage.dbwx
    public final void a(dbwy<amfu, akuh> dbwyVar) {
        if (!dbwyVar.getValue().equals(this.a.g)) {
            this.a.b.a().j(dbwyVar.getValue());
        }
    }
}
