package defpackage;

import com.google.protos.youtube.api.innertube.DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand;
import com.google.protos.youtube.api.innertube.ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xom  reason: default package */
/* loaded from: classes4.dex */
public final class xom implements aafl {
    private final xse a;
    private final /* synthetic */ int b;

    public xom(xse xseVar, int i) {
        this.b = i;
        xseVar.getClass();
        this.a = xseVar;
    }

    public xom(xse xseVar) {
        xseVar.getClass();
        this.a = xseVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.b == 0) {
            if (!apzgVar.qn(ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.showPostCreationDialogFooterCommand)) {
                zep.b("ShowPostCreationDialogFooterCommandResolver receives an unknown command.");
                return;
            }
            ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand = (ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand) apzgVar.qm(ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.showPostCreationDialogFooterCommand);
            if ((showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.b & 1) == 0) {
                zep.b("Executed showPostCreationDialogFooterCommand without renderer.");
                return;
            }
            xse xseVar = this.a;
            aunb aunbVar = showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            xseVar.a(ampq.j(aunbVar));
        } else if (!apzgVar.qn(DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.dismissPostCreationDialogFooterCommand)) {
            zep.b("DismissPostCreationDialogFooterCommandResolver receives an unknown command.");
        } else {
            this.a.a(amon.a);
        }
    }
}
