package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ktd  reason: default package */
/* loaded from: classes3.dex */
public final class ktd implements View.OnClickListener, ajru {
    static final amup a = amup.k("offline_playlist_top_level_tab_id", "FEwhat_to_watch");
    private final Resources b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final RecyclerView g;
    private final RelativeLayout h;
    private final ImageView i;
    private final TextView j;
    private final ImageView k;
    private final ktb l;
    private final aafo m;
    private final snc n;
    private final ajmy o;
    private kso p;
    private ajrs q;

    public ktd(Context context, aafo aafoVar, ktc ktcVar, snc sncVar, ajmy ajmyVar, ViewGroup viewGroup) {
        this.m = aafoVar;
        this.o = ajmyVar;
        this.n = sncVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.commute_shelf_item, viewGroup, false);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.metadata);
        this.f = (TextView) inflate.findViewById(R.id.description);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.collage);
        this.g = recyclerView;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.thumbnail_layout);
        this.h = relativeLayout;
        this.i = (ImageView) relativeLayout.findViewById(R.id.thumbnail);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.duration);
        this.j = textView;
        textView.setTypeface(textView.getTypeface(), 1);
        this.k = (ImageView) inflate.findViewById(R.id.offline_badge);
        Resources resources = context.getResources();
        this.b = resources;
        ktb a2 = ktcVar.a(new xx(resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_width), resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_height)), new xx(resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_width), resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_double_height)), resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_avatar_width_height));
        this.l = a2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.g = new ksx(a2);
        recyclerView.ag(gridLayoutManager);
        recyclerView.ad(a2);
        recyclerView.aC(new ksw(a2, resources.getDimensionPixelSize(R.dimen.offline_commute_playlist_item_image_padding)));
        inflate.setOnClickListener(this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        Drawable drawable;
        String str;
        kso ksoVar = (kso) obj;
        this.p = ksoVar;
        this.q = ajrsVar;
        if (!ksoVar.a) {
            if (!ksoVar.h.isEmpty()) {
                avhnVar = (avhn) ksoVar.h.get(0);
            } else {
                avhnVar = avhn.a;
            }
            this.o.h(this.i, avhnVar);
            zag.m(this.j, ksoVar.j);
            this.h.setVisibility(0);
            this.g.setVisibility(8);
        } else {
            this.l.y(ksoVar.l, ksoVar.f, ksoVar.h);
            this.l.mr();
            this.h.setVisibility(8);
            this.g.setVisibility(0);
        }
        zag.m(this.d, ksoVar.c);
        if (ksoVar.a) {
            drawable = this.b.getDrawable(2131232625);
        } else {
            drawable = this.b.getDrawable(2131232420);
        }
        this.k.setImageDrawable(drawable);
        if (ksoVar.a) {
            zag.o(this.e, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!amps.e(ksoVar.d)) {
                spannableStringBuilder.append((CharSequence) ksoVar.d);
            }
            if (!amps.e(ksoVar.k)) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) " · ");
                }
                spannableStringBuilder.append((CharSequence) ksoVar.k);
            }
            zag.m(this.e, spannableStringBuilder);
        }
        if (!ksoVar.a) {
            zag.m(this.f, this.b.getString(R.string.offline_button_complete_text));
            this.f.setTextSize(2, 14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            Resources resources = this.b;
            int i = ksoVar.g;
            spannableStringBuilder2.append((CharSequence) resources.getQuantityString(R.plurals.video_count, i, Integer.valueOf(i))).append((CharSequence) " · ");
            if ((!ksoVar.a || !ksoVar.b.startsWith("BL")) && (str = ksoVar.d) != null) {
                spannableStringBuilder2.append((CharSequence) str);
            } else {
                spannableStringBuilder2.append((CharSequence) nni.n(this.b, this.n, ksoVar.i.toEpochMilli()));
            }
            zag.m(this.f, spannableStringBuilder2);
            this.f.setTextSize(2, 12.0f);
        }
        awbs d = d();
        if (d == null) {
            return;
        }
        this.q.a.o(acun.a(d), acun.a(ajra.d(this.q)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.p == null) {
            return;
        }
        awbs d = d();
        if (d != null) {
            this.q.a.H(3, acun.a(d), null);
        }
        this.m.c(this.p.e, a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.p = null;
        this.q = null;
    }

    private final awbs d() {
        aopa createBuilder;
        ajrs ajrsVar;
        kso ksoVar = this.p;
        awbs awbsVar = null;
        if (ksoVar != null && (ajrsVar = this.q) != null) {
            awbsVar = ajrsVar.a.i(ksoVar.b, actj.BUNDLE_ITEM_COMMUTE_SHELF, this.q.b("position", -1));
        }
        if (awbsVar != null) {
            aopa mo52toBuilder = awbsVar.mo52toBuilder();
            if (this.p.a) {
                createBuilder = apxg.a.createBuilder();
                aopa createBuilder2 = apxn.a.createBuilder();
                aoob z = aoob.z(this.p.b);
                createBuilder2.copyOnWrite();
                apxn apxnVar = (apxn) createBuilder2.instance;
                apxnVar.b |= 1;
                apxnVar.c = z;
                createBuilder.copyOnWrite();
                apxg apxgVar = (apxg) createBuilder.instance;
                apxn apxnVar2 = (apxn) createBuilder2.mo39build();
                apxnVar2.getClass();
                apxgVar.e = apxnVar2;
                apxgVar.b |= 4;
            } else {
                createBuilder = apxg.a.createBuilder();
                aopa createBuilder3 = apxl.a.createBuilder();
                aoob z2 = aoob.z(this.p.b);
                createBuilder3.copyOnWrite();
                apxl apxlVar = (apxl) createBuilder3.instance;
                apxlVar.b |= 1;
                apxlVar.c = z2;
                createBuilder.copyOnWrite();
                apxg apxgVar2 = (apxg) createBuilder.instance;
                apxl apxlVar2 = (apxl) createBuilder3.mo39build();
                apxlVar2.getClass();
                apxgVar2.d = apxlVar2;
                apxgVar2.b |= 2;
            }
            mo52toBuilder.copyOnWrite();
            awbs awbsVar2 = (awbs) mo52toBuilder.instance;
            apxg apxgVar3 = (apxg) createBuilder.mo39build();
            apxgVar3.getClass();
            awbsVar2.h = apxgVar3;
            awbsVar2.b |= 64;
            return (awbs) mo52toBuilder.mo39build();
        }
        return awbsVar;
    }
}
