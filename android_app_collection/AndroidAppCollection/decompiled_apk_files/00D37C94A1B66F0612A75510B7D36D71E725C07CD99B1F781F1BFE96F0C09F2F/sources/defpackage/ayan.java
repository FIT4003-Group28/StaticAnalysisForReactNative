package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayan  reason: default package */
/* loaded from: classes2.dex */
public final class ayan extends ayaq {
    private final ayao c;

    public ayan(String str, ayao ayaoVar) {
        super(str, false);
        aqxo.w(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        ayaoVar.getClass();
        this.c = ayaoVar;
    }

    @Override // defpackage.ayaq
    public final Object a(byte[] bArr) {
        return this.c.a(new String(bArr, amoz.a));
    }

    @Override // defpackage.ayaq
    public final byte[] b(Object obj) {
        return this.c.b(obj).getBytes(amoz.a);
    }
}
