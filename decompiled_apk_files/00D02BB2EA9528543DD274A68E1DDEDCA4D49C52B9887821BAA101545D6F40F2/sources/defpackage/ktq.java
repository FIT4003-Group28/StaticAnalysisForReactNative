package defpackage;
/* compiled from: PG */
/* renamed from: ktq  reason: default package */
/* loaded from: classes7.dex */
public final class ktq {
    public boolean a;
    private final jtm b;

    public ktq(jtm jtmVar) {
        this.b = jtmVar;
    }

    public final void a() {
        dbsk.m(!this.a, "lockUiControls() called twice without call to unlockUiControls.");
        this.a = true;
        jtm jtmVar = this.b;
        jtmVar.a.setVisibility(8);
        jtmVar.b.setVisibility(8);
        jtmVar.c.setVisibility(8);
        jtmVar.d.setVisibility(8);
    }

    public final void b() {
        dbsk.m(this.a, "unlockUiControls() called while no full screen UI is shown.");
        this.a = false;
        jtm jtmVar = this.b;
        jtmVar.e.as.c();
        jtmVar.a.setVisibility(0);
        jtmVar.b.setVisibility(0);
        jtmVar.c.setVisibility(0);
        jtmVar.d.setVisibility(0);
        jtmVar.e.a();
    }
}
