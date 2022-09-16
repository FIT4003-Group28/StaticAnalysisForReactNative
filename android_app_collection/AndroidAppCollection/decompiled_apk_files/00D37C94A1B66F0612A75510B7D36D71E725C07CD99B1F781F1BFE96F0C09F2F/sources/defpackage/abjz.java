package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatAction;
/* compiled from: PG */
/* renamed from: abjz  reason: default package */
/* loaded from: classes.dex */
public final class abjz {
    private LiveChatAction.MarkChatItemAsDeletedAction a;
    private LiveChatAction.MarkChatItemsByAuthorAsDeletedAction b;

    public abjz(apzg apzgVar) {
        if (apzgVar == null) {
            return;
        }
        if (apzgVar.qn(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
            this.a = (LiveChatAction.MarkChatItemAsDeletedAction) apzgVar.qm(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
        } else if (!apzgVar.qn(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
        } else {
            this.b = (LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) apzgVar.qm(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
        }
    }

    public final arag a() {
        LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = this.a;
        if (markChatItemAsDeletedAction != null) {
            arag aragVar = markChatItemAsDeletedAction.c;
            return aragVar == null ? arag.a : aragVar;
        }
        LiveChatAction.MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = this.b;
        if (markChatItemsByAuthorAsDeletedAction == null) {
            return null;
        }
        arag aragVar2 = markChatItemsByAuthorAsDeletedAction.c;
        return aragVar2 == null ? arag.a : aragVar2;
    }

    public final arag b() {
        LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = this.a;
        if (markChatItemAsDeletedAction != null) {
            arag aragVar = markChatItemAsDeletedAction.d;
            return aragVar == null ? arag.a : aragVar;
        }
        LiveChatAction.MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = this.b;
        if (markChatItemsByAuthorAsDeletedAction == null) {
            return null;
        }
        arag aragVar2 = markChatItemsByAuthorAsDeletedAction.d;
        return aragVar2 == null ? arag.a : aragVar2;
    }

    public final boolean c() {
        return (this.a == null && this.b == null) ? false : true;
    }

    public abjz(Object obj) {
        this(obj instanceof apzg ? (apzg) obj : null);
    }
}
