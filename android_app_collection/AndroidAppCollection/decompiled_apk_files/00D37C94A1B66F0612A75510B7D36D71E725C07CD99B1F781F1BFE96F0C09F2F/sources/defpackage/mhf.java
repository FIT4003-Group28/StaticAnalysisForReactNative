package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: mhf  reason: default package */
/* loaded from: classes3.dex */
public final class mhf extends ajsl implements ajrn, lou {
    public final ajrp a;
    public aqdv b;
    public low c;
    private final Context d;
    private final View e;
    private final TextView f;
    private final TextView g;
    private final ImageView h;
    private final TextView i;
    private final mhg j;
    private final mho k;
    private final jqu l;
    private final mhm m;
    private final ajxz n;
    private final gem o;
    private final faq p;
    private final akem q;
    private ajrs r;

    public mhf(Context context, mhh mhhVar, mhp mhpVar, mhn mhnVar, jqv jqvVar, aafo aafoVar, ajxz ajxzVar, gem gemVar, faq faqVar, akem akemVar) {
        context.getClass();
        this.d = context;
        this.o = gemVar;
        this.p = faqVar;
        this.q = akemVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_list_item, (ViewGroup) null);
        this.e = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.subtitle);
        this.h = (ImageView) inflate.findViewById(R.id.right_icon);
        this.i = (TextView) inflate.findViewById(R.id.activity_count_live_status);
        ajmy ajmyVar = (ajmy) mhhVar.a.get();
        ajmyVar.getClass();
        ajxz ajxzVar2 = (ajxz) mhhVar.b.get();
        ajxzVar2.getClass();
        inflate.getClass();
        this.j = new mhg(ajmyVar, ajxzVar2, inflate);
        imq imqVar = (imq) mhpVar.a.get();
        imqVar.getClass();
        inflate.getClass();
        this.k = new mho(imqVar, inflate);
        aagi aagiVar = (aagi) mhnVar.a.get();
        aagiVar.getClass();
        ayor ayorVar = (ayor) mhnVar.b.get();
        ayorVar.getClass();
        ilv ilvVar = (ilv) mhnVar.c.get();
        ilvVar.getClass();
        ilu iluVar = (ilu) mhnVar.d.get();
        iluVar.getClass();
        inflate.getClass();
        this.m = new mhm(aagiVar, ayorVar, ilvVar, iluVar, inflate);
        ajrp ajrpVar = new ajrp(aafoVar, inflate);
        this.a = ajrpVar;
        jnw jnwVar = (jnw) jqvVar.a.get();
        jnwVar.getClass();
        yni yniVar = (yni) jqvVar.b.get();
        yniVar.getClass();
        jkm jkmVar = (jkm) jqvVar.c.get();
        ahce ahceVar = (ahce) jqvVar.d.get();
        ahceVar.getClass();
        jkz jkzVar = (jkz) jqvVar.e.get();
        jkzVar.getClass();
        azqb azqbVar = jqvVar.f;
        inflate.getClass();
        this.l = new jqu(jnwVar, yniVar, jkmVar, ahceVar, jkzVar, azqbVar, inflate, ajrpVar);
        this.n = ajxzVar;
        gemVar.d(new View.OnClickListener() { // from class: mhe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mhf mhfVar = mhf.this;
                low lowVar = mhfVar.c;
                if (lowVar != null) {
                    lowVar.b(mhfVar, mhfVar.b);
                }
                mhfVar.a.onClick(view);
            }
        });
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.o.b;
    }

    @Override // defpackage.lou
    public final void c(boolean z) {
        elk.g(this.d, this.r, this.o, z);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        arag aragVar3;
        aunb aunbVar;
        aucf aucfVar;
        aucf aucfVar2;
        avto avtoVar;
        ayoi T;
        ayoi T2;
        aunb aunbVar2;
        arhs arhsVar;
        ViewStub viewStub4;
        aqdv aqdvVar = (aqdv) obj;
        this.r = ajrsVar;
        this.b = aqdvVar;
        ampq a = low.a(ajrsVar);
        if (a.h()) {
            low lowVar = (low) a.c();
            this.c = lowVar;
            lowVar.c(this, aqdvVar);
        } else {
            this.c = null;
        }
        this.a.b(ajrsVar.a, aqdvVar.c == 4 ? (apzg) aqdvVar.d : null, ajrsVar.e(), this);
        if ((aqdvVar.b & 1) != 0) {
            aragVar = aqdvVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        aqdw aqdwVar = aqdvVar.j;
        if (aqdwVar == null) {
            aqdwVar = aqdw.a;
        }
        int c = aqgn.c(aqdwVar.b);
        if (c == 0) {
            c = 1;
        }
        ColorStateList f = zhn.f(this.d, R.attr.ytTextPrimary);
        if (c == 4) {
            f = zhn.f(this.d, R.attr.ytCallToAction);
        }
        this.f.setTextColor(f);
        this.f.setText(b);
        if ((aqdvVar.b & 2) != 0) {
            aragVar2 = aqdvVar.h;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        if (b2 != null) {
            this.g.setText(b2);
        } else {
            this.g.setVisibility(8);
        }
        aqdx aqdxVar = aqdvVar.i;
        if (aqdxVar == null) {
            aqdxVar = aqdx.a;
        }
        aqdw aqdwVar2 = aqdvVar.j;
        if (aqdwVar2 == null) {
            aqdwVar2 = aqdw.a;
        }
        int c2 = aqgn.c(aqdwVar2.b);
        if (c2 == 0) {
            c2 = 1;
        }
        mhg mhgVar = this.j;
        CircularImageView circularImageView = mhgVar.i;
        if (circularImageView != null) {
            circularImageView.setVisibility(8);
        }
        FrameLayout frameLayout = mhgVar.j;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ImageView imageView = mhgVar.l;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TintableImageView tintableImageView = mhgVar.m;
        if (tintableImageView != null) {
            tintableImageView.setVisibility(8);
        }
        if (mhg.b(aqdxVar) != null) {
            if (mhgVar.i == null && (viewStub4 = mhgVar.d) != null) {
                mhgVar.i = (CircularImageView) viewStub4.inflate();
            }
            mhgVar.i.setVisibility(0);
            mhgVar.a.h(mhgVar.i, mhg.b(aqdxVar));
        } else if (mhg.c(aqdxVar) != null) {
            if (mhgVar.j == null && (viewStub3 = mhgVar.e) != null) {
                mhgVar.j = (FrameLayout) viewStub3.inflate();
                mhgVar.k = (ImageView) mhgVar.j.findViewById(R.id.image_view);
            }
            mhgVar.j.setVisibility(0);
            mhgVar.a.h(mhgVar.k, mhg.c(aqdxVar));
        } else if (mhg.a(aqdxVar) != null) {
            if (mhgVar.m == null && (viewStub2 = mhgVar.g) != null) {
                mhgVar.m = (TintableImageView) viewStub2.inflate();
            }
            ajxz ajxzVar = mhgVar.b;
            arhr b3 = arhr.b(mhg.a(aqdxVar).c);
            if (b3 == null) {
                b3 = arhr.UNKNOWN;
            }
            int a2 = ajxzVar.a(b3);
            if (a2 == 0) {
                mhgVar.m.setImageDrawable(null);
                mhgVar.m.a(null);
            } else {
                mhgVar.m.setImageResource(a2);
                ColorStateList colorStateList = mhgVar.h;
                if (c2 == 4) {
                    colorStateList = zhn.f(mhgVar.c, R.attr.ytCallToAction);
                }
                mhgVar.m.a(colorStateList);
            }
            mhgVar.m.setVisibility(0);
        } else {
            if (mhgVar.l == null && (viewStub = mhgVar.f) != null) {
                mhgVar.l = (ImageView) viewStub.inflate();
            }
            mhgVar.l.setVisibility(0);
            if (mhg.d(aqdxVar) != null) {
                mhgVar.a.h(mhgVar.l, mhg.d(aqdxVar));
            } else {
                mhgVar.a.e(mhgVar.l);
                mhgVar.l.setImageDrawable(null);
                mhgVar.l.setBackgroundResource(R.color.yt_grey3);
            }
        }
        this.i.setVisibility(8);
        this.h.setVisibility(8);
        int i = aqdvVar.e;
        if (i == 20) {
            this.h.setVisibility(0);
            ImageView imageView2 = this.h;
            ajxz ajxzVar2 = this.n;
            if (aqdvVar.e == 20) {
                arhsVar = (arhs) aqdvVar.f;
            } else {
                arhsVar = arhs.a;
            }
            arhr b4 = arhr.b(arhsVar.c);
            if (b4 == null) {
                b4 = arhr.UNKNOWN;
            }
            imageView2.setImageResource(ajxzVar2.a(b4));
        } else if (i == 5) {
            this.i.setVisibility(0);
            TextView textView = this.i;
            if (aqdvVar.e == 5) {
                aragVar3 = (arag) aqdvVar.f;
            } else {
                aragVar3 = arag.a;
            }
            textView.setText(ajgl.b(aragVar3));
            this.i.setTextColor(zhn.j(this.d, R.attr.ytTextSecondary).orElse(0));
        } else if (i == 6) {
            this.i.setVisibility(0);
            this.i.setText(ajgl.b(aqdvVar.e == 6 ? (arag) aqdvVar.f : null));
            this.i.setTextColor(zhn.j(this.d, R.attr.ytBrandRed).orElse(0));
        }
        mho mhoVar = this.k;
        mhoVar.a();
        if (aqdvVar.e == 23) {
            aunbVar = (aunb) aqdvVar.f;
        } else {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.uploadProgressArrowRenderer)) {
            imq imqVar = mhoVar.c;
            UploadArrowView uploadArrowView = mhoVar.a;
            if (aqdvVar.e == 23) {
                aunbVar2 = (aunb) aqdvVar.f;
            } else {
                aunbVar2 = aunb.a;
            }
            UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer = (UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) aunbVar2.qm(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.uploadProgressArrowRenderer);
            ayor ayorVar = (ayor) imqVar.a.get();
            ayorVar.getClass();
            Context context = (Context) imqVar.b.get();
            context.getClass();
            aagi aagiVar = (aagi) imqVar.c.get();
            aagiVar.getClass();
            ilv ilvVar = (ilv) imqVar.d.get();
            ilvVar.getClass();
            ilu iluVar = (ilu) imqVar.e.get();
            iluVar.getClass();
            aacz aaczVar = (aacz) imqVar.f.get();
            aaczVar.getClass();
            uploadArrowView.getClass();
            uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.getClass();
            mhoVar.b = new imp(ayorVar, context, aagiVar, ilvVar, iluVar, aaczVar, new imh(uploadArrowView), uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer);
            mhoVar.b.b(true);
        }
        aqds aqdsVar = aqdvVar.k;
        if (aqdsVar == null) {
            aqdsVar = aqds.a;
        }
        if (aqdsVar.b == 328362115) {
            final mhm mhmVar = this.m;
            aqds aqdsVar2 = aqdvVar.k;
            if (aqdsVar2 == null) {
                aqdsVar2 = aqds.a;
            }
            if (aqdsVar2.b == 328362115) {
                avtoVar = (avto) aqdsVar2.c;
            } else {
                avtoVar = avto.a;
            }
            aypg aypgVar = mhmVar.g;
            if (aypgVar != null) {
                ayqi.c((AtomicReference) aypgVar);
            }
            if ((avtoVar.b & 2) == 0) {
                T = ayoi.T(false);
            } else {
                T = mhm.a(mhmVar.c.a, avtoVar.c);
            }
            if ((avtoVar.b & 2) == 0) {
                T2 = ayoi.T(false);
            } else {
                T2 = mhm.a(mhmVar.d.a, avtoVar.c);
            }
            ayoi h = mhmVar.a.c().h(akyu.a, true);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ayor ayorVar2 = mhmVar.b;
            ayrd.b(timeUnit, "unit is null");
            azjc azjcVar = new azjc(h, timeUnit, ayorVar2);
            azqc.i();
            mhmVar.g = ayoi.o(azjcVar.X(mhmVar.b), T.ad(false), T2.ad(false), img.f).I(kth.k).as(new ayqb() { // from class: mhj
                @Override // defpackage.ayqb
                public final void a(Object obj2) {
                    String quantityString;
                    mhm mhmVar2 = mhm.this;
                    mhl mhlVar = (mhl) obj2;
                    avvb avvbVar = mhlVar.a;
                    boolean z = mhlVar.b;
                    boolean z2 = mhlVar.c;
                    mhk mhkVar = null;
                    if (avvbVar.getNumVideosFailed().intValue() <= 0 || z) {
                        if (avvbVar.getNumVideosInProgress().intValue() > 0) {
                            mhkVar = new mhk(mhmVar2.e.getResources().getQuantityString(R.plurals.uploads_in_progress, avvbVar.getNumVideosInProgress().intValue(), avvbVar.getNumVideosInProgress()), zhn.j(mhmVar2.e, R.attr.ytCallToAction).orElse(mhmVar2.e.getResources().getColor(R.color.yt_dark_blue)));
                        } else if (avvbVar.getNumVideosCompleted().intValue() > 0 && !z2) {
                            mhkVar = new mhk(mhmVar2.e.getString(R.string.upload_complete), zhn.j(mhmVar2.e, R.attr.ytCallToAction).orElse(mhmVar2.e.getResources().getColor(R.color.yt_dark_blue)));
                        }
                    } else {
                        if (avvbVar.getNumVideosInProgress().intValue() > 0) {
                            quantityString = mhmVar2.e.getResources().getQuantityString(R.plurals.uploads_failed_with_in_progress_videos, avvbVar.getNumVideosFailed().intValue(), avvbVar.getNumVideosFailed(), Integer.valueOf(avvbVar.getNumVideosInProgress().intValue() + avvbVar.getNumVideosFailed().intValue()));
                        } else {
                            quantityString = mhmVar2.e.getResources().getQuantityString(R.plurals.uploads_failed, avvbVar.getNumVideosFailed().intValue(), avvbVar.getNumVideosFailed());
                        }
                        mhkVar = new mhk(quantityString, zhn.j(mhmVar2.e, R.attr.ytTouchResponse).orElse(mhmVar2.e.getResources().getColor(R.color.yt_black_pure)));
                    }
                    if (mhkVar != null) {
                        zag.m(mhmVar2.f, mhkVar.a);
                        mhmVar2.f.setTextColor(mhkVar.b);
                    }
                }
            });
        } else {
            aqds aqdsVar3 = aqdvVar.k;
            if (aqdsVar3 == null) {
                aqdsVar3 = aqds.a;
            }
            if (aqdsVar3.b == 135739232) {
                aucfVar = (aucf) aqdsVar3.c;
            } else {
                aucfVar = aucf.a;
            }
            if (!aucfVar.c.isEmpty()) {
                jqu jquVar = this.l;
                aqds aqdsVar4 = aqdvVar.k;
                if (aqdsVar4 == null) {
                    aqdsVar4 = aqds.a;
                }
                if (aqdsVar4.b == 135739232) {
                    aucfVar2 = (aucf) aqdsVar4.c;
                } else {
                    aucfVar2 = aucf.a;
                }
                String str = aucfVar2.c;
                jquVar.i = aqdvVar;
                jquVar.j = str;
                agvv i2 = ((agrf) jquVar.e.get()).a().i();
                String str2 = jquVar.j;
                str2.getClass();
                if (i2.e(str2) != null) {
                    String str3 = jquVar.j;
                    zgh.m(str3);
                    if (str3.startsWith("BL")) {
                        ajrp ajrpVar = jquVar.h;
                        acti actiVar = ajrsVar.a;
                        String str4 = jquVar.j;
                        zgh.m(str4);
                        ajrpVar.b(actiVar, far.a(str4), ajrsVar.e(), null);
                    }
                }
                String str5 = jquVar.j;
                zgh.m(str5);
                if ("PPSV".equals(str5)) {
                    jquVar.k = jquVar.c.a(4, null, jquVar.g, new jqs(jquVar, 1));
                    jnw jnwVar = jquVar.a;
                    jquVar.l = jnwVar.d.submit(new jnr(jnwVar, new jqt(jquVar)));
                    jquVar.g.setClickable(false);
                } else {
                    jquVar.k = jquVar.c.a(1, str5, jquVar.g, new jqs(jquVar));
                    jquVar.l = jquVar.a.b(str5, new jqt(jquVar, 1));
                    jquVar.g.setClickable(true);
                }
                jquVar.k.a();
                jquVar.b.g(jquVar);
            }
        }
        this.p.b(this, aqdvVar.c == 4 ? (apzg) aqdvVar.d : null);
        this.o.e(ajrsVar);
        this.q.b(a(), this.q.a(a(), null));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqdv) obj).m.I();
    }

    @Override // defpackage.ajrn
    public final void oq(Map map) {
        map.put("com.google.android.libraries.youtube.rendering.presenter.PresentContext", this.r);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.p.c(this);
        this.a.c();
        jqu jquVar = this.l;
        jquVar.b.m(jquVar);
        zag.o(jquVar.g, false);
        jquVar.f.setTypeface(Typeface.DEFAULT);
        TextView textView = jquVar.f;
        textView.setTextColor(zhn.j(textView.getContext(), R.attr.ytTextSecondary).orElse(0));
        jquVar.i = null;
        jquVar.j = null;
        jquVar.k = null;
        Future future = jquVar.l;
        if (future != null) {
            future.cancel(false);
            jquVar.l = null;
        }
        jquVar.g.setClickable(true);
        mhm mhmVar = this.m;
        aypg aypgVar = mhmVar.g;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            mhmVar.g = null;
        }
        mhmVar.f.setTextColor(zhn.j(mhmVar.e, R.attr.ytTextSecondary).orElse(0));
        this.k.a();
        low lowVar = this.c;
        if (lowVar != null) {
            lowVar.d(this);
        }
    }
}
