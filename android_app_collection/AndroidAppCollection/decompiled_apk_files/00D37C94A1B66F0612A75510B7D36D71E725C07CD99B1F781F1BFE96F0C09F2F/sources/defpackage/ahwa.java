package defpackage;
/* compiled from: PG */
/* renamed from: ahwa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahwa implements ayqb {
    public final /* synthetic */ ahwi a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahwa(ahwi ahwiVar) {
        this.a = ahwiVar;
    }

    public /* synthetic */ ahwa(ahwi ahwiVar, int i) {
        this.b = i;
        this.a = ahwiVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            ahwi ahwiVar = this.a;
            ahic ahicVar = (ahic) obj;
            ahwiVar.c();
            if (!ahwiVar.i) {
                return;
            }
            ahwiVar.i = false;
            ahwiVar.b.c(ahvy.b(3));
            return;
        }
        ahwi ahwiVar2 = this.a;
        ahic ahicVar2 = (ahic) obj;
        ahwiVar2.d = ahicVar2.a().m();
        ahwiVar2.h = ahicVar2.a().p();
    }
}
