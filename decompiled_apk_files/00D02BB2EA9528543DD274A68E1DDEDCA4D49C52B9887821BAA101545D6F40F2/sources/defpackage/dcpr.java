package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcpr  reason: default package */
/* loaded from: classes.dex */
final class dcpr extends dcpg {
    public dcpr(Map map) {
        super(map);
    }

    @Override // defpackage.dcpg
    protected final char[] c(char c) {
        return c < 256 ? new char[]{'\\', 'x', dcpw.a[c >>> 4], dcpw.a[c & 15]} : dcpw.a(c);
    }
}
