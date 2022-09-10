package defpackage;
/* compiled from: PG */
/* renamed from: alft  reason: default package */
/* loaded from: classes2.dex */
public final class alft implements amrl {
    private final amsa a;
    private final amri b;
    private final amuo c;

    public alft(amuo amuoVar, amsa amsaVar, amri amriVar) {
        this.c = amuoVar;
        this.a = amsaVar;
        this.b = amriVar;
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        return this.a.a(aktcVar, amrkVar, this.b, this.c.c, amrjVar);
    }
}
