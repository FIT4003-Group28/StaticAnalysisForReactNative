package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: afqg  reason: default package */
/* loaded from: classes.dex */
public final class afqg implements afpu {
    public final Context a;
    public final afqb b;
    public final acti c;
    public final avvq d;
    public final ajsm e;
    public String f;
    public final afqj g;
    private final ajsg h;
    private final ajyi i;
    private final acrr j;
    private final zfq k;
    private final RecyclerView l;
    private final Handler m = new Handler();
    private String n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ajsa] */
    public afqg(ajsg ajsgVar, ajyi ajyiVar, acrr acrrVar, zfq zfqVar, afqj afqjVar, Context context, afqb afqbVar, RecyclerView recyclerView, acti actiVar, avvq avvqVar) {
        this.g = afqjVar;
        this.a = context;
        this.h = ajsgVar;
        this.i = ajyiVar;
        this.j = acrrVar;
        this.k = zfqVar;
        this.b = afqbVar;
        this.l = recyclerView;
        this.c = actiVar;
        this.d = avvqVar;
        afqe afqeVar = new afqe();
        afqeVar.mG(new ajrt() { // from class: afqc
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                afqg afqgVar = afqg.this;
                if (afqgVar.d == avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
                    ajrsVar.f("color", Integer.valueOf(zhn.j(afqgVar.a, R.attr.ytStaticBrandWhite).orElse(0)));
                }
                ajrsVar.a(afqgVar.c);
            }
        });
        ajsf a = ajsgVar.a(ajyiVar.get());
        a.q(true);
        a.h(afqeVar);
        this.e = afqeVar;
        recyclerView.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top), 0, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.af(null);
        recyclerView.ad(a);
        recyclerView.setMotionEventSplittingEnabled(false);
    }

    private final avvr j(avvp avvpVar) {
        avvr a = avvt.a();
        String str = this.n;
        a.copyOnWrite();
        avvt.e((avvt) a.instance, str);
        avvq avvqVar = this.d;
        a.copyOnWrite();
        avvt.c((avvt) a.instance, avvqVar);
        a.copyOnWrite();
        avvt.f((avvt) a.instance, avvpVar);
        return a;
    }

    private final void k(avvt avvtVar) {
        acrr acrrVar = this.j;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dW(avvtVar);
        acrrVar.c((arrh) a.mo39build());
    }

    @Override // defpackage.afpu
    public final afpy a(int i) {
        return new afqa((avvu) this.e.get(i));
    }

    @Override // defpackage.afpu
    public final void b(final String str) {
        if (this.f != null || !str.trim().isEmpty()) {
            this.m.removeCallbacksAndMessages(null);
            this.m.postDelayed(new Runnable() { // from class: afqd
                @Override // java.lang.Runnable
                public final void run() {
                    afqg afqgVar = afqg.this;
                    String str2 = str;
                    afqgVar.f = str2;
                    afqf afqfVar = new afqf(afqgVar);
                    afqj afqjVar = afqgVar.g;
                    ylx.k(afqjVar.b.b(new afqi(afqjVar, str2, aadi.b), afqjVar.a), anjk.a, new afsc(1), new itd(afqfVar, 5));
                }
            }, 200L);
            i(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_INPUT_TEXT_UPDATED);
        }
    }

    @Override // defpackage.afpu
    public final void c(int i) {
        avvr j = j(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_SUGGESTION_SELECTED);
        aopa createBuilder = avvs.a.createBuilder();
        createBuilder.copyOnWrite();
        avvs avvsVar = (avvs) createBuilder.instance;
        avvsVar.b |= 1;
        avvsVar.c = i;
        j.copyOnWrite();
        avvt.d((avvt) j.instance, (avvs) createBuilder.mo39build());
        k((avvt) j.mo39build());
    }

    @Override // defpackage.afpu
    public final void d(afqb afqbVar, RecyclerView recyclerView) {
    }

    @Override // defpackage.afpu
    public final void e() {
        this.n = this.k.b(16);
        i(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STARTED);
    }

    @Override // defpackage.afpu
    public final void f() {
        i(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STOPPED);
        this.f = null;
        this.m.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.afpu
    public final boolean g() {
        return false;
    }

    @Override // defpackage.afpu
    public final boolean h() {
        return true;
    }

    public final void i(avvp avvpVar) {
        k((avvt) j(avvpVar).mo39build());
    }
}
