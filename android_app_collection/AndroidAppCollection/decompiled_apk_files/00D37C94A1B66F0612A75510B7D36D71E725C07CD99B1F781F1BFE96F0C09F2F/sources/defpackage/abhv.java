package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abhv  reason: default package */
/* loaded from: classes.dex */
public final class abhv implements ajrt {
    final /* synthetic */ abhw a;

    public abhv(abhw abhwVar) {
        this.a = abhwVar;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        String str;
        Object c = ajqmVar.c(i);
        if (c instanceof astb) {
            str = ((astb) c).c;
        } else if (c instanceof astc) {
            str = ((astc) c).c;
        } else {
            str = c instanceof assz ? ((assz) c).b : null;
        }
        str.getClass();
        abhu abhuVar = (abhu) this.a.c.get(str);
        ajrsVar.f("ticker_start_timestamp_ms", Long.valueOf(abhuVar.c));
        ajrsVar.f("ticker_applied_action", abhuVar.d);
    }
}
