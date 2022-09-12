package defpackage;
/* compiled from: PG */
/* renamed from: avjj  reason: default package */
/* loaded from: classes3.dex */
public final class avjj extends avkg {
    public ahnc a;
    public String b;
    private Boolean c;
    private Boolean d;

    @Override // defpackage.avkg
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.avkg
    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.avkg
    public final avkh a() {
        String str = this.c == null ? " criticalUpdatesOnly" : "";
        if (this.d == null) {
            str = str.concat(" resumeOnly");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new avjk(this.a, this.b, this.c.booleanValue(), this.d.booleanValue());
    }
}
