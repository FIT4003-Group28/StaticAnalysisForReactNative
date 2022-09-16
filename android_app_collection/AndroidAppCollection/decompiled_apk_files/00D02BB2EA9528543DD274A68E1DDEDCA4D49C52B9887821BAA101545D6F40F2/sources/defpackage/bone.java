package defpackage;
/* compiled from: PG */
/* renamed from: bone  reason: default package */
/* loaded from: classes3.dex */
final class bone implements cpmy {
    final /* synthetic */ bonh a;

    public bone(bonh bonhVar) {
        this.a = bonhVar;
    }

    @Override // defpackage.cpmy
    public final void a(cpnc cpncVar) {
        String c;
        String str;
        cpmy cpmyVar = this.a.d;
        if (cpmyVar != null) {
            cpmyVar.a(cpncVar);
        }
        if (cpncVar.c().isEmpty()) {
            c = cpncVar.a();
        } else {
            c = cpncVar.c();
        }
        bnxq bnxqVar = this.a.c.d.get(c);
        String str2 = "";
        if (bnxqVar != null) {
            str2 = bnxqVar.a();
            str = bnxqVar.b();
        } else {
            str = str2;
        }
        this.a.N(dory.SUGGEST_SELECTION, str2, str, true);
        jmw.d(this.a.a.J(), null);
    }
}
