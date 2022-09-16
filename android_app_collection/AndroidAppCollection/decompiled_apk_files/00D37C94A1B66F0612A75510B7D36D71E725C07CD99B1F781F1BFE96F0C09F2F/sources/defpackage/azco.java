package defpackage;
/* compiled from: PG */
/* renamed from: azco  reason: default package */
/* loaded from: classes2.dex */
public final class azco extends ayos {
    final ayof a;
    final ayov b;

    public azco(ayof ayofVar, ayov ayovVar) {
        this.a = ayofVar;
        this.b = ayovVar;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        this.a.X(new azcn(ayotVar, this.b));
    }
}
