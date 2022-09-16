package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatPopUpItemContainerLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.PollRendererOuterClass;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abqq  reason: default package */
/* loaded from: classes.dex */
public final class abqq implements abhj, abkx {
    private final ImageView A;
    private final TextView B;
    private final TextView C;
    private final ViewGroup D;
    private ampq E;
    public final Context a;
    public final aafo b;
    public final abgz c;
    public final ajsk d;
    public final abky e;
    public final acti f;
    public final Handler i;
    public final View j;
    public final LiveChatPopUpItemContainerLayout k;
    public final TextView l;
    public final ViewGroup m;
    public final View n;
    public asqc o;
    public aufe p;
    public ObjectAnimator q;
    public boolean r;
    public boolean s;
    public boolean t;
    private final ajxz u;
    private final ajmy v;
    private final aagi w;
    private final abha x;
    private final ImageButton y;
    private final ImageView z;
    public final List g = new ArrayList();
    public final Runnable h = new abqn(this);
    private ampq F = amon.a;

    public abqq(Context context, ajxz ajxzVar, ajmy ajmyVar, aafo aafoVar, Handler handler, abgz abgzVar, ajsk ajskVar, abky abkyVar, aagi aagiVar, abha abhaVar, ViewGroup viewGroup, acti actiVar) {
        this.a = new ContextThemeWrapper(context, 2132084076);
        this.u = ajxzVar;
        this.v = ajmyVar;
        this.b = aafoVar;
        this.i = handler;
        this.c = abgzVar;
        this.d = ajskVar;
        this.e = abkyVar;
        this.w = aagiVar;
        this.n = viewGroup;
        this.x = abhaVar;
        this.f = actiVar;
        LiveChatPopUpItemContainerLayout liveChatPopUpItemContainerLayout = (LiveChatPopUpItemContainerLayout) viewGroup.findViewById(R.id.live_chat_poll_container);
        this.k = liveChatPopUpItemContainerLayout;
        View findViewById = viewGroup.findViewById(R.id.live_chat_poll);
        this.j = findViewById;
        this.y = (ImageButton) findViewById.findViewById(R.id.live_chat_poll_context_menu_toggle);
        this.l = (TextView) findViewById.findViewById(R.id.poll_metadata_text);
        this.z = (ImageView) findViewById.findViewById(R.id.poll_thumbnail);
        this.A = (ImageView) findViewById.findViewById(R.id.poll_question_thumbnail);
        this.B = (TextView) findViewById.findViewById(R.id.poll_question_text);
        this.C = (TextView) findViewById.findViewById(R.id.poll_question_subtext);
        this.m = (ViewGroup) findViewById.findViewById(R.id.poll_choices_container);
        this.D = (ViewGroup) viewGroup.findViewById(R.id.error_snackbar_container);
        liveChatPopUpItemContainerLayout.c = true;
        liveChatPopUpItemContainerLayout.d = new abql(this);
    }

    private final void l() {
        if (!amps.e((String) this.F.f())) {
            ((aypg) this.E.c()).qr();
        }
        this.F = amon.a;
        this.E = amon.a;
    }

    @Override // defpackage.abhj
    public final void a(String str) {
        aloh.m(this.D, str, 0).g();
        for (abqi abqiVar : this.g) {
            abqiVar.i = false;
            abqiVar.a.setClickable(true);
            abqiVar.e.setVisibility(8);
            abqiVar.f.setVisibility(8);
            abqiVar.d.setStroke(abqiVar.g.getResources().getDimensionPixelOffset(R.dimen.live_chat_polls_choice_stroke_width), ake.f(abqiVar.g, R.color.yt_white1_opacity30));
        }
        this.s = true;
    }

    @Override // defpackage.abkx
    public final int b() {
        return 1;
    }

    @Override // defpackage.abkx
    public final void c() {
        e(true, false, false);
    }

    public final void d() {
        this.g.clear();
        this.m.removeAllViews();
        this.g.clear();
    }

    public final void e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.q;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            if (!z) {
                this.k.setVisibility(8);
                this.t = false;
                if (z2) {
                    d();
                }
                if (z3) {
                    return;
                }
                f();
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.k, View.TRANSLATION_Y, this.k.getTranslationY(), this.k.getHeight());
            this.q = ofFloat;
            ofFloat.setDuration(300L);
            this.q.setInterpolator(new DecelerateInterpolator());
            this.q.addListener(new abqo(this, z2, z3));
            this.q.start();
        }
    }

    public final void f() {
        asqc asqcVar = this.o;
        if ((asqcVar.b & 16) != 0) {
            apzg apzgVar = asqcVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            this.x.a(amuk.r(apzgVar), this.c, true);
        }
    }

    public final void g(aufe aufeVar) {
        if ((aufeVar.b & 16384) != 0) {
            String str = aufeVar.m;
            if (Objects.equals(this.F.f(), str)) {
                return;
            }
            l();
            ampq j = ampq.j(str);
            this.F = j;
            if (amps.e((String) j.f())) {
                return;
            }
            this.E = ampq.j(this.w.c().h((String) this.F.c(), true).I(zwb.f).V(aaku.d).k(assd.class).X(aypa.a()).as(new ayqb() { // from class: abqm
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    abqq abqqVar = abqq.this;
                    assd assdVar = (assd) obj;
                    if ((assdVar.c.b & 2) != 0) {
                        abqqVar.l.setText(ajgl.b(assdVar.getMetadataText()));
                        abqqVar.l.setVisibility(0);
                    }
                    if (abqqVar.r) {
                        Map pollChoiceStatesMap = assdVar.getPollChoiceStatesMap();
                        for (int i = 0; i < abqqVar.g.size(); i++) {
                            abqi abqiVar = (abqi) abqqVar.g.get(i);
                            asse asseVar = ((asrz) pollChoiceStatesMap.get(Integer.valueOf(i))).b;
                            if ((asseVar.b & 1) != 0) {
                                ClipDrawable clipDrawable = abqiVar.c;
                                ObjectAnimator.ofInt(clipDrawable, "level", clipDrawable.getLevel(), (int) (asseVar.c * 10000.0d)).setDuration(500L).start();
                            }
                            if ((asseVar.b & 2) == 0) {
                                abqiVar.b.setVisibility(8);
                            } else {
                                TextView textView = abqiVar.b;
                                arag aragVar = asseVar.d;
                                if (aragVar == null) {
                                    aragVar = arag.a;
                                }
                                textView.setText(ajgl.b(aragVar));
                                abqiVar.b.setVisibility(0);
                            }
                        }
                    }
                }
            }));
            return;
        }
        l();
    }

    public final void h(aufd aufdVar, boolean z) {
        aovr aovrVar;
        if ((aufdVar.b & 64) != 0) {
            aunb aunbVar = aufdVar.h;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                aunb aunbVar2 = aufdVar.h;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                final apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                if ((apojVar.b & 32) != 0) {
                    ImageButton imageButton = this.y;
                    Context context = this.a;
                    ajxz ajxzVar = this.u;
                    arhs arhsVar = apojVar.g;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b = arhr.b(arhsVar.c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    imageButton.setImageDrawable(akf.a(context, ajxzVar.a(b)));
                }
                if ((apojVar.b & 131072) != 0) {
                    aovs aovsVar = apojVar.s;
                    if (aovsVar == null) {
                        aovsVar = aovs.a;
                    }
                    aovrVar = aovsVar.c;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                } else {
                    aovrVar = apojVar.r;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                }
                if ((apojVar.b & 32768) != 0) {
                    this.y.setOnClickListener(new View.OnClickListener() { // from class: abqj
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            abqq abqqVar = abqq.this;
                            apoj apojVar2 = apojVar;
                            aafo aafoVar = abqqVar.b;
                            apzg apzgVar = apojVar2.p;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            aafoVar.c(apzgVar, null);
                        }
                    });
                }
                if (!aovrVar.c.isEmpty()) {
                    this.y.setContentDescription(aovrVar.c);
                }
            }
        }
        if ((aufdVar.b & 4) != 0) {
            ajmy ajmyVar = this.v;
            ImageView imageView = this.z;
            avhn avhnVar = aufdVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            this.z.setVisibility(0);
        } else if (z) {
            this.z.setVisibility(8);
        }
        if ((aufdVar.b & 8) != 0) {
            ajmy ajmyVar2 = this.v;
            ImageView imageView2 = this.A;
            avhn avhnVar2 = aufdVar.e;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            ajmyVar2.h(imageView2, avhnVar2);
            this.A.setVisibility(0);
        } else if (z) {
            this.A.setVisibility(8);
        }
        if ((aufdVar.b & 2) != 0) {
            TextView textView = this.B;
            arag aragVar = aufdVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            zag.m(textView, ajgl.b(aragVar));
        } else if (z) {
            this.B.setVisibility(8);
        }
        if ((aufdVar.b & 16) != 0) {
            TextView textView2 = this.l;
            arag aragVar2 = aufdVar.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            zag.m(textView2, ajgl.b(aragVar2));
        } else if (z) {
            this.l.setVisibility(8);
        }
        if ((aufdVar.b & 32) == 0) {
            if (!z) {
                return;
            }
            this.C.setVisibility(8);
            return;
        }
        TextView textView3 = this.C;
        arag aragVar3 = aufdVar.g;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        this.C.setVisibility(0);
    }

    @Override // defpackage.abkx
    public final void i() {
        this.k.setVisibility(4);
        this.k.post(new abqn(this, 1));
    }

    public final void j(aufe aufeVar) {
        if (k(aufeVar)) {
            if ((aufeVar.b & 2) != 0) {
                aunb aunbVar = aufeVar.e;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(PollRendererOuterClass.pollHeaderRenderer)) {
                    h((aufd) aunbVar.qm(PollRendererOuterClass.pollHeaderRenderer), false);
                }
            }
            if (this.r) {
                this.i.removeCallbacks(this.h);
            }
            for (int i = 0; i < aufeVar.f.size(); i++) {
                ((abqi) this.g.get(i)).a((aufc) aufeVar.f.get(i), Boolean.valueOf(this.r));
            }
            g(aufeVar);
        }
    }

    public final boolean k(aufe aufeVar) {
        aufe aufeVar2;
        if (aufeVar == null || (aufeVar2 = this.p) == null) {
            return false;
        }
        String str = "";
        String str2 = aufeVar2.c == 13 ? (String) aufeVar2.d : str;
        if (aufeVar.c == 13) {
            str = (String) aufeVar.d;
        }
        return TextUtils.equals(str2, str) && this.g.size() == aufeVar.f.size();
    }
}
