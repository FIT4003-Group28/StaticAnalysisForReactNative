package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aypi  reason: default package */
/* loaded from: classes3.dex */
public final class aypi {
    final /* synthetic */ ayfo a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aypo c;
    final /* synthetic */ ayon d;

    public aypi(aypo aypoVar, ayfo ayfoVar, ayon ayonVar, boolean z) {
        this.c = aypoVar;
        this.a = ayfoVar;
        this.d = ayonVar;
        this.b = z;
    }

    public final void a() {
        dehn<Boolean> a;
        this.a.aT();
        this.d.a(ayoo.LOADING);
        if (this.b) {
            a = this.c.b.e();
        } else {
            a = deha.a(true);
        }
        deha.q(a, new ayph(this), dege.a);
    }
}
