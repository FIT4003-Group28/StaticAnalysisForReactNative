package defpackage;
/* compiled from: PG */
/* renamed from: cupd  reason: default package */
/* loaded from: classes5.dex */
final class cupd extends cuqe {
    private String a;
    private cuqd b;

    @Override // defpackage.cuqe
    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null jsonSource");
    }

    @Override // defpackage.cuqe
    public final void c(cuqd cuqdVar) {
        if (cuqdVar != null) {
            this.b = cuqdVar;
            return;
        }
        throw new NullPointerException("Null stackCard");
    }

    @Override // defpackage.cuqe
    public final cuqf a() {
        String str = this.a == null ? " jsonSource" : "";
        if (this.b == null) {
            str = str.concat(" stackCard");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cupe(this.a, this.b);
    }
}
