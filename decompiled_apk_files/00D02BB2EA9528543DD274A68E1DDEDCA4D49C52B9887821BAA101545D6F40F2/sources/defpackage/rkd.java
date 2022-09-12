package defpackage;
/* compiled from: PG */
/* renamed from: rkd  reason: default package */
/* loaded from: classes7.dex */
final class rkd extends rki {
    public ddho a;
    public cjtd b;
    public cqtd c;
    private Integer d;
    private Integer e;

    @Override // defpackage.rki
    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.rki
    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.rki
    public final rkj a() {
        String str = this.d == null ? " titleId" : "";
        if (this.e == null) {
            str = str.concat(" descriptionId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new rke(this.d.intValue(), this.e.intValue(), this.a, this.b, this.c);
    }
}
