package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.metadataeditor.elements.suggest.MdeSuggestBottomSheetController$CandidateChipSpan;
import com.google.android.libraries.youtube.metadataeditor.elements.suggest.OverlayView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import j$.util.OptionalInt;
/* compiled from: PG */
/* renamed from: afps  reason: default package */
/* loaded from: classes.dex */
public final class afps implements afqb {
    public final CoordinatorLayout a;
    public final EditText b;
    public final ViewGroup c;
    public final BottomSheetBehavior d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final afpu i;
    public final avvq j;
    public MdeSuggestBottomSheetController$CandidateChipSpan k;
    public int l;
    public int m;
    public int n;
    public final RecyclerView o;
    public afpr p;
    public final awsx q;
    private final Context r;
    private boolean s;
    private int t;

    public afps(Context context, afqh afqhVar, CoordinatorLayout coordinatorLayout, EditText editText, awsx awsxVar, ViewGroup viewGroup, acti actiVar, avvq avvqVar, afpu afpuVar, boolean z) {
        afpu afqgVar;
        RecyclerView recyclerView;
        this.r = context;
        this.j = avvqVar;
        this.a = coordinatorLayout;
        this.b = editText;
        this.q = awsxVar;
        this.c = viewGroup;
        this.g = avvqVar == avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER ? 0 : zhn.j(context, R.attr.ytBadgeChipBackground).orElse(0);
        coordinatorLayout.addOnLayoutChangeListener(new afpo(this));
        RecyclerView recyclerView2 = new RecyclerView(context);
        this.o = recyclerView2;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(1);
        recyclerView2.ag(linearLayoutManager);
        ((ViewGroup) viewGroup.findViewById(R.id.social_suggestions_bottom_sheet)).addView(recyclerView2, -1, -2);
        if (afpuVar != null) {
            afqgVar = afpuVar;
            recyclerView = recyclerView2;
        } else {
            ajsg ajsgVar = (ajsg) afqhVar.a.get();
            ajsgVar.getClass();
            ajyi ajyiVar = (ajyi) afqhVar.b.get();
            ajyiVar.getClass();
            ((aafo) afqhVar.c.get()).getClass();
            acrr acrrVar = (acrr) afqhVar.d.get();
            acrrVar.getClass();
            zfq zfqVar = (zfq) afqhVar.e.get();
            zfqVar.getClass();
            afqj afqjVar = (afqj) afqhVar.f.get();
            afqjVar.getClass();
            recyclerView = recyclerView2;
            afqgVar = new afqg(ajsgVar, ajyiVar, acrrVar, zfqVar, afqjVar, context, this, recyclerView2, actiVar, avvqVar);
        }
        this.i = afqgVar;
        afqgVar.d(this, recyclerView);
        OverlayView overlayView = (OverlayView) viewGroup.findViewById(R.id.social_suggestions_overlay);
        overlayView.a = recyclerView;
        overlayView.b = new afpn(this);
        View findViewById = viewGroup.findViewById(R.id.user_mention_suggestions_top_bar);
        OptionalInt j = zhn.j(context, R.attr.yt10PercentLayer);
        if (j.isPresent()) {
            findViewById.setBackgroundColor(j.getAsInt());
        }
        this.t = 0;
        BottomSheetBehavior v = BottomSheetBehavior.v(viewGroup);
        this.d = v;
        v.C(true);
        v.E(5);
        v.D(0);
        if (z) {
            v.w(new afpp(this));
            editText.getViewTreeObserver().addOnGlobalLayoutListener(new afpq(this));
        }
        Resources resources = context.getResources();
        this.e = resources.getDimension(R.dimen.user_mention_chip_corner_radius);
        this.f = resources.getDimension(R.dimen.user_mention_chip_horizontal_padding);
        this.h = resources.getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top);
    }

    private final ViewParent g() {
        ViewParent parent = this.b.getParent();
        while (parent != null && !(parent instanceof ScrollView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            parent = this.b.getParent();
            if (parent != null) {
                parent = parent.getParent();
            }
            while (parent != null && !(parent instanceof ViewGroup)) {
                parent = parent.getParent();
            }
        }
        return parent;
    }

    private final boolean h() {
        return this.b.getSelectionStart() == this.b.getSelectionEnd();
    }

    public final void a() {
        if (this.k != null) {
            this.b.getText().removeSpan(this.k);
            this.i.f();
            if (this.p != null) {
                f();
                ((afpc) this.p).b();
            }
        }
        this.k = null;
        b();
    }

    public final void b() {
        this.d.E(5);
    }

    public final void c() {
        int indexOf;
        int selectionStart;
        if (this.k == null && h() && (selectionStart = this.b.getSelectionStart()) > 0) {
            Editable text = this.b.getText();
            if (selectionStart >= this.q.c.length()) {
                if (this.q.c.contentEquals(text.subSequence(selectionStart - this.q.c.length(), selectionStart)) && this.l < 10) {
                    int selectionStart2 = this.b.getSelectionStart();
                    this.k = new MdeSuggestBottomSheetController$CandidateChipSpan();
                    this.b.getText().setSpan(this.k, selectionStart2 - this.q.c.length(), selectionStart2, 34);
                    this.i.e();
                    return;
                }
            }
        }
        if (this.k != null) {
            if (h()) {
                Editable text2 = this.b.getText();
                int selectionStart3 = this.b.getSelectionStart();
                boolean z = false;
                boolean z2 = selectionStart3 > 0 && text2.charAt(selectionStart3 + (-1)) == ' ';
                if (selectionStart3 >= 2 && text2.charAt(selectionStart3 - 2) == ' ') {
                    z = true;
                }
                if ((!this.s && !z) || !z2) {
                    int spanStart = text2.getSpanStart(this.k);
                    int spanEnd = text2.getSpanEnd(this.k);
                    if (selectionStart3 >= spanStart && selectionStart3 <= spanEnd && (indexOf = text2.toString().indexOf(this.q.c, spanStart)) != -1 && indexOf == spanStart) {
                        Editable text3 = this.b.getText();
                        int spanStart2 = text3.getSpanStart(this.k);
                        int spanEnd2 = text3.getSpanEnd(this.k);
                        if (spanEnd2 > this.q.c.length() + spanStart2 && spanEnd2 <= text3.length()) {
                            this.i.b(text3.subSequence(spanStart2 + this.q.c.length(), spanEnd2).toString());
                            return;
                        } else if (spanEnd2 != spanStart2 + 1) {
                            return;
                        } else {
                            if (this.i.g()) {
                                this.i.b("");
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                    }
                }
            }
            a();
        }
    }

    @Override // defpackage.afqb
    public final void d(boolean z) {
        if (z) {
            b();
        } else {
            BottomSheetBehavior bottomSheetBehavior = this.d;
            if (bottomSheetBehavior.t == 5) {
                bottomSheetBehavior.E(4);
            }
        }
        this.s = z;
        if (!z) {
            e();
        }
    }

    public final void e() {
        ViewParent g;
        Layout layout = this.b.getLayout();
        if (layout != null) {
            Rect rect = new Rect();
            this.o.getGlobalVisibleRect(rect);
            int a = (int) afnw.a(layout, this.b);
            if (rect.top > a || rect.top <= 10 || (g = g()) == null) {
                return;
            }
            int i = a - rect.top;
            ((ViewGroup) g).scrollBy(0, i);
            this.t += i;
        }
    }

    public final void f() {
        ViewParent g = g();
        if (g != null) {
            ((ViewGroup) g).scrollBy(0, -this.t);
            this.t = 0;
        }
    }
}
