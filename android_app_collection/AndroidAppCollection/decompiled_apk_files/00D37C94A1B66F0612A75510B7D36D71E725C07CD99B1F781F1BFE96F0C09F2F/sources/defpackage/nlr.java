package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: nlr  reason: default package */
/* loaded from: classes3.dex */
public final class nlr extends nkg implements frp {
    public final Activity d;
    public final afvn e;
    public final afwc f;
    public fkz g;
    public ViewGroup h;
    public Button i;
    public long j;
    public int k;
    private final Context l;
    private final ajmy m;
    private final aafo n;
    private final acti o;
    private final nnu p;
    private final frr q;
    private aqnb r;
    private flf s;
    private flg t;
    private flh u;
    private akbj v;
    private ViewGroup w;
    private YouTubeTextView x;
    private fle y;

    public nlr(Context context, azqb azqbVar, Activity activity, ajmy ajmyVar, aafo aafoVar, acti actiVar, afvn afvnVar, afwc afwcVar, frr frrVar, aadd aaddVar) {
        super(actiVar, aaddVar);
        this.l = context;
        nnu nnuVar = (nnu) azqbVar.get();
        this.p = nnuVar;
        this.d = activity;
        this.m = ajmyVar;
        this.n = aafoVar;
        this.o = actiVar;
        this.e = afvnVar;
        this.f = afwcVar;
        this.q = frrVar;
        nnuVar.h = actiVar;
        this.k = 1;
    }

    private final void e(ViewGroup viewGroup, String str) {
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap;
        arag aragVar;
        this.h = (ViewGroup) viewGroup.findViewById(R.id.scroll_view);
        fle fleVar = new fle((ViewGroup) this.h.findViewById(R.id.campaign_group), false, this.m);
        this.y = fleVar;
        fleVar.a(this.r);
        flg flgVar = new flg(this.l, this.n, (ViewGroup) this.h.findViewById(R.id.nonprofit_group));
        this.t = flgVar;
        aqnb aqnbVar = this.r;
        YouTubeTextView youTubeTextView = flgVar.c;
        arag aragVar2 = aqnbVar.m;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(youTubeTextView, ajgl.b(aragVar2));
        flgVar.d.c();
        arag aragVar3 = aqnbVar.n;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        int size = aragVar3.c.size();
        YouTubeTextView youTubeTextView2 = flgVar.d;
        arag aragVar4 = aqnbVar.n;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        if (aragVar4 == null) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(aafv.a(aragVar4, flgVar.b, false));
            if (spannableStringBuilder.length() != 0 && size > 1) {
                int length = spannableStringBuilder.length();
                int length2 = spannableStringBuilder.length();
                String valueOf = String.valueOf(spannableStringBuilder.subSequence(spannableStringBuilder.length() - 1, spannableStringBuilder.length()));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
                sb.append(valueOf);
                sb.append("  ");
                spannableStringBuilder.replace(length - 1, length2, (CharSequence) sb.toString());
                Context context = flgVar.a;
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131232626);
                Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), Math.max(flgVar.d.getLineHeight(), decodeResource.getHeight()), Bitmap.Config.ARGB_8888);
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(zhn.j(flgVar.a, R.attr.ytCallToAction).orElse(0), PorterDuff.Mode.SRC_IN));
                new Canvas(createBitmap).drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                spannableStringBuilder.setSpan(new ImageSpan(context, createBitmap), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            }
        }
        zag.m(youTubeTextView2, spannableStringBuilder);
        Button button = (Button) viewGroup.findViewById(R.id.donation_button);
        this.i = button;
        zag.k(button, button.getBackground());
        this.v = new akbj(this.n, new ajsk(), this.i);
        apok apokVar = this.r.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = this.r.f;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if (str != null) {
                hashMap = new HashMap();
                hashMap.put("engagement_panel_id_key", str);
            } else {
                hashMap = null;
            }
            Button button2 = this.i;
            if ((apojVar.b & 256) != 0) {
                aragVar = apojVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(button2, ajgl.b(aragVar));
            this.v.a(apojVar, this.a, hashMap);
        }
        this.o.u(new acte(this.r.z), null);
    }

    @Override // defpackage.nmc
    public final void A(apzg apzgVar) {
    }

    @Override // defpackage.nmc
    public final void C(nlz nlzVar) {
    }

    @Override // defpackage.nmc
    public final nlx b() {
        return this.p;
    }

    public final void c() {
        apok apokVar = this.r.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = this.r.f;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            apzg apzgVar = apojVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (!apzgVar.qn(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
                return;
            }
            aopa mo52toBuilder = ((YpcGetCartEndpoint$YPCGetCartEndpoint) apzgVar.qm(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).mo52toBuilder();
            long j = this.j;
            mo52toBuilder.copyOnWrite();
            YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) mo52toBuilder.instance;
            ypcGetCartEndpoint$YPCGetCartEndpoint.b |= 1024;
            ypcGetCartEndpoint$YPCGetCartEndpoint.k = j;
            int i = this.k;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 1 || i2 == 2) {
                    aopa createBuilder = avka.a.createBuilder();
                    aopa createBuilder2 = avjz.a.createBuilder();
                    boolean z = this.k == 2;
                    createBuilder2.copyOnWrite();
                    avjz avjzVar = (avjz) createBuilder2.instance;
                    avjzVar.b |= 2;
                    avjzVar.c = z;
                    createBuilder.copyOnWrite();
                    avka avkaVar = (avka) createBuilder.instance;
                    avjz avjzVar2 = (avjz) createBuilder2.mo39build();
                    avjzVar2.getClass();
                    avkaVar.d = avjzVar2;
                    avkaVar.b = 2 | avkaVar.b;
                    mo52toBuilder.copyOnWrite();
                    YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint2 = (YpcGetCartEndpoint$YPCGetCartEndpoint) mo52toBuilder.instance;
                    avka avkaVar2 = (avka) createBuilder.mo39build();
                    avkaVar2.getClass();
                    ypcGetCartEndpoint$YPCGetCartEndpoint2.l = avkaVar2;
                    ypcGetCartEndpoint$YPCGetCartEndpoint2.b |= 2048;
                }
                aafo aafoVar = this.n;
                aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
                aopcVar.e(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, (YpcGetCartEndpoint$YPCGetCartEndpoint) mo52toBuilder.mo39build());
                apzg apzgVar2 = (apzg) aopcVar.mo39build();
                apok apokVar3 = this.r.f;
                if (apokVar3 == null) {
                    apokVar3 = apok.a;
                }
                apoj apojVar2 = apokVar3.c;
                if (apojVar2 == null) {
                    apojVar2 = apoj.a;
                }
                aafoVar.c(apzgVar2, actk.h(apojVar2, true));
                return;
            }
            throw null;
        }
    }

    public final void d() {
        this.h.post(new Runnable() { // from class: nlp
            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup viewGroup = nlr.this.h;
                viewGroup.scrollTo(0, viewGroup.getBottom());
            }
        });
    }

    @Override // defpackage.frp
    public final void f(String str, aqnb aqnbVar) {
        aqnb aqnbVar2 = this.r;
        if (aqnbVar2 == null || !aqnbVar2.y.equals(str)) {
            return;
        }
        this.u.a(aqnbVar);
    }

    @Override // defpackage.nmc
    public final void n() {
    }

    @Override // defpackage.nmc
    public final void o(apzg apzgVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)).getClass();
        aqvq aqvqVar = this.b;
        if (aqvqVar == null) {
            return;
        }
        String d = ntr.d(aqvqVar);
        if ("donation_shelf".equals(d)) {
            aqnb aqnbVar = this.r;
            LayoutInflater from = LayoutInflater.from(this.l);
            ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.donation_engagement_panel, (ViewGroup) null, false);
            this.w = viewGroup;
            e(viewGroup, "donation_shelf");
            flh flhVar = new flh(this.l, (ViewGroup) this.w.findViewById(R.id.progress_group), this.n);
            this.u = flhVar;
            flhVar.a(aqnbVar);
            flf flfVar = new flf((ViewGroup) this.w.findViewById(R.id.creator_messages_container), from, this.m);
            this.s = flfVar;
            for (int i = 0; i < aqnbVar.p.size(); i++) {
                ViewGroup viewGroup2 = (ViewGroup) flfVar.a.getChildAt(i);
                if (viewGroup2 == null) {
                    viewGroup2 = (ViewGroup) flfVar.b.inflate(R.layout.donation_creator_message, flfVar.a, false);
                    flfVar.a.addView(viewGroup2);
                }
                fle fleVar = (fle) flfVar.a.getTag();
                if (fleVar == null) {
                    fleVar = new fle(flfVar.c, viewGroup2);
                    viewGroup2.setTag(fleVar);
                }
                aqmz aqmzVar = (aqmz) aqnbVar.p.get(i);
                if ((aqmzVar.b & 1) == 0) {
                    fleVar.b.setVisibility(8);
                } else {
                    fleVar.b.setVisibility(0);
                    ajmy ajmyVar = fleVar.a;
                    ImageView imageView = fleVar.b;
                    avhn avhnVar = aqmzVar.c;
                    if (avhnVar == null) {
                        avhnVar = avhn.a;
                    }
                    ajmyVar.h(imageView, avhnVar);
                }
                YouTubeTextView youTubeTextView = fleVar.c;
                if ((aqmzVar.b & 2) != 0) {
                    aragVar2 = aqmzVar.d;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                } else {
                    aragVar2 = null;
                }
                zag.m(youTubeTextView, ajgl.b(aragVar2));
                YouTubeTextView youTubeTextView2 = fleVar.d;
                if ((aqmzVar.b & 4) != 0) {
                    aragVar3 = aqmzVar.e;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                zag.m(youTubeTextView2, ajgl.b(aragVar3));
            }
            int childCount = flfVar.a.getChildCount() - aqnbVar.p.size();
            if (childCount > 0) {
                flfVar.a.removeViews(aqnbVar.p.size(), childCount);
            }
            if (aqnbVar.p.size() > 0) {
                flfVar.a.setVisibility(0);
            } else {
                flfVar.a.setVisibility(8);
            }
            YouTubeTextView youTubeTextView3 = (YouTubeTextView) this.w.findViewById(R.id.nonprofit_description_view);
            this.x = youTubeTextView3;
            arag aragVar4 = aqnbVar.o;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            zag.m(youTubeTextView3, ajgl.b(aragVar4));
            this.q.c(aqnbVar.y, this);
        } else if ("donation_amount_picker".equals(d)) {
            aqnb aqnbVar2 = this.r;
            ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(this.l).inflate(R.layout.donation_amount_picker, (ViewGroup) null, false);
            this.w = viewGroup3;
            e(viewGroup3, null);
            if ((aqnbVar2.b & 256) != 0) {
                this.i.setOnClickListener(new View.OnClickListener() { // from class: nll
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        nlr nlrVar = nlr.this;
                        if (nlrVar.e.t()) {
                            nlrVar.c();
                        } else {
                            nlrVar.f.c(nlrVar.d, null, new nlq(nlrVar));
                        }
                    }
                });
            }
            fkz fkzVar = new fkz((YouTubeTextView) this.w.findViewById(R.id.custom_amount_label), (TextInputLayout) this.w.findViewById(R.id.custom_amount_group));
            this.g = fkzVar;
            fkzVar.f = new nlm(this);
            fkz fkzVar2 = this.g;
            fkzVar2.e = aqnbVar2;
            YouTubeTextView youTubeTextView4 = fkzVar2.a;
            arag aragVar5 = aqnbVar2.r;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
            youTubeTextView4.setText(ajgl.b(aragVar5));
            PrefixedEditText prefixedEditText = fkzVar2.c;
            arag aragVar6 = aqnbVar2.s;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            String obj = ajgl.b(aragVar6).toString();
            prefixedEditText.a = obj;
            prefixedEditText.c = 20;
            prefixedEditText.b = new float[obj.length()];
            prefixedEditText.invalidate();
            fkzVar2.c.addTextChangedListener(fkzVar2.d);
            final flc flcVar = new flc(this.l, (RadioGroup) this.w.findViewById(R.id.predefined_amounts_group), (CheckedTextView) this.w.findViewById(R.id.privacy_checkbox));
            flcVar.d = new nln(this);
            flcVar.e = new nlo(this);
            if (aqnbVar2.q.size() == 0) {
                nln nlnVar = flcVar.d;
                if (nlnVar != null) {
                    nlnVar.a(0L);
                }
            } else {
                flcVar.b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: flb
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                        aqnd aqndVar;
                        flc flcVar2 = flc.this;
                        if (flcVar2.d == null || (aqndVar = (aqnd) radioGroup.findViewById(i2).getTag()) == null) {
                            return;
                        }
                        flcVar2.d.a(aqndVar.c);
                    }
                });
                int min = Math.min(aqnbVar2.q.size() - 1, 1);
                int i2 = 0;
                while (i2 < aqnbVar2.q.size()) {
                    aqnd aqndVar = (aqnd) aqnbVar2.q.get(i2);
                    RadioButton radioButton = (RadioButton) LayoutInflater.from(flcVar.a).inflate(R.layout.donation_predefined_amount_button, (ViewGroup) flcVar.b, false);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) radioButton.getLayoutParams();
                    flcVar.b.addView(radioButton);
                    if ((aqndVar.b & 2) != 0) {
                        aragVar = aqndVar.d;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    zag.m(radioButton, ajgl.b(aragVar));
                    zag.k(radioButton, radioButton.getBackground());
                    if (i2 != 0) {
                        if (i2 == aqnbVar2.q.size() - 1) {
                            marginLayoutParams.setMarginStart(0);
                        }
                    } else {
                        marginLayoutParams.setMarginStart(0);
                        i2 = 0;
                    }
                    radioButton.setTag((aqnd) aqnbVar2.q.get(i2));
                    if (i2 == min) {
                        radioButton.setChecked(true);
                    }
                    i2++;
                }
                CheckedTextView checkedTextView = flcVar.c;
                arag aragVar7 = aqnbVar2.w;
                if (aragVar7 == null) {
                    aragVar7 = arag.a;
                }
                zag.m(checkedTextView, ajgl.b(aragVar7));
                if ((aqnbVar2.b & 134217728) != 0) {
                    flcVar.c.setOnClickListener(new View.OnClickListener() { // from class: fla
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            flc flcVar2 = flc.this;
                            flcVar2.a(!flcVar2.c.isChecked());
                        }
                    });
                    flcVar.a(aqnbVar2.x);
                }
            }
            d();
        }
    }

    @Override // defpackage.nmc
    public final View oX() {
        return this.w;
    }

    @Override // defpackage.nmc
    public final void oY(ajrt ajrtVar) {
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final void p(aqvq aqvqVar, asjj asjjVar) {
        auqh auqhVar;
        auqh auqhVar2;
        auqh auqhVar3;
        aqvs aqvsVar;
        arag aragVar;
        aqvs aqvsVar2;
        if (aqvqVar != null) {
            aqvo aqvoVar = aqvqVar.g;
            if (aqvoVar == null) {
                aqvoVar = aqvo.a;
            }
            if (aqvoVar.b == 49399797) {
                auqhVar = (auqh) aqvoVar.c;
            } else {
                auqhVar = auqh.a;
            }
            if (auqhVar.d.size() != 0) {
                aqvo aqvoVar2 = aqvqVar.g;
                if (aqvoVar2 == null) {
                    aqvoVar2 = aqvo.a;
                }
                if (aqvoVar2.b == 49399797) {
                    auqhVar2 = (auqh) aqvoVar2.c;
                } else {
                    auqhVar2 = auqh.a;
                }
                if ((((auqk) auqhVar2.d.get(0)).e & 64) != 0) {
                    super.p(aqvqVar, asjjVar);
                    aqvo aqvoVar3 = aqvqVar.g;
                    if (aqvoVar3 == null) {
                        aqvoVar3 = aqvo.a;
                    }
                    if (aqvoVar3.b == 49399797) {
                        auqhVar3 = (auqh) aqvoVar3.c;
                    } else {
                        auqhVar3 = auqh.a;
                    }
                    aqnb aqnbVar = ((auqk) auqhVar3.d.get(0)).bd;
                    if (aqnbVar == null) {
                        aqnbVar = aqnb.a;
                    }
                    this.r = aqnbVar;
                    aqvp aqvpVar = aqvqVar.f;
                    if (aqvpVar == null) {
                        aqvpVar = aqvp.a;
                    }
                    if (aqvpVar.b != 138681548) {
                        this.p.j(null);
                    } else {
                        nnu nnuVar = this.p;
                        aqvp aqvpVar2 = aqvqVar.f;
                        if (aqvpVar2 == null) {
                            aqvpVar2 = aqvp.a;
                        }
                        if (aqvpVar2.b == 138681548) {
                            aqvsVar = (aqvs) aqvpVar2.c;
                        } else {
                            aqvsVar = aqvs.a;
                        }
                        if ((aqvsVar.b & 1) != 0) {
                            aqvp aqvpVar3 = aqvqVar.f;
                            if (aqvpVar3 == null) {
                                aqvpVar3 = aqvp.a;
                            }
                            if (aqvpVar3.b == 138681548) {
                                aqvsVar2 = (aqvs) aqvpVar3.c;
                            } else {
                                aqvsVar2 = aqvs.a;
                            }
                            aragVar = aqvsVar2.c;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                        } else {
                            aragVar = null;
                        }
                        nnuVar.j(ajgl.b(aragVar));
                    }
                    this.p.i(null);
                    this.p.f(null);
                    return;
                }
            }
        }
        super.p(null, asjjVar);
    }

    @Override // defpackage.nmc
    public final void y() {
    }

    @Override // defpackage.nmc
    public final void z() {
    }
}
