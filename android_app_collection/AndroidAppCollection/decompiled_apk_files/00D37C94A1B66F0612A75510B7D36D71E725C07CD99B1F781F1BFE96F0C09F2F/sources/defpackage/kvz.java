package defpackage;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: kvz  reason: default package */
/* loaded from: classes3.dex */
public final class kvz extends kui implements ezg {
    public azqb a;
    public axxo aA;
    public kuk aD;
    public ankt aE;
    View aF;
    public LinearLayoutManager aG;
    public EditText aH;
    public ListView aI;
    public View aJ;
    public int aK;
    public String aL;
    public String aM;
    public aacz aN;
    public kwn aO;
    public sdb aP;
    private laz aQ;
    private lcs aR;
    private ankt aS;
    private kvy aT;
    private View aU;
    private View aV;
    private RecyclerView aW;
    private boolean aX;
    private String aY;
    private String aZ;
    public acvh ae;
    public SharedPreferences af;
    public aadd ag;
    public ezh ah;
    public akho ai;
    public afvn aj;
    public lvl ak;
    public akfw al;
    public lba am;
    public akhn an;
    public lct ao;
    public akvm aw;
    public aafo ax;
    public ajmy ay;
    public axxv az;
    public azqb b;
    private int ba;
    private String bb;
    private String bc;
    private boolean bd;
    private boolean be;
    private boolean bf;
    private boolean bg;
    private String bi;
    private boolean bj;
    private boolean bk;
    private kvy bl;
    public Executor c;
    public Executor d;
    public lbl e;
    public final AtomicBoolean aB = new AtomicBoolean(true);
    public final AtomicBoolean aC = new AtomicBoolean(true);
    private int bh = -1;

    private static Rect bg(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    private static View bh(ViewGroup viewGroup, int i, int i2) {
        View bh;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.isShown()) {
                if (childAt.isClickable()) {
                    if (bg(childAt).contains(i, i2)) {
                        return childAt;
                    }
                } else if ((childAt instanceof ViewGroup) && (bh = bh((ViewGroup) childAt, i, i2)) != null) {
                    return bh;
                }
            }
        }
        return null;
    }

    private final void bi(String str, int i, String str2) {
        aopa createBuilder = atnp.a.createBuilder();
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 2;
        atnpVar.d = i;
        if (str != null) {
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            atnpVar2.b |= 1;
            atnpVar2.c = str;
        }
        if (!str2.isEmpty()) {
            createBuilder.copyOnWrite();
            atnp atnpVar3 = (atnp) createBuilder.instance;
            str2.getClass();
            atnpVar3.b |= 32;
            atnpVar3.f = str2;
        }
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        oi().d(acuo.a(62985), (apzg) aopcVar.mo39build(), null);
        oi().n(new acte(actj.MOBILE_BACK_BUTTON));
        oi().n(new acte(actj.SEARCH_BAR_MIC_BUTTON));
        this.aY = oi().k();
        this.ba = 62985;
        this.aZ = oi().k();
        lcs lcsVar = this.aR;
        lcsVar.j = this.aY;
        lcsVar.k = this.ba;
    }

    private final void bj() {
        if (this.bg || this.aR.f()) {
            return;
        }
        this.aH.requestFocus();
        if (this.be) {
            this.be = false;
            return;
        }
        be();
        new Handler().postDelayed(new Runnable() { // from class: kvh
            @Override // java.lang.Runnable
            public final void run() {
                kvz.this.be();
            }
        }, 200L);
    }

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        if (this.be) {
            aE();
        }
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.ah.j(this);
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.al.g("voz-target-id");
        zag.i(this.aH);
        if (!this.bd) {
            if (eog.z(this.ag) && this.ae.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                return;
            }
            this.ae.t("sf_i", asny.LATENCY_ACTION_SEARCH_UI);
        }
    }

    @Override // defpackage.dp
    public final void X(int i, String[] strArr, int[] iArr) {
        this.aR.a(i, strArr, iArr);
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void Y() {
        kuw kuwVar;
        super.Y();
        if (this.aj.c().g()) {
            this.aH.setImeOptions(16777216);
        }
        if (this.bj || this.aR.f()) {
            this.aH.clearFocus();
            this.bj = false;
        } else {
            aupg aupgVar = this.ag.a().n;
            if (aupgVar == null) {
                aupgVar = aupg.a;
            }
            String str = aupgVar.f;
            kuw[] values = kuw.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    kuwVar = values[i];
                    if (TextUtils.equals(str, kuwVar.c)) {
                        break;
                    }
                    i++;
                } else {
                    kuwVar = kuw.SHOWN_ON_OPEN;
                    break;
                }
            }
            if (kuwVar == kuw.SHOWN_ON_OPEN) {
                bj();
            }
        }
        akib a = this.e.a();
        a.m = this.ae;
        akhv akhvVar = a.b;
        akhvVar.d = a.m;
        akid akidVar = akhvVar.a;
        akidVar.b = akhvVar.d;
        if (a != null) {
            akvm akvmVar = this.aw;
            akidVar.a = akvmVar;
            akhvVar.c = akvmVar;
        }
        aaxb aaxbVar = (aaxb) this.a.get();
        aawz a2 = aaxbVar.a();
        a2.i();
        ylx.k(aaxbVar.b(a2), this.d, new ylv() { // from class: kvn
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                kvz.this.aO.a("Error occurred getting the history state", th);
            }
        }, new ylw() { // from class: kvo
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                kvz kvzVar = kvz.this;
                aruu aruuVar = (aruu) obj;
                kvzVar.aB.set(aruuVar.d);
                kvzVar.aC.set(aruuVar.c);
            }
        });
        bd();
        this.bd = false;
        if (!eog.z(this.ag) || !this.ae.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.ae.s(asny.LATENCY_ACTION_SEARCH_UI);
            this.ae.t("sr_ui", asny.LATENCY_ACTION_SEARCH_UI);
            return;
        }
        this.ae.t("sr_ui", asny.LATENCY_ACTION_VOICE_ASSISTANT);
    }

    public final void aE() {
        zag.i(this.aH);
        this.ai.f();
        this.aR.c(r(-1).toByteArray());
    }

    public final void aF() {
        if (this.bk) {
            this.aW.al(0);
        } else {
            this.aI.smoothScrollToPosition(0);
        }
    }

    public final void aG(akht akhtVar) {
        ylr.c();
        Collection collection = akhtVar.c;
        if (collection != null && !collection.isEmpty() && this.aD.getCount() == 0 && eog.I(this.ag)) {
            oi().n(new acte(actj.SEARCH_SUGGESTION));
        }
        this.aK = -1;
        akho akhoVar = this.ai;
        akhoVar.f = new ArrayList(akhtVar.c);
        akhs akhsVar = akhtVar.b;
        Boolean bool = akhsVar.a;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            akhoVar.d = booleanValue;
            if (booleanValue) {
                akhoVar.c++;
            }
        }
        if (!akhtVar.a.isEmpty()) {
            int i = akhsVar.b;
            akhoVar.i += i;
            if (i > akhoVar.j) {
                akhoVar.j = i;
            }
            int[] iArr = akhoVar.k;
            if (iArr != null) {
                if (i <= 1999) {
                    int i2 = akho.a[i / 100];
                    int[] iArr2 = akhoVar.k;
                    iArr2[i2] = iArr2[i2] + 1;
                } else {
                    int i3 = akho.b;
                    iArr[i3] = iArr[i3] + 1;
                }
            }
        }
        this.aD.h();
        this.aD.j(akhtVar.d);
        this.aD.g(akhtVar.c);
    }

    public final void aH(String str) {
        aI(str, -1);
    }

    public final void aI(String str, int i) {
        this.aQ.a(str, r(i).toByteArray(), this.aY, this.ba);
        this.bd = true;
    }

    @Override // defpackage.gbd
    public final ayoi aN() {
        return ayoi.O(gbb.c);
    }

    @Override // defpackage.gbd
    public final boolean bc() {
        BottomSheetBehavior bottomSheetBehavior;
        lbr lbrVar;
        lcs lcsVar = this.aR;
        if (eog.aZ(lcsVar.q) && (bottomSheetBehavior = lcsVar.n) != null && bottomSheetBehavior.t == 3 && (lbrVar = (lbr) lcsVar.f.mL().e(lcsVar.h)) != null) {
            return lbrVar.a();
        }
        return false;
    }

    public final void bd() {
        ankt anktVar;
        ankt anktVar2 = this.aE;
        if (anktVar2 != null) {
            anktVar2.cancel(true);
        }
        if (!TextUtils.isEmpty(this.bi) && (anktVar = this.aS) != null) {
            anktVar.cancel(true);
        }
        this.bi = this.aL;
        SuggestVideoStateSubscriber suggestVideoStateSubscriber = (SuggestVideoStateSubscriber) this.b.get();
        final String str = suggestVideoStateSubscriber.b;
        final String str2 = suggestVideoStateSubscriber.a;
        final long seconds = suggestVideoStateSubscriber.c == -1 ? 0L : TimeUnit.MILLISECONDS.toSeconds(suggestVideoStateSubscriber.d.c() - suggestVideoStateSubscriber.c);
        this.aM = this.aL.toLowerCase(this.ap.getResources().getConfiguration().locale);
        final int selectionStart = this.aH.getSelectionStart();
        final akib a = this.e.a();
        if (!this.e.b() && this.aM.isEmpty()) {
            ankt qp = a.e.qp(new Callable() { // from class: akhz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Collection emptyList;
                    akhh b;
                    akib akibVar = akib.this;
                    akht akhtVar = new akht("");
                    if (!akibVar.a.d()) {
                        emptyList = Collections.emptySet();
                    } else {
                        akhn akhnVar = akibVar.i;
                        akhe akheVar = null;
                        String a2 = akhnVar != null ? akhnVar.a() : null;
                        akid akidVar = akibVar.b.a;
                        if (akidVar != null && (b = akidVar.b()) != null) {
                            akheVar = b.d();
                        }
                        if (akheVar != null) {
                            akibVar.k.set(akheVar.b.size());
                            akhn akhnVar2 = akibVar.i;
                            if (akhnVar2 != null && a2.equals(akhnVar2.a())) {
                                akhn akhnVar3 = akibVar.i;
                                String str3 = akheVar.e;
                                if (str3 != null) {
                                    try {
                                        akhnVar3.a.set((char) Integer.parseInt(str3, 16));
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                akhnVar3.c();
                            }
                            emptyList = akheVar.b;
                        } else {
                            emptyList = Collections.emptyList();
                        }
                    }
                    akhtVar.c = emptyList;
                    return akhtVar;
                }
            });
            this.aE = qp;
            anlz.A(qp, this.bl, this.d);
        }
        final String str3 = this.aM;
        final boolean z = !this.aB.get();
        final boolean z2 = !this.aC.get();
        ankv c = a.e.c(new Callable() { // from class: akia
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return akib.this.d(str3, z, selectionStart, str, z2, str2, seconds);
            }
        }, 0L, TimeUnit.MILLISECONDS);
        this.aS = c;
        anlz.A(c, this.aT, this.d);
    }

    public final void be() {
        zag.p(this.aH);
    }

    public final void bf(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = 0;
        this.aV.setVisibility(true != isEmpty ? 0 : 8);
        if (this.aX) {
            View view = this.aU;
            if (true != isEmpty) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Override // defpackage.gbd
    public final fsx lt() {
        if (this.aq == null) {
            fsw a = this.as.a();
            a.m(new ampg() { // from class: kvp
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    frz frzVar = (frz) obj;
                    frzVar.b = kvz.this.aF;
                    frzVar.d(amyg.a);
                    return frzVar;
                }
            });
            this.aq = a.a();
        }
        return this.aq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
        if (r0.cC != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
        if (r0.cB != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r19 = true;
     */
    @Override // defpackage.gbd, defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mQ(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvz.mQ(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0259, code lost:
        if (r4.equals("search_youtube") != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0278  */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mc(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvz.mc(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int selectionStart = this.aH.getSelectionStart();
        int selectionEnd = this.aH.getSelectionEnd();
        bj();
        EditText editText = this.aH;
        editText.setText(editText.getText());
        this.aH.setSelection(selectionStart, selectionEnd);
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        boolean z = true;
        if (!ezxVar.b() && !ezxVar.i()) {
            z = false;
        }
        this.bg = z;
        if (z) {
            zag.i(this.aH);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    final ascj r(int i) {
        int min;
        List e = this.aD.e();
        if (this.bk) {
            min = Math.min(e.size() - 1, Math.max(this.aK, this.aG.L()));
        } else {
            min = Math.min(e.size() - 1, Math.max(this.aK, this.aI.getLastVisiblePosition()));
        }
        int a = this.aD.a(i);
        akho akhoVar = this.ai;
        akhoVar.g = min;
        akhoVar.h = a;
        akib a2 = this.e.a();
        this.ai.l = a2.j();
        this.ai.m = a2.b();
        this.ai.n = this.an.b();
        return this.ai.a(a2.f());
    }

    public final void s(akhl akhlVar) {
        this.c.execute(new kvx(this, akhlVar));
        List list = this.ai.f;
        if (list != null) {
            list.remove(akhlVar);
        }
        this.aD.i(akhlVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvz.S(int, int, android.content.Intent):void");
    }
}
