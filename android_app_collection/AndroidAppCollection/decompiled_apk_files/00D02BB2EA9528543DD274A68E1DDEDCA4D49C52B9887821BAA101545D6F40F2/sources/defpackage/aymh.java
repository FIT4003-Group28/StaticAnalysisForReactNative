package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aymh  reason: default package */
/* loaded from: classes3.dex */
public class aymh {
    private static final Long c = 100L;
    public final Activity a;
    public final azed b;
    private final alp d = alp.a();

    public aymh(Activity activity) {
        this.a = activity;
        this.b = new azed(activity);
    }

    public static int i(baad baadVar) {
        Set<baaj> j = baadVar.j();
        if (j.isEmpty()) {
            return R.plurals.LIST_COUNT_PLACES;
        }
        if (j.size() > 1) {
            return R.plurals.LIST_COUNT_ITEMS;
        }
        baaj baajVar = baaj.PLACE;
        dpuk dpukVar = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        if (((baaj) dcft.c(j)).ordinal() != 1) {
            return R.plurals.LIST_COUNT_PLACES;
        }
        dcep B = dcbg.b(baadVar.i()).s(aymg.a).B();
        if (B.size() != 1) {
            return R.plurals.LIST_COUNT_ITEMS;
        }
        if (((dpuk) dcft.c(B)).ordinal() == 1) {
            return R.plurals.LIST_COUNT_EVENTS;
        }
        String valueOf = String.valueOf(B);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("Unsupported experience type: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    private final CharSequence l(drcs drcsVar, int i, int i2) {
        return new SpannableStringBuilder().append((CharSequence) new SpannableStringBuilder().append(this.b.a.getResources().getText(azed.a(drcsVar)))).append((CharSequence) " · ").append((CharSequence) this.a.getResources().getQuantityString(i2, i, Integer.valueOf(i)));
    }

    private final CharSequence m(baad baadVar, boolean z) {
        return n(g(baadVar), e(baadVar, z));
    }

    private static CharSequence n(CharSequence charSequence, CharSequence charSequence2) {
        return new SpannableStringBuilder().append(charSequence).append((CharSequence) ((charSequence.length() <= 0 || charSequence2.length() <= 0) ? "" : " · ")).append(charSequence2);
    }

    public final CharSequence a(baad baadVar, cqss cqssVar, boolean z) {
        if (baadVar.y()) {
            return n(f(baadVar, cqssVar), e(baadVar, z));
        }
        return m(baadVar, z);
    }

    public final CharSequence b(drcs drcsVar, cqss cqssVar, int i) {
        return c(drcsVar, cqssVar, i, R.plurals.LIST_COUNT_PLACES);
    }

    public final CharSequence c(drcs drcsVar, cqss cqssVar, int i, int i2) {
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        azed azedVar = this.b;
        baac baacVar = baac.PRIVATE;
        drcs drcsVar2 = drcs.UNKNOWN_SHARING_STATE;
        int ordinal = drcsVar.ordinal();
        if (ordinal == 0) {
            String valueOf = String.valueOf(drcsVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Illegal sharing state - ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        if (ordinal == 1) {
            i3 = 2131232769;
        } else if (ordinal == 2) {
            i3 = 2131232749;
        } else if (ordinal == 3) {
            i3 = 2131232856;
        } else if (ordinal != 4) {
            throw new AssertionError(drcsVar);
        } else {
            i3 = 2131232829;
        }
        return spannableStringBuilder.append((CharSequence) new SpannableStringBuilder().append((CharSequence) azedVar.b.e(cqrt.h(i3, cqssVar).a(azedVar.a), 0.9f)).append((CharSequence) " ").append(azedVar.a.getResources().getText(azed.a(drcsVar)))).append((CharSequence) " · ").append((CharSequence) this.a.getResources().getQuantityString(i2, i, Integer.valueOf(i)));
    }

    public final CharSequence d(drcs drcsVar, int i) {
        return l(drcsVar, i, R.plurals.LIST_COUNT_PLACES);
    }

    public final CharSequence e(baad baadVar, boolean z) {
        CharSequence charSequence;
        CharSequence charSequence2 = "";
        if (!z || !h(baadVar)) {
            charSequence = charSequence2;
        } else {
            int Q = (int) baadVar.Q();
            charSequence = new SpannableStringBuilder().append((CharSequence) this.a.getResources().getQuantityString(R.plurals.LIST_COUNT_FOLLOWERS, Q, Integer.valueOf(Q)));
        }
        if (baadVar.w() && baadVar.af() >= c.longValue()) {
            charSequence2 = new SpannableStringBuilder(this.a.getResources().getQuantityString(R.plurals.LIST_COUNT_VIEWS, (int) baadVar.af(), baadVar.ag()));
        }
        return n(charSequence, charSequence2);
    }

    public final CharSequence f(baad baadVar, cqss cqssVar) {
        baac t = baadVar.t();
        return new SpannableStringBuilder().append(c(baae.a(t), cqssVar, baadVar.k(), i(baadVar)));
    }

    public final CharSequence g(baad baadVar) {
        String string = baadVar.L() ? this.a.getString(R.string.LIST_AUTHOR_NAME, new Object[]{baadVar.O()}) : this.a.getString(R.string.LIST_DEFAULT_AUTHOR_NAME);
        int k = baadVar.k();
        return new SpannableStringBuilder().append((CharSequence) this.d.b(string)).append((CharSequence) " · ").append((CharSequence) this.a.getResources().getQuantityString(i(baadVar), k, Integer.valueOf(k)));
    }

    public final boolean h(baad baadVar) {
        return baadVar.w() && baadVar.Q() > 0;
    }

    public final CharSequence j(baad baadVar) {
        if (!baadVar.y()) {
            return m(baadVar, false);
        }
        return k(baadVar);
    }

    public final CharSequence k(baad baadVar) {
        baac t = baadVar.t();
        return n(new SpannableStringBuilder().append(l(baae.a(t), baadVar.k(), i(baadVar))), e(baadVar, false));
    }
}
