package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bkpa  reason: default package */
/* loaded from: classes3.dex */
public final class bkpa extends bkpf {
    public bvrt<djck> a;
    public cdjk b;
    private String c;
    private Boolean d;

    @Override // defpackage.bkpf
    public final void b(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null filterText");
    }

    @Override // defpackage.bkpf
    public final void c(@dzsi bvrt<djck> bvrtVar) {
        this.a = bvrtVar;
    }

    @Override // defpackage.bkpf
    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bkpf
    public final bkpg a() {
        String str = this.c == null ? " filterText" : "";
        if (this.d == null) {
            str = str.concat(" showPlaceInfo");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" surface");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bkpb(this.c, this.a, this.d.booleanValue(), this.b);
    }
}
