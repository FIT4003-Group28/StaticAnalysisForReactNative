package defpackage;
/* compiled from: PG */
/* renamed from: admp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class admp implements ylw {
    public final /* synthetic */ admw a;
    public final /* synthetic */ adii b;
    private final /* synthetic */ int c;

    public /* synthetic */ admp(admw admwVar, adii adiiVar) {
        this.a = admwVar;
        this.b = adiiVar;
    }

    public /* synthetic */ admp(admw admwVar, adii adiiVar, int i) {
        this.c = i;
        this.a = admwVar;
        this.b = adiiVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        if (this.c == 0) {
            Void r3 = (Void) obj;
            this.a.h.c(this.b.a());
            return;
        }
        Void r32 = (Void) obj;
        this.a.h.c(this.b.a());
    }
}
