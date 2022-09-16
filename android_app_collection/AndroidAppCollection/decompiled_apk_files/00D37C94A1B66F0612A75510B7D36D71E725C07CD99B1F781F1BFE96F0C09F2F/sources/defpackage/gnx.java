package defpackage;

import com.google.protos.youtube.api.innertube.AddRendererToItemSectionActionOuterClass;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand;
import com.google.protos.youtube.api.innertube.CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand;
import com.google.protos.youtube.api.innertube.CommentSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand;
import com.google.protos.youtube.api.innertube.RemoveRendererFromItemSectionActionOuterClass;
import com.google.protos.youtube.api.innertube.ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint;
import com.google.protos.youtube.api.innertube.ReplaceItemSectionHeaderActionOuterClass;
import com.google.protos.youtube.api.innertube.ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction;
import com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction;
import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gnx  reason: default package */
/* loaded from: classes3.dex */
public final class gnx implements aafl {
    public static final /* synthetic */ int a = 0;
    private final yni b;
    private final /* synthetic */ int c;

    public gnx(yni yniVar) {
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i) {
        this.c = i;
        yniVar.getClass();
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, float[] fArr) {
        this.c = i;
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, int[] iArr) {
        this.c = i;
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, short[] sArr) {
        this.c = i;
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, boolean[] zArr) {
        this.c = i;
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, byte[][] bArr) {
        this.c = i;
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, char[][] cArr) {
        this.c = i;
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, boolean[][] zArr) {
        this.c = i;
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, byte[] bArr) {
        this.c = i;
        yniVar.getClass();
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, char[] cArr) {
        this.c = i;
        yniVar.getClass();
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, short[][] sArr) {
        this.c = i;
        yniVar.getClass();
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, int[][] iArr) {
        this.c = i;
        yniVar.getClass();
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, float[][] fArr) {
        this.c = i;
        yniVar.getClass();
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, byte[][][] bArr) {
        this.c = i;
        yniVar.getClass();
        this.b = yniVar;
    }

    public gnx(yni yniVar, int i, char[][][] cArr) {
        this.c = i;
        yniVar.getClass();
        this.b = yniVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Object qm;
        boolean z = false;
        apbs apbsVar = null;
        atpl atplVar = null;
        final aumz aumzVar = null;
        switch (this.c) {
            case 0:
                if (!apzgVar.qn(CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand.closeSponsorshipsDialogCommand)) {
                    return;
                }
                this.b.f(new ygj());
                return;
            case 1:
                if (!apzgVar.qn(ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint)) {
                    return;
                }
                this.b.d(new wki(((ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint) apzgVar.qm(ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint)).b));
                return;
            case 2:
                this.b.d(isy.a((ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction) apzgVar.qm(ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.showChannelNotificationPreferenceDialogAction)));
                return;
            case 3:
                this.b.d(apzgVar.qm(ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.showSubscribePromoAction));
                return;
            case 4:
                if (!apzgVar.qn(CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand.closeSuggestedPlaylistVideosSheetCommand)) {
                    return;
                }
                this.b.d(new kqd());
                return;
            case 5:
                Object I = zew.I(map, "show_search_contents_command_key");
                if (I == null) {
                    I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                }
                yni yniVar = this.b;
                if ((I instanceof Boolean) && ((Boolean) I).booleanValue()) {
                    z = true;
                }
                yniVar.d(kxb.a(z));
                return;
            case 6:
                if (apzgVar.qn(AddRendererToItemSectionActionOuterClass.addRendererToItemSectionAction)) {
                    apbsVar = (apbs) apzgVar.qm(AddRendererToItemSectionActionOuterClass.addRendererToItemSectionAction);
                }
                if (apbsVar == null) {
                    zep.b("AddRendererToItemSectionActionResolver received an action other than AddRendererToItemSectionAction.");
                    return;
                }
                int i = apbsVar.b;
                if ((i & 1) == 0) {
                    zep.b("AddRendererToItemSectionAction has no renderer.");
                    return;
                } else if ((i & 2) != 0) {
                    aunb aunbVar = apbsVar.c;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    if (aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
                        qm = ajhh.a((aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer));
                    } else if (aunbVar.qn(CommentSectionRendererOuterClass.commentThreadRenderer)) {
                        qm = aunbVar.qm(CommentSectionRendererOuterClass.commentThreadRenderer);
                    } else {
                        zep.b("AddRendererToItemSectionAction contains an unsupported renderer.");
                        return;
                    }
                    this.b.e(apbsVar.d, new aabi(qm, 0));
                    return;
                } else {
                    zep.b("AddRendererToItemSectionAction has no target item section.");
                    return;
                }
            case 7:
                CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint) apzgVar.qm(CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.commentsStreamReloadEndpoint);
                aqcm aqcmVar = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                if (aqcmVar == null) {
                    aqcmVar = aqcm.a;
                }
                if ((aqcmVar.b & 1) == 0) {
                    return;
                }
                xml xmlVar = (xml) zew.K(map, "sectionController", xml.class);
                if (xmlVar == null) {
                    this.b.f(new xou(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint));
                    return;
                }
                int e = aqgn.e(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.d);
                if (e == 0) {
                    e = 1;
                }
                int i2 = e - 1;
                if (i2 == 1) {
                    aqcm aqcmVar2 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                    if (aqcmVar2 == null) {
                        aqcmVar2 = aqcm.a;
                    }
                    aumx aumxVar = aqcmVar2.c;
                    if (aumxVar == null) {
                        aumxVar = aumx.a;
                    }
                    xmlVar.lx(aumxVar, null);
                    return;
                } else if (i2 != 2) {
                    aqcm aqcmVar3 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                    if (aqcmVar3 == null) {
                        aqcmVar3 = aqcm.a;
                    }
                    aumx aumxVar2 = aqcmVar3.c;
                    if (aumxVar2 == null) {
                        aumxVar2 = aumx.a;
                    }
                    xmlVar.lr(ajna.g(aumxVar2));
                    return;
                } else {
                    aqcm aqcmVar4 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                    if (aqcmVar4 == null) {
                        aqcmVar4 = aqcm.a;
                    }
                    aumx aumxVar3 = aqcmVar4.c;
                    if (aumxVar3 == null) {
                        aumxVar3 = aumx.a;
                    }
                    xmlVar.r(aumxVar3, Math.max(0, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.f));
                    return;
                }
            case 8:
                if (apzgVar.qn(RemoveRendererFromItemSectionActionOuterClass.removeRendererFromItemSectionAction)) {
                    aumzVar = (aumz) apzgVar.qm(RemoveRendererFromItemSectionActionOuterClass.removeRendererFromItemSectionAction);
                }
                if (aumzVar == null) {
                    zep.b("RemoveRendererFromItemSectionActionResolver received an action other than RemoveRendererFromItemSectionAction.");
                    return;
                } else if (aumzVar.b != 1) {
                    return;
                } else {
                    this.b.d(aabm.a(new ampt() { // from class: xoi
                        /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
                        @Override // defpackage.ampt
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean a(java.lang.Object r5) {
                            /*
                                r4 = this;
                                aumz r0 = defpackage.aumz.this
                                int r1 = defpackage.gnx.a
                                boolean r1 = r5 instanceof defpackage.ajhh
                                r2 = 0
                                if (r1 != 0) goto La
                                goto L5d
                            La:
                                ajhh r5 = (defpackage.ajhh) r5
                                aqtb r5 = r5.a
                                byte[] r5 = defpackage.ajhm.a(r5)
                                if (r5 != 0) goto L16
                            L14:
                                r5 = 0
                                goto L4b
                            L16:
                                aoos r1 = defpackage.ajhm.a     // Catch: java.lang.Throwable -> L14
                                awnn r3 = defpackage.awnn.a     // Catch: java.lang.Throwable -> L14
                                aopi r5 = defpackage.aopi.parseFrom(r3, r5, r1)     // Catch: java.lang.Throwable -> L14
                                awnn r5 = (defpackage.awnn) r5     // Catch: java.lang.Throwable -> L14
                                awow r5 = r5.c     // Catch: java.lang.Throwable -> L14
                                if (r5 != 0) goto L26
                                awow r5 = defpackage.awow.a     // Catch: java.lang.Throwable -> L14
                            L26:
                                aopg r1 = defpackage.awmx.b     // Catch: java.lang.Throwable -> L14
                                java.lang.Object r5 = r5.qm(r1)     // Catch: java.lang.Throwable -> L14
                                awmx r5 = (defpackage.awmx) r5     // Catch: java.lang.Throwable -> L14
                                awnc r5 = r5.e     // Catch: java.lang.Throwable -> L14
                                if (r5 != 0) goto L34
                                awnc r5 = defpackage.awnc.a     // Catch: java.lang.Throwable -> L14
                            L34:
                                byte[] r5 = r5.toByteArray()
                                aoog r5 = defpackage.aoog.O(r5)
                                boolean r1 = r5.E()
                                if (r1 == 0) goto L43
                                goto L14
                            L43:
                                int r5 = r5.n()
                                int r5 = defpackage.aosl.a(r5)
                            L4b:
                                int r1 = r0.b
                                r3 = 1
                                if (r1 != r3) goto L59
                                java.lang.Object r0 = r0.c
                                java.lang.Integer r0 = (java.lang.Integer) r0
                                int r0 = r0.intValue()
                                goto L5a
                            L59:
                                r0 = 0
                            L5a:
                                if (r5 != r0) goto L5d
                                return r3
                            L5d:
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.xoi.a(java.lang.Object):boolean");
                        }
                    }));
                    return;
                }
            case 9:
                if (!apzgVar.qn(ReplaceItemSectionHeaderActionOuterClass.replaceItemSectionHeaderAction)) {
                    zep.b("ReplaceItemSectionHeaderActionResolver receives an unknown command");
                    return;
                }
                aunl aunlVar = (aunl) apzgVar.qm(ReplaceItemSectionHeaderActionOuterClass.replaceItemSectionHeaderAction);
                int i3 = aunlVar.b;
                if ((i3 & 1) == 0) {
                    zep.b("ReplaceItemSectionHeaderAction doesn't contain a new header");
                    return;
                } else if ((i3 & 2) == 0) {
                    zep.b("ReplaceItemSectionHeaderAction doesn't contain the target item section");
                    return;
                } else {
                    yni yniVar2 = this.b;
                    String str = aunlVar.d;
                    aslo asloVar = aunlVar.c;
                    if (asloVar == null) {
                        asloVar = aslo.a;
                    }
                    yniVar2.e(str, new aabo(asloVar));
                    return;
                }
            case 10:
                AddToToastActionOuterClass$AddToToastAction addToToastActionOuterClass$AddToToastAction = (AddToToastActionOuterClass$AddToToastAction) apzgVar.qm(AddToToastActionOuterClass$AddToToastAction.addToToastAction);
                apbx apbxVar = addToToastActionOuterClass$AddToToastAction.b;
                if (apbxVar == null) {
                    apbxVar = apbx.a;
                }
                if ((apbxVar.b & 2) == 0) {
                    apbx apbxVar2 = addToToastActionOuterClass$AddToToastAction.b;
                    if (apbxVar2 == null) {
                        apbxVar2 = apbx.a;
                    }
                    if ((apbxVar2.b & 1) != 0) {
                        apbx apbxVar3 = addToToastActionOuterClass$AddToToastAction.b;
                        if (apbxVar3 == null) {
                            apbxVar3 = apbx.a;
                        }
                        atplVar = apbxVar3.c;
                        if (atplVar == null) {
                            atplVar = atpl.a;
                        }
                    }
                    this.b.d(aabj.d(atplVar, map));
                    return;
                }
                yni yniVar3 = this.b;
                apbx apbxVar4 = addToToastActionOuterClass$AddToToastAction.b;
                if (apbxVar4 == null) {
                    apbxVar4 = apbx.a;
                }
                atoo atooVar = apbxVar4.d;
                if (atooVar == null) {
                    atooVar = atoo.a;
                }
                yniVar3.d(aabj.c(atooVar, map));
                return;
            case 11:
                Object I2 = zew.I(map, "com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag");
                if (I2 == null) {
                    I2 = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                }
                if (I2 == null) {
                    zep.l(String.valueOf(getClass().getName()).concat(": attempted to route with null tag"));
                    return;
                } else {
                    this.b.d(aabk.a(I2));
                    return;
                }
            case 12:
                final HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand = (HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand) apzgVar.qm(HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.hideItemSectionVideosByIdCommand);
                if ((hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.b & 1) == 0) {
                    return;
                }
                this.b.d(aabm.a(new ampt() { // from class: aabl
                    @Override // defpackage.ampt
                    public final boolean a(Object obj) {
                        HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand2 = HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.this;
                        int i4 = gnx.a;
                        String str2 = hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand2.c;
                        if (!(obj instanceof aqfa)) {
                            return false;
                        }
                        return str2.equals(((aqfa) obj).c);
                    }
                }));
                return;
            case 13:
                this.b.d(abjv.a(ampq.i(zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")), (ToggleConversationActionOuterClass$ToggleConversationAction) apzgVar.qm(ToggleConversationActionOuterClass$ToggleConversationAction.toggleConversationAction)));
                return;
            case 14:
                Object I3 = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (I3 instanceof akmd) {
                    akmd akmdVar = (akmd) I3;
                    Object obj = akmdVar.b;
                    if (!akmdVar.a) {
                        this.b.d(new akmt());
                    }
                    I3 = obj;
                }
                if (I3 == null) {
                    return;
                }
                this.b.d(aabm.b(I3));
                return;
            default:
                Object I4 = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (I4 instanceof akmd) {
                    I4 = ((akmd) I4).b;
                }
                if (I4 == null) {
                    return;
                }
                this.b.d(aabm.b(I4));
                return;
        }
    }
}
