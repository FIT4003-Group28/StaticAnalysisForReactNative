package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbrv  reason: default package */
/* loaded from: classes5.dex */
public final class dbrv extends dbrz {
    final /* synthetic */ String a = "null";
    final /* synthetic */ dbrz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbrv(dbrz dbrzVar, dbrz dbrzVar2) {
        super(dbrzVar2);
        this.b = dbrzVar;
    }

    @Override // defpackage.dbrz
    public final CharSequence a(Object obj) {
        return obj == null ? this.a : this.b.a(obj);
    }

    @Override // defpackage.dbrz
    public final dbrz b() {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
