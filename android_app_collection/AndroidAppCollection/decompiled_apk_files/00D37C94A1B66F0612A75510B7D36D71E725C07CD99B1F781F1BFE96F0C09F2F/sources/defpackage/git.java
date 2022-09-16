package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;
/* compiled from: PG */
/* renamed from: git  reason: default package */
/* loaded from: classes3.dex */
public final class git extends gme {
    private final aafo h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public git(android.content.Context r9, defpackage.yni r10, defpackage.aaxb r11, defpackage.yzj r12, defpackage.aafo r13, java.util.concurrent.Executor r14) {
        /*
            r8 = this;
            r11.getClass()
            gkv r5 = new gkv
            r0 = 1
            r5.<init>(r11, r0)
            r11.getClass()
            gku r6 = new gku
            r6.<init>(r11, r0)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.h = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.git.<init>(android.content.Context, yni, aaxb, yzj, aafo, java.util.concurrent.Executor):void");
    }

    @Override // defpackage.gme
    protected final int b() {
        return R.string.watch_history_clear;
    }

    @Override // defpackage.gme
    protected final int c() {
        return R.string.watch_history_clear_confirmation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gme
    public final int d() {
        return R.string.watch_history_clear_done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gme
    public final aarv e(apzg apzgVar, Object obj) {
        return new epw(apzgVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gme
    public final void f(apzg apzgVar) {
        this.h.d(((ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint) apzgVar.qm(ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.clearWatchHistoryEndpoint)).b, null);
    }
}
