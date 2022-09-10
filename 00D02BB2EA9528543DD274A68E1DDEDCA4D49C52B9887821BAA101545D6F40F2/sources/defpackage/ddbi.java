package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ddbi  reason: default package */
/* loaded from: classes5.dex */
public final class ddbi implements defg {
    final /* synthetic */ ddbn a;

    public ddbi(ddbn ddbnVar) {
        this.a = ddbnVar;
    }

    @Override // defpackage.defg
    public final dehn a(Object obj) {
        this.a.h++;
        try {
            return (dehn) this.a.c.a();
        } catch (Exception e) {
            this.a.k(e);
            return deha.a(null);
        }
    }
}
