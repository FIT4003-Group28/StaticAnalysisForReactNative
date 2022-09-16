package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayar  reason: default package */
/* loaded from: classes2.dex */
public final class ayar extends ayaq {
    private final ayas c;

    public ayar(String str, boolean z, ayas ayasVar) {
        super(str, z);
        aqxo.w(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        ayasVar.getClass();
        this.c = ayasVar;
    }

    @Override // defpackage.ayaq
    public final Object a(byte[] bArr) {
        return this.c.a(bArr);
    }

    @Override // defpackage.ayaq
    public final byte[] b(Object obj) {
        return this.c.b(obj);
    }
}
