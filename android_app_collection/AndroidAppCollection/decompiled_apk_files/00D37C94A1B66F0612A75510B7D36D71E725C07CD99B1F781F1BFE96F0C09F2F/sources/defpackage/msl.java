package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: msl  reason: default package */
/* loaded from: classes3.dex */
public final class msl extends mfs {
    private final View C;
    private final LinearLayout D;
    private View E;
    private final ajrp a;
    private final snc b;
    private final int c;
    private final int d;
    private final int e;
    private final View f;

    public msl(Context context, ajmy ajmyVar, aafo aafoVar, snc sncVar, gem gemVar, jkv jkvVar, kua kuaVar) {
        super(context, ajmyVar, gemVar, LayoutInflater.from(context).inflate(R.layout.video_item_layout, (ViewGroup) null, false), aafoVar, jkvVar, null, kuaVar);
        Resources resources = context.getResources();
        View view = this.i;
        this.f = view;
        this.C = view.findViewById(R.id.text_layout);
        this.b = sncVar;
        this.a = new ajrp(aafoVar, gemVar);
        this.c = resources.getDimensionPixelSize(R.dimen.compact_video_padding_start_postv2);
        this.d = resources.getDimensionPixelSize(R.dimen.compact_video_padding_end_postv2);
        this.e = resources.getDimensionPixelSize(R.dimen.compact_video_padding_bottom_postv2);
        this.D = (LinearLayout) view.findViewById(R.id.video_info_view);
    }

    private static apmi d(awar awarVar) {
        apmg apmgVar = awarVar.r;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 2) != 0) {
            apmg apmgVar2 = awarVar.r;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmi apmiVar = apmgVar2.d;
            return apmiVar == null ? apmi.a : apmiVar;
        }
        return null;
    }

    private static final CharSequence e(awar awarVar) {
        arag aragVar;
        if ((awarVar.b & 1024) != 0) {
            aragVar = awarVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if (b != null) {
            return etk.j(b);
        }
        return null;
    }

    private static final CharSequence f(awar awarVar) {
        arag aragVar;
        arag aragVar2;
        if ((awarVar.b & 16384) != 0) {
            aragVar = awarVar.m;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        CharSequence b = ajgl.b(aragVar);
        if (!TextUtils.isEmpty(b)) {
            if ((awarVar.b & 2048) != 0) {
                aragVar2 = awarVar.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            Spanned b2 = ajgl.b(aragVar2);
            if (!TextUtils.isEmpty(b2)) {
                b = TextUtils.concat(b, " • ", b2);
            }
        } else {
            b = null;
        }
        if (b != null) {
            return etk.j(b);
        }
        return null;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        avss avssVar;
        avhn avhnVar;
        arag aragVar3;
        avss avssVar2;
        apmk apmkVar;
        awar awarVar = (awar) obj;
        apmh apmhVar = null;
        ajrsVar.a.u(new acte(awarVar.D), null);
        boolean z = d(awarVar) != null;
        ajrp ajrpVar = this.a;
        acti actiVar = ajrsVar.a;
        if ((awarVar.b & 32768) != 0) {
            apzgVar = awarVar.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
        if ((awarVar.b & 4096) != 0) {
            aragVar = awarVar.j;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((awarVar.b & 4096) != 0) {
            aragVar2 = awarVar.j;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        CharSequence i = ajgl.i(aragVar2);
        aopu aopuVar = awarVar.w;
        if ((awarVar.b & 2097152) != 0) {
            avssVar = awarVar.s;
            if (avssVar == null) {
                avssVar = avss.a;
            }
        } else {
            avssVar = null;
        }
        p(b, i, aopuVar, avssVar);
        if ((awarVar.b & 2) != 0) {
            avhnVar = awarVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        z(avhnVar);
        if (awarVar.v) {
            if (this.E == null) {
                this.E = ((ViewStub) this.i.findViewById(R.id.watched_overlay_stub)).inflate();
            }
            this.E.setVisibility(0);
        } else {
            View view = this.E;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        t(ohn.f(awarVar.w));
        awas awasVar = awarVar.x;
        if (awasVar == null) {
            awasVar = awas.a;
        }
        int Z = awwc.Z(awasVar.b);
        if ((Z != 0 && Z == 3) || ajrsVar.j("postsV2FullThumbnailStyle", false)) {
            LinearLayout linearLayout = this.D;
            int i2 = this.c;
            linearLayout.setPadding(i2, i2, this.d, this.e);
            this.C.setVisibility(0);
            if ((awarVar.b & 8) != 0) {
                aragVar3 = awarVar.g;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            B(ajgl.b(aragVar3));
            Context context = this.g;
            snc sncVar = this.b;
            if ((2097152 & awarVar.b) != 0) {
                avssVar2 = awarVar.s;
                if (avssVar2 == null) {
                    avssVar2 = avss.a;
                }
            } else {
                avssVar2 = null;
            }
            CharSequence g = lxh.g(context, sncVar, avssVar2);
            if (ajrsVar.j("postsV2NewMetadataStyle", false)) {
                CharSequence e = e(awarVar);
                if (TextUtils.isEmpty(g)) {
                    g = f(awarVar);
                }
                m(e, g, z);
            } else {
                if (TextUtils.isEmpty(g)) {
                    g = e(awarVar);
                    CharSequence f = f(awarVar);
                    if (TextUtils.isEmpty(f) || TextUtils.isEmpty(g)) {
                        if (!TextUtils.isEmpty(f)) {
                            g = f;
                        }
                    } else {
                        g = TextUtils.concat(g, " • ", f);
                    }
                }
                m(null, g, z);
            }
            apmg apmgVar = awarVar.q;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 1) != 0) {
                apmg apmgVar2 = awarVar.q;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apmkVar = apmgVar2.c;
                if (apmkVar == null) {
                    apmkVar = apmk.a;
                }
            } else {
                apmkVar = null;
            }
            w(apmkVar);
            apmg apmgVar3 = awarVar.p;
            if (apmgVar3 == null) {
                apmgVar3 = apmg.a;
            }
            if ((apmgVar3.b & 4) != 0) {
                apmg apmgVar4 = awarVar.p;
                if (apmgVar4 == null) {
                    apmgVar4 = apmg.a;
                }
                apmhVar = apmgVar4.e;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
            }
            u(apmhVar);
            v(d(awarVar));
            return;
        }
        this.D.setPadding(0, 0, 0, 0);
        this.C.setVisibility(8);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.a.c();
    }
}
