package defpackage;

import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hwt  reason: default package */
/* loaded from: classes3.dex */
public final class hwt implements aafo {
    private final aafi a;
    private final LoggingUrlsPingController b;

    public hwt(aafi aafiVar, LoggingUrlsPingController loggingUrlsPingController) {
        this.a = aafiVar;
        this.b = loggingUrlsPingController;
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void a(apzg apzgVar) {
        aafn.a(this, apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        aafl f = this.a.f(apzgVar);
        if (f != null && f != aafl.x) {
            this.b.i(apzgVar.d, map);
        }
        this.a.c(apzgVar, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }
}
