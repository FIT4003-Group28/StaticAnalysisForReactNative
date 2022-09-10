package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.SurveyMetadata;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import java.util.List;
/* compiled from: PG */
/* renamed from: acwr  reason: default package */
/* loaded from: classes2.dex */
public final class acwr implements czob {
    final /* synthetic */ eeu a;
    final /* synthetic */ ff b;
    final /* synthetic */ btlu c;
    final /* synthetic */ List d;
    final /* synthetic */ cjrc e;
    final /* synthetic */ acws f;
    final /* synthetic */ acwi g;

    public acwr(acws acwsVar, eeu eeuVar, acwi acwiVar, ff ffVar, btlu btluVar, List list, cjrc cjrcVar) {
        this.f = acwsVar;
        this.a = eeuVar;
        this.g = acwiVar;
        this.b = ffVar;
        this.c = btluVar;
        this.d = list;
        this.e = cjrcVar;
    }

    @Override // defpackage.czob
    public final void a(SurveyData surveyData) {
        boolean contains;
        boolean contains2;
        if (!((efh) this.a).b) {
            return;
        }
        acwi acwiVar = this.g;
        acwj acwjVar = acwiVar.a;
        dvun dvunVar = acwiVar.b;
        if (acwjVar.a.getEnableFeatureParameters().bm && !acwjVar.e.m(bvjk.aB, false)) {
            int i = acwjVar.a.getEnableFeatureParameters().bn;
            if (i > 0 && acwjVar.e.s(bvjk.dE, 0) >= i) {
                acwjVar.e.W(bvjk.dE, 0);
            } else if (!acwjVar.f.a(acwjVar.g) && !acwjVar.e.m(bvjk.aB, false)) {
                acwjVar.e.ao(bvjk.dE);
                ckco ckcoVar = (ckco) acwjVar.d.a(ckfl.b);
                dvum b = dvum.b(dvunVar.g);
                if (b == null) {
                    b = dvum.NEVER;
                }
                ckcoVar.a(b.at);
                return;
            }
        }
        cznu cznuVar = new cznu(this.b, surveyData);
        cznuVar.c = this.c.s();
        this.f.e.a();
        Integer num = 340;
        if (num.intValue() <= 0) {
            throw new IllegalArgumentException("The max prompt width must be a positive value.");
        }
        cznuVar.b = num;
        cznuVar.h = this.f.f;
        List<mx<String, String>> list = this.d;
        if (list != null) {
            cznuVar.e = list;
        }
        cznx cznxVar = new cznx(cznuVar.a, cznuVar.b, cznuVar.h, cznuVar.c, cznuVar.d, cznuVar.e, cznuVar.f, cznuVar.g);
        czod czodVar = czod.a;
        czpb a = czpb.a();
        synchronized (czod.b) {
            try {
                dtul bZ = dtup.f.bZ();
                Integer num2 = cznxVar.b;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dtup dtupVar = (dtup) bZ.b;
                    dtupVar.a |= 1;
                    dtupVar.b = intValue;
                }
                if (czov.a(dyed.b(czov.a))) {
                    cznv cznvVar = cznxVar.g;
                    if (cznvVar != null) {
                        cznw cznwVar = cznw.FIRST_CARD_MODAL;
                        int ordinal = cznvVar.ordinal();
                        int i2 = ordinal != 0 ? ordinal != 1 ? 0 : 4 : 3;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dtup dtupVar2 = (dtup) bZ.b;
                        dtupVar2.d = dtum.a(i2);
                        dtupVar2.a |= 2;
                    }
                    cznw cznwVar2 = cznxVar.f;
                    if (cznwVar2 != null) {
                        cznv cznvVar2 = cznv.CARD;
                        int ordinal2 = cznwVar2.ordinal();
                        int i3 = ordinal2 != 0 ? ordinal2 != 1 ? 0 : 3 : 4;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dtup dtupVar3 = (dtup) bZ.b;
                        dtupVar3.e = dtuo.a(i3);
                        dtupVar3.a |= 4;
                    }
                }
                if (czod.b.get()) {
                    int i4 = czph.a;
                    czodVar.c();
                    bZ.a(dtun.SURVEY_ALREADY_RUNNING);
                    czodVar.a(bZ.bK(), a, cznxVar.a);
                } else {
                    SurveyData surveyData2 = cznxVar.d;
                    czodVar.c = (SurveyDataImpl) surveyData2;
                    czodVar.j = cznxVar.h;
                    Activity activity = cznxVar.a;
                    cqat cqatVar = czodVar.g;
                    if (czph.t(((SurveyDataImpl) surveyData2).f)) {
                        czodVar.c();
                        bZ.a(dtun.SURVEY_EXPIRED);
                        czodVar.a(bZ.bK(), a, cznxVar.a);
                    } else {
                        activity.getPackageName();
                        try {
                            if (czodVar.i > ((SurveyDataImpl) cznxVar.d).f) {
                                czov.a(dyeg.a.a().a(czov.a));
                                czodVar.c();
                                bZ.a(dtun.SURVEY_EXPIRED);
                                czodVar.a(bZ.bK(), a, cznxVar.a);
                            } else if (activity.isFinishing()) {
                                czodVar.c();
                                bZ.a(dtun.CLIENT_ACTIVITY_WAS_FINISHING);
                                czodVar.a(bZ.bK(), a, cznxVar.a);
                            } else if (activity.isDestroyed()) {
                                czodVar.c();
                                bZ.a(dtun.CLIENT_ACTIVITY_WAS_DESTROYED);
                                czodVar.a(bZ.bK(), a, cznxVar.a);
                            } else {
                                SurveyDataImpl surveyDataImpl = czodVar.c;
                                dubf dubfVar = surveyDataImpl.c;
                                if (dubfVar != null) {
                                    if (dubfVar.e.size() == 0) {
                                        if (String.valueOf(surveyDataImpl.a).length() == 0) {
                                            new String("Survey contains no questions. Survey trigger id: ");
                                        }
                                        if (!TextUtils.isEmpty(surveyDataImpl.e) && String.valueOf(surveyDataImpl.e).length() == 0) {
                                            new String("No survey available reason: ");
                                        }
                                        dcdc<String> dcdcVar = surveyDataImpl.g;
                                        if (dcdcVar != null && !dcdcVar.isEmpty()) {
                                            String valueOf = String.valueOf(surveyDataImpl.g);
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                                            sb.append("Backend errors are: ");
                                            sb.append(valueOf);
                                            sb.toString();
                                        }
                                    } else {
                                        if (czov.a(dyed.b(czov.a))) {
                                            cznv cznvVar3 = cznxVar.g;
                                            dtzt dtztVar = czodVar.c.c.b;
                                            if (dtztVar == null) {
                                                dtztVar = dtzt.f;
                                            }
                                            dsrh dsrhVar = new dsrh(dtztVar.d, dtzt.e);
                                            if (cznvVar3 != null) {
                                                cznw cznwVar3 = cznw.FIRST_CARD_MODAL;
                                                int ordinal3 = cznvVar3.ordinal();
                                                if (ordinal3 == 0) {
                                                    contains = dsrhVar.contains(dtzs.COMPLETION_STYLE_CARD);
                                                } else if (ordinal3 == 1) {
                                                    contains = dsrhVar.contains(dtzs.COMPLETION_STYLE_TOAST);
                                                }
                                                if (contains) {
                                                    cznw cznwVar4 = cznxVar.f;
                                                    dtzz dtzzVar = czodVar.c.c.c;
                                                    if (dtzzVar == null) {
                                                        dtzzVar = dtzz.e;
                                                    }
                                                    dsrh dsrhVar2 = new dsrh(dtzzVar.c, dtzz.d);
                                                    if (cznwVar4 != null) {
                                                        int ordinal4 = cznwVar4.ordinal();
                                                        if (ordinal4 == 0) {
                                                            contains2 = dsrhVar2.contains(dtzy.PROMPT_STYLE_FIRST_CARD_MODAL);
                                                        } else if (ordinal4 == 1) {
                                                            contains2 = dsrhVar2.contains(dtzy.PROMPT_STYLE_FIRST_CARD_NON_MODAL);
                                                        }
                                                        if (contains2) {
                                                        }
                                                    }
                                                    czodVar.c();
                                                    bZ.a(dtun.INVALID_PROMPT_STYLE);
                                                    czodVar.a(bZ.bK(), a, cznxVar.a);
                                                }
                                            }
                                            czodVar.c();
                                            bZ.a(dtun.INVALID_COMPLETION_STYLE);
                                            czodVar.a(bZ.bK(), a, cznxVar.a);
                                        }
                                        czod.b();
                                        Account account = cznxVar.c;
                                        czodVar.d = account == null ? "" : account.name;
                                        czodVar.e = cznxVar.e;
                                        dubf dubfVar2 = czodVar.c.c;
                                        Answer answer = new Answer();
                                        answer.b = czodVar.d;
                                        List<mx<String, String>> list2 = czodVar.e;
                                        if (list2 != null) {
                                            answer.c = czph.k(list2, activity);
                                        }
                                        answer.d = czodVar.f;
                                        answer.f = czodVar.h;
                                        gn g = ((ff) activity).g();
                                        if (g.H("com.google.android.libraries.surveys.internal.PromptDialogFragment") == null) {
                                            SurveyDataImpl surveyDataImpl2 = czodVar.c;
                                            String str = surveyDataImpl2.a;
                                            duch duchVar = surveyDataImpl2.d;
                                            cznw cznwVar5 = cznw.FIRST_CARD_MODAL;
                                            cznv cznvVar4 = cznv.CARD;
                                            dtzz dtzzVar2 = dubfVar2.c;
                                            if (dtzzVar2 == null) {
                                                dtzzVar2 = dtzz.e;
                                            }
                                            int i5 = dtzzVar2.b;
                                            int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? 0 : 5 : 4 : 3 : 2;
                                            if (i6 == 0) {
                                                i6 = 1;
                                            }
                                            int i7 = i6 - 2;
                                            Integer valueOf2 = i7 != 2 ? i7 != 3 ? null : Integer.valueOf((int) R.drawable.google_g_logo) : Integer.valueOf((int) R.drawable.google_g_logo);
                                            cznv cznvVar5 = cznxVar.g;
                                            cznw cznwVar6 = cznxVar.f;
                                            czra czraVar = new czra();
                                            Bundle bundle = new Bundle();
                                            bundle.putString("TriggerId", str);
                                            bundle.putByteArray("SurveyPayload", dubfVar2.bS());
                                            bundle.putByteArray("SurveySession", duchVar.bS());
                                            bundle.putParcelable("Answer", answer);
                                            bundle.putBoolean("BottomSheet", false);
                                            if (valueOf2 != null) {
                                                bundle.putInt("logoResId", valueOf2.intValue());
                                            }
                                            bundle.putSerializable("SurveyCompletionCode", cznvVar5);
                                            bundle.putSerializable("SurveyPromptCode", cznwVar6);
                                            czraVar.B(bundle);
                                            gz b2 = g.b();
                                            b2.C(16908290, czraVar, "com.google.android.libraries.surveys.internal.PromptDialogFragment");
                                            b2.r();
                                        }
                                        czodVar.a(bZ.bK(), a, cznxVar.a);
                                    }
                                }
                                czodVar.c();
                                bZ.a(dtun.INVALID_SURVEY_PAYLOAD);
                                czodVar.a(bZ.bK(), a, cznxVar.a);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                SurveyMetadata a2 = surveyData.a();
                String str2 = a2 == null ? null : a2.b;
                if (a2 == null || str2 == null) {
                    return;
                }
                this.f.b.y(str2, a2.a, a2.c, this.e);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
