package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcps  reason: default package */
/* loaded from: classes.dex */
final class dcps extends dcpi {
    public dcps(Map map) {
        super(map);
    }

    @Override // defpackage.dcpi
    protected final char[] d(int i) {
        if (i < 256) {
            return dcpw.b((char) i);
        }
        if (i < 65536) {
            return dcpw.a((char) i);
        }
        char[] cArr = {'\\', 'U', dcpw.a[r6 >>> 4], dcpw.a[r6 & 15], dcpw.a[r6 & 15], dcpw.a[r6 & 15], dcpw.a[r6 & 15], dcpw.a[r6 & 15], dcpw.a[r6 & 15], dcpw.a[i & 15]};
        int i2 = i >>> 4;
        int i3 = i2 >>> 4;
        int i4 = i3 >>> 4;
        int i5 = i4 >>> 4;
        int i6 = i5 >>> 4;
        int i7 = i6 >>> 4;
        return cArr;
    }
}
