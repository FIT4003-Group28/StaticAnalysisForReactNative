package defpackage;
/* compiled from: PG */
/* renamed from: avyv  reason: default package */
/* loaded from: classes.dex */
final class avyv extends avzf {
    private avzc a;
    private avze b;

    @Override // defpackage.avzf
    public final void b(avzc avzcVar) {
        if (avzcVar != null) {
            this.a = avzcVar;
            return;
        }
        throw new NullPointerException("Null instanceContext");
    }

    @Override // defpackage.avzf
    public final void c(avze avzeVar) {
        if (avzeVar != null) {
            this.b = avzeVar;
            return;
        }
        throw new NullPointerException("Null instanceId");
    }

    @Override // defpackage.avzf
    public final avzg a() {
        String str = this.a == null ? " instanceContext" : "";
        if (this.b == null) {
            str = str.concat(" instanceId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new avyw(this.a, this.b);
    }
}
