package defpackage;
/* compiled from: PG */
/* renamed from: lmk  reason: default package */
/* loaded from: classes3.dex */
public final class lmk implements akev {
    final /* synthetic */ acti a;
    final /* synthetic */ byte[] b;
    private final /* synthetic */ int c;

    public lmk(acti actiVar, byte[] bArr) {
        this.a = actiVar;
        this.b = bArr;
    }

    public lmk(acti actiVar, byte[] bArr, int i) {
        this.c = i;
        this.a = actiVar;
        this.b = bArr;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        if (this.c == 0) {
            akfi akfiVar = (akfi) obj;
        } else {
            akfi akfiVar2 = (akfi) obj;
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        if (this.c == 0) {
            akfi akfiVar = (akfi) obj;
            this.a.D(new acte(this.b));
            this.a.u(new acte(this.b), null);
            return;
        }
        akfi akfiVar2 = (akfi) obj;
        this.a.D(new acte(this.b));
        this.a.u(new acte(this.b), null);
    }
}
