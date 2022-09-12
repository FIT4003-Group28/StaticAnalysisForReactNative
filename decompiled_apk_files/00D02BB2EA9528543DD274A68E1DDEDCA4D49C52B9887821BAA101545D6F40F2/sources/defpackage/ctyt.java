package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctyt  reason: default package */
/* loaded from: classes5.dex */
public final class ctyt extends cuhh {
    private Integer a;
    private Integer b;
    private dcdc<cuhq> c;

    @Override // defpackage.cuhh
    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cuhh
    public final void c(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.cuhh
    public final void d(dcdc<cuhq> dcdcVar) {
        if (dcdcVar != null) {
            this.c = dcdcVar;
            return;
        }
        throw new NullPointerException("Null textStyles");
    }

    @Override // defpackage.cuhh
    public final cuhi a() {
        String str = this.a == null ? " startIndex" : "";
        if (this.b == null) {
            str = str.concat(" endIndex");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" textStyles");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuei(this.a.intValue(), this.b.intValue(), this.c);
    }
}
