package defpackage;
/* compiled from: PG */
/* renamed from: afmj  reason: default package */
/* loaded from: classes2.dex */
public final class afmj implements afny {
    public final dxio<brba> a;
    private final btvo b;

    public afmj(dxio<brba> dxioVar, btvo btvoVar) {
        this.a = dxioVar;
        this.b = btvoVar;
    }

    @Override // defpackage.afny
    public final Runnable a(dwir dwirVar, dwiv dwivVar) {
        return new afmi(this, bwrs.a(new brln(dwirVar, dwivVar, (iqy) null, this.b)));
    }

    @Override // defpackage.afny
    public final Runnable b(dwir dwirVar) {
        return new afmh(this, dwirVar);
    }
}
