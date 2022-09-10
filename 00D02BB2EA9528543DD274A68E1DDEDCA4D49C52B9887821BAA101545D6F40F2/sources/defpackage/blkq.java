package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
/* compiled from: PG */
/* renamed from: blkq  reason: default package */
/* loaded from: classes3.dex */
public final class blkq {
    private final String a;
    private final dbsg<djck> b;
    private final Iterable<drew> c;
    private final boolean d;
    private final dbsg<CharSequence> e;

    public blkq(String str, dbsg<djck> dbsgVar, Iterable<drew> iterable, boolean z, dbsg<CharSequence> dbsgVar2) {
        this.a = str;
        this.b = dbsgVar;
        this.c = iterable;
        this.d = z;
        this.e = dbsgVar2;
    }

    public static dclz<Integer> b(drew drewVar) {
        return dclz.g(Integer.valueOf(drewVar.d), Integer.valueOf(drewVar.e));
    }

    public final CharSequence a(CharSequence charSequence) {
        dcdc<dclz<Integer>> z;
        if (charSequence.length() == 0) {
            return charSequence;
        }
        if (!this.a.isEmpty()) {
            String charSequence2 = charSequence.toString();
            String str = this.a;
            z = dcbg.b(this.c).o(blkk.a).s(blkl.a).z();
            if (z.isEmpty()) {
                z = bljw.a(charSequence2, str);
            }
        } else if (!this.b.a()) {
            return charSequence;
        } else {
            final djck b = this.b.b();
            z = dcbg.b(this.c).o(blkm.a).o(new dbsl(b) { // from class: blkn
                private final djck a;

                {
                    this.a = b;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    drev drevVar;
                    djck djckVar = this.a;
                    drew drewVar = (drew) obj;
                    if (drewVar.b == 4) {
                        drevVar = (drev) drewVar.c;
                    } else {
                        drevVar = drev.c;
                    }
                    drdm drdmVar = drevVar.b;
                    if (drdmVar == null) {
                        drdmVar = drdm.e;
                    }
                    drdk drdkVar = drdmVar.b;
                    if (drdkVar == null) {
                        drdkVar = drdk.c;
                    }
                    drdk drdkVar2 = djckVar.b;
                    if (drdkVar2 == null) {
                        drdkVar2 = drdk.c;
                    }
                    return drdkVar.equals(drdkVar2);
                }
            }).s(blko.a).z();
        }
        dclz g = dclz.g(0, Integer.valueOf(charSequence.length()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int size = z.size();
        dclz<Integer> dclzVar = null;
        for (int i = 0; i < size; i++) {
            dclz<Integer> dclzVar2 = z.get(i);
            if (g.b.compareTo(dclzVar2.b) <= 0 && g.c.compareTo(dclzVar2.c) >= 0) {
                spannableStringBuilder.setSpan(new StyleSpan(1), dclzVar2.n().intValue(), dclzVar2.o().intValue(), 17);
                if (dclzVar == null || dclzVar2.n().intValue() < dclzVar.n().intValue()) {
                    dclzVar = dclzVar2;
                }
            }
        }
        if (!this.d || dclzVar == null) {
            return spannableStringBuilder;
        }
        dclz s = dclz.g(Integer.valueOf(dclzVar.n().intValue() - 100), Integer.valueOf(dclzVar.o().intValue() + 100)).s(dclz.g(0, Integer.valueOf(spannableStringBuilder.length())));
        String str2 = "…";
        CharSequence charSequence3 = (CharSequence) this.e.h(blkp.a).c(str2);
        CharSequence[] charSequenceArr = new CharSequence[3];
        if (((Integer) s.n()).intValue() <= 0) {
            str2 = "";
        }
        charSequenceArr[0] = str2;
        charSequenceArr[1] = spannableStringBuilder.subSequence(((Integer) s.n()).intValue(), ((Integer) s.o()).intValue());
        if (((Integer) s.o()).intValue() >= spannableStringBuilder.length()) {
            charSequence3 = "";
        }
        charSequenceArr[2] = charSequence3;
        return TextUtils.concat(charSequenceArr);
    }
}
