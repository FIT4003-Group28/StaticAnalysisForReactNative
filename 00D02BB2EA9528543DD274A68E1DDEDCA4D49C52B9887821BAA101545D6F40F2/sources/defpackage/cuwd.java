package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.common.CustomTypefaceSpan;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cuwd  reason: default package */
/* loaded from: classes5.dex */
public final class cuwd {
    public static String a(cuhv cuhvVar) {
        StringBuilder sb = new StringBuilder();
        dcdc<cuhg> a = cuhvVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cuhg cuhgVar = a.get(i);
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(cuhgVar.a());
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static SpannableStringBuilder b(Context context, cuhv cuhvVar, dbsg<Integer> dbsgVar) {
        SpannableString spannableString;
        int i;
        dbsg i2;
        dbsg i3;
        int b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        dcdc<cuhg> a = cuhvVar.a();
        int size = a.size();
        ?? r4 = 0;
        int i4 = 0;
        while (i4 < size) {
            cuhg cuhgVar = a.get(i4);
            if (spannableStringBuilder.length() > 0 && !cuhgVar.e().c(Boolean.valueOf((boolean) r4)).booleanValue()) {
                spannableStringBuilder.append("\n");
            }
            int length = cuhgVar.a().length();
            int i5 = 1;
            if (cuhgVar.b().a()) {
                String a2 = cuhgVar.a();
                cuhp b2 = cuhgVar.b().b();
                cuhp cuhpVar = cuhp.UNKNOWN;
                cuhn cuhnVar = cuhn.UNKNOWN;
                cuhu cuhuVar = cuhu.UNKNOWN;
                cuhs cuhsVar = cuhs.UNKNOWN;
                int ordinal = b2.ordinal();
                if (ordinal == 1) {
                    i3 = dbsg.i(2132018127);
                } else if (ordinal == 2) {
                    i3 = dbsg.i(2132018130);
                } else if (ordinal == 3) {
                    i3 = dbsg.i(2132018113);
                } else if (ordinal != 4) {
                    i3 = ordinal != 5 ? dbpy.a : dbsg.i(2132018138);
                } else {
                    i3 = dbsg.i(2132018117);
                }
                if (!i3.a()) {
                    spannableString = new SpannableString(a2);
                } else {
                    SpannableString spannableString2 = new SpannableString(((Integer) i3.b()).intValue() == 2132018138 ? a2.toUpperCase(akr.a(context.getResources().getConfiguration()).d()) : a2);
                    spannableString2.setSpan(new TextAppearanceSpan(context, ((Integer) i3.b()).intValue()), r4, a2.length(), 33);
                    if (dbsgVar.a()) {
                        b = dbsgVar.b().intValue();
                    } else if (cuhp.CAPTION_TEXT.equals(b2)) {
                        b = ka.b(context.getResources(), R.color.default_caption_color);
                    } else {
                        b = ka.b(context.getResources(), R.color.default_rich_text_font_color);
                    }
                    spannableString2.setSpan(new ForegroundColorSpan(b), r4, a2.length(), 33);
                    spannableString = spannableString2;
                }
            } else {
                spannableString = new SpannableString(cuhgVar.a());
            }
            if (cuhgVar.c().a()) {
                dcdc<cuhl> SL = cuhgVar.c().b().SL();
                int size2 = SL.size();
                int i6 = 0;
                while (i6 < size2) {
                    cuhl cuhlVar = SL.get(i6);
                    cuhp cuhpVar2 = cuhp.UNKNOWN;
                    cuhn cuhnVar2 = cuhn.UNKNOWN;
                    cuhu cuhuVar2 = cuhu.UNKNOWN;
                    cuhs cuhsVar2 = cuhs.UNKNOWN;
                    int ordinal2 = cuhlVar.a().ordinal();
                    if (ordinal2 != i5) {
                        i2 = ordinal2 != 2 ? dbpy.a : dbsg.i(new BulletSpan((int) context.getResources().getDimension(R.dimen.bullet_span_gap_width)));
                    } else {
                        i2 = dbsg.i(new LeadingMarginSpan.Standard(cuwg.a(context, cuhlVar.b())));
                    }
                    if (i2.a()) {
                        Object b3 = i2.b();
                        int i7 = r4 == true ? 1 : 0;
                        int i8 = r4 == true ? 1 : 0;
                        spannableString.setSpan(b3, i7, length, 33);
                    }
                    i6++;
                    i5 = 1;
                }
            }
            if (cuhgVar.d().a()) {
                dcdc<cuhi> b4 = cuhgVar.d().b();
                int size3 = b4.size();
                int i9 = 0;
                while (i9 < size3) {
                    cuhi cuhiVar = b4.get(i9);
                    ArrayList arrayList = new ArrayList();
                    dcdc<cuhq> c = cuhiVar.c();
                    int size4 = c.size();
                    int i10 = 0;
                    while (i10 < size4) {
                        cuhq cuhqVar = c.get(i10);
                        dcdc<cuhg> dcdcVar = a;
                        int i11 = size;
                        if (cuhs.BOLD.equals(cuhqVar.b()) || cuhs.ITALIC.equals(cuhqVar.b())) {
                            arrayList.add(cuhqVar);
                        } else {
                            e(spannableString, cuhiVar, length, c(context, cuhqVar));
                        }
                        i10++;
                        a = dcdcVar;
                        size = i11;
                    }
                    dcdc<cuhg> dcdcVar2 = a;
                    int i12 = size;
                    int size5 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        i = i9 + 1;
                        if (i13 < size5) {
                            e(spannableString, cuhiVar, length, c(context, (cuhq) arrayList.get(i13)));
                            i13++;
                        }
                    }
                    i9 = i;
                    a = dcdcVar2;
                    size = i12;
                }
            }
            spannableStringBuilder.append((CharSequence) spannableString);
            i4++;
            a = a;
            size = size;
            r4 = 0;
        }
        return spannableStringBuilder;
    }

    static dbsg<ParcelableSpan> c(Context context, cuhq cuhqVar) {
        Layout.Alignment alignment;
        cuhp cuhpVar = cuhp.UNKNOWN;
        cuhn cuhnVar = cuhn.UNKNOWN;
        cuhu cuhuVar = cuhu.UNKNOWN;
        cuhs cuhsVar = cuhs.UNKNOWN;
        switch (cuhqVar.b().ordinal()) {
            case 1:
                return dbsg.i(new StyleSpan(1));
            case 2:
                return dbsg.i(new StyleSpan(2));
            case 3:
                return dbsg.i(new UnderlineSpan());
            case 4:
                return dbsg.i(new StrikethroughSpan());
            case 5:
                return dbsg.i(new SuperscriptSpan());
            case 6:
                return dbsg.i(new SubscriptSpan());
            case 7:
                return dbsg.i(new ForegroundColorSpan(cuhqVar.d()));
            case 8:
                return dbsg.i(new BackgroundColorSpan(cuhqVar.a()));
            case 9:
                return dbsg.i(new AbsoluteSizeSpan((int) (cuhqVar.h() * context.getResources().getDisplayMetrics().scaledDensity)));
            case 10:
                dcdc<cuhu> l = cuhqVar.l();
                int size = l.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    switch (l.get(i).ordinal()) {
                        case 1:
                            return dbsg.i(new TypefaceSpan("sans-serif-light"));
                        case 2:
                        case 8:
                            return dbsg.i(new TypefaceSpan("sans-serif"));
                        case 3:
                            return dbsg.i(new TypefaceSpan("sans-serif-medium"));
                        case 4:
                            return dbsg.i(new TypefaceSpan("sans-serif-black"));
                        case 5:
                            return dbsg.i(d(context, R.font.google_sans, "sans-serif"));
                        case 6:
                            return dbsg.i(d(context, R.font.google_sans_medium, "sans-serif-medium"));
                        case 7:
                        default:
                            i = i2;
                    }
                }
                return dbpy.a;
            case 11:
                int e = cuhqVar.e();
                if (e != 1) {
                    alignment = e != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                return dbsg.i(new AlignmentSpan.Standard(alignment));
            case 12:
                return dbsg.i(new URLSpan(cuhqVar.f().a()));
            default:
                return dbpy.a;
        }
    }

    static ParcelableSpan d(Context context, int i, String str) {
        try {
            return new CustomTypefaceSpan(ka.a(context, i));
        } catch (Resources.NotFoundException | IllegalArgumentException unused) {
            cstl.a("RichTextConvUtil");
            return new TypefaceSpan(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(android.text.SpannableString r2, defpackage.cuhi r3, int r4, defpackage.dbsg<android.text.ParcelableSpan> r5) {
        /*
            boolean r0 = r5.a()
            if (r0 == 0) goto L31
            int r0 = r3.a()
            int r1 = r3.b()
            if (r0 != 0) goto L13
            if (r1 == 0) goto L19
            r0 = 0
        L13:
            if (r0 < 0) goto L31
            if (r0 > r1) goto L31
            if (r1 > r4) goto L31
        L19:
            java.lang.Object r5 = r5.b()
            int r0 = r3.a()
            int r1 = r3.b()
            if (r1 != 0) goto L28
            goto L2c
        L28:
            int r4 = r3.b()
        L2c:
            r3 = 33
            r2.setSpan(r5, r0, r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwd.e(android.text.SpannableString, cuhi, int, dbsg):void");
    }
}
