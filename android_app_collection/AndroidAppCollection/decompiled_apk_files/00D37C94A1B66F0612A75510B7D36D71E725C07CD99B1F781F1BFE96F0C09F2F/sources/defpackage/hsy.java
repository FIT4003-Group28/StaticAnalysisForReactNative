package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.RecentlyUsedStickerPageRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerCatalogHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerPageRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerPageSelectorRendererOuterClass;
import com.google.protos.youtube.api.innertube.UnicodeEmojiStickerPageRendererOuterClass;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hsy  reason: default package */
/* loaded from: classes3.dex */
public final class hsy extends hsd {
    private View aA;
    private View aB;
    private LocationSearchView aC;
    private ViewGroup aD;
    public abdx aj;
    public hsq ak;
    public hub al;
    public hun am;
    public Executor an;
    public htc ao;
    public htx ap;
    public gfu aq;
    public FrameLayout ar;
    public RtlAwareViewPager as;
    public auzg at;
    public auzk au;
    public DefaultTabsBar av;
    public hsw aw;
    public boolean ax;
    public int ay;
    public boolean az = true;

    private final void aM(int i, int i2, int i3) {
        Context rb = rb();
        if (this.aq.a() == gfs.DARK) {
            i2 = i3;
        }
        LayoutInflater.from(new ContextThemeWrapper(rb, i2)).inflate(i, (ViewGroup) this.ar, true);
    }

    @Override // defpackage.dp
    public final void X(int i, String[] strArr, int[] iArr) {
        this.ak.h.b(i, strArr, iArr);
    }

    @Override // defpackage.hro
    protected final View aE() {
        return this.as;
    }

    @Override // defpackage.hro
    protected final View aF() {
        return this.aA;
    }

    @Override // defpackage.htk
    public final void aK(boolean z) {
        this.aB.setVisibility(true != z ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aL(int i) {
        abdx abdxVar = this.aj;
        abdv abdvVar = new abdv(abdxVar.e, abdxVar.a.c());
        abdvVar.i = aadf.b(abdxVar.c);
        abdvVar.a = i;
        abdvVar.b = this.az;
        abdvVar.i();
        ylx.l(this.aj.b.a(abdvVar), this.an, new ylv() { // from class: hss
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                hsy hsyVar = hsy.this;
                zep.d("Failed to get multi page sticker", th);
                Toast.makeText(hsyVar.mJ(), (int) R.string.reel_generic_error_message, 1).show();
            }
        }, new ylw() { // from class: hst
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                final hsy hsyVar = hsy.this;
                final artl artlVar = (artl) obj;
                hsyVar.an.execute(new Runnable() { // from class: hsu
                    @Override // java.lang.Runnable
                    public final void run() {
                        aunb aunbVar;
                        final hsy hsyVar2 = hsy.this;
                        artl artlVar2 = artlVar;
                        if (hqs.i(hsyVar2) && artlVar2 != null) {
                            boolean z = hsyVar2.az;
                            hsyVar2.ay = z ? artlVar2.h : hsyVar2.ay;
                            if (z) {
                                hsyVar2.az = false;
                            }
                            hsw hswVar = hsyVar2.aw;
                            int i2 = hswVar.b;
                            int i3 = artlVar2.g;
                            if (i2 != i3) {
                                hswVar.b = i3;
                                hswVar.m();
                                hsyVar2.as.l(hsyVar2.ay);
                            }
                            final htl htlVar = (htl) hsyVar2.aw.o(hsyVar2.as.a());
                            if (htlVar == null || !hqs.i(htlVar)) {
                                return;
                            }
                            htf htfVar = htlVar.a;
                            htfVar.t = hsyVar2;
                            htfVar.w = hsyVar2.ai;
                            if (!hsyVar2.ax && (artlVar2.b & 2) != 0) {
                                aunb aunbVar2 = artlVar2.d;
                                if (aunbVar2 == null) {
                                    aunbVar2 = aunb.a;
                                }
                                hsyVar2.at = (auzg) aunbVar2.qm(StickerCatalogHeaderRendererOuterClass.stickerCatalogHeaderRenderer);
                                auzg auzgVar = hsyVar2.at;
                                arag aragVar = null;
                                if ((auzgVar.b & 2) != 0) {
                                    aunbVar = auzgVar.d;
                                    if (aunbVar == null) {
                                        aunbVar = aunb.a;
                                    }
                                } else {
                                    aunbVar = null;
                                }
                                auzg auzgVar2 = hsyVar2.at;
                                if ((auzgVar2.b & 1) != 0 && (aragVar = auzgVar2.c) == null) {
                                    aragVar = arag.a;
                                }
                                FrameLayout frameLayout = hsyVar2.ar;
                                if (aunbVar != null) {
                                    ImageView imageView = (ImageView) frameLayout.findViewById(R.id.sticker_catalog_close);
                                    imageView.setOnClickListener(new View.OnClickListener() { // from class: hrl
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            hro.this.aH();
                                        }
                                    });
                                    imageView.setVisibility(0);
                                }
                                if (aragVar != null) {
                                    ((TextView) frameLayout.findViewById(R.id.sticker_catalog_title)).setText(ajgl.b(aragVar));
                                }
                                hsyVar2.ax = true;
                            }
                            if ((artlVar2.b & 4) != 0) {
                                aunb aunbVar3 = artlVar2.e;
                                if (aunbVar3 == null) {
                                    aunbVar3 = aunb.a;
                                }
                                if (aunbVar3.qn(StickerPageRendererOuterClass.stickerPageRenderer)) {
                                    auzj auzjVar = (auzj) aunbVar3.qm(StickerPageRendererOuterClass.stickerPageRenderer);
                                    int i4 = auzjVar.c;
                                    if (i4 > 0) {
                                        htlVar.o(i4);
                                    }
                                    if (auzjVar.b.size() > 0) {
                                        htlVar.p(auzjVar.b);
                                    }
                                    htc.a(hsyVar2.af, auzjVar.b);
                                } else if (aunbVar3.qn(RecentlyUsedStickerPageRendererOuterClass.recentlyUsedStickerPageRenderer)) {
                                    final htc htcVar = hsyVar2.ao;
                                    htlVar.o(((aukl) aunbVar3.qm(RecentlyUsedStickerPageRendererOuterClass.recentlyUsedStickerPageRenderer)).b);
                                    ylx.n(htlVar, htcVar.a.a(htlVar), hmv.f, new zdt() { // from class: htb
                                        @Override // defpackage.zdt
                                        public final void a(Object obj2) {
                                            htc htcVar2 = htc.this;
                                            htl htlVar2 = htlVar;
                                            List list = (List) obj2;
                                            if (list != null) {
                                                htc.a(htcVar2.b, list);
                                                htlVar2.a.v = true;
                                                htlVar2.p(list);
                                            }
                                        }
                                    });
                                } else if (aunbVar3.qn(UnicodeEmojiStickerPageRendererOuterClass.unicodeEmojiStickerPageRenderer)) {
                                    final htx htxVar = hsyVar2.ap;
                                    final avmn avmnVar = (avmn) aunbVar3.qm(UnicodeEmojiStickerPageRendererOuterClass.unicodeEmojiStickerPageRenderer);
                                    amuk amukVar = htxVar.a.c;
                                    if (amukVar.isEmpty()) {
                                        htxVar.b.post(new Runnable() { // from class: htv
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                htk.this.aK(false);
                                            }
                                        });
                                    } else {
                                        final ArrayList arrayList = new ArrayList(amukVar.size());
                                        for (int i5 = 0; i5 < amukVar.size(); i5++) {
                                            aopa createBuilder = auzh.a.createBuilder();
                                            arag g = ajgl.g((String) amukVar.get(i5));
                                            createBuilder.copyOnWrite();
                                            auzh auzhVar = (auzh) createBuilder.instance;
                                            g.getClass();
                                            auzhVar.d = g;
                                            auzhVar.b |= 2;
                                            createBuilder.copyOnWrite();
                                            auzh auzhVar2 = (auzh) createBuilder.instance;
                                            auzhVar2.c = 3;
                                            auzhVar2.b |= 1;
                                            aopc aopcVar = (aopc) aunb.a.createBuilder();
                                            aopcVar.e(StickerCatalogRendererOuterClass.dynamicStickerRenderer, (auzh) createBuilder.mo39build());
                                            arrayList.add((aunb) aopcVar.mo39build());
                                        }
                                        htxVar.b.post(new Runnable() { // from class: htw
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                htx htxVar2 = htx.this;
                                                List<aunb> list = arrayList;
                                                htl htlVar2 = htlVar;
                                                avmn avmnVar2 = avmnVar;
                                                htk htkVar = hsyVar2;
                                                for (aunb aunbVar4 : list) {
                                                    htxVar2.c.oi().D(hve.a((auzh) aunbVar4.qm(StickerCatalogRendererOuterClass.dynamicStickerRenderer)));
                                                }
                                                htlVar2.o(avmnVar2.b);
                                                htkVar.aK(false);
                                                htlVar2.p(list);
                                            }
                                        });
                                    }
                                }
                            }
                            if ((artlVar2.b & 8) == 0) {
                                return;
                            }
                            aunb aunbVar4 = artlVar2.f;
                            if (aunbVar4 == null) {
                                aunbVar4 = aunb.a;
                            }
                            hsyVar2.au = (auzk) aunbVar4.qm(StickerPageSelectorRendererOuterClass.stickerPageSelectorRenderer);
                            if (hsyVar2.av.j() == 0 && hsyVar2.au.b.size() > 0) {
                                final int i6 = 0;
                                for (aunb aunbVar5 : hsyVar2.au.b) {
                                    if (aunbVar5.qn(ButtonRendererOuterClass.buttonRenderer)) {
                                        apoj apojVar = (apoj) aunbVar5.qm(ButtonRendererOuterClass.buttonRenderer);
                                        if ((apojVar.b & 65536) != 0) {
                                            DefaultTabsBar defaultTabsBar = hsyVar2.av;
                                            aovr aovrVar = apojVar.r;
                                            if (aovrVar == null) {
                                                aovrVar = aovr.a;
                                            }
                                            String str = aovrVar.c;
                                            defaultTabsBar.p(str, str);
                                        }
                                        hsyVar2.av.k(i6).setOnClickListener(new View.OnClickListener() { // from class: hsr
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                hsy hsyVar3 = hsy.this;
                                                int i7 = i6;
                                                hsyVar3.as.l(i7);
                                                ((htl) hsyVar3.aw.o(i7)).c.al(0);
                                            }
                                        });
                                    }
                                    i6++;
                                }
                            }
                            if (hsyVar2.av.j() == 0 || artlVar2.h >= hsyVar2.av.j()) {
                                return;
                            }
                            hsyVar2.av.m(artlVar2.h, false);
                        }
                    }
                });
            }
        }, anlf.a);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.af.oi().d(acuo.a(37168), null, null);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.multi_page_sticker_catalog_fragment, viewGroup, false);
        this.ar = frameLayout;
        this.aA = frameLayout.findViewById(R.id.sticker_catalog_container);
        RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager) this.ar.findViewById(R.id.sticker_catalog_page);
        this.as = rtlAwareViewPager;
        if (rtlAwareViewPager.d != 2) {
            rtlAwareViewPager.d = 2;
            rtlAwareViewPager.h();
        }
        this.aw = new hsw(this, mL());
        this.as.e(new hsx(this));
        DefaultTabsBar defaultTabsBar = (DefaultTabsBar) this.ar.findViewById(R.id.sticker_page_tab_bar);
        this.av = defaultTabsBar;
        this.as.e(defaultTabsBar);
        this.av.setVisibility(0);
        this.aB = this.ar.findViewById(R.id.spinner);
        if (bundle != null) {
            this.aw.e(bundle.getParcelable("pages"), getClass().getClassLoader());
            this.ay = bundle.getInt("position");
        }
        this.as.k(this.aw);
        aK(true);
        hsv hsvVar = new hsv(this);
        this.ah = true;
        this.d.setOnKeyListener(this);
        Display defaultDisplay = ((WindowManager) rb().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.y;
        this.ag = i;
        this.aA.setTranslationY(i);
        this.as.setTranslationY(this.ag);
        this.as.setTranslationY(this.ag);
        aG(true, hsvVar);
        aM(R.layout.location_search_view_layout, 2132083360, 2132083359);
        LocationSearchView locationSearchView = (LocationSearchView) this.ar.findViewById(R.id.location_search_view);
        this.aC = locationSearchView;
        hsq hsqVar = this.ak;
        hrm hrmVar = this.ai;
        acti oi = this.af.oi();
        hsqVar.i = locationSearchView;
        hsqVar.o = hrmVar;
        hsqVar.k = this;
        hsqVar.l = oi;
        hsqVar.j = hsqVar.c.a(locationSearchView, hsqVar);
        hsqVar.h = hsqVar.c();
        aM(R.layout.user_mention_search_view, 2132083910, 2132083882);
        ViewGroup viewGroup2 = (ViewGroup) this.ar.findViewById(R.id.user_mention_search_view);
        this.aD = viewGroup2;
        hub hubVar = this.al;
        hrm hrmVar2 = this.ai;
        acti oi2 = this.af.oi();
        hubVar.j = viewGroup2;
        hubVar.p = hrmVar2;
        hubVar.o = new gtx();
        hubVar.o.c((FrameLayout) viewGroup2.findViewById(R.id.results_view));
        UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint = UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.a;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.userMentionSuggestionsEndpoint, userMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint);
        hubVar.n = (apzg) aopcVar.mo39build();
        iie iieVar = hubVar.c;
        avvq avvqVar = avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_MENTION_STICKER;
        apzg apzgVar = hubVar.n;
        Context context = (Context) iieVar.a.get();
        context.getClass();
        iim iimVar = (iim) iieVar.b.get();
        iimVar.getClass();
        viewGroup2.getClass();
        oi2.getClass();
        avvqVar.getClass();
        apzgVar.getClass();
        hubVar.k = new iid(context, iimVar, viewGroup2, hubVar, oi2, avvqVar, apzgVar);
        hun hunVar = this.am;
        hunVar.j = this.ai;
        hunVar.h = this.af.oi();
        return this.ar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    @Override // defpackage.hro, android.content.DialogInterface.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKey(android.content.DialogInterface r4, int r5, android.view.KeyEvent r6) {
        /*
            r3 = this;
            r4 = 0
            r0 = 4
            r1 = 1
            if (r5 != r0) goto Lf
            int r5 = r6.getAction()
            if (r5 != r1) goto Le
            r5 = 4
            r2 = 1
            goto L10
        Le:
            r5 = 4
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L31
            com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView r2 = r3.aC
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L29
            android.view.ViewGroup r2 = r3.aD
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L23
            goto L31
        L23:
            hub r4 = r3.al
            r4.d()
            return r1
        L29:
            com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView r4 = r3.aC
            r5 = 8
            r4.setVisibility(r5)
            return r1
        L31:
            if (r5 != r0) goto L3d
            int r5 = r6.getAction()
            if (r5 != r1) goto L3d
            r3.aH()
            return r1
        L3d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsy.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
    }

    @Override // defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putParcelable("pages", this.aw.a());
        bundle.putInt("position", this.as.a());
        super.oz(bundle);
    }
}
