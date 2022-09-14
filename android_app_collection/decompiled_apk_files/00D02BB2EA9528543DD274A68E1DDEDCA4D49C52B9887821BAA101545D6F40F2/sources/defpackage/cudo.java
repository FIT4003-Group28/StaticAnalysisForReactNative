package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cudo  reason: default package */
/* loaded from: classes5.dex */
public final class cudo extends cuge {
    private String a;
    private ctzl b;
    private dbsg<byte[]> c = dbpy.a;

    @Override // defpackage.cuge
    public final void b(ctzl ctzlVar) {
        if (ctzlVar != null) {
            this.b = ctzlVar;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // defpackage.cuge
    public final void c(byte[] bArr) {
        this.c = dbsg.i(bArr);
    }

    @Override // defpackage.cuge
    public final void d(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null menuName");
    }

    @Override // defpackage.cuge
    public final cugf a() {
        String str = this.a == null ? " menuName" : "";
        if (this.b == null) {
            str = str.concat(" action");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cudp(this.a, this.b, this.c);
    }
}
