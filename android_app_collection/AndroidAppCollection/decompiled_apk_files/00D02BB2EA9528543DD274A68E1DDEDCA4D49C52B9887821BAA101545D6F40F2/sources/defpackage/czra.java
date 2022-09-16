package defpackage;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
/* compiled from: PG */
/* renamed from: czra  reason: default package */
/* loaded from: classes5.dex */
public final class czra extends ex implements czqy {
    private final czqz ad = new czqz(this);

    @Override // defpackage.czqy
    public final /* bridge */ /* synthetic */ Activity a() {
        return super.J();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dubf dubfVar;
        final czqz czqzVar = this.ad;
        czqzVar.c = czqzVar.a.a();
        Bundle bundle2 = ((fd) czqzVar.a).o;
        czqzVar.p = bundle2.getString("TriggerId");
        czqzVar.n = bundle2.getInt("RequestCode", -1);
        czqzVar.b = (Answer) bundle2.getParcelable("Answer");
        czqzVar.l = bundle2.getBoolean("BottomSheet");
        czqzVar.o = bundle2.containsKey("logoResId") ? Integer.valueOf(bundle2.getInt("logoResId", 0)) : null;
        czqzVar.r = (cznv) bundle2.getSerializable("SurveyCompletionCode");
        cznw cznwVar = (cznw) bundle2.getSerializable("SurveyPromptCode");
        if (czov.b(dydx.b(czov.a))) {
            czqzVar.e = null;
            byte[] byteArray = bundle2.getByteArray("SurveyPayload");
            if (byteArray != null) {
                czqzVar.e = (dubf) czph.a(dubf.g, byteArray);
            }
            czqzVar.g = null;
            byte[] byteArray2 = bundle2.getByteArray("SurveySession");
            if (byteArray2 != null) {
                czqzVar.g = (duch) czph.a(duch.c, byteArray2);
            }
            if (czqzVar.p == null || (dubfVar = czqzVar.e) == null || dubfVar.e.size() == 0 || czqzVar.b == null || czqzVar.g == null) {
                return null;
            }
        } else {
            czqzVar.e = (dubf) czph.a(dubf.g, bundle2.getByteArray("SurveyPayload"));
            czqzVar.g = (duch) czph.a(duch.c, bundle2.getByteArray("SurveySession"));
        }
        ex exVar = (ex) czqzVar.a;
        if (exVar.c) {
            exVar.d.requestWindowFeature(1);
        }
        Context context = czqzVar.c;
        String str = czqzVar.p;
        duch duchVar = czqzVar.g;
        boolean b = czph.b(czqzVar.e);
        czqzVar.b.g = 2;
        new czoj(context, str, duchVar).a(czqzVar.b, b);
        czsi.a.a();
        czqzVar.i = layoutInflater.inflate(R.layout.survey_prompt_banner, viewGroup, false);
        czqzVar.j = (ViewGroup) czqzVar.i.findViewById(R.id.survey_prompt_banner_container);
        czox.a((ImageView) czqzVar.i.findViewById(R.id.survey_prompt_banner_logo), czqzVar.o);
        Answer answer = czqzVar.b;
        final String str2 = (answer == null || TextUtils.isEmpty(answer.b)) ? null : czqzVar.b.b;
        if (czov.a(dyed.b(czov.a)) && cznwVar == cznw.FIRST_CARD_MODAL) {
            czqzVar.f();
            return czqzVar.i;
        }
        duaz duazVar = czqzVar.e.a;
        if (duazVar == null) {
            duazVar = duaz.c;
        }
        if (duazVar.a) {
            czqzVar.m = false;
            View view = czqzVar.i;
            duaz duazVar2 = czqzVar.e.a;
            if (duazVar2 == null) {
                duazVar2 = duaz.c;
            }
            czqz.i(view, duazVar2.b);
            final czpj czpjVar = new czpj(czqzVar.c);
            czpjVar.setOnAcceptSurveyClickListener(new View.OnClickListener(czqzVar) { // from class: czqr
                private final czqz a;

                {
                    this.a = czqzVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    czqz czqzVar2 = this.a;
                    czqzVar2.b.e = true;
                    czqzVar2.h(czqzVar2.c, czqzVar2.p, czqzVar2.g, czph.b(czqzVar2.e));
                    czqzVar2.f();
                }
            });
            czpjVar.setOnDeclineSurveyClickListener(new View.OnClickListener(czqzVar) { // from class: czqs
                private final czqz a;

                {
                    this.a = czqzVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    czqz czqzVar2 = this.a;
                    czqzVar2.b.e = false;
                    czqzVar2.g(czqzVar2.c, czqzVar2.p, czqzVar2.g, czph.b(czqzVar2.e));
                    czqzVar2.h(czqzVar2.c, czqzVar2.p, czqzVar2.g, czph.b(czqzVar2.e));
                    czqzVar2.a.g();
                }
            });
            czqzVar.j.addView(czpjVar);
            ImageButton imageButton = (ImageButton) czqzVar.i.findViewById(R.id.survey_close_button);
            imageButton.setImageDrawable(czph.s(czqzVar.c));
            imageButton.setOnClickListener(new View.OnClickListener(czqzVar, czpjVar, str2) { // from class: czqt
                private final czqz a;
                private final czpj b;
                private final String c;

                {
                    this.a = czqzVar;
                    this.b = czpjVar;
                    this.c = str2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    czqz czqzVar2 = this.a;
                    czpj czpjVar2 = this.b;
                    String str3 = this.c;
                    czpb a = czpb.a();
                    czpjVar2.setOnAcceptSurveyClickListener(null);
                    czpjVar2.setOnDeclineSurveyClickListener(null);
                    czqzVar2.g(czqzVar2.c, czqzVar2.p, czqzVar2.g, czph.b(czqzVar2.e));
                    czqzVar2.a.g();
                    czpa.d(a, czqzVar2.c, str3);
                }
            });
        } else {
            czqzVar.m = true;
            dubq dubqVar = czqzVar.e.e.get(0);
            czqz.i(czqzVar.i, dubqVar.e.isEmpty() ? dubqVar.d : dubqVar.e);
            int a = dubp.a(dubqVar.g);
            if (a == 0) {
                a = 1;
            }
            int i = a - 2;
            if (i == 1) {
                czqzVar.f = new QuestionMetrics();
                czqzVar.f.a();
                final dubq dubqVar2 = czqzVar.e.e.get(0);
                final czsc czscVar = new czsc(czqzVar.c);
                czscVar.setOnAnswerSelectClickListener(new czsa(czqzVar, dubqVar2) { // from class: czql
                    private final czqz a;
                    private final dubq b;

                    {
                        this.a = czqzVar;
                        this.b = dubqVar2;
                    }

                    @Override // defpackage.czsa
                    public final void a(czsb czsbVar) {
                        czqz czqzVar2 = this.a;
                        dubq dubqVar3 = this.b;
                        czqzVar2.h = czsbVar;
                        if (czsbVar.c == 4) {
                            czqzVar2.d(true);
                        } else {
                            czqzVar2.a(dubqVar3);
                        }
                    }
                });
                czscVar.setUpSingleSelectView(dubqVar2.a == 4 ? (duck) dubqVar2.b : duck.c);
                czqzVar.j.addView(czscVar);
                czqzVar.c();
                czqzVar.e(new View.OnClickListener(czqzVar, dubqVar2) { // from class: czqm
                    private final czqz a;
                    private final dubq b;

                    {
                        this.a = czqzVar;
                        this.b = dubqVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.a.a(this.b);
                    }
                }, str2);
                ImageButton imageButton2 = (ImageButton) czqzVar.i.findViewById(R.id.survey_close_button);
                imageButton2.setImageDrawable(czph.s(czqzVar.c));
                imageButton2.setOnClickListener(new View.OnClickListener(czqzVar, czscVar, str2) { // from class: czqn
                    private final czqz a;
                    private final czsc b;
                    private final String c;

                    {
                        this.a = czqzVar;
                        this.b = czscVar;
                        this.c = str2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        czqz czqzVar2 = this.a;
                        czsc czscVar2 = this.b;
                        String str3 = this.c;
                        czpb a2 = czpb.a();
                        czscVar2.setOnAnswerSelectClickListener(null);
                        czqzVar2.g(czqzVar2.c, czqzVar2.p, czqzVar2.g, czph.b(czqzVar2.e));
                        czqzVar2.a.g();
                        czpa.d(a2, czqzVar2.c, str3);
                    }
                });
            } else if (i == 2) {
                czqzVar.f = new QuestionMetrics();
                czqzVar.f.a();
                final dubq dubqVar3 = czqzVar.e.e.get(0);
                final czpu czpuVar = new czpu(czqzVar.c);
                czpuVar.setOnAnswerSelectClickListener(new czpt(czqzVar) { // from class: czqu
                    private final czqz a;

                    {
                        this.a = czqzVar;
                    }

                    @Override // defpackage.czpt
                    public final void a(czps czpsVar) {
                        czqz czqzVar2 = this.a;
                        if (!czpsVar.a()) {
                            czqzVar2.d(false);
                            return;
                        }
                        czqzVar2.d = czpsVar;
                        czqzVar2.f.b();
                        czqzVar2.d(true);
                    }
                });
                czpuVar.setUpMultipleSelectView(dubqVar3.a == 5 ? (dubb) dubqVar3.b : dubb.b, null);
                czqzVar.j.addView(czpuVar);
                czqzVar.c();
                czqzVar.e(new View.OnClickListener(czqzVar, dubqVar3) { // from class: czqv
                    private final czqz a;
                    private final dubq b;

                    {
                        this.a = czqzVar;
                        this.b = dubqVar3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        dubb dubbVar;
                        czqz czqzVar2 = this.a;
                        dubq dubqVar4 = this.b;
                        czps czpsVar = czqzVar2.d;
                        duae bZ = duaq.d.bZ();
                        if (czqzVar2.f.c()) {
                            duaf bZ2 = duag.b.bZ();
                            if (dubqVar4.a == 5) {
                                dubbVar = (dubb) dubqVar4.b;
                            } else {
                                dubbVar = dubb.b;
                            }
                            dtzc dtzcVar = dubbVar.a;
                            if (dtzcVar == null) {
                                dtzcVar = dtzc.b;
                            }
                            dsrj<dtza> dsrjVar = dtzcVar.a;
                            int i2 = 0;
                            while (true) {
                                boolean[] zArr = czpsVar.b;
                                if (i2 >= zArr.length) {
                                    break;
                                }
                                if (zArr[i2]) {
                                    String str3 = dsrjVar.get(i2).c;
                                    int a2 = dtyy.a(dsrjVar.get(i2).a);
                                    int i3 = 4;
                                    if (a2 != 0 && a2 == 4 && !TextUtils.isEmpty(czpsVar.a)) {
                                        str3 = czpsVar.a;
                                    }
                                    duam bZ3 = duan.d.bZ();
                                    int i4 = dsrjVar.get(i2).b;
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    duan duanVar = (duan) bZ3.b;
                                    duanVar.b = i4;
                                    str3.getClass();
                                    duanVar.c = str3;
                                    int a3 = dtyy.a(dsrjVar.get(i2).a);
                                    if (a3 == 0) {
                                        a3 = 1;
                                    }
                                    int i5 = a3 - 2;
                                    if (i5 == 1) {
                                        i3 = 3;
                                    } else if (i5 != 2) {
                                        i3 = i5 != 3 ? 2 : 5;
                                    }
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    ((duan) bZ3.b).a = dual.a(i3);
                                    bZ2.a(bZ3.bK());
                                    czqzVar2.f.b();
                                }
                                int i6 = dubqVar4.c;
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                ((duaq) bZ.b).c = i6;
                                duag bK = bZ2.bK();
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                duaq duaqVar = (duaq) bZ.b;
                                bK.getClass();
                                duaqVar.b = bK;
                                duaqVar.a = 3;
                                i2++;
                            }
                        }
                        duaq bK2 = bZ.bK();
                        if (bK2 != null) {
                            czqzVar2.b.a = bK2;
                        }
                        czqzVar2.b();
                    }
                }, str2);
                ImageButton imageButton3 = (ImageButton) czqzVar.i.findViewById(R.id.survey_close_button);
                imageButton3.setImageDrawable(czph.s(czqzVar.c));
                imageButton3.setOnClickListener(new View.OnClickListener(czqzVar, czpuVar, str2) { // from class: czqw
                    private final czqz a;
                    private final czpu b;
                    private final String c;

                    {
                        this.a = czqzVar;
                        this.b = czpuVar;
                        this.c = str2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        czqz czqzVar2 = this.a;
                        czpu czpuVar2 = this.b;
                        String str3 = this.c;
                        czpb a2 = czpb.a();
                        czpuVar2.setOnAnswerSelectClickListener(null);
                        czqzVar2.g(czqzVar2.c, czqzVar2.p, czqzVar2.g, czph.b(czqzVar2.e));
                        czqzVar2.a.g();
                        czpa.d(a2, czqzVar2.c, str3);
                    }
                });
            } else if (i == 3) {
                czqzVar.f = new QuestionMetrics();
                czqzVar.f.a();
                final dubq dubqVar4 = czqzVar.e.e.get(0);
                final czro czroVar = new czro(czqzVar.c);
                czroVar.setUpRatingView(dubqVar4.a == 6 ? (dubt) dubqVar4.b : dubt.f);
                czroVar.setOnRatingClickListener(new czrn(czqzVar, dubqVar4) { // from class: czqj
                    private final czqz a;
                    private final dubq b;

                    {
                        this.a = czqzVar;
                        this.b = dubqVar4;
                    }

                    @Override // defpackage.czrn
                    public final void a(int i2) {
                        czqz czqzVar2 = this.a;
                        dubq dubqVar5 = this.b;
                        if (czqzVar2.a.a() == null) {
                            return;
                        }
                        duae bZ = duaq.d.bZ();
                        String num = Integer.toString(i2);
                        if (czqzVar2.f.c()) {
                            duam bZ2 = duan.d.bZ();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            duan duanVar = (duan) bZ2.b;
                            duanVar.b = i2;
                            num.getClass();
                            duanVar.c = num;
                            ((duan) bZ2.b).a = dual.a(3);
                            duan bK = bZ2.bK();
                            duaj bZ3 = duak.b.bZ();
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            bK.getClass();
                            ((duak) bZ3.b).a = bK;
                            duak bK2 = bZ3.bK();
                            int i3 = dubqVar5.c;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            duaq duaqVar = (duaq) bZ.b;
                            duaqVar.c = i3;
                            bK2.getClass();
                            duaqVar.b = bK2;
                            duaqVar.a = 4;
                            if (num != null) {
                                int i4 = czph.a;
                            }
                        }
                        duaq bK3 = bZ.bK();
                        if (bK3 != null) {
                            czqzVar2.b.a = bK3;
                        }
                        czqzVar2.b();
                    }
                });
                czqzVar.j.addView(czroVar);
                czqzVar.c();
                czqzVar.j.findViewById(R.id.survey_next).setVisibility(8);
                ImageButton imageButton4 = (ImageButton) czqzVar.i.findViewById(R.id.survey_close_button);
                imageButton4.setImageDrawable(czph.s(czqzVar.c));
                imageButton4.setOnClickListener(new View.OnClickListener(czqzVar, czroVar, str2) { // from class: czqk
                    private final czqz a;
                    private final czro b;
                    private final String c;

                    {
                        this.a = czqzVar;
                        this.b = czroVar;
                        this.c = str2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        czqz czqzVar2 = this.a;
                        czro czroVar2 = this.b;
                        String str3 = this.c;
                        czpb a2 = czpb.a();
                        czroVar2.setOnRatingClickListener(null);
                        czqzVar2.g(czqzVar2.c, czqzVar2.p, czqzVar2.g, czph.b(czqzVar2.e));
                        czqzVar2.a.g();
                        czpa.d(a2, czqzVar2.c, str3);
                    }
                });
            } else if (i == 4) {
                czqzVar.f = new QuestionMetrics();
                czqzVar.f.a();
                final dubq dubqVar5 = czqzVar.e.e.get(0);
                czqc czqcVar = new czqc(czqzVar.c);
                czqcVar.setUpOpenTextView(dubqVar5.a == 7 ? (dubd) dubqVar5.b : dubd.c);
                czqcVar.setOnOpenTextResponseListener(new czqb(czqzVar) { // from class: czqx
                    private final czqz a;

                    {
                        this.a = czqzVar;
                    }

                    @Override // defpackage.czqb
                    public final void a(String str3) {
                        this.a.q = str3;
                    }
                });
                czqzVar.j.addView(czqcVar);
                czqzVar.c();
                czqzVar.d(true);
                czqzVar.e(new View.OnClickListener(czqzVar, dubqVar5) { // from class: czqh
                    private final czqz a;
                    private final dubq b;

                    {
                        this.a = czqzVar;
                        this.b = dubqVar5;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        czqz czqzVar2 = this.a;
                        dubq dubqVar6 = this.b;
                        String str3 = czqzVar2.q;
                        duae bZ = duaq.d.bZ();
                        if (czqzVar2.f.c()) {
                            String e = dbsj.e(str3);
                            duah bZ2 = duai.b.bZ();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            e.getClass();
                            ((duai) bZ2.b).a = e;
                            duai bK = bZ2.bK();
                            int i2 = dubqVar6.c;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            duaq duaqVar = (duaq) bZ.b;
                            duaqVar.c = i2;
                            bK.getClass();
                            duaqVar.b = bK;
                            duaqVar.a = 5;
                        }
                        duaq bK2 = bZ.bK();
                        if (bK2 != null) {
                            czqzVar2.b.a = bK2;
                        }
                        czqzVar2.b();
                    }
                }, str2);
                ImageButton imageButton5 = (ImageButton) czqzVar.i.findViewById(R.id.survey_close_button);
                imageButton5.setImageDrawable(czph.s(czqzVar.c));
                imageButton5.setOnClickListener(new View.OnClickListener(czqzVar, str2) { // from class: czqi
                    private final czqz a;
                    private final String b;

                    {
                        this.a = czqzVar;
                        this.b = str2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        czqz czqzVar2 = this.a;
                        String str3 = this.b;
                        czpb a2 = czpb.a();
                        czqzVar2.g(czqzVar2.c, czqzVar2.p, czqzVar2.g, czph.b(czqzVar2.e));
                        czqzVar2.a.g();
                        czpa.d(a2, czqzVar2.c, str3);
                    }
                });
            }
        }
        czph.f(czqzVar.a.a(), (TextView) czqzVar.i.findViewById(R.id.survey_legal_text), str2, new czpg(czqzVar, str2) { // from class: czqq
            private final czqz a;
            private final String b;

            {
                this.a = czqzVar;
                this.b = str2;
            }

            @Override // defpackage.czpg
            public final void a() {
                czqz czqzVar2 = this.a;
                String str3 = this.b;
                czpb a2 = czpb.a();
                Context context2 = czqzVar2.c;
                if (context2 instanceof ff) {
                    gn g = ((ff) context2).g();
                    czsp czspVar = new czsp();
                    Bundle bundle3 = new Bundle(2);
                    bundle3.putString("EXTRA_ACCOUNT_NAME", str3);
                    bundle3.putBundle("EXTRA_PSD_BUNDLE", czph.h(czqzVar2.b.c));
                    czspVar.B(bundle3);
                    czspVar.e(g, czsp.ad);
                    g.aq();
                } else if (context2 instanceof Activity) {
                    FragmentTransaction beginTransaction = ((Activity) context2).getFragmentManager().beginTransaction();
                    czqf czqfVar = new czqf();
                    Bundle bundle4 = new Bundle(2);
                    bundle4.putString("EXTRA_ACCOUNT_NAME", str3);
                    bundle4.putBundle("EXTRA_PSD_BUNDLE", czph.h(czqzVar2.b.c));
                    czqfVar.setArguments(bundle4);
                    beginTransaction.add(czqfVar, czqf.a);
                    beginTransaction.commitAllowingStateLoss();
                }
                czpa.c(a2, czqzVar2.c, str3);
            }
        });
        czqzVar.i.setOnKeyListener(new View.OnKeyListener(czqzVar) { // from class: czqg
            private final czqz a;

            {
                this.a = czqzVar;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i2, KeyEvent keyEvent) {
                czqz czqzVar2 = this.a;
                if (i2 == 4) {
                    czqzVar2.g(czqzVar2.c, czqzVar2.p, czqzVar2.g, czph.b(czqzVar2.e));
                    czqzVar2.a.g();
                    return czqzVar2.m;
                }
                return false;
            }
        });
        czqzVar.i.setOnTouchListener(czqp.a);
        return czqzVar.i;
    }

    @Override // defpackage.fd
    public final void am() {
        if (!this.ad.k) {
            czsi.a.b();
        }
        super.am();
    }
}
