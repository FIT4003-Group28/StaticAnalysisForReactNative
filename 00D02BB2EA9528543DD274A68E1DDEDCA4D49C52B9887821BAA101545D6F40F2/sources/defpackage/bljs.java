package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bljs  reason: default package */
/* loaded from: classes3.dex */
public class bljs implements bliy {
    private final dxio<bkpi> a;
    private final bwrs<ilo> b;
    private final djck c;
    private final CharSequence d;
    private final String e;
    private final jic f;
    private final cjtd g;

    public bljs(Activity activity, dxio<bkpi> dxioVar, bwrs<ilo> bwrsVar, CharSequence charSequence, dnfg dnfgVar, djck djckVar) {
        this.a = dxioVar;
        this.b = bwrsVar;
        this.d = charSequence;
        this.c = djckVar;
        dnna dnnaVar = dnfgVar.b;
        this.f = new jic((dnnaVar == null ? dnna.m : dnnaVar).e, ckqc.FIFE_MERGE, 2131232998);
        this.e = j(activity, djckVar);
        cjta b = cjtd.b();
        ilo c = bwrsVar.c();
        dbsk.s(c);
        b.g = decs.a(c.ai().c);
        b.g(djckVar.c);
        b.d = dtxy.nw;
        this.g = b.a();
        dcdn<drdk, String> dcdnVar = bljh.a;
        drdk drdkVar = djckVar.b;
        dcdnVar.get(drdkVar == null ? drdk.c : drdkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(Activity activity, djck djckVar) {
        String str = djckVar.d;
        djcm djcmVar = djckVar.e;
        if (djcmVar == null) {
            djcmVar = djcm.b;
        }
        int i = (int) djcmVar.a;
        return i == 0 ? "" : activity.getResources().getQuantityString(R.plurals.TOPIC_REVIEWS_MENTION_TOPIC_LABEL, i, Integer.valueOf(i), str);
    }

    public static dbsg<bljs> k(bljt bljtVar, bwrs<ilo> bwrsVar, bljv bljvVar, djck djckVar) {
        dbsg dbsgVar;
        drev drevVar;
        dbsg dbsgVar2;
        dbsg i;
        drev drevVar2;
        drev drevVar3;
        if (djckVar.g.size() == 0) {
            return dbpy.a;
        }
        boolean z = false;
        docg docgVar = djckVar.g.get(0);
        Iterator<drew> it = docgVar.w.iterator();
        while (true) {
            if (it.hasNext()) {
                drew next = it.next();
                drey dreyVar = drey.PLACE_TOPIC_MENTION;
                drey b = drey.b(next.f);
                if (b == null) {
                    b = drey.UNKNOWN_HIGHLIGHT_TYPE;
                }
                if (dreyVar.equals(b) && next.e <= docgVar.r.length()) {
                    if (next.b == 4) {
                        drevVar3 = (drev) next.c;
                    } else {
                        drevVar3 = drev.c;
                    }
                    drdm drdmVar = drevVar3.b;
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
                    if (drdkVar.equals(drdkVar2) && drdmVar.c) {
                        dbsgVar = dbsg.i(next);
                        break;
                    }
                }
            } else {
                dbsgVar = dbpy.a;
                break;
            }
        }
        if (!dbsgVar.a()) {
            i = dbpy.a;
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(docgVar.r);
            spannableStringBuilder.setSpan(new StyleSpan(1), ((drew) dbsgVar.b()).d, ((drew) dbsgVar.b()).e, 17);
            drew drewVar = (drew) dbsgVar.b();
            if (drewVar.b == 4) {
                drevVar = (drev) drewVar.c;
            } else {
                drevVar = drev.c;
            }
            drdm drdmVar2 = drevVar.b;
            if (drdmVar2 == null) {
                drdmVar2 = drdm.e;
            }
            if ((drdmVar2.a & 32) != 0) {
                if (drewVar.b == 4) {
                    drevVar2 = (drev) drewVar.c;
                } else {
                    drevVar2 = drev.c;
                }
                drdm drdmVar3 = drevVar2.b;
                if (drdmVar3 == null) {
                    drdmVar3 = drdm.e;
                }
                dqiq dqiqVar = drdmVar3.d;
                if (dqiqVar == null) {
                    dqiqVar = dqiq.c;
                }
                int i2 = dqiqVar.a;
                int i3 = dqiqVar.b;
                dbsgVar2 = (i2 >= 0 && i3 > i2 && i3 <= spannableStringBuilder.length()) ? dbsg.i(dqiqVar) : dbpy.a;
            } else {
                dbsgVar2 = dbpy.a;
            }
            if (!dbsgVar2.a()) {
                i = dbpy.a;
            } else {
                int i4 = ((dqiq) dbsgVar2.b()).a;
                int i5 = ((dqiq) dbsgVar2.b()).b;
                CharSequence subSequence = spannableStringBuilder.subSequence(i4, i5);
                int e = dbra.b.k().e(subSequence);
                if (e >= 0) {
                    i5 = e + i4 + 1;
                    subSequence = spannableStringBuilder.subSequence(i4, i5);
                }
                String charSequence = spannableStringBuilder.toString();
                CharSequence[] charSequenceArr = new CharSequence[5];
                charSequenceArr[0] = "\"";
                if (i4 != 0) {
                    BreakIterator sentenceInstance = BreakIterator.getSentenceInstance(Locale.getDefault());
                    sentenceInstance.setText(charSequence);
                    for (int first = sentenceInstance.first(); first <= i4 && first != -1; first = sentenceInstance.next()) {
                        if (first == i4) {
                            break;
                        }
                    }
                    if (!charSequence.substring(i4, i4 + 1).matches("[\\p{Punct}。]")) {
                        z = true;
                    }
                    z = false;
                }
                String str = "";
                charSequenceArr[1] = true != z ? str : "…";
                charSequenceArr[2] = subSequence;
                if (true == (i5 != charSequence.length() && !charSequence.substring(i5 + (-1), i5).matches("[\\p{Punct}。]"))) {
                    str = "…";
                }
                charSequenceArr[3] = str;
                charSequenceArr[4] = "\"";
                i = dbsg.i(TextUtils.concat(charSequenceArr));
            }
        }
        if (!i.a()) {
            return dbpy.a;
        }
        CharSequence charSequence2 = (CharSequence) i.b();
        dnfg dnfgVar = docgVar.n;
        if (dnfgVar == null) {
            dnfgVar = dnfg.c;
        }
        dnfg dnfgVar2 = dnfgVar;
        Activity activity = (Activity) ((dxjd) bljtVar.a).a;
        bljt.a(activity, 1);
        dxio a = ((dxjh) bljtVar.b).a();
        bljt.a(a, 2);
        bljt.a(bwrsVar, 3);
        bljt.a(charSequence2, 4);
        bljt.a(dnfgVar2, 5);
        bljt.a(djckVar, 6);
        return dbsg.i(new bljs(activity, a, bwrsVar, charSequence2, dnfgVar2, djckVar));
    }

    @Override // defpackage.bliy
    public CharSequence a() {
        return this.d;
    }

    @Override // defpackage.bliy
    public CharSequence b() {
        return this.e;
    }

    @Override // defpackage.bliy
    public CharSequence c() {
        return this.e;
    }

    @Override // defpackage.bliy
    public jic d() {
        return this.f;
    }

    @Override // defpackage.bliy
    public Boolean e() {
        return false;
    }

    @Override // defpackage.bliy
    public Boolean f() {
        return false;
    }

    @Override // defpackage.bliy
    public cqkl g() {
        dbsg<String> i = this.c.g.size() == 0 ? dbpy.a : dbsg.i(this.c.g.get(0).i);
        bkpi a = this.a.a();
        bwrs<ilo> bwrsVar = this.b;
        drdk drdkVar = this.c.b;
        if (drdkVar == null) {
            drdkVar = drdk.c;
        }
        a.b(bwrsVar, dbsg.i(drdkVar), dbpy.a, blif.i(), false, i);
        return cqkl.a;
    }

    @Override // defpackage.bliy
    public cjtd h() {
        return this.g;
    }

    @Override // defpackage.bliy
    public dbsg<djck> i() {
        return dbsg.i(this.c);
    }
}
