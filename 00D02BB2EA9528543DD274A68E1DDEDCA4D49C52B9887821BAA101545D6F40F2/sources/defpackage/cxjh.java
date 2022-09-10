package defpackage;

import java.util.concurrent.Executors;
/* renamed from: cxjh  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cxjh implements dbty {
    static final dbty a = new cxjh();

    private cxjh() {
    }

    @Override // defpackage.dbty
    public final Object a() {
        return dehx.d(Executors.newSingleThreadScheduledExecutor(cxjg.a));
    }
}
