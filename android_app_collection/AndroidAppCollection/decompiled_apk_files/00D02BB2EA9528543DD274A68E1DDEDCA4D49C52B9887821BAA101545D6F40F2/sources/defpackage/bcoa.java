package defpackage;
/* compiled from: PG */
/* renamed from: bcoa  reason: default package */
/* loaded from: classes3.dex */
final class bcoa implements apnk {
    public boolean a;
    @dzsi
    private apnl b;

    public final void a() {
        apnl apnlVar = this.b;
        if (!this.a || apnlVar == null) {
            return;
        }
        apnlVar.c(0L);
        this.a = false;
    }

    @Override // defpackage.apnk
    public final void p(@dzsi apnl apnlVar) {
        this.b = apnlVar;
        a();
    }
}
