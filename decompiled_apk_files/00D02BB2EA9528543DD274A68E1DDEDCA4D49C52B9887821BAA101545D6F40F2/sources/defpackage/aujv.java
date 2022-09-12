package defpackage;
/* compiled from: PG */
/* renamed from: aujv  reason: default package */
/* loaded from: classes2.dex */
public final class aujv implements dbsl<aukd> {
    final /* synthetic */ String a;

    public aujv(String str) {
        this.a = str;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(aukd aukdVar) {
        aukd aukdVar2 = aukdVar;
        return (aukdVar2.a & 8) != 0 && aukdVar2.d.equals(this.a);
    }
}
