package defpackage;
/* compiled from: PG */
/* renamed from: auii  reason: default package */
/* loaded from: classes.dex */
final class auii extends aujc {
    public Integer a;
    private Boolean b;
    private int c;

    @Override // defpackage.aujc
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.aujc
    public final void c(int i) {
        if (i != 0) {
            this.c = i;
            return;
        }
        throw new NullPointerException("Null notificationOptOutUiState");
    }

    @Override // defpackage.aujc
    public final aujd a() {
        String str = this.a == null ? " notificationId" : "";
        if (this.c == 0) {
            str = str.concat(" notificationOptOutUiState");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" isUserPreferenceSyncedToServer");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new auij(this.a.intValue(), this.c, this.b.booleanValue());
    }
}
