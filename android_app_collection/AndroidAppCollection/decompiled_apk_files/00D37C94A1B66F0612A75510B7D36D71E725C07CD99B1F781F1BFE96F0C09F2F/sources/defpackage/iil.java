package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: iil  reason: default package */
/* loaded from: classes3.dex */
public final class iil {
    public final Context a;
    public final aafo b;
    public final iik c;
    public final apzg d;
    public final acti e;
    public final avvq f;
    public final ajsm g;
    public String h;
    private final ajsg i;
    private final ajyi j;
    private final acrr k;
    private final zfq l;
    private final RecyclerView m;
    private final Handler n = new Handler();
    private String o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ajsa] */
    public iil(Context context, ajsg ajsgVar, ajyi ajyiVar, aafo aafoVar, acrr acrrVar, zfq zfqVar, iik iikVar, RecyclerView recyclerView, apzg apzgVar, acti actiVar, avvq avvqVar) {
        this.a = context;
        this.i = ajsgVar;
        this.j = ajyiVar;
        this.b = aafoVar;
        this.k = acrrVar;
        this.l = zfqVar;
        this.c = iikVar;
        this.m = recyclerView;
        this.d = apzgVar;
        this.e = actiVar;
        this.f = avvqVar;
        iii iiiVar = new iii();
        final iig iigVar = new iig(this);
        iiiVar.mG(new ajrt() { // from class: iif
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                iil iilVar = iil.this;
                ajrsVar.f("listener", iigVar);
                if (iilVar.f == avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
                    ajrsVar.f("color", Integer.valueOf(zhn.j(iilVar.a, R.attr.ytStaticBrandWhite).orElse(0)));
                }
                ajrsVar.a(iilVar.e);
            }
        });
        ajsf a = ajsgVar.a(ajyiVar.get());
        a.q(true);
        a.h(iiiVar);
        this.g = iiiVar;
        recyclerView.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top), 0, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.af(null);
        recyclerView.ag(new LinearLayoutManager());
        recyclerView.ad(a);
        recyclerView.setMotionEventSplittingEnabled(false);
    }

    public final avvr a(avvp avvpVar) {
        avvr a = avvt.a();
        String str = this.o;
        a.copyOnWrite();
        avvt.e((avvt) a.instance, str);
        avvq avvqVar = this.f;
        a.copyOnWrite();
        avvt.c((avvt) a.instance, avvqVar);
        a.copyOnWrite();
        avvt.f((avvt) a.instance, avvpVar);
        return a;
    }

    public final void b(avvt avvtVar) {
        acrr acrrVar = this.k;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dW(avvtVar);
        acrrVar.c((arrh) a.mo39build());
    }

    public final void c(avvp avvpVar) {
        b((avvt) a(avvpVar).mo39build());
    }

    public final void d(final String str) {
        if (!str.equals(this.h)) {
            if (this.h == null && str.trim().isEmpty()) {
                return;
            }
            this.n.removeCallbacksAndMessages(null);
            this.n.postDelayed(new Runnable() { // from class: iih
                @Override // java.lang.Runnable
                public final void run() {
                    iil iilVar = iil.this;
                    String str2 = str;
                    iilVar.h = str2;
                    if (str2.length() == 0) {
                        iilVar.g.clear();
                        iilVar.c.e(true);
                        return;
                    }
                    iij iijVar = new iij(iilVar);
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.services.social.query", str2);
                    hashMap.put("com.google.android.libraries.youtube.innertube.services.social.listener", iijVar);
                    iilVar.b.c(iilVar.d, hashMap);
                }
            }, 200L);
            c(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_INPUT_TEXT_UPDATED);
        }
    }

    public final void e() {
        this.o = this.l.b(16);
        c(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STARTED);
    }

    public final void f() {
        c(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STOPPED);
        this.h = null;
        this.n.removeCallbacksAndMessages(null);
    }
}
