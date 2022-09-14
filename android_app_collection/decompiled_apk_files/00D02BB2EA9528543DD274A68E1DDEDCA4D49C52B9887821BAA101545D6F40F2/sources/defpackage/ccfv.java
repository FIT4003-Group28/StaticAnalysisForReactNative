package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;
/* renamed from: ccfv  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccfv implements dbsl {
    static final dbsl a = new ccfv();

    private ccfv() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        Pattern pattern = ccfx.b;
        Uri b = ((afga) obj).b();
        String path = b.getPath();
        return path != null && afhf.a(b, "/maps/contrib") && (ccfx.b.matcher(path).matches() || ccfx.c.matcher(path).matches());
    }
}
