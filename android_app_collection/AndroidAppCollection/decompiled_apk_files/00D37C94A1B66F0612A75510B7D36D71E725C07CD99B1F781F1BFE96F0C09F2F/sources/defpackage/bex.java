package defpackage;
/* compiled from: PG */
/* renamed from: bex  reason: default package */
/* loaded from: classes2.dex */
public final class bex {
    final /* synthetic */ bhc a;
    final /* synthetic */ bfl b;

    public bex(bfl bflVar, bhc bhcVar) {
        this.b = bflVar;
        this.a = bhcVar;
    }

    public final void a() {
        this.b.t.remove(this.a);
        this.b.p.notifyDataSetChanged();
    }
}
