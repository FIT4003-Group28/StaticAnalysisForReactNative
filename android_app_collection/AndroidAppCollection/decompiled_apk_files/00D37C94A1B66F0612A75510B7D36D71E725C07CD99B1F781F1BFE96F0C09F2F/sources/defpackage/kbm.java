package defpackage;
/* compiled from: PG */
/* renamed from: kbm  reason: default package */
/* loaded from: classes3.dex */
final class kbm {
    public Boolean a;
    private Boolean b;
    private Boolean c;

    public kbm() {
    }

    public kbm(kbn kbnVar) {
        this.b = Boolean.valueOf(kbnVar.a);
        this.a = Boolean.valueOf(kbnVar.b);
        this.c = Boolean.valueOf(kbnVar.c);
    }

    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final kbn a() {
        Boolean bool = this.b;
        if (bool == null || this.a == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" isControlsOverlayVisible");
            }
            if (this.a == null) {
                sb.append(" isChangeAnimated");
            }
            if (this.c == null) {
                sb.append(" shouldCancelHiding");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new kbn(bool.booleanValue(), this.a.booleanValue(), this.c.booleanValue());
    }
}
