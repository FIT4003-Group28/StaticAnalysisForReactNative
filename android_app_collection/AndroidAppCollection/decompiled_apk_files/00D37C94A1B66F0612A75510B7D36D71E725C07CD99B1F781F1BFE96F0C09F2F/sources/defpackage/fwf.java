package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsHorizontalSurvey;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;
import com.google.android.apps.youtube.app.common.ui.bottomui.KeyPressAwareEditText;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fwf  reason: default package */
/* loaded from: classes3.dex */
public final class fwf implements fuf {
    public final aafo a;
    final HatsContainer b;
    final YouTubeTextView c;
    final HatsSurvey d;
    final HatsHorizontalSurvey e;
    public final Map f = new HashMap();
    public final ayom g;
    ftp h;
    private final ajxz i;

    public fwf(ajxz ajxzVar, aafo aafoVar, ayom ayomVar, HatsContainer hatsContainer) {
        this.i = ajxzVar;
        this.a = aafoVar;
        this.b = hatsContainer;
        fuh a = hatsContainer.a();
        if (a.a == null) {
            a.a = (YouTubeTextView) a.a(R.layout.hats_prompt);
        }
        this.c = a.a;
        this.e = hatsContainer.a().b();
        fuh a2 = hatsContainer.a();
        if (a2.b == null) {
            a2.b = (HatsSurvey) a2.a(R.layout.hats_survey);
        }
        this.d = a2.b;
        this.g = ayomVar;
    }

    private static final boolean e(fvp fvpVar) {
        if (fvpVar.d == 1) {
            avds avdsVar = fvpVar.f.c;
            if (avdsVar == null) {
                avdsVar = avds.a;
            }
            int az = awwc.az(avdsVar.b);
            if (az == 0 || az != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.fuf
    public final /* bridge */ /* synthetic */ View a(fue fueVar, ftp ftpVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        final fvp fvpVar = (fvp) fueVar;
        this.h = ftpVar;
        if (fvpVar.d != 3) {
            this.b.d(new View.OnClickListener() { // from class: fvw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fwf.this.b(fvpVar);
                }
            });
        }
        if (e(fvpVar)) {
            zag.m(this.c, fvpVar.i);
            this.d.d(fvpVar.i);
        } else {
            this.e.d(fvpVar.i);
        }
        int i = fvpVar.d;
        final apoj apojVar = null;
        if (i == 1) {
            avdq avdqVar = fvpVar.f;
            boolean e = e(fvpVar);
            HatsSurvey hatsSurvey = e ? this.d : this.e;
            YouTubeTextView youTubeTextView = e ? this.c : null;
            hatsSurvey.f(null, null);
            aopu<avdr> aopuVar = avdqVar.j;
            ViewGroup viewGroup = hatsSurvey.d;
            ArrayList arrayList = new ArrayList(aopuVar.size());
            for (avdr avdrVar : aopuVar) {
                if (avdrVar.b == 84469192) {
                    final avdp avdpVar = (avdp) avdrVar.c;
                    View f = hxb.f(viewGroup.getContext(), viewGroup, e);
                    hxb.i(f, avdpVar, this.i, new View.OnClickListener() { // from class: fvy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            fwf fwfVar = fwf.this;
                            fvp fvpVar2 = fvpVar;
                            avdp avdpVar2 = avdpVar;
                            fum fumVar = fvpVar2.m;
                            if (fumVar != null) {
                                apzg apzgVar = avdpVar2.e;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                                fumVar.a(apzgVar);
                            }
                            fwfVar.c(1);
                        }
                    });
                    arrayList.add(f);
                }
            }
            hatsSurvey.e(arrayList);
            if (!e) {
                this.e.b(hxb.h(avdqVar.j));
                this.e.a(hxb.g(avdqVar.j));
            }
            this.b.f(hatsSurvey);
            this.b.e(youTubeTextView);
        } else if (i == 2) {
            avdh avdhVar = fvpVar.g;
            aopu<avdi> aopuVar2 = avdhVar.g;
            ViewGroup viewGroup2 = this.d.d;
            this.f.clear();
            LayoutInflater from = LayoutInflater.from(viewGroup2.getContext());
            ArrayList arrayList2 = new ArrayList(aopuVar2.size());
            for (avdi avdiVar : aopuVar2) {
                if ((avdiVar.b & 1) != 0) {
                    avdg avdgVar = avdiVar.c;
                    if (avdgVar == null) {
                        avdgVar = avdg.a;
                    }
                    apzg apzgVar = avdgVar.d;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    final fwd fwdVar = new fwd(apzgVar, avdgVar.f);
                    CheckBox checkBox = (CheckBox) from.inflate(R.layout.hats_checkbox_survey_option, viewGroup2, false);
                    if ((avdgVar.b & 1) != 0) {
                        aragVar = avdgVar.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    checkBox.setText(ajgl.b(aragVar));
                    checkBox.setOnClickListener(new View.OnClickListener() { // from class: fvz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            fwf fwfVar = fwf.this;
                            fwd fwdVar2 = fwdVar;
                            for (Map.Entry entry : fwfVar.f.entrySet()) {
                                CheckBox checkBox2 = (CheckBox) entry.getValue();
                                if (!view.equals(checkBox2) && (fwdVar2.b || ((fwd) entry.getKey()).b)) {
                                    checkBox2.setChecked(false);
                                }
                            }
                        }
                    });
                    arrayList2.add(checkBox);
                    this.f.put(fwdVar, checkBox);
                }
            }
            this.d.e(arrayList2);
            apok apokVar = avdhVar.i;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) != 0) {
                apok apokVar2 = avdhVar.i;
                if (apokVar2 == null) {
                    apokVar2 = apok.a;
                }
                apojVar = apokVar2.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
            }
            this.d.f(apojVar, new View.OnClickListener() { // from class: fvx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fwf fwfVar = fwf.this;
                    fvp fvpVar2 = fvpVar;
                    apoj apojVar2 = apojVar;
                    fum fumVar = fvpVar2.m;
                    if (fumVar != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Map.Entry entry : fwfVar.f.entrySet()) {
                            if (((CheckBox) entry.getValue()).isChecked()) {
                                arrayList3.add(((fwd) entry.getKey()).a);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            return;
                        }
                        if (!arrayList3.isEmpty()) {
                            apzg apzgVar2 = (apzg) arrayList3.get(0);
                            HashMap hashMap = null;
                            if (apzgVar2.qn(FeedbackEndpointOuterClass.feedbackEndpoint)) {
                                fumVar.b.q(fumVar.a, apzgVar2);
                                if (arrayList3.size() > 1) {
                                    hashMap = new HashMap();
                                    hashMap.putAll(fumVar.b.c);
                                    ArrayList arrayList4 = new ArrayList(arrayList3.size() - 1);
                                    for (int i2 = 1; i2 < arrayList3.size(); i2++) {
                                        arrayList4.add(((aqyh) ((apzg) arrayList3.get(i2)).qm(FeedbackEndpointOuterClass.feedbackEndpoint)).e);
                                    }
                                    hashMap.put("feedback_merge_token", true);
                                    hashMap.put("feedback_token", arrayList4);
                                }
                            }
                            fumVar.b.a.c(apzgVar2, hashMap);
                        }
                        if ((apojVar2.b & 8192) != 0) {
                            aafo aafoVar = fwfVar.a;
                            apzg apzgVar3 = apojVar2.n;
                            if (apzgVar3 == null) {
                                apzgVar3 = apzg.a;
                            }
                            aafoVar.c(apzgVar3, actk.f(fvpVar2));
                        }
                        if ((apojVar2.b & 16384) != 0) {
                            aafo aafoVar2 = fwfVar.a;
                            apzg apzgVar4 = apojVar2.o;
                            if (apzgVar4 == null) {
                                apzgVar4 = apzg.a;
                            }
                            aafoVar2.c(apzgVar4, actk.f(fvpVar2));
                        }
                        fwfVar.c(1);
                    }
                }
            });
            this.b.f(this.d);
            this.b.e(this.c);
        } else if (i == 3) {
            avdj avdjVar = fvpVar.h;
            final ViewGroup viewGroup3 = this.d.d;
            View inflate = LayoutInflater.from(viewGroup3.getContext()).inflate(R.layout.hats_free_text_survey_option, viewGroup3, false);
            TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.input_layout);
            KeyPressAwareEditText keyPressAwareEditText = (KeyPressAwareEditText) textInputLayout.findViewById(R.id.input);
            if ((2 & avdjVar.b) != 0) {
                aragVar2 = avdjVar.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            keyPressAwareEditText.setHint(ajgl.b(aragVar2));
            keyPressAwareEditText.setOnTouchListener(new View.OnTouchListener() { // from class: fwb
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    fwf.this.g.c(fwe.b(true));
                    view.requestFocus();
                    zag.p(view);
                    return false;
                }
            });
            keyPressAwareEditText.a = new fvs(this);
            keyPressAwareEditText.addTextChangedListener(new fwc(this, textInputLayout));
            final amup k = amup.k("ShowSystemInfoDialogCommandResolver.SHOW_SYSTEM_INFO_DIALOG_COMMAND_ORIGIN_SURVEY_KEY", fvpVar.e);
            final YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.disclaimer);
            youTubeTextView2.c();
            if ((avdjVar.b & 4) != 0) {
                aragVar3 = avdjVar.e;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            youTubeTextView2.setText(ajgl.c(aragVar3, new ajgf() { // from class: fvt
                @Override // defpackage.ajgf
                public final ClickableSpan a(apzg apzgVar2) {
                    fwf fwfVar = fwf.this;
                    return aaft.a(false).a(fwfVar.a, k, apzgVar2);
                }
            }));
            keyPressAwareEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: fwa
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    zag.o(YouTubeTextView.this, false);
                }
            });
            HatsSurvey hatsSurvey2 = this.d;
            hatsSurvey2.d.removeAllViews();
            hatsSurvey2.d.addView(inflate);
            final TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.input_layout);
            final EditText editText = (EditText) textInputLayout2.findViewById(R.id.input);
            apok apokVar3 = avdjVar.g;
            if (apokVar3 == null) {
                apokVar3 = apok.a;
            }
            if ((apokVar3.b & 1) != 0) {
                apok apokVar4 = avdjVar.g;
                if (apokVar4 == null) {
                    apokVar4 = apok.a;
                }
                apojVar = apokVar4.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
            }
            final Runnable runnable = new Runnable() { // from class: fvu
                @Override // java.lang.Runnable
                public final void run() {
                    fwf fwfVar = fwf.this;
                    apoj apojVar2 = apojVar;
                    EditText editText2 = editText;
                    if ((apojVar2.b & 32768) != 0) {
                        amup k2 = amup.k("SilentSubmitUserFeedbackCommandResolver.DESCRIPTION_KEY", editText2.getText().toString());
                        aafo aafoVar = fwfVar.a;
                        apzg apzgVar2 = apojVar2.p;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar.d(amuk.r(apzgVar2), k2);
                    }
                    zag.i(editText2);
                    fwfVar.c(1);
                    fwfVar.g.c(fwe.b(false));
                }
            };
            this.d.f(apojVar, new iem(runnable, 1));
            this.d.g(false);
            editText.setImeOptions(4);
            editText.setHorizontallyScrolling(false);
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: fvr
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                    EditText editText2 = editText;
                    TextInputLayout textInputLayout3 = textInputLayout2;
                    Runnable runnable2 = runnable;
                    if (i2 == 4 && editText2.getText().length() <= textInputLayout3.c) {
                        runnable2.run();
                        return true;
                    }
                    return false;
                }
            });
            this.b.d(new View.OnClickListener() { // from class: fvv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final fwf fwfVar = fwf.this;
                    final EditText editText2 = editText;
                    ViewGroup viewGroup4 = viewGroup3;
                    final fvp fvpVar2 = fvpVar;
                    if (editText2.getText().length() > 0) {
                        new AlertDialog.Builder(viewGroup4.getContext()).setMessage(R.string.hats_free_text_dismiss_dialog).setCancelable(false).setPositiveButton(R.string.hats_free_text_confirm_dismiss, new DialogInterface.OnClickListener() { // from class: fvq
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                fwf.this.d(editText2, fvpVar2);
                            }
                        }).setNegativeButton(R.string.hats_free_text_cancel_dismiss, gzj.b).create().show();
                    } else {
                        fwfVar.d(editText2, fvpVar2);
                    }
                }
            });
            this.b.f(this.d);
            this.b.e(this.c);
        } else {
            throw new AssertionError();
        }
        HatsContainer hatsContainer = this.b;
        hatsContainer.g = true;
        hatsContainer.c();
        return this.b;
    }

    public final void b(fvp fvpVar) {
        fum fumVar = fvpVar.m;
        if (fumVar != null) {
            fumVar.a(fvpVar.k);
        }
        c(0);
        this.g.c(fwe.b(false));
    }

    public final void c(int i) {
        this.f.clear();
        ftp ftpVar = this.h;
        if (ftpVar != null) {
            ftpVar.a(i);
            this.h = null;
        }
    }

    public final void d(View view, fvp fvpVar) {
        b(fvpVar);
        if (view != null) {
            zag.i(view);
        }
    }
}
