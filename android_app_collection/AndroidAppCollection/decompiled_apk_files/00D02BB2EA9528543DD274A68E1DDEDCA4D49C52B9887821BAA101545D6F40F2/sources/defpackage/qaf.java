package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qaf  reason: default package */
/* loaded from: classes7.dex */
public final class qaf extends qcf {
    private String a;
    private dvvo b;
    private byee c;

    @Override // defpackage.qcf
    public final void b(dvvo dvvoVar) {
        if (dvvoVar != null) {
            this.b = dvvoVar;
            return;
        }
        throw new NullPointerException("Null busyness");
    }

    @Override // defpackage.qcf
    public final void c(byee byeeVar) {
        if (byeeVar != null) {
            this.c = byeeVar;
            return;
        }
        throw new NullPointerException("Null openHours");
    }

    @Override // defpackage.qcf
    public final void d(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.qcf
    public final qcg a() {
        String str = this.a == null ? " title" : "";
        if (this.b == null) {
            str = str.concat(" busyness");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" openHours");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qag(this.a, this.b, this.c);
    }
}
