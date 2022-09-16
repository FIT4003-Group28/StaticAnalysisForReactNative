package defpackage;

import com.google.protos.youtube.api.innertube.CommentShareboxRenderer;
import com.google.protos.youtube.api.innertube.ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hyd  reason: default package */
/* loaded from: classes3.dex */
public final class hyd implements aafl {
    public final feu a;
    public final iee b;
    private final xli c;

    public hyd(xli xliVar, feu feuVar, iee ieeVar) {
        this.c = xliVar;
        this.a = feuVar;
        this.b = ieeVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar.qn(ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.showCommentSimpleboxCommand)) {
            aunb aunbVar = ((ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand) apzgVar.qm(ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.showCommentSimpleboxCommand)).b;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            this.c.i = new hyc(this);
            this.c.f((aqca) aunbVar.qm(CommentShareboxRenderer.commentSimpleboxRenderer), null);
        }
    }
}
