package defpackage;
/* compiled from: PG */
/* renamed from: gku  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gku implements gmd {
    public final /* synthetic */ aaxb a;
    private final /* synthetic */ int b;

    public /* synthetic */ gku(aaxb aaxbVar, int i) {
        this.b = i;
        this.a = aaxbVar;
    }

    @Override // defpackage.gmd
    public final ankt a(aaqs aaqsVar) {
        int i = this.b;
        if (i == 0) {
            return this.a.c.a((aaxc) aaqsVar);
        } else if (i == 1) {
            return this.a.b.a((aawy) aaqsVar);
        } else {
            return this.a.g.a((aaxd) aaqsVar);
        }
    }
}
