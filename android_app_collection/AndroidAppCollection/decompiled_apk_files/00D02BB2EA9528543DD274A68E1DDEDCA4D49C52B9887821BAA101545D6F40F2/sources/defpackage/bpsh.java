package defpackage;
/* compiled from: PG */
/* renamed from: bpsh  reason: default package */
/* loaded from: classes4.dex */
final class bpsh extends bptl {
    private Integer a;
    private Integer b;
    private Integer c;

    @Override // defpackage.bptl
    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.bptl
    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.bptl
    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.bptl
    public final bptm a() {
        String str = this.a == null ? " progressMessageId" : "";
        if (this.b == null) {
            str = str.concat(" offlineTitleId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" offlineBodyId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bpsi(this.a.intValue(), this.b.intValue(), this.c.intValue());
    }
}
