package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: laj  reason: default package */
/* loaded from: classes3.dex */
public final class laj extends ajsl {
    public final aafo a;
    public boolean b;
    public awds c;
    private final Context d;
    private final ajmy e;
    private final ajrx f;
    private final Resources g;
    private final LayoutInflater h;
    private final LinearLayout i;
    private final LinearLayout j;
    private FrameLayout k;
    private ImageView l;
    private TextView m;
    private LinearLayout n;
    private boolean o;
    private boolean p;
    private int q;

    public laj(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar) {
        this.d = context;
        ajmyVar.getClass();
        this.e = ajmyVar;
        this.f = gemVar;
        aafoVar.getClass();
        this.a = aafoVar;
        this.g = context.getResources();
        LayoutInflater from = LayoutInflater.from(context);
        this.h = from;
        View inflate = from.inflate(R.layout.watch_card, (ViewGroup) null);
        this.i = (LinearLayout) inflate.findViewById(R.id.card_layout);
        this.j = (LinearLayout) inflate.findViewById(R.id.card_content);
        this.b = false;
        this.o = false;
        this.p = false;
        gemVar.c(inflate);
    }

    private final void g() {
        arag aragVar;
        apzg apzgVar;
        LinearLayout linearLayout;
        arag aragVar2;
        awdq awdqVar = this.c.g;
        if (awdqVar == null) {
            awdqVar = awdq.a;
        }
        if (awdqVar.d.size() == 0) {
            return;
        }
        awdq awdqVar2 = this.c.g;
        if (awdqVar2 == null) {
            awdqVar2 = awdq.a;
        }
        aopu aopuVar = awdqVar2.d;
        if (!this.p) {
            this.h.inflate(R.layout.watch_card_section_title, (ViewGroup) this.j, true);
            TextView textView = (TextView) this.j.getChildAt(linearLayout.getChildCount() - 1);
            awdq awdqVar3 = this.c.g;
            if (awdqVar3 == null) {
                awdqVar3 = awdq.a;
            }
            if ((awdqVar3.b & 1) != 0) {
                awdq awdqVar4 = this.c.g;
                if (awdqVar4 == null) {
                    awdqVar4 = awdq.a;
                }
                aragVar2 = awdqVar4.c;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView.setText(ajgl.b(aragVar2));
            this.h.inflate(R.layout.watch_card_list_item_separator, (ViewGroup) this.j, true);
        }
        LinearLayout linearLayout2 = this.n;
        if (linearLayout2 == null) {
            LinearLayout linearLayout3 = new LinearLayout(this.d);
            this.n = linearLayout3;
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.n.setOrientation(0);
            int i = zew.i(this.g.getDisplayMetrics(), 7);
            this.n.setPadding(i, i, i, i);
            this.j.addView(this.n);
        } else {
            linearLayout2.removeAllViews();
        }
        int integer = this.g.getInteger(R.integer.watch_card_related_entities_count);
        int min = Math.min(integer, aopuVar.size());
        this.n.setWeightSum(integer);
        for (int i2 = 0; i2 < min; i2++) {
            awdr awdrVar = (awdr) aopuVar.get(i2);
            View inflate = this.h.inflate(R.layout.watch_card_related_entity, (ViewGroup) null);
            TextView textView2 = (TextView) inflate.findViewById(R.id.title);
            if ((awdrVar.b & 1) != 0) {
                aragVar = awdrVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView2.setText(ajgl.b(aragVar));
            avhn avhnVar = awdrVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            h(inflate, R.id.thumbnail, avhnVar);
            if ((awdrVar.b & 4) != 0) {
                apzgVar = awdrVar.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = null;
            }
            inflate.setOnClickListener(new lai(this, apzgVar));
            this.n.addView(inflate);
            inflate.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
    }

    private final void h(View view, int i, avhn avhnVar) {
        ImageView imageView = (ImageView) view.findViewById(i);
        this.e.h(imageView, avhnVar);
        imageView.setVisibility(true != akel.A(avhnVar) ? 8 : 0);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.f).b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        awdg awdgVar;
        awdh awdhVar;
        awdz awdzVar;
        apzg apzgVar;
        awds awdsVar = (awds) obj;
        this.p = false;
        if (!awdsVar.equals(this.c)) {
            this.o = false;
        }
        if (!this.o || this.g.getConfiguration().orientation != this.q) {
            int i = 1;
            if (!this.o) {
                this.c = awdsVar;
                this.b = !awdsVar.i;
            }
            if (this.i.findViewById(R.id.card_header) != null) {
                this.i.removeViewAt(0);
            }
            arag aragVar3 = null;
            LinearLayout linearLayout = (LinearLayout) this.h.inflate(R.layout.watch_card_header, (ViewGroup) null);
            this.i.addView(linearLayout, 0);
            TextView textView = (TextView) this.i.findViewById(R.id.card_title);
            awds awdsVar2 = this.c;
            if ((awdsVar2.b & 1) != 0) {
                aragVar = awdsVar2.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            TextView textView2 = (TextView) this.i.findViewById(R.id.card_label);
            this.m = textView2;
            textView2.setPadding(0, 0, 0, zew.i(this.g.getDisplayMetrics(), 4));
            this.m.setVisibility(0);
            this.m.setText(ajgl.n(this.c.e)[0]);
            if ((this.c.b & 4) != 0) {
                this.i.findViewById(R.id.card_description).setOnClickListener(new laf(this, 1));
            }
            TextView textView3 = (TextView) linearLayout.findViewById(R.id.card_switch_label);
            awds awdsVar3 = this.c;
            if ((awdsVar3.b & 128) != 0) {
                aragVar2 = awdsVar3.j;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView3.setText(ajgl.b(aragVar2));
            this.l = (ImageView) this.i.findViewById(R.id.card_switch_icon);
            FrameLayout frameLayout = (FrameLayout) this.i.findViewById(R.id.card_switch);
            this.k = frameLayout;
            frameLayout.setOnClickListener(new laf(this));
            FrameLayout frameLayout2 = (FrameLayout) this.i.findViewById(R.id.call_to_action_layout);
            FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = (FixedAspectRatioRelativeLayout) this.i.findViewById(R.id.call_to_action_container);
            TextView textView4 = (TextView) frameLayout2.findViewById(R.id.call_to_action_button);
            awds awdsVar4 = this.c;
            if ((awdsVar4.b & 8) != 0) {
                awdgVar = awdsVar4.f;
                if (awdgVar == null) {
                    awdgVar = awdg.a;
                }
            } else {
                awdgVar = null;
            }
            int i2 = awdgVar.b;
            int i3 = 49968063;
            if (i2 == 49968063) {
                awdhVar = (awdh) awdgVar.c;
            } else {
                i3 = i2;
                awdhVar = null;
            }
            if (awdhVar != null) {
                fixedAspectRatioRelativeLayout.a = this.g.getFraction(R.fraction.aspect_ratio_2_1, 1, 1);
                if (frameLayout2.findViewById(R.id.watch_card_collage) == null) {
                    ((ViewStub) frameLayout2.findViewById(R.id.watch_card_collage_stub)).inflate();
                }
                apzgVar = awdhVar.f;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                avhn avhnVar = awdhVar.c;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                h(frameLayout2, R.id.left_thumbnail, avhnVar);
                avhn avhnVar2 = awdhVar.d;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
                h(frameLayout2, R.id.top_right_thumbnail, avhnVar2);
                avhn avhnVar3 = awdhVar.e;
                if (avhnVar3 == null) {
                    avhnVar3 = avhn.a;
                }
                h(frameLayout2, R.id.bottom_right_thumbnail, avhnVar3);
                if ((awdhVar.b & 16) != 0 && (aragVar3 = awdhVar.g) == null) {
                    aragVar3 = arag.a;
                }
                textView4.setText(ajgl.b(aragVar3));
            } else {
                if (i3 == 49970284) {
                    awdzVar = (awdz) awdgVar.c;
                } else {
                    awdzVar = awdz.a;
                }
                apzg apzgVar2 = awdzVar.d;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                avhn avhnVar4 = awdzVar.c;
                if (avhnVar4 == null) {
                    avhnVar4 = avhn.a;
                }
                h(frameLayout2, R.id.watch_card_single_image, avhnVar4);
                if ((awdzVar.b & 4) != 0 && (aragVar3 = awdzVar.e) == null) {
                    aragVar3 = arag.a;
                }
                textView4.setText(ajgl.b(aragVar3));
                apzgVar = apzgVar2;
            }
            frameLayout2.setOnClickListener(new lai(this, apzgVar, 1));
            if (this.o && this.p) {
                g();
            }
            f();
            this.o = true;
            int i4 = this.g.getConfiguration().orientation;
            this.q = i4;
            if (i4 == 2) {
                if (awdhVar != null) {
                    i = 4;
                }
                zgd.t(frameLayout2, zgd.q(i), LinearLayout.LayoutParams.class);
                zgd.t((LinearLayout) linearLayout.findViewById(R.id.card_description_and_switch), zgd.q(2.0f), LinearLayout.LayoutParams.class);
            }
            this.f.e(ajrsVar);
            return;
        }
        this.f.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awds) obj).k.I();
    }

    public final void f() {
        aopu aopuVar;
        awdd awddVar;
        awdd awddVar2;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        awec awecVar;
        if (this.b) {
            if (!this.p) {
                awds awdsVar = this.c;
                awdn awdnVar = awdsVar.h;
                if (awdnVar == null) {
                    awdnVar = awdn.a;
                }
                if (awdnVar.b == 49961548) {
                    awdn awdnVar2 = awdsVar.h;
                    if (awdnVar2 == null) {
                        awdnVar2 = awdn.a;
                    }
                    if (awdnVar2.b == 49961548) {
                        awecVar = (awec) awdnVar2.c;
                    } else {
                        awecVar = awec.a;
                    }
                    aopuVar = awecVar.b;
                } else {
                    aopuVar = null;
                }
                if (aopuVar != null) {
                    this.j.removeAllViews();
                    for (int i = 0; i < aopuVar.size(); i++) {
                        if (i != 0) {
                            this.h.inflate(R.layout.watch_card_list_item_separator, (ViewGroup) this.j, true);
                        }
                        LinearLayout linearLayout = this.j;
                        awea aweaVar = (awea) aopuVar.get(i);
                        View inflate = this.h.inflate(R.layout.watch_card_video, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.title);
                        if ((aweaVar.b & 4) != 0) {
                            aragVar3 = aweaVar.e;
                            if (aragVar3 == null) {
                                aragVar3 = arag.a;
                            }
                        } else {
                            aragVar3 = null;
                        }
                        textView.setText(ajgl.b(aragVar3));
                        TextView textView2 = (TextView) inflate.findViewById(R.id.duration);
                        if ((aweaVar.b & 8) != 0) {
                            aragVar4 = aweaVar.f;
                            if (aragVar4 == null) {
                                aragVar4 = arag.a;
                            }
                        } else {
                            aragVar4 = null;
                        }
                        zag.m(textView2, ajgl.b(aragVar4));
                        if ((aweaVar.b & 2) != 0) {
                            aragVar5 = aweaVar.d;
                            if (aragVar5 == null) {
                                aragVar5 = arag.a;
                            }
                        } else {
                            aragVar5 = null;
                        }
                        Spanned b = ajgl.b(aragVar5);
                        if (!TextUtils.isEmpty(b)) {
                            TextView textView3 = (TextView) inflate.findViewById(R.id.index);
                            textView3.setVisibility(0);
                            textView3.setText(b);
                        }
                        if ((aweaVar.b & 1) != 0) {
                            avhn avhnVar = aweaVar.c;
                            if (avhnVar == null) {
                                avhnVar = avhn.a;
                            }
                            h(inflate, R.id.thumbnail, avhnVar);
                        }
                        inflate.findViewById(R.id.video_layout).setOnClickListener(new lag(this, aweaVar));
                        linearLayout.addView(inflate);
                    }
                }
                awdn awdnVar3 = this.c.h;
                if (awdnVar3 == null) {
                    awdnVar3 = awdn.a;
                }
                if (awdnVar3.b == 49627160) {
                    int i2 = 0;
                    while (true) {
                        if (awdnVar3.b == 49627160) {
                            awddVar = (awdd) awdnVar3.c;
                        } else {
                            awddVar = awdd.a;
                        }
                        if (i2 >= awddVar.b.size()) {
                            break;
                        }
                        if (i2 != 0) {
                            this.h.inflate(R.layout.watch_card_list_item_separator, (ViewGroup) this.j, true);
                        }
                        LinearLayout linearLayout2 = this.j;
                        if (awdnVar3.b == 49627160) {
                            awddVar2 = (awdd) awdnVar3.c;
                        } else {
                            awddVar2 = awdd.a;
                        }
                        awdc awdcVar = (awdc) awddVar2.b.get(i2);
                        View inflate2 = this.h.inflate(R.layout.watch_card_album, (ViewGroup) null);
                        TextView textView4 = (TextView) inflate2.findViewById(R.id.title);
                        if ((awdcVar.b & 2) != 0) {
                            aragVar = awdcVar.d;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                        } else {
                            aragVar = null;
                        }
                        textView4.setText(ajgl.b(aragVar));
                        TextView textView5 = (TextView) inflate2.findViewById(R.id.year);
                        if ((awdcVar.b & 4) != 0) {
                            aragVar2 = awdcVar.e;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                        } else {
                            aragVar2 = null;
                        }
                        zag.m(textView5, ajgl.b(aragVar2));
                        if ((awdcVar.b & 1) != 0) {
                            avhn avhnVar2 = awdcVar.c;
                            if (avhnVar2 == null) {
                                avhnVar2 = avhn.a;
                            }
                            h(inflate2, R.id.thumbnail, avhnVar2);
                        }
                        inflate2.findViewById(R.id.album_layout).setOnClickListener(new lah(this, awdcVar));
                        linearLayout2.addView(inflate2);
                        i2++;
                    }
                }
                g();
                this.p = true;
            }
            if (this.g.getConfiguration().orientation == 1) {
                View findViewById = this.k.findViewById(R.id.card_switch_content);
                int paddingTop = findViewById.getPaddingTop();
                findViewById.setPadding(paddingTop, paddingTop, paddingTop, 0);
            }
            this.l.setImageResource(2131230920);
            this.j.setVisibility(0);
            return;
        }
        if (this.g.getConfiguration().orientation == 1) {
            View findViewById2 = this.k.findViewById(R.id.card_switch_content);
            int paddingTop2 = findViewById2.getPaddingTop();
            findViewById2.setPadding(paddingTop2, paddingTop2, paddingTop2, paddingTop2);
        }
        this.l.setImageResource(2131230921);
        this.j.setVisibility(8);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
