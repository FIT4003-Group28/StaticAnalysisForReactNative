package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;
/* compiled from: PG */
/* renamed from: igt  reason: default package */
/* loaded from: classes3.dex */
public final class igt extends zxr {
    public final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer a;
    public final ihl b;
    public final ajrs c;

    public igt(dt dtVar, ihl ihlVar, aunb aunbVar, ajrs ajrsVar) {
        super(dtVar, dtVar.getSupportFragmentManager(), null, false, false);
        this.b = ihlVar;
        this.a = (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer) aunbVar.qm(PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.pendingReelUploadsBottomSheetRenderer);
        this.c = ajrsVar;
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.b.f;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        arag aragVar = this.a.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return ajgl.b(aragVar);
    }
}
