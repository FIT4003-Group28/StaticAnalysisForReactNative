package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cutl  reason: default package */
/* loaded from: classes5.dex */
public final class cutl extends abg<cutk> {
    public final cuvx a;
    public cvfx e = cuth.a;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public cuib m;
    private int n;
    private int o;

    public cutl(cuvx cuvxVar) {
        this.a = cuvxVar;
    }

    @Override // defpackage.abg
    public final int c() {
        cuib cuibVar = this.m;
        if (cuibVar == null) {
            return 0;
        }
        return cuibVar.c().size();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ cutk d(ViewGroup viewGroup, int i) {
        cutm cutmVar = new cutm(viewGroup.getContext());
        Resources resources = viewGroup.getContext().getResources();
        this.n = resources.getDimensionPixelSize(R.dimen.suggestion_chip_margin);
        this.f = resources.getDimensionPixelSize(R.dimen.suggestion_chip_multi_line_horizontal_padding);
        this.g = resources.getDimensionPixelSize(R.dimen.suggestion_chip_multi_line_top_padding);
        this.h = resources.getDimensionPixelSize(R.dimen.suggestion_chip_multi_line_bottom_padding);
        this.i = resources.getDimensionPixelSize(R.dimen.suggestion_chip_one_line_horizontal_padding);
        this.j = resources.getDimensionPixelSize(R.dimen.suggestion_chip_one_line_vertical_padding);
        this.k = resources.getDimensionPixelSize(R.dimen.suggestion_chip_secondary_top_padding);
        this.l = resources.getDimensionPixelSize(R.dimen.suggestion_chip_secondary_bottom_padding);
        this.o = resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(R.dimen.suggestion_chip_width_restriction);
        return new cutk(cutmVar);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(cutk cutkVar, final int i) {
        Bitmap decodeByteArray;
        cutm cutmVar = (cutm) cutkVar.a;
        cutmVar.setMaxWidth(this.o);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(i == 0 ? this.n : 0, 0, this.n, (this.m.d() != 2 || i == this.m.c().size() + (-1)) ? 0 : this.n);
        cutmVar.setLayoutParams(layoutParams);
        final cuhz cuhzVar = this.m.c().get(i);
        cutmVar.b();
        String b = cuhzVar.b();
        String e = cuhzVar.e();
        if (TextUtils.isEmpty(e)) {
            cutmVar.setText(b);
            cutmVar.setTextAppearance(cutmVar.getContext(), cutmVar.c);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(e).length());
            sb.append(b);
            sb.append("\n");
            sb.append(e);
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new TextAppearanceSpan(cutmVar.getContext(), cutmVar.d), 0, b.length(), 33);
            spannableString.setSpan(new TextAppearanceSpan(cutmVar.getContext(), cutmVar.e), b.length(), b.length() + e.length() + 1, 33);
            cutmVar.setText(spannableString);
        }
        if (cuhzVar.c().a() && (decodeByteArray = BitmapFactory.decodeByteArray(cuhzVar.c().b().a(), 0, cuhzVar.c().b().a().length)) != null) {
            int a = cuwg.a(cutmVar.getContext(), cuhzVar.c().b().b());
            int a2 = cuwg.a(cutmVar.getContext(), cuhzVar.c().b().c());
            if (a > 0 && a2 > 0) {
                cutmVar.setIcon(new BitmapDrawable(cutmVar.getResources(), Bitmap.createScaledBitmap(decodeByteArray, a, a2, true)));
            }
            if (cuhzVar.c().b().d().a()) {
                cutmVar.setIconTint(ColorStateList.valueOf(cuhzVar.c().b().d().b().intValue()));
            }
        }
        cutmVar.getViewTreeObserver().addOnGlobalLayoutListener(new cutj(this, cutmVar, cuhzVar));
        ((cuzv) this.a).g(com.google.android.filament.R.styleable.AppCompatTheme_windowMinWidthMajor, this.m, i);
        cutmVar.setOnClickListener(new View.OnClickListener(this, cuhzVar, i) { // from class: cuti
            private final cutl a;
            private final cuhz b;
            private final int c;

            {
                this.a = this;
                this.b = cuhzVar;
                this.c = i;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cutl cutlVar = this.a;
                cuhz cuhzVar2 = this.b;
                int i2 = this.c;
                ((cuzv) cutlVar.a).g(com.google.android.filament.R.styleable.AppCompatTheme_windowMinWidthMinor, cutlVar.m, i2);
                cutlVar.e.a(cuhzVar2);
            }
        });
    }
}
