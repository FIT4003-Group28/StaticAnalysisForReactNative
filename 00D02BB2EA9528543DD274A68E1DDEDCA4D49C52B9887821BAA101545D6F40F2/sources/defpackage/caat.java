package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caat  reason: default package */
/* loaded from: classes4.dex */
public final class caat implements cgrd<dwul> {
    final /* synthetic */ caaw a;

    public caat(caaw caawVar) {
        this.a = caawVar;
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
    }

    @Override // defpackage.cgrd
    public final void b() {
        this.a.aX();
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(dwul dwulVar) {
        dwul dwulVar2 = dwulVar;
        caaw caawVar = this.a;
        caawVar.aS = dwulVar2;
        caawVar.aJ(dwulVar2, false);
        this.a.bu();
        this.a.aR();
        this.a.ao.a(new Runnable(this) { // from class: caas
            private final caat a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.bo();
            }
        }, bvrj.UI_THREAD, 1000L);
    }
}
