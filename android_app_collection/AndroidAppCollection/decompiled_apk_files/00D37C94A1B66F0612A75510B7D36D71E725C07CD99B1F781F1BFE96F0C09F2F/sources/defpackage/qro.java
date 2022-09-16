package defpackage;

import android.os.Bundle;
import java.util.Map;
/* compiled from: PG */
/* renamed from: qro  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qro implements rvd {
    private final /* synthetic */ int c;
    public static final /* synthetic */ qro b = new qro(1);
    public static final /* synthetic */ qro a = new qro();

    private /* synthetic */ qro() {
    }

    private /* synthetic */ qro(int i) {
        this.c = i;
    }

    @Override // defpackage.rvd
    public final rve a(Object obj) {
        if (this.c == 0) {
            Map map = (Map) obj;
            return rwd.c(null);
        }
        Bundle bundle = (Bundle) obj;
        if (qrl.d(bundle)) {
            return rwd.c(null);
        }
        return rwd.c(bundle);
    }
}
