package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vlq  reason: default package */
/* loaded from: classes7.dex */
public final class vlq extends vmc {
    public dwaw a;
    public buad b;
    public Boolean c;
    public Long d;
    public btzi<dwaw, dwbc> e;
    private Integer f;

    public vlq() {
    }

    public vlq(vmd vmdVar) {
        vlr vlrVar = (vlr) vmdVar;
        this.a = vlrVar.a;
        this.b = vlrVar.b;
        this.c = Boolean.valueOf(vlrVar.c);
        this.d = Long.valueOf(vlrVar.d);
        this.f = Integer.valueOf(vlrVar.e);
        this.e = vlrVar.f;
    }

    @Override // defpackage.vmc
    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.vmc
    public final vmd a() {
        String str = this.a == null ? " proto" : "";
        if (this.b == null) {
            str = str.concat(" options");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" hasUncertainFromPoint");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" creationTimeMillis");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" numRetriesAttempted");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" callback");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new vlr(this.a, this.b, this.c.booleanValue(), this.d.longValue(), this.f.intValue(), this.e);
    }
}
