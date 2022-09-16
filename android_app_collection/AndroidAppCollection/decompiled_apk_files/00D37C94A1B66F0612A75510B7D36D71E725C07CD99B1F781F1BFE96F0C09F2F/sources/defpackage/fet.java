package defpackage;
/* compiled from: PG */
/* renamed from: fet  reason: default package */
/* loaded from: classes3.dex */
public final class fet {
    private final feu a;
    private String b;

    public fet(feu feuVar) {
        this.a = feuVar;
    }

    public final void a() {
        if (this.b != null) {
            return;
        }
        this.b = this.a.a();
    }

    public final void b() {
        String str = this.b;
        if (str == null) {
            return;
        }
        this.a.b(str);
        this.b = null;
    }
}
