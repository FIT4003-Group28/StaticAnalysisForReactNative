package defpackage;
/* compiled from: PG */
/* renamed from: avys  reason: default package */
/* loaded from: classes.dex */
public final class avys extends avzb {
    public btlu a;
    private dlsw b;
    private Boolean c;
    private Boolean d;

    @Override // defpackage.avzb
    public final void b(dlsw dlswVar) {
        if (dlswVar != null) {
            this.b = dlswVar;
            return;
        }
        throw new NullPointerException("Null activeOwner");
    }

    @Override // defpackage.avzb
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.avzb
    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.avzb
    public final avzc a() {
        String str = this.b == null ? " activeOwner" : "";
        if (this.c == null) {
            str = str.concat(" isSdCardMounted");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" shouldUseExternalStorage");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new avyt(this.a, this.b, this.c.booleanValue(), this.d.booleanValue());
    }
}
