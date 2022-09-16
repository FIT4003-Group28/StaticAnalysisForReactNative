package defpackage;
/* compiled from: PG */
/* renamed from: dx  reason: default package */
/* loaded from: classes3.dex */
public final class dx {
    public final dz a;

    private dx(dz dzVar) {
        this.a = dzVar;
    }

    public static dx a(dz dzVar) {
        return new dx(dzVar);
    }

    public final eo b() {
        return this.a.e;
    }

    public final void c() {
        this.a.e.noteStateNotSaved();
    }

    public final void d() {
        this.a.e.ai(true);
    }
}
