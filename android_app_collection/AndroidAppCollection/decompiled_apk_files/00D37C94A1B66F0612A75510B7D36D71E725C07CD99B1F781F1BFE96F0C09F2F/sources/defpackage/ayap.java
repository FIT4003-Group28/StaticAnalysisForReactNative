package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayap  reason: default package */
/* loaded from: classes2.dex */
public final class ayap extends ayaq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayap(String str) {
        super(str, false);
        boolean z = false;
        aqxo.w(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        aqxo.q(str.length() > 4 ? true : z, "empty key name");
    }

    @Override // defpackage.ayaq
    public final Object a(byte[] bArr) {
        return bArr;
    }

    @Override // defpackage.ayaq
    public final byte[] b(Object obj) {
        return (byte[]) obj;
    }
}
