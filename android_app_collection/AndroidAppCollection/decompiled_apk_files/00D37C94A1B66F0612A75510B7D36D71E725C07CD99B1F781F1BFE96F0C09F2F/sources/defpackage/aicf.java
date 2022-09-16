package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: aicf  reason: default package */
/* loaded from: classes.dex */
public final class aicf implements aich {
    private final List a;

    public aicf(aich... aichVarArr) {
        List asList = Arrays.asList(aichVarArr);
        asList.getClass();
        this.a = asList;
    }

    @Override // defpackage.aich
    public final void pG(boolean z) {
        for (aich aichVar : this.a) {
            aichVar.pG(z);
        }
    }

    @Override // defpackage.aich
    public final void pH(VideoQuality[] videoQualityArr, int i, boolean z) {
        for (aich aichVar : this.a) {
            aichVar.pH(videoQualityArr, i, z);
        }
    }

    @Override // defpackage.aich
    public final void q(aicg aicgVar) {
        for (aich aichVar : this.a) {
            aichVar.q(aicgVar);
        }
    }
}
