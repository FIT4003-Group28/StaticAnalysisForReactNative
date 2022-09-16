package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatAction;
/* compiled from: PG */
/* renamed from: abit  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abit implements Runnable {
    public final /* synthetic */ abiy a;
    public final /* synthetic */ LiveChatAction.CloseLiveChatActionPanelAction b;
    public final /* synthetic */ boolean c;
    private final /* synthetic */ int d;

    public /* synthetic */ abit(abiy abiyVar, LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction, boolean z) {
        this.a = abiyVar;
        this.b = closeLiveChatActionPanelAction;
        this.c = z;
    }

    public /* synthetic */ abit(abiy abiyVar, LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction, boolean z, int i) {
        this.d = i;
        this.a = abiyVar;
        this.b = closeLiveChatActionPanelAction;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            abiy abiyVar = this.a;
            LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction = this.b;
            abiyVar.b(closeLiveChatActionPanelAction.c, this.c);
            return;
        }
        abiy abiyVar2 = this.a;
        LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction2 = this.b;
        abiyVar2.b(closeLiveChatActionPanelAction2.c, this.c);
    }
}
