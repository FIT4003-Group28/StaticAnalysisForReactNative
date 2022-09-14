package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.android.apps.gmm.mymaps.place.viewmodelimpls.MyMapsFeatureAttributesViewModelImpl$Roboto2DraftMediumTypefaceSpan;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: arih  reason: default package */
/* loaded from: classes2.dex */
public class arih implements cqkp, arhg {
    @dzsi
    private List<jbf> a;
    private final MyMapsFeatureAttributesViewModelImpl$Roboto2DraftMediumTypefaceSpan b = new TypefaceSpan() { // from class: com.google.android.apps.gmm.mymaps.place.viewmodelimpls.MyMapsFeatureAttributesViewModelImpl$Roboto2DraftMediumTypefaceSpan
        private final Typeface a = ((cqvi) irn.b).a;

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setTypeface(this.a);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public final void updateMeasureState(TextPaint textPaint) {
            textPaint.setTypeface(this.a);
        }
    };
    private final SpannableStringBuilder c;
    private final Configuration d;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.apps.gmm.mymaps.place.viewmodelimpls.MyMapsFeatureAttributesViewModelImpl$Roboto2DraftMediumTypefaceSpan] */
    public arih(Activity activity) {
        this.d = activity.getResources().getConfiguration();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(activity.getString(R.string.MY_MAPS_FEATURE_EMPTY_ATTRIBUTE));
        this.c = spannableStringBuilder;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(irg.j().b(activity)), 0, spannableStringBuilder.length(), 0);
    }

    @Override // defpackage.arhg
    public void D(dvcj dvcjVar) {
        SpannableStringBuilder append;
        dccx F = dcdc.F();
        if (dvcjVar.b.size() != 1) {
            for (dvbr dvbrVar : dvcjVar.b) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dvbrVar.a);
                spannableStringBuilder.setSpan(this.b, 0, spannableStringBuilder.length(), 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dvbrVar.b);
                if (TextUtils.getTrimmedLength(spannableStringBuilder2) == 0) {
                    spannableStringBuilder2 = this.c;
                }
                if (bvox.d(this.d)) {
                    append = spannableStringBuilder2.append((CharSequence) "   ").append((CharSequence) spannableStringBuilder);
                } else {
                    append = spannableStringBuilder.append((CharSequence) "   ").append((CharSequence) spannableStringBuilder2);
                }
                ixw ixwVar = new ixw();
                ixwVar.a = append;
                F.g(ixwVar.a());
            }
        } else {
            String str = dvcjVar.b.get(0).b;
            if (!str.toString().contentEquals(this.c)) {
                ixw ixwVar2 = new ixw();
                ixwVar2.a = str;
                F.g(ixwVar2.a());
            }
        }
        this.a = F.f();
        cqkx.p(this);
    }

    @Override // defpackage.arhg
    public void E(String str) {
    }

    public List<jbf> a() {
        return this.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }
}
