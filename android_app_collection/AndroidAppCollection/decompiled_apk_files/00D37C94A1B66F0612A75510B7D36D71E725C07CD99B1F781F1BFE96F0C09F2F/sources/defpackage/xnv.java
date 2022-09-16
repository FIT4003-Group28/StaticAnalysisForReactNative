package defpackage;

import com.google.android.libraries.youtube.comment.endpoint.ChangeCommentsMarkersVisibilityCommandHelper;
import com.google.protos.youtube.api.innertube.ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand;
import com.google.protos.youtube.api.innertube.ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand;
import com.google.protos.youtube.api.innertube.ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xnv  reason: default package */
/* loaded from: classes4.dex */
public final class xnv implements aafl {
    private final ChangeCommentsMarkersVisibilityCommandHelper a;
    private final /* synthetic */ int b;

    public xnv(ChangeCommentsMarkersVisibilityCommandHelper changeCommentsMarkersVisibilityCommandHelper) {
        this.a = changeCommentsMarkersVisibilityCommandHelper;
    }

    public xnv(ChangeCommentsMarkersVisibilityCommandHelper changeCommentsMarkersVisibilityCommandHelper, int i) {
        this.b = i;
        this.a = changeCommentsMarkersVisibilityCommandHelper;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        int H;
        boolean z = false;
        if (this.b == 0) {
            ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand = (ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand) apzgVar.qm(ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.changeCommentsSortModeCommand);
            ChangeCommentsMarkersVisibilityCommandHelper changeCommentsMarkersVisibilityCommandHelper = this.a;
            if ((changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.b & 1) != 0 && (H = akpq.H(changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.c)) != 0 && H == 3) {
                z = true;
            }
            changeCommentsMarkersVisibilityCommandHelper.b = z;
            return;
        }
        ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand = (ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand) apzgVar.qm(ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.changeCommentsMarkersVisibilityCommand);
        ChangeCommentsMarkersVisibilityCommandHelper changeCommentsMarkersVisibilityCommandHelper2 = this.a;
        if ((changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.b & 1) != 0 && changeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.c) {
            z = true;
        }
        if (z && !changeCommentsMarkersVisibilityCommandHelper2.b) {
            return;
        }
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopg aopgVar = ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.changeKeyedMarkersVisibilityCommand;
        aopa createBuilder = ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.a.createBuilder();
        createBuilder.copyOnWrite();
        ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand = (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand) createBuilder.instance;
        changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.b = 1 | changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.b;
        changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.c = z;
        createBuilder.copyOnWrite();
        ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand2 = (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand) createBuilder.instance;
        changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand2.b |= 2;
        changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand2.d = "COMMENTS_MARKERS_KEY";
        aopcVar.e(aopgVar, (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand) createBuilder.mo39build());
        ((aafo) changeCommentsMarkersVisibilityCommandHelper2.a.get()).a((apzg) aopcVar.mo39build());
    }
}
