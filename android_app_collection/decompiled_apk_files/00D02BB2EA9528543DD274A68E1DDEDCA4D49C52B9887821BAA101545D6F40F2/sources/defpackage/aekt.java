package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aekt  reason: default package */
/* loaded from: classes2.dex */
public final class aekt extends aekx {
    private Integer a;
    private aekz b;
    private aekz c;

    @Override // defpackage.aekx
    public final void b(aekz aekzVar) {
        if (aekzVar != null) {
            this.b = aekzVar;
            return;
        }
        throw new NullPointerException("Null checkInDatepickerConfig");
    }

    @Override // defpackage.aekx
    public final void c(aekz aekzVar) {
        if (aekzVar != null) {
            this.c = aekzVar;
            return;
        }
        throw new NullPointerException("Null checkOutDatepickerConfig");
    }

    @Override // defpackage.aekx
    public final void d() {
        this.a = 524314;
    }

    @Override // defpackage.aekx
    public final aela a() {
        String str = this.a == null ? " dateFormatFlags" : "";
        if (this.b == null) {
            str = str.concat(" checkInDatepickerConfig");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" checkOutDatepickerConfig");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aeku(this.a.intValue(), this.b, this.c);
    }
}
