package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AddBannerToLiveChatCommandOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.LiveChatBannerRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatItemRenderer;
import com.google.protos.youtube.api.innertube.RemoveBannerFromLiveChatCommandOuterClass;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: abic  reason: default package */
/* loaded from: classes.dex */
public final class abic implements abhe, abhd {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final ArrayDeque b = new ArrayDeque();
    public abhd c;
    public asqg d;
    public boolean e;
    private final Handler f;

    public abic(Handler handler) {
        this.f = handler;
    }

    private final asrf d() {
        asqg asqgVar = this.d;
        if (asqgVar == null || (asqgVar.b & 4) == 0) {
            return null;
        }
        aunb aunbVar = asqgVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (!aunbVar.qn(LiveChatItemRenderer.liveChatTextMessageRenderer)) {
            return null;
        }
        aunb aunbVar2 = this.d.e;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        return (asrf) aunbVar2.qm(LiveChatItemRenderer.liveChatTextMessageRenderer);
    }

    private final void e(final asqg asqgVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final abow abowVar = (abow) it.next();
            this.f.post(new Runnable() { // from class: abib
                @Override // java.lang.Runnable
                public final void run() {
                    abow.this.e(asqgVar);
                }
            });
        }
        this.d = asqgVar;
        this.e = false;
    }

    @Override // defpackage.abhe
    public final void a(final apzg apzgVar) {
        boolean equals;
        asqg asqgVar;
        if (apzgVar.qn(AddBannerToLiveChatCommandOuterClass.addBannerToLiveChatCommand)) {
            aunb aunbVar = ((apbj) apzgVar.qm(AddBannerToLiveChatCommandOuterClass.addBannerToLiveChatCommand)).b;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(LiveChatBannerRendererOuterClass.liveChatBannerRenderer) || (asqgVar = (asqg) aunbVar.qm(LiveChatBannerRendererOuterClass.liveChatBannerRenderer)) == null) {
                return;
            }
            if (!asqgVar.j) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    asqg asqgVar2 = (asqg) it.next();
                    if (!asqgVar2.j) {
                        arrayList.add(asqgVar2);
                    }
                }
                this.b.removeAll(arrayList);
            }
            this.b.addFirst(asqgVar);
            e(asqgVar);
        } else if (!apzgVar.qn(RemoveBannerFromLiveChatCommandOuterClass.removeBannerForLiveChatCommand) || this.d == null) {
            if (!apzgVar.qn(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction) && !apzgVar.qn(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
                return;
            }
            String str = null;
            if (apzgVar.qn(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
                LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = (LiveChatAction.MarkChatItemAsDeletedAction) apzgVar.qm(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
                asrf d = d();
                if (d == null) {
                    return;
                }
                String str2 = (markChatItemAsDeletedAction.b & 4) != 0 ? markChatItemAsDeletedAction.e : null;
                if ((d.b & 1) != 0) {
                    str = d.c;
                }
                equals = TextUtils.equals(str2, str);
            } else if (!apzgVar.qn(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
                return;
            } else {
                LiveChatAction.MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = (LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) apzgVar.qm(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
                asrf d2 = d();
                if (d2 == null) {
                    return;
                }
                String str3 = (markChatItemsByAuthorAsDeletedAction.b & 4) != 0 ? markChatItemsByAuthorAsDeletedAction.e : null;
                if ((d2.b & 8) != 0) {
                    str = d2.f;
                }
                equals = TextUtils.equals(str3, str);
            }
            if (!equals) {
                return;
            }
            this.e = true;
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                final abow abowVar = (abow) it2.next();
                this.f.post(new Runnable() { // from class: abia
                    @Override // java.lang.Runnable
                    public final void run() {
                        abow abowVar2 = abow.this;
                        apzg apzgVar2 = apzgVar;
                        if (!abowVar2.q) {
                            return;
                        }
                        abowVar2.f.removeAllViews();
                        abowVar2.j.f("live_chat_item_action", apzgVar2);
                        abowVar2.j(abowVar2.n);
                        abowVar2.h();
                    }
                });
            }
        } else {
            c(((aumy) apzgVar.qm(RemoveBannerFromLiveChatCommandOuterClass.removeBannerForLiveChatCommand)).b);
        }
    }

    public final void b(abow abowVar) {
        abowVar.m = this;
        this.a.add(abowVar);
        asqg asqgVar = this.d;
        if (asqgVar == null || this.e) {
            return;
        }
        abowVar.e(asqgVar);
    }

    public final void c(String str) {
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                asqg asqgVar = (asqg) it.next();
                if (TextUtils.equals(asqgVar.c, str)) {
                    arrayList.add(asqgVar);
                }
            }
            this.b.removeAll(arrayList);
            if (this.b.isEmpty()) {
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    abow abowVar = (abow) it2.next();
                    Handler handler = this.f;
                    abowVar.getClass();
                    handler.post(new abot(abowVar, 1));
                }
                this.d = null;
            } else if (this.d.equals(this.b.peekFirst())) {
            } else {
                e((asqg) this.b.peekFirst());
            }
        }
    }

    @Override // defpackage.abhd
    public final void f() {
        abhd abhdVar = this.c;
        if (abhdVar != null) {
            noy noyVar = (noy) abhdVar;
            noyVar.k = true;
            noyVar.D();
        }
    }
}
