package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kyb  reason: default package */
/* loaded from: classes3.dex */
public final class kyb extends ajsl implements ajrm, ynl {
    private final fqx A;
    private final acuh B;
    private argv C;
    private final kyo D;
    private flx E;
    private final ajrc F;
    private final ajxt G;
    private boolean H;
    private final ViewGroup a;
    private final RecyclerView b;
    private final int c;
    private final RelativeLayout d;
    private final ajsm e;
    private final akfb f;
    private final yni g;
    private final TextView h;
    private final ajyc i;
    private final ImageView j;
    private final View k;
    private final View l;
    private final int m;
    private final Context n;
    private final Resources o;
    private final ViewGroup p;
    private final TextView q;
    private final fmg r;
    private final gga s;
    private final aafo t;
    private final ajsf u;
    private final LinearLayoutManager v;
    private final kya x;
    private final fly y;
    private final fqx z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, ajsa] */
    public kyb(Context context, ajyi ajyiVar, akfb akfbVar, yni yniVar, azqb azqbVar, fmh fmhVar, ggb ggbVar, fly flyVar, ajyc ajycVar, aafo aafoVar, ajxt ajxtVar, ajsg ajsgVar, acuh acuhVar, ViewGroup viewGroup) {
        this.n = context;
        this.f = akfbVar;
        this.g = yniVar;
        this.i = ajycVar;
        this.t = aafoVar;
        this.y = flyVar;
        this.G = ajxtVar;
        this.B = acuhVar;
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(R.layout.horizontal_card_list, (ViewGroup) null);
        this.a = viewGroup2;
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup2.findViewById(R.id.header_layout);
        this.d = relativeLayout;
        this.l = viewGroup2.findViewById(R.id.separator);
        kyo kyoVar = (kyo) azqbVar.get();
        this.D = kyoVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(16, R.id.card_list_button);
        relativeLayout.addView(kyoVar.a, 0, layoutParams);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.horizontal_card_list_header_top_bottom_padding_adjustment);
        View view = kyoVar.a;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + dimensionPixelSize, view.getPaddingRight(), view.getPaddingBottom() + dimensionPixelSize);
        this.m = context.getResources().getDimensionPixelOffset(R.dimen.horizontal_card_list_channel_peekaboo_adjustment);
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.card_list_container);
        this.b = recyclerView;
        if (viewGroup instanceof RecyclerView) {
            recyclerView.ah(((RecyclerView) viewGroup).g());
        }
        this.c = recyclerView.getPaddingTop();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.v = linearLayoutManager;
        linearLayoutManager.ab(0);
        recyclerView.ag(linearLayoutManager);
        recyclerView.v(new zaa(recyclerView));
        ajsm ajsmVar = new ajsm();
        this.e = ajsmVar;
        ajsf a = ajsgVar.a(ajyiVar.get());
        this.u = a;
        a.h(ajsmVar);
        ajrc ajrcVar = new ajrc();
        this.F = ajrcVar;
        a.rZ(ajrcVar);
        kya kyaVar = new kya();
        this.x = kyaVar;
        a.rZ(kyaVar);
        this.z = new fqx(context.getResources().getDimensionPixelSize(R.dimen.horizontal_card_list_item_spacing));
        this.A = new fqx(context.getResources().getDimensionPixelSize(R.dimen.horizontal_card_list_narrow_item_spacing));
        this.o = context.getResources();
        TextView textView = (TextView) viewGroup2.findViewById(R.id.card_list_button);
        this.h = textView;
        this.s = ggbVar.a(textView);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.card_list_subscribe_button);
        this.q = textView2;
        this.r = fmhVar.a(textView2, null);
        this.j = (ImageView) viewGroup2.findViewById(R.id.card_list_contextual_menu_anchor);
        this.k = viewGroup2.findViewById(R.id.card_list_contextual_menu_anchor_wrapper);
        this.p = (ViewGroup) viewGroup2.findViewById(R.id.sort_filter_sub_menu_container);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x037d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0409  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(defpackage.ajrs r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyb.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((argv) obj).j.I();
    }

    @Override // defpackage.ajrm
    public final boolean h(View view) {
        apoj apojVar;
        argv argvVar = this.C;
        if (argvVar != null) {
            aafo aafoVar = this.t;
            args argsVar = argvVar.g;
            if (argsVar == null) {
                argsVar = args.a;
            }
            if (argsVar.b == 65153809) {
                apojVar = (apoj) argsVar.c;
            } else {
                apojVar = apoj.a;
            }
            apzg apzgVar = apojVar.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            return false;
        }
        return false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                int indexOf = this.e.indexOf(((aabk) obj).b());
                if (indexOf < 0) {
                    return null;
                }
                this.e.remove(indexOf);
                ajxt ajxtVar = this.G;
                argv argvVar = this.C;
                argv a = ajxtVar.a(argvVar);
                if (indexOf >= a.d.size()) {
                    zep.b("Index greater than total number of cards");
                    return null;
                }
                aopc aopcVar = (aopc) a.mo52toBuilder();
                aopcVar.copyOnWrite();
                argv argvVar2 = (argv) aopcVar.instance;
                aopu aopuVar = argvVar2.d;
                if (!aopuVar.c()) {
                    argvVar2.d = aopi.mutableCopy(aopuVar);
                }
                argvVar2.d.remove(indexOf);
                argv argvVar3 = (argv) aopcVar.mo39build();
                if (akzj.f(argvVar3, ajxtVar.a.get(argvVar))) {
                    return null;
                }
                ajxtVar.a.put(argvVar, argvVar3);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aabk.class};
    }

    @Override // defpackage.ajsl
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.clear();
        this.g.m(this);
        this.D.qZ(ajsaVar);
        this.r.d();
    }
}
