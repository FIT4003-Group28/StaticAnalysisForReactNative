package defpackage;
/* compiled from: PG */
/* renamed from: agcc  reason: default package */
/* loaded from: classes2.dex */
public final class agcc extends aggz {
    public ddho a;
    private Boolean b;
    private Boolean c;

    @Override // defpackage.aggz
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.aggz
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.aggz
    public final agha a() {
        String str = this.b == null ? " showCoverPhoto" : "";
        if (this.c == null) {
            str = str.concat(" showFixedHeightSpaceForSnippet");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" veType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new agcd(this.b.booleanValue(), this.c.booleanValue(), this.a);
    }
}
