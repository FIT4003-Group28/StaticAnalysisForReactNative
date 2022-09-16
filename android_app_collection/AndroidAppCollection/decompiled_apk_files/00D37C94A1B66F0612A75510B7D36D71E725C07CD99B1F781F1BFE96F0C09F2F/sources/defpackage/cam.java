package defpackage;
/* compiled from: PG */
/* renamed from: cam  reason: default package */
/* loaded from: classes2.dex */
public final class cam implements can {
    public final String a;
    public final cak b;
    public final cad c;
    public final boolean d;
    public final boolean e;

    public cam(String str, cak cakVar, cad cadVar, boolean z, boolean z2) {
        this.a = str;
        this.b = cakVar;
        this.c = cadVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        return new byf(bxnVar, cbdVar, this);
    }
}
