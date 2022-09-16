package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.extensions.social.controller.MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ihz  reason: default package */
/* loaded from: classes3.dex */
public final class ihz implements xxe, iik {
    public final CoordinatorLayout a;
    public final EditText b;
    public final ViewGroup c;
    public final BottomSheetBehavior d;
    public final float e;
    public final float f;
    public final int g;
    public final iil h;
    public final avvq i;
    public final List j;
    public final boolean k;
    public MainUserMentionSuggestionsBottomSheetController$CandidateChipSpan l;
    public axbz m;
    public boolean n;
    public int o;
    private final Context p;
    private RecyclerView q;

    public ihz(Context context, iim iimVar, CoordinatorLayout coordinatorLayout, EditText editText, ViewGroup viewGroup, apzg apzgVar, acti actiVar, avvq avvqVar, boolean z) {
        this.j = new ArrayList();
        this.p = context;
        this.i = avvqVar;
        this.a = coordinatorLayout;
        this.b = editText;
        this.k = z;
        this.c = viewGroup;
        this.g = avvqVar == avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER ? 0 : zhn.j(context, R.attr.ytBadgeChipBackground).orElse(0);
        ihv ihvVar = new ihv(this);
        ihw ihwVar = new ihw(this);
        editText.addTextChangedListener(ihvVar);
        editText.addTextChangedListener(new xxr());
        editText.getText().setSpan(ihwVar, 0, 0, 18);
        coordinatorLayout.addOnLayoutChangeListener(new ihx(this));
        RecyclerView recyclerView = new RecyclerView(context);
        this.q = recyclerView;
        viewGroup.addView(recyclerView, -1, -2);
        this.h = iimVar.a(this, this.q, apzgVar, actiVar, avvqVar);
        BottomSheetBehavior v = BottomSheetBehavior.v(viewGroup);
        this.d = v;
        v.E(5);
        Resources resources = context.getResources();
        this.e = resources.getDimension(R.dimen.user_mention_chip_corner_radius);
        this.f = resources.getDimension(R.dimen.user_mention_chip_horizontal_padding);
        if (avvqVar == avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
            editText.addTextChangedListener(new ihu(this));
        }
    }

    @Override // defpackage.xxe
    public final String a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b.getText());
        xxs.b(spannableStringBuilder);
        return spannableStringBuilder.toString().trim();
    }

    public final void b() {
        if (this.l != null) {
            this.b.getText().removeSpan(this.l);
            this.h.f();
        }
        this.l = null;
        c();
    }

    @Override // defpackage.xxe
    public final void c() {
        this.d.E(5);
    }

    public final void d(String str, String str2, int i, int i2) {
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "@".concat(valueOf) : new String("@");
        if (this.i != avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 2);
            sb.append((char) 160);
            sb.append(concat);
            sb.append((char) 160);
            concat = sb.toString();
        }
        this.b.getText().replace(i, i2, concat);
        ajwp ajwpVar = new ajwp(str2, this.e, this.f, this.b.getMeasuredWidth() * 0.9f, this.g);
        int length = concat.length() + i;
        if (this.i == avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
            UnderlineSpan underlineSpan = new UnderlineSpan();
            this.b.getText().setSpan(underlineSpan, i, length, 33);
            this.j.add(new ihy(this, str2, str, underlineSpan));
            this.o++;
            return;
        }
        this.b.getText().setSpan(ajwpVar, i, length, 33);
        this.b.getText().setSpan(new xxq(), i, length, 33);
    }

    @Override // defpackage.iik
    public final void e(boolean z) {
        if (z) {
            c();
        } else {
            BottomSheetBehavior bottomSheetBehavior = this.d;
            if (bottomSheetBehavior.t == 5) {
                bottomSheetBehavior.E(4);
            }
        }
        this.n = z;
    }

    public final boolean f() {
        return this.b.getSelectionStart() == this.b.getSelectionEnd();
    }

    @Override // defpackage.iik
    public final void g(avvu avvuVar) {
        if (this.l == null) {
            return;
        }
        Editable text = this.b.getText();
        int spanStart = text.getSpanStart(this.l);
        int spanEnd = text.getSpanEnd(this.l);
        b();
        if (this.i != avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
            d(avvuVar.d, avvuVar.c, spanStart, spanEnd);
            this.b.getText().insert(this.b.getSelectionStart(), " ");
            return;
        }
        aopa createBuilder = axbz.a.createBuilder();
        String str = avvuVar.c;
        createBuilder.copyOnWrite();
        axbz axbzVar = (axbz) createBuilder.instance;
        str.getClass();
        axbzVar.b |= 1;
        axbzVar.c = str;
        String str2 = avvuVar.d;
        createBuilder.copyOnWrite();
        axbz axbzVar2 = (axbz) createBuilder.instance;
        str2.getClass();
        axbzVar2.b |= 2;
        axbzVar2.d = str2;
        createBuilder.copyOnWrite();
        axbz axbzVar3 = (axbz) createBuilder.instance;
        axbzVar3.b |= 4;
        axbzVar3.e = spanStart;
        createBuilder.copyOnWrite();
        axbz axbzVar4 = (axbz) createBuilder.instance;
        axbzVar4.b |= 8;
        axbzVar4.f = spanEnd;
        this.m = (axbz) createBuilder.mo39build();
    }

    public ihz(Context context, iim iimVar, CoordinatorLayout coordinatorLayout, EditText editText, ViewGroup viewGroup, apzg apzgVar, acti actiVar, avvq avvqVar, aljg aljgVar) {
        this(context, iimVar, coordinatorLayout, editText, viewGroup, apzgVar, actiVar, avvqVar, false);
        BottomSheetBehavior bottomSheetBehavior = this.d;
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        bottomSheetBehavior.z.clear();
        bottomSheetBehavior.z.add(aljgVar);
    }
}
