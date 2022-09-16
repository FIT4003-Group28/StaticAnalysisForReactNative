package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajgl  reason: default package */
/* loaded from: classes.dex */
public final class ajgl {
    static final CharSequence a = " · ";
    private static final CharSequence[] b = new CharSequence[0];
    private static final Spanned c = new SpannedString("");

    static {
        aqxo.i(adyd.t);
    }

    public static Spanned a(ajgj ajgjVar) {
        return s(ajgjVar.a, ajgjVar.b, 0, ajgjVar.c, null);
    }

    public static Spanned b(arag aragVar) {
        return s(null, aragVar, 0, null, null);
    }

    public static Spanned c(arag aragVar, ajgf ajgfVar) {
        return s(null, aragVar, 0, ajgfVar, null);
    }

    public static Spanned d(arag aragVar, ajgj ajgjVar) {
        ajgi ajgiVar = new ajgi(ajgjVar);
        ajgiVar.b = aragVar;
        return a(ajgiVar.a());
    }

    public static Spanned e(arag aragVar, ajgj ajgjVar, ajgh ajghVar) {
        ajgf ajgfVar = null;
        Context context = ajgjVar == null ? null : ajgjVar.a;
        if (ajgjVar != null) {
            ajgfVar = ajgjVar.c;
        }
        return s(context, aragVar, 0, ajgfVar, ajghVar);
    }

    public static arag f(long j) {
        aopc aopcVar = (aopc) arag.a.createBuilder();
        aopc aopcVar2 = (aopc) arai.a.createBuilder();
        String format = NumberFormat.getInstance().format(j);
        aopcVar2.copyOnWrite();
        arai araiVar = (arai) aopcVar2.instance;
        format.getClass();
        araiVar.b |= 1;
        araiVar.c = format;
        aopcVar.cs(aopcVar2);
        return (arag) aopcVar.mo39build();
    }

    public static arag g(String... strArr) {
        aopc aopcVar = (aopc) arag.a.createBuilder();
        for (String str : strArr) {
            aopc aopcVar2 = (aopc) arai.a.createBuilder();
            aopcVar2.copyOnWrite();
            arai araiVar = (arai) aopcVar2.instance;
            araiVar.b |= 1;
            araiVar.c = t(str);
            aopcVar.cs(aopcVar2);
        }
        return (arag) aopcVar.mo39build();
    }

    public static arag h(String str) {
        aopc aopcVar = (aopc) arag.a.createBuilder();
        aopcVar.copyOnWrite();
        arag aragVar = (arag) aopcVar.instance;
        aragVar.b |= 1;
        aragVar.d = t(str);
        return (arag) aopcVar.mo39build();
    }

    public static CharSequence i(arag aragVar) {
        if (aragVar != null) {
            arah arahVar = aragVar.f;
            if (arahVar == null) {
                arahVar = arah.a;
            }
            if ((arahVar.b & 1) == 0) {
                return null;
            }
            arah arahVar2 = aragVar.f;
            if (arahVar2 == null) {
                arahVar2 = arah.a;
            }
            aovr aovrVar = arahVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            return aovrVar.c;
        }
        return null;
    }

    public static CharSequence j(CharSequence charSequence, List list) {
        return k(charSequence, (CharSequence[]) list.toArray(new CharSequence[list.size()]));
    }

    public static CharSequence k(CharSequence charSequence, CharSequence... charSequenceArr) {
        CharSequence charSequence2 = "";
        if (charSequenceArr != null && (r1 = charSequenceArr.length) > 0) {
            if (charSequence == null) {
                charSequence = a;
            }
            for (CharSequence charSequence3 : charSequenceArr) {
                if (!TextUtils.isEmpty(charSequence3)) {
                    charSequence2 = TextUtils.isEmpty(charSequence2) ? charSequence3 : TextUtils.concat(charSequence2, charSequence, charSequence3);
                }
            }
        }
        return charSequence2;
    }

    public static List l(List list) {
        if (list == null || list.isEmpty()) {
            return Arrays.asList(b);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((arag) it.next()));
        }
        return arrayList;
    }

    public static boolean m(arag aragVar) {
        for (arai araiVar : aragVar.c) {
            if ((araiVar.b & 512) != 0) {
                return true;
            }
        }
        return false;
    }

    public static Spanned[] n(List list) {
        Spanned[] spannedArr = new Spanned[list.size()];
        for (int i = 0; i < list.size(); i++) {
            spannedArr[i] = b((arag) list.get(i));
        }
        return spannedArr;
    }

    public static Spanned[] o(arag[] aragVarArr) {
        Spanned[] spannedArr = new Spanned[aragVarArr.length];
        for (int i = 0; i < aragVarArr.length; i++) {
            spannedArr[i] = b(aragVarArr[i]);
        }
        return spannedArr;
    }

    public static CharSequence[] p(arag[] aragVarArr) {
        int length;
        if (aragVarArr == null || (length = aragVarArr.length) == 0) {
            return b;
        }
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i = 0; i < aragVarArr.length; i++) {
            charSequenceArr[i] = b(aragVarArr[i]);
        }
        return charSequenceArr;
    }

    public static void q(Context context, Intent intent) {
        String str = intent.getPackage();
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            if (str == null) {
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                    if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                        intent.putExtra("is_loopback", true);
                        intent.setPackage(packageName);
                        return;
                    }
                }
            } else if (packageName.equals(str)) {
                intent.putExtra("is_loopback", true);
            }
        }
    }

    public static Spanned r(arag aragVar) {
        return s(null, aragVar, 1, null, null);
    }

    public static Spanned s(Context context, arag aragVar, int i, ajgf ajgfVar, ajgh ajghVar) {
        URLSpan[] uRLSpanArr;
        Typeface c2;
        int h;
        if (aragVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(aragVar.d)) {
            if (aragVar.c.size() != 0) {
                if (aragVar.c.size() > 0 && aragVar.c.size() != 0 && aragVar.c.size() <= 1 && i == 0) {
                    arai araiVar = (arai) aragVar.c.get(0);
                    if (!araiVar.d && !araiVar.e && !araiVar.g && !araiVar.f && !araiVar.h && araiVar.i == 0 && (araiVar.b & 512) == 0 && ((h = arey.h(araiVar.k)) == 0 || h == 1)) {
                        return new SpannedString(((arai) aragVar.c.get(0)).c);
                    }
                }
                int i2 = ajgk.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = 0;
                int i4 = 0;
                for (arai araiVar2 : aragVar.c) {
                    if (!araiVar2.c.isEmpty() && !TextUtils.isEmpty(araiVar2.c)) {
                        i3 += araiVar2.c.length();
                        spannableStringBuilder.append(araiVar2.c);
                        int i5 = (araiVar2.d ? 1 : 0) | (true != araiVar2.e ? 0 : 2);
                        if (i5 != 0) {
                            spannableStringBuilder.setSpan(new StyleSpan(i5), i4, i3, 33);
                        }
                        if (araiVar2.g) {
                            spannableStringBuilder.setSpan(new ajgk(), i4, i3, 33);
                        }
                        if (araiVar2.f) {
                            spannableStringBuilder.setSpan(new ajgd(), i4, i3, 33);
                        }
                        if (araiVar2.h) {
                            spannableStringBuilder.setSpan(new ajge(), i4, i3, 33);
                        }
                        int i6 = araiVar2.i;
                        if (i6 != 0) {
                            if (ajghVar != null && (araiVar2.b & 128) != 0) {
                                i6 = ajghVar.a(i6, araiVar2.j);
                            }
                            spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i6), null), i4, i3, 33);
                        }
                        if (context != null) {
                            int h2 = arey.h(araiVar2.k);
                            if (h2 == 0) {
                                h2 = 1;
                            }
                            switch (h2 - 1) {
                                case 1:
                                    c2 = ajgo.YTSANS_MEDIUM.c(context);
                                    break;
                                case 2:
                                    c2 = ajgo.ROBOTO_MEDIUM.c(context);
                                    break;
                                case 3:
                                    c2 = ajgo.YOUTUBE_SANS_LIGHT.c(context);
                                    break;
                                case 4:
                                    c2 = ajgo.YOUTUBE_SANS_REGULAR.c(context);
                                    break;
                                case 5:
                                    c2 = ajgo.YOUTUBE_SANS_MEDIUM.c(context);
                                    break;
                                case 6:
                                    c2 = ajgo.YOUTUBE_SANS_SEMIBOLD.c(context);
                                    break;
                                case 7:
                                    c2 = ajgo.YOUTUBE_SANS_BOLD.c(context);
                                    break;
                                case 8:
                                    c2 = ajgo.YOUTUBE_SANS_EXTRABOLD.c(context);
                                    break;
                                case 9:
                                    c2 = ajgo.YOUTUBE_SANS_BLACK.c(context);
                                    break;
                                case 10:
                                default:
                                    c2 = null;
                                    break;
                                case 11:
                                    c2 = ajgo.ROBOTO_REGULAR.c(context);
                                    break;
                            }
                            if (c2 != null) {
                                spannableStringBuilder.setSpan(new ajgg(c2), i4, i3, 33);
                            }
                        }
                        if (ajgfVar != null && (araiVar2.b & 512) != 0) {
                            apzg apzgVar = araiVar2.m;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            spannableStringBuilder.setSpan(ajgfVar.a(apzgVar), i4, i3, 33);
                        }
                        i4 = i3;
                    }
                }
                if (i != 0) {
                    Linkify.addLinks(spannableStringBuilder, 1);
                    for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                        spannableStringBuilder.removeSpan(uRLSpan);
                        final String url = uRLSpan.getURL();
                        spannableStringBuilder.setSpan(new URLSpan(url) { // from class: com.google.android.libraries.youtube.proto.formatted.FormattedStringUtil$SanitizedURLSpan
                            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                Context context2 = view.getContext();
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(getURL()));
                                ajgl.q(context2, intent);
                                context2.startActivity(intent);
                            }
                        }, spanStart, spanEnd, 33);
                    }
                }
                return spannableStringBuilder;
            }
            return c;
        }
        return new SpannedString(aragVar.d);
    }

    private static String t(String str) {
        return str == null ? "" : str;
    }
}
