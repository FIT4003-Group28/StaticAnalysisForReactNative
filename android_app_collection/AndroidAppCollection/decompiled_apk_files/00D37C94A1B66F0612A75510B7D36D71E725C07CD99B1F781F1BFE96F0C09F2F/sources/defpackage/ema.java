package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.List;
/* compiled from: PG */
/* renamed from: ema  reason: default package */
/* loaded from: classes3.dex */
public final class ema extends ekl {
    private final View k;
    private final akem l;
    private final akbm m;

    public ema(Context context, ajmy ajmyVar, gem gemVar, ajrq ajrqVar, ajyc ajycVar, akbn akbnVar, fmh fmhVar, fnz fnzVar, akem akemVar) {
        super(context, ajmyVar, gemVar, ajrqVar, ajycVar, fmhVar, fnzVar);
        this.k = this.e.findViewById(R.id.avatar_layout);
        this.l = akemVar;
        TextView textView = this.h;
        this.m = textView != null ? akbnVar.a(textView) : null;
    }

    public static final CharSequence q(aqdi aqdiVar) {
        arag aragVar;
        if ((aqdiVar.b & 32) != 0) {
            aragVar = aqdiVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    public static final apmo r(aqdi aqdiVar) {
        for (aplw aplwVar : aqdiVar.j) {
            if ((aplwVar.b & 16777216) != 0) {
                apmo apmoVar = aplwVar.h;
                return apmoVar == null ? apmo.a : apmoVar;
            }
        }
        return null;
    }

    public static final CharSequence s(aqdi aqdiVar) {
        arag aragVar;
        if ((aqdiVar.b & 16) != 0) {
            aragVar = aqdiVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ apzg d(Object obj) {
        apzg apzgVar = ((aqdi) obj).g;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ ates e(Object obj) {
        ates atesVar = ((aqdi) obj).k;
        return atesVar == null ? ates.a : atesVar;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ avaq f(Object obj) {
        aqdi aqdiVar = (aqdi) obj;
        aqdj aqdjVar = aqdiVar.h;
        if (aqdjVar == null) {
            aqdjVar = aqdj.a;
        }
        if ((aqdjVar.b & 1) != 0) {
            aqdj aqdjVar2 = aqdiVar.h;
            if (aqdjVar2 == null) {
                aqdjVar2 = aqdj.a;
            }
            avaq avaqVar = aqdjVar2.c;
            return avaqVar == null ? avaq.a : avaqVar;
        }
        return null;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ avhn g(Object obj) {
        avhn avhnVar = ((aqdi) obj).c;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence h(Object obj) {
        return q((aqdi) obj);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence i(Object obj) {
        return s((aqdi) obj);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence j(Object obj) {
        return q((aqdi) obj);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence k(Object obj) {
        arag aragVar;
        aqdi aqdiVar = (aqdi) obj;
        if (r(aqdiVar) == null) {
            if ((aqdiVar.b & 8) != 0) {
                aragVar = aqdiVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            return ajgl.b(aragVar);
        }
        return r(aqdiVar).b;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ CharSequence l(Object obj) {
        return s((aqdi) obj);
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ Object m(Object obj, avaq avaqVar) {
        aqdi aqdiVar = (aqdi) obj;
        if ((aqdiVar.b & 256) != 0) {
            aopc aopcVar = (aopc) aqdiVar.mo52toBuilder();
            aqdj aqdjVar = aqdiVar.h;
            if (aqdjVar == null) {
                aqdjVar = aqdj.a;
            }
            aopa mo52toBuilder = aqdjVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            aqdj aqdjVar2 = (aqdj) mo52toBuilder.instance;
            avaqVar.getClass();
            aqdjVar2.c = avaqVar;
            aqdjVar2.b |= 1;
            aopcVar.copyOnWrite();
            aqdi aqdiVar2 = (aqdi) aopcVar.instance;
            aqdj aqdjVar3 = (aqdj) mo52toBuilder.mo39build();
            aqdjVar3.getClass();
            aqdiVar2.h = aqdjVar3;
            aqdiVar2.b |= 256;
            return (aqdi) aopcVar.mo39build();
        }
        return aqdiVar;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ List n(Object obj) {
        return ((aqdi) obj).i;
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ byte[] o(Object obj) {
        return ((aqdi) obj).m.I();
    }

    @Override // defpackage.ekl, defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apoj apojVar;
        aqdi aqdiVar = (aqdi) obj;
        super.oK(ajrsVar, aqdiVar);
        zgd.t(this.k, zgd.r(this.a.getResources().getDimensionPixelSize(R.dimen.list_item_thumbnail_width)), ViewGroup.LayoutParams.class);
        TextView textView = (TextView) this.e.findViewById(R.id.channel_name);
        boolean z = false;
        if (r(aqdiVar) != null) {
            zai zaiVar = new zai(zhn.d(textView.getContext(), R.attr.ytVerifiedBadgeBackground));
            textView.setMaxLines(2);
            textView.setBackground(zaiVar);
            textView.getViewTreeObserver().addOnPreDrawListener(new elz(aqdiVar, textView, zaiVar));
        } else {
            textView.setBackground(null);
            textView.setMaxLines(this.a.getResources().getInteger(R.integer.compact_renderer_title_max_lines));
            textView.setPadding(0, 0, 0, 0);
        }
        acti actiVar = ajrsVar.a;
        if (this.m == null) {
            zag.o(this.h, false);
        } else {
            if ((aqdiVar.b & 131072) != 0) {
                aunb aunbVar = aqdiVar.n;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
            } else {
                apojVar = null;
            }
            this.m.b(apojVar, actiVar);
            TextView textView2 = this.h;
            if (apojVar != null) {
                z = true;
            }
            zag.o(textView2, z);
        }
        this.l.b(this.e, this.l.a(this.e, null));
    }
}
