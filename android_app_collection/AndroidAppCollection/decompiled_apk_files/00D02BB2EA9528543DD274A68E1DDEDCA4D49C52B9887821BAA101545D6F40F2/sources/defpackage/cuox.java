package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuox  reason: default package */
/* loaded from: classes5.dex */
public final class cuox extends cupy {
    private dcdc<cuqa> a;
    private Integer b;
    private dbsg<Integer> c = dbpy.a;

    @Override // defpackage.cupy
    public final void b(dcdc<cuqa> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null buttons");
    }

    @Override // defpackage.cupy
    public final void c(int i) {
        this.c = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.cupy
    public final void d(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cupy
    public final cuqb a() {
        String str = this.a == null ? " buttons" : "";
        if (this.b == null) {
            str = str.concat(" orientation");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuoy(this.a, this.b.intValue(), this.c);
    }
}
