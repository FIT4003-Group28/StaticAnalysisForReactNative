package defpackage;
/* compiled from: PG */
/* renamed from: acna  reason: default package */
/* loaded from: classes.dex */
public final class acna implements abrs {
    final /* synthetic */ absi a;
    final /* synthetic */ acnf b;

    public acna(acnf acnfVar, absi absiVar) {
        this.b = acnfVar;
        this.a = absiVar;
    }

    @Override // defpackage.abrs
    public final void a(boolean z) {
        acnf acnfVar = this.b;
        acnfVar.o = z;
        absi absiVar = this.a;
        boolean z2 = false;
        if (!acnfVar.b && z) {
            z2 = true;
        }
        absiVar.a = z2;
        abtj abtjVar = acnfVar.m;
        if (abtjVar != null) {
            abtjVar.c();
        }
    }
}
