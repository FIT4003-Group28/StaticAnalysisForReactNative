package defpackage;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.LiveChatActionPanelRendererOuterClass;
import com.google.protos.youtube.api.innertube.PollRendererOuterClass;
/* compiled from: PG */
/* renamed from: abiy  reason: default package */
/* loaded from: classes.dex */
public final class abiy implements abhk {
    public abqq a;
    private final Handler b;

    public abiy(Handler handler) {
        this.b = handler;
    }

    @Override // defpackage.abhk
    public final void a(apzg apzgVar) {
        if (apzgVar.qn(LiveChatAction.ShowLiveChatActionPanelAction.showLiveChatActionPanelAction)) {
            final LiveChatAction.ShowLiveChatActionPanelAction showLiveChatActionPanelAction = (LiveChatAction.ShowLiveChatActionPanelAction) apzgVar.qm(LiveChatAction.ShowLiveChatActionPanelAction.showLiveChatActionPanelAction);
            if ((showLiveChatActionPanelAction.b & 1) == 0) {
                return;
            }
            aunb aunbVar = showLiveChatActionPanelAction.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(LiveChatActionPanelRendererOuterClass.liveChatActionPanelRenderer)) {
                return;
            }
            this.b.post(new Runnable() { // from class: abiw
                @Override // java.lang.Runnable
                public final void run() {
                    abiy abiyVar = abiy.this;
                    aunb aunbVar2 = showLiveChatActionPanelAction.c;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    asqc asqcVar = (asqc) aunbVar2.qm(LiveChatActionPanelRendererOuterClass.liveChatActionPanelRenderer);
                    abqq abqqVar = abiyVar.a;
                    if (abqqVar == null || abqqVar.t) {
                        return;
                    }
                    abqqVar.m.removeAllViews();
                    if ((asqcVar.b & 4) != 0) {
                        aunb aunbVar3 = asqcVar.d;
                        if (aunbVar3 == null) {
                            aunbVar3 = aunb.a;
                        }
                        if (aunbVar3.qn(PollRendererOuterClass.pollRenderer)) {
                            aufe aufeVar = (aufe) aunbVar3.qm(PollRendererOuterClass.pollRenderer);
                            abqqVar.p = aufeVar;
                            abqqVar.r = aufeVar.l;
                            if ((aufeVar.b & 2) != 0) {
                                aunb aunbVar4 = aufeVar.e;
                                if (aunbVar4 == null) {
                                    aunbVar4 = aunb.a;
                                }
                                if (aunbVar4.qn(PollRendererOuterClass.pollHeaderRenderer)) {
                                    abqqVar.h((aufd) aunbVar4.qm(PollRendererOuterClass.pollHeaderRenderer), true);
                                }
                            }
                            if (aufeVar.f.size() > 0) {
                                for (aufc aufcVar : aufeVar.f) {
                                    abqi abqiVar = new abqi(abqqVar.a, new abqk(abqqVar));
                                    abqiVar.a(aufcVar, Boolean.valueOf(abqqVar.r));
                                    abqqVar.m.addView(abqiVar.a);
                                    abqqVar.g.add(abqiVar);
                                }
                            }
                            abqqVar.g(aufeVar);
                            abqqVar.f.u(new acte(aufeVar.g), null);
                        }
                    }
                    abqqVar.o = asqcVar;
                    if (!abqqVar.t) {
                        abqqVar.t = true;
                        ObjectAnimator objectAnimator = abqqVar.q;
                        if (objectAnimator == null || !objectAnimator.isRunning()) {
                            abqqVar.e.b(abqqVar);
                        }
                    }
                    abqqVar.d.a(asqcVar, abqqVar.j);
                }
            });
        } else if (apzgVar.qn(LiveChatAction.CloseLiveChatActionPanelAction.closeLiveChatActionPanelAction)) {
            LiveChatAction.CloseLiveChatActionPanelAction closeLiveChatActionPanelAction = (LiveChatAction.CloseLiveChatActionPanelAction) apzgVar.qm(LiveChatAction.CloseLiveChatActionPanelAction.closeLiveChatActionPanelAction);
            if ((closeLiveChatActionPanelAction.b & 1) == 0) {
                return;
            }
            boolean z = closeLiveChatActionPanelAction.e;
            if (closeLiveChatActionPanelAction.d > 0) {
                this.b.postDelayed(new abit(this, closeLiveChatActionPanelAction, z, 1), closeLiveChatActionPanelAction.d);
            } else {
                this.b.post(new abit(this, closeLiveChatActionPanelAction, z));
            }
        } else if (apzgVar.qn(LiveChatAction.replaceLiveChatRendererAction)) {
            final asqa asqaVar = (asqa) apzgVar.qm(LiveChatAction.replaceLiveChatRendererAction);
            if ((asqaVar.b & 2) == 0) {
                return;
            }
            aunb aunbVar2 = asqaVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            if (!aunbVar2.qn(LiveChatActionPanelRendererOuterClass.liveChatActionPanelRenderer)) {
                return;
            }
            this.b.post(new Runnable() { // from class: abiv
                @Override // java.lang.Runnable
                public final void run() {
                    asqc asqcVar;
                    abiy abiyVar = abiy.this;
                    aunb aunbVar3 = asqaVar.d;
                    if (aunbVar3 == null) {
                        aunbVar3 = aunb.a;
                    }
                    asqc asqcVar2 = (asqc) aunbVar3.qm(LiveChatActionPanelRendererOuterClass.liveChatActionPanelRenderer);
                    abqq abqqVar = abiyVar.a;
                    if (abqqVar == null || !abqqVar.t || (asqcVar = abqqVar.o) == null || !TextUtils.equals(asqcVar2.c, asqcVar.c) || (asqcVar2.b & 4) == 0) {
                        return;
                    }
                    aunb aunbVar4 = asqcVar2.d;
                    if (aunbVar4 == null) {
                        aunbVar4 = aunb.a;
                    }
                    if (!aunbVar4.qn(PollRendererOuterClass.pollRenderer)) {
                        return;
                    }
                    aufe aufeVar = (aufe) aunbVar4.qm(PollRendererOuterClass.pollRenderer);
                    if (!abqqVar.k(aufeVar)) {
                        return;
                    }
                    abqqVar.j(aufeVar);
                    abqqVar.o = asqcVar2;
                }
            });
        } else if (apzgVar.qn(LiveChatAction.UpdateLiveChatPollAction.updateLiveChatPollAction)) {
            final LiveChatAction.UpdateLiveChatPollAction updateLiveChatPollAction = (LiveChatAction.UpdateLiveChatPollAction) apzgVar.qm(LiveChatAction.UpdateLiveChatPollAction.updateLiveChatPollAction);
            if ((updateLiveChatPollAction.b & 1) == 0) {
                return;
            }
            aunb aunbVar3 = updateLiveChatPollAction.c;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            if (!aunbVar3.qn(PollRendererOuterClass.pollRenderer)) {
                return;
            }
            this.b.post(new Runnable() { // from class: abix
                @Override // java.lang.Runnable
                public final void run() {
                    abiy abiyVar = abiy.this;
                    aunb aunbVar4 = updateLiveChatPollAction.c;
                    if (aunbVar4 == null) {
                        aunbVar4 = aunb.a;
                    }
                    aufe aufeVar = (aufe) aunbVar4.qm(PollRendererOuterClass.pollRenderer);
                    abqq abqqVar = abiyVar.a;
                    if (abqqVar == null || !abqqVar.t) {
                        return;
                    }
                    abqqVar.j(aufeVar);
                }
            });
        } else if (!apzgVar.qn(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
        } else {
            final LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = (LiveChatAction.MarkChatItemAsDeletedAction) apzgVar.qm(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
            if ((markChatItemAsDeletedAction.b & 4) == 0) {
                return;
            }
            this.b.post(new Runnable() { // from class: abiu
                @Override // java.lang.Runnable
                public final void run() {
                    abiy.this.b(markChatItemAsDeletedAction.e, false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, boolean z) {
        abqq abqqVar = this.a;
        if (abqqVar == null || !abqqVar.t) {
            return;
        }
        asqc asqcVar = abqqVar.o;
        if (!TextUtils.equals(str, asqcVar != null ? asqcVar.c : null)) {
            return;
        }
        this.a.e(true, true, z);
    }
}
