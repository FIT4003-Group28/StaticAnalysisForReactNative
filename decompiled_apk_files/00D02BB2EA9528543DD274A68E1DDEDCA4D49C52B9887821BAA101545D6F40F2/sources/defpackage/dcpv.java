package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcpv  reason: default package */
/* loaded from: classes.dex */
final class dcpv extends dcpg {
    public dcpv(Map<Character, String> map) {
        super(map);
    }

    @Override // defpackage.dcpg
    protected final char[] c(char c) {
        if (c < 256) {
            char[] cArr = dcpw.a;
            char[] cArr2 = {'\\', dcpw.a[r6 >>> 3], dcpw.a[r6 & 7], dcpw.a[c & 7]};
            int i = c >>> 3;
            return cArr2;
        }
        return dcpw.a(c);
    }
}
