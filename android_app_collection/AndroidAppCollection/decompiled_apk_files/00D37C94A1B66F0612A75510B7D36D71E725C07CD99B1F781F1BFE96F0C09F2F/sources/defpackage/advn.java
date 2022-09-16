package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: advn  reason: default package */
/* loaded from: classes.dex */
public final class advn implements akev {
    final /* synthetic */ actj a;
    final /* synthetic */ advo b;

    public advn(advo advoVar, actj actjVar) {
        this.b = advoVar;
        this.a = actjVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfi akfiVar = (akfi) obj;
        this.b.d = null;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfi akfiVar = (akfi) obj;
        if (this.a != null) {
            this.b.c.oi().n(new acte(this.a));
        }
        this.b.d = akfiVar;
    }
}
