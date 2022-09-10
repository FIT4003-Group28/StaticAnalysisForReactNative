package defpackage;
/* compiled from: PG */
/* renamed from: aljw  reason: default package */
/* loaded from: classes2.dex */
final class aljw extends alqe {
    private amxf a;
    private Boolean b;

    public aljw() {
    }

    public aljw(alqf alqfVar) {
        aljx aljxVar = (aljx) alqfVar;
        this.a = aljxVar.a;
        this.b = Boolean.valueOf(aljxVar.b);
    }

    @Override // defpackage.alqe
    public final void b(amxf amxfVar) {
        if (amxfVar != null) {
            this.a = amxfVar;
            return;
        }
        throw new NullPointerException("Null drawMode");
    }

    @Override // defpackage.alqe
    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.alqe
    public final alqf a() {
        String str = this.a == null ? " drawMode" : "";
        if (this.b == null) {
            str = str.concat(" isDarkModeEnabled");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aljx(this.a, this.b.booleanValue());
    }
}
