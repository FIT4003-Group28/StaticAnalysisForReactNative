package defpackage;

import java.util.zip.CRC32;
/* renamed from: byxi  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class byxi implements dbrn {
    static final dbrn a = new byxi();

    private byxi() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        CRC32 crc32 = new CRC32();
        byte[] bS = ((dljv) obj).bS();
        crc32.update(bS, 0, bS.length);
        return Integer.valueOf((int) crc32.getValue());
    }
}
