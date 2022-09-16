package defpackage;
/* compiled from: PG */
/* renamed from: askr  reason: default package */
/* loaded from: classes2.dex */
final class askr extends askt {
    private dvdm a;
    private Boolean b;
    private Boolean c;

    @Override // defpackage.askt
    public final void b(dvdm dvdmVar) {
        if (dvdmVar != null) {
            this.a = dvdmVar;
            return;
        }
        throw new NullPointerException("Null cameraType");
    }

    @Override // defpackage.askt
    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.askt
    public final void d(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.askt
    public final asku a() {
        String str = this.a == null ? " cameraType" : "";
        if (this.b == null) {
            str = str.concat(" isSatellite");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" isWalking");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new asks(this.a, this.b.booleanValue(), this.c.booleanValue());
    }
}
