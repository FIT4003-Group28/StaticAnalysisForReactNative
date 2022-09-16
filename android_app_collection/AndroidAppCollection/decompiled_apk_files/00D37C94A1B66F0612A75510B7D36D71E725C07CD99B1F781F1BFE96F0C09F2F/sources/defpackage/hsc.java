package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.emoji.widget.EmojiTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: hsc  reason: default package */
/* loaded from: classes3.dex */
public final class hsc extends hte implements View.OnClickListener {
    private auzh A;
    private EmojiTextView B;
    public final FrameLayout t;
    public final ImageView u;
    public final htd v;
    public Bitmap w;
    private final hux y;
    private final apy z;

    public hsc(View view, htd htdVar, hux huxVar, apy apyVar) {
        super(view);
        this.t = (FrameLayout) view.findViewById(R.id.dynamic_sticker_container);
        this.u = (ImageView) view.findViewById(R.id.sticker);
        this.v = htdVar;
        this.y = huxVar;
        this.z = apyVar;
    }

    private final View G(Context context, int i, int i2) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(context, i2)).inflate(i, new FrameLayout(context));
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        arag aragVar = this.A.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        textView.setText(b);
        textView.setAllCaps(true);
        this.u.setContentDescription(b != null ? b.toString() : "");
        return inflate;
    }

    private final void H(auzh auzhVar) {
        if (this.v.a() == null) {
            return;
        }
        this.v.a().H(3, hve.a(auzhVar), null);
    }

    private final void I(auzh auzhVar) {
        arag aragVar = auzhVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        this.u.setContentDescription(b != null ? b.toString() : "");
    }

    @Override // defpackage.hte
    public final void E() {
        if (!this.x.qn(StickerCatalogRendererOuterClass.dynamicStickerRenderer)) {
            throw new IllegalArgumentException("renderer missing");
        }
        this.A = (auzh) this.x.qm(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
        Context context = this.u.getContext();
        int e = aqvb.e(this.A.c);
        int i = 1;
        if (e == 0) {
            e = 1;
        }
        switch (e - 1) {
            case 1:
                Bitmap c = aakr.c(context, G(context, R.layout.location_sticker, ((Integer) hsq.a.get(hsq.b)).intValue()));
                this.w = c;
                this.u.setImageBitmap(c);
                break;
            case 2:
                View G = G(context, R.layout.user_mention_sticker, ((Integer) hub.a.get(hub.b)).intValue());
                ((htf) this.v).i.e((ImageView) G.findViewById(R.id.icon));
                Bitmap c2 = aakr.c(context, G);
                this.w = c2;
                this.u.setImageBitmap(c2);
                break;
            case 3:
                if (this.B == null) {
                    this.B = (EmojiTextView) ((ViewStub) this.t.findViewById(R.id.unicode_emoji_sticker_stub)).inflate();
                }
                EmojiTextView emojiTextView = this.B;
                int i2 = this.t.getLayoutParams().height;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.unicode_emoji_sticker_padding);
                emojiTextView.setTextSize(1, (int) (Math.min(i2 - (dimensionPixelSize + dimensionPixelSize), context.getResources().getDimensionPixelSize(R.dimen.dynamic_sticker_max_height)) / context.getResources().getDisplayMetrics().scaledDensity));
                EmojiTextView emojiTextView2 = this.B;
                arag aragVar = this.A.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                emojiTextView2.setText(ajgl.b(aragVar));
                break;
            case 4:
                View inflate = LayoutInflater.from(context).inflate(R.layout.date_sticker, new FrameLayout(context));
                ((TextView) inflate.findViewById(R.id.date)).setText(new SimpleDateFormat("d", Locale.getDefault()).format(new Date()));
                Bitmap c3 = aakr.c(context, inflate);
                this.w = c3;
                this.u.setImageBitmap(c3);
                I(this.A);
                break;
            case 5:
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.time_sticker, new FrameLayout(context));
                ((TextView) inflate2.findViewById(R.id.time)).setText(new SimpleDateFormat("h:mm", Locale.getDefault()).format(new Date()));
                ((TextView) inflate2.findViewById(R.id.am_pm_indicator)).setText(Calendar.getInstance().getDisplayName(9, 1, Locale.getDefault()));
                Bitmap c4 = aakr.c(context, inflate2);
                this.w = c4;
                this.u.setImageBitmap(c4);
                I(this.A);
                break;
            case 6:
            default:
                int e2 = aqvb.e(this.A.c);
                if (e2 != 0) {
                    i = e2;
                }
                StringBuilder sb = new StringBuilder(28);
                sb.append("unexpected type: ");
                sb.append(i - 1);
                throw new IllegalArgumentException(sb.toString());
            case 7:
                Bitmap c5 = aakr.c(context, G(context, R.layout.video_sticker_picker, R.style.NormalDynamicSticker));
                this.w = c5;
                this.u.setImageBitmap(c5);
                break;
            case 8:
                String str = (String) hvd.c.get(Integer.valueOf(Calendar.getInstance().get(7)));
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 77);
                sb2.append("https://www.gstatic.com/youtube/kazoo/server/assets/stickers/day_of_week_");
                sb2.append(str);
                sb2.append(".png");
                this.y.a(Uri.parse(sb2.toString()), new hsb(this, (ImageView) LayoutInflater.from(context).inflate(R.layout.day_of_week_sticker, (ViewGroup) null), context));
                break;
            case 9:
                Bitmap c6 = aakr.c(context, G(context, R.layout.link_sticker, R.style.NormalDynamicSticker));
                this.w = c6;
                this.u.setImageBitmap(c6);
                break;
        }
        this.t.setOnClickListener(this);
        auzh auzhVar = this.A;
        if (this.v.a() == null) {
            return;
        }
        this.v.a().u(hve.a(auzhVar), null);
    }

    @Override // defpackage.hte
    public final void F() {
        this.u.setImageDrawable(null);
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            bitmap.recycle();
            this.w = null;
        }
        EmojiTextView emojiTextView = this.B;
        if (emojiTextView != null) {
            emojiTextView.setText((CharSequence) null);
        }
        this.A = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int e = aqvb.e(this.A.c);
        int i = 1;
        if (e == 0) {
            e = 1;
        }
        switch (e - 1) {
            case 1:
                H(this.A);
                hsq hsqVar = ((htf) this.v).h;
                aopc aopcVar = (aopc) aunb.a.createBuilder();
                aopcVar.e(StickerCatalogRendererOuterClass.dynamicStickerRenderer, this.A);
                boolean z = ((htf) this.v).v;
                hsqVar.m = (aunb) aopcVar.mo39build();
                hsqVar.n = z;
                if (!hsqVar.f || akdr.g(hsqVar.d)) {
                    hsqVar.f();
                    return;
                }
                hsqVar.h = hsqVar.c();
                hsqVar.h.a();
                return;
            case 2:
                H(this.A);
                hub hubVar = ((htf) this.v).i;
                aopc aopcVar2 = (aopc) aunb.a.createBuilder();
                aopcVar2.e(StickerCatalogRendererOuterClass.dynamicStickerRenderer, this.A);
                boolean z2 = ((htf) this.v).v;
                hubVar.l = (aunb) aopcVar2.mo39build();
                hubVar.m = z2;
                hubVar.o.b();
                hubVar.j.setVisibility(0);
                iid iidVar = hubVar.k;
                if (!TextUtils.isEmpty(iidVar.d.getText())) {
                    iidVar.d.setText("");
                }
                iidVar.d.requestFocus();
                zag.p(iidVar.d);
                iidVar.a(iidVar.a.getString(R.string.user_mention_search_view_results_box_hint));
                iidVar.c.e();
                return;
            case 3:
                ((htf) this.v).p.b(this.x, this.z);
                this.t.removeView(this.B);
                H(this.A);
                ((htf) this.v).w.a();
                htf htfVar = (htf) this.v;
                hrd hrdVar = htfVar.j;
                EmojiTextView emojiTextView = this.B;
                boolean z3 = htfVar.v;
                axbl j = axbm.j();
                String charSequence = emojiTextView.getText().toString();
                if (!hrdVar.c.a(charSequence).isEmpty()) {
                    hrdVar.d.oi().n(new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON));
                }
                aopa createBuilder = axcg.a.createBuilder();
                createBuilder.copyOnWrite();
                axcg axcgVar = (axcg) createBuilder.instance;
                charSequence.getClass();
                axcgVar.b |= 2;
                axcgVar.d = charSequence;
                amuk a = hrdVar.c.a(charSequence);
                if (!a.isEmpty()) {
                    aopa createBuilder2 = axch.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    axch axchVar = (axch) createBuilder2.instance;
                    charSequence.getClass();
                    axchVar.b |= 1;
                    axchVar.c = charSequence;
                    createBuilder2.copyOnWrite();
                    axch axchVar2 = (axch) createBuilder2.instance;
                    aopu aopuVar = axchVar2.d;
                    if (!aopuVar.c()) {
                        axchVar2.d = aopi.mutableCopy(aopuVar);
                    }
                    aonk.addAll((Iterable) a, (List) axchVar2.d);
                    axch axchVar3 = (axch) createBuilder2.mo39build();
                    createBuilder.copyOnWrite();
                    axcg axcgVar2 = (axcg) createBuilder.instance;
                    axchVar3.getClass();
                    axcgVar2.e = axchVar3;
                    axcgVar2.b |= 4;
                }
                aopa createBuilder3 = axbk.a.createBuilder();
                createBuilder3.copyOnWrite();
                axbk axbkVar = (axbk) createBuilder3.instance;
                axcg axcgVar3 = (axcg) createBuilder.mo39build();
                axcgVar3.getClass();
                axbkVar.d = axcgVar3;
                axbkVar.c = 7;
                createBuilder3.copyOnWrite();
                axbk axbkVar2 = (axbk) createBuilder3.instance;
                axbkVar2.b |= 4096;
                axbkVar2.e = z3;
                boolean b = hrdVar.f.b();
                createBuilder3.copyOnWrite();
                axbk axbkVar3 = (axbk) createBuilder3.instance;
                axbkVar3.b |= 8192;
                axbkVar3.f = b;
                j.copyOnWrite();
                ((axbm) j.instance).F((axbk) createBuilder3.mo39build());
                hxb.e(hrdVar.a, hrdVar.g, emojiTextView, j, new hrb(hrdVar, 1));
                return;
            case 4:
                H(this.A);
                ((htf) this.v).p.b(this.x, this.z);
                ((htf) this.v).w.a();
                htf htfVar2 = (htf) this.v;
                hvl hvlVar = htfVar2.x;
                Bitmap bitmap = this.w;
                boolean z4 = htfVar2.v;
                aopa createBuilder4 = axbk.a.createBuilder();
                createBuilder4.copyOnWrite();
                axbk axbkVar4 = (axbk) createBuilder4.instance;
                axbkVar4.b |= 4096;
                axbkVar4.e = z4;
                axab axabVar = axab.a;
                createBuilder4.copyOnWrite();
                axbk axbkVar5 = (axbk) createBuilder4.instance;
                axabVar.getClass();
                axbkVar5.d = axabVar;
                axbkVar5.c = 9;
                boolean b2 = hvlVar.c.b();
                createBuilder4.copyOnWrite();
                axbk axbkVar6 = (axbk) createBuilder4.instance;
                axbkVar6.b |= 8192;
                axbkVar6.f = b2;
                axbl j2 = axbm.j();
                j2.copyOnWrite();
                ((axbm) j2.instance).F((axbk) createBuilder4.mo39build());
                hxb.d(hvlVar.a, bitmap, j2, new huy(hvlVar.b));
                return;
            case 5:
                H(this.A);
                ((htf) this.v).p.b(this.x, this.z);
                ((htf) this.v).w.a();
                htf htfVar3 = (htf) this.v;
                hvl hvlVar2 = htfVar3.m;
                Bitmap bitmap2 = this.w;
                boolean z5 = htfVar3.v;
                aopa createBuilder5 = axbk.a.createBuilder();
                createBuilder5.copyOnWrite();
                axbk axbkVar7 = (axbk) createBuilder5.instance;
                axbkVar7.b |= 4096;
                axbkVar7.e = z5;
                axcb axcbVar = axcb.a;
                createBuilder5.copyOnWrite();
                axbk axbkVar8 = (axbk) createBuilder5.instance;
                axcbVar.getClass();
                axbkVar8.d = axcbVar;
                axbkVar8.c = 8;
                boolean b3 = hvlVar2.c.b();
                createBuilder5.copyOnWrite();
                axbk axbkVar9 = (axbk) createBuilder5.instance;
                axbkVar9.b |= 8192;
                axbkVar9.f = b3;
                axbl j3 = axbm.j();
                j3.copyOnWrite();
                ((axbm) j3.instance).F((axbk) createBuilder5.mo39build());
                hxb.d(hvlVar2.a, bitmap2, j3, new huy(hvlVar2.b, 3));
                return;
            case 6:
            default:
                int e2 = aqvb.e(this.A.c);
                if (e2 != 0) {
                    i = e2;
                }
                StringBuilder sb = new StringBuilder(28);
                sb.append("unexpected type: ");
                sb.append(i - 1);
                throw new IllegalArgumentException(sb.toString());
            case 7:
                H(this.A);
                htf htfVar4 = (htf) this.v;
                hun hunVar = htfVar4.k;
                aunb aunbVar = this.x;
                boolean z6 = htfVar4.v;
                hunVar.c.b(aunbVar, hunVar.a);
                hunVar.i = z6;
                new huj().qv(hunVar.a.getSupportFragmentManager(), "reels_video_picker_fragment");
                return;
            case 8:
                H(this.A);
                ((htf) this.v).p.b(this.x, this.z);
                ((htf) this.v).w.a();
                htf htfVar5 = (htf) this.v;
                final hvd hvdVar = htfVar5.n;
                Bitmap bitmap3 = this.w;
                boolean z7 = htfVar5.v;
                hvdVar.g.oi().n(new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON));
                aopa createBuilder6 = axbk.a.createBuilder();
                createBuilder6.copyOnWrite();
                axbk axbkVar10 = (axbk) createBuilder6.instance;
                axbkVar10.b |= 4096;
                axbkVar10.e = z7;
                aopa createBuilder7 = axac.a.createBuilder();
                aopa createBuilder8 = axad.b.createBuilder();
                axae axaeVar = hvd.a;
                createBuilder8.copyOnWrite();
                axad axadVar = (axad) createBuilder8.instance;
                axadVar.d = axaeVar.d;
                axadVar.c |= 1;
                amvn<axae> amvnVar = hvd.b;
                createBuilder8.copyOnWrite();
                axad axadVar2 = (axad) createBuilder8.instance;
                aopq aopqVar = axadVar2.e;
                if (!aopqVar.c()) {
                    axadVar2.e = aopi.mutableCopy(aopqVar);
                }
                for (axae axaeVar2 : amvnVar) {
                    axadVar2.e.g(axaeVar2.d);
                }
                axad axadVar3 = (axad) createBuilder8.mo39build();
                createBuilder7.copyOnWrite();
                axac axacVar = (axac) createBuilder7.instance;
                axadVar3.getClass();
                axacVar.d = axadVar3;
                axacVar.b |= 2;
                createBuilder6.copyOnWrite();
                axbk axbkVar11 = (axbk) createBuilder6.instance;
                axac axacVar2 = (axac) createBuilder7.mo39build();
                axacVar2.getClass();
                axbkVar11.d = axacVar2;
                axbkVar11.c = 12;
                createBuilder6.copyOnWrite();
                axbk axbkVar12 = (axbk) createBuilder6.instance;
                axbkVar12.b |= 8192;
                axbkVar12.f = true;
                axbl j4 = axbm.j();
                j4.copyOnWrite();
                ((axbm) j4.instance).F((axbk) createBuilder6.mo39build());
                Matrix matrix = new Matrix();
                matrix.preScale(0.5f, 0.5f, 0.5f, 0.5f);
                aotm e3 = aahp.e(matrix);
                j4.copyOnWrite();
                ((axbm) j4.instance).E(e3);
                hxb.d(hvdVar.d, bitmap3, j4, new hvg() { // from class: huz
                    @Override // defpackage.hvg
                    public final void a(axbl axblVar) {
                        hvd hvdVar2 = hvd.this;
                        hvdVar2.f.aH(axblVar);
                        hvdVar2.h.d(axblVar);
                    }
                });
                return;
            case 9:
                H(this.A);
                ((htf) this.v).p.b(this.x, this.z);
                hvh hvhVar = ((htf) this.v).o;
                try {
                    final htq htqVar = hvhVar.c;
                    if (((Boolean) ylx.b(htqVar.c, htqVar.d.a(), new ampg() { // from class: htm
                        @Override // defpackage.ampg
                        public final Object apply(Object obj) {
                            htq htqVar2 = htq.this;
                            hwp hwpVar = (hwp) obj;
                            boolean z8 = true;
                            if (hwpVar.e == 0) {
                                return true;
                            }
                            if (htqVar2.b.c() - hwpVar.e <= htq.a) {
                                z8 = false;
                            }
                            return Boolean.valueOf(z8);
                        }
                    }).get()).booleanValue()) {
                        hvhVar.d.G();
                    } else {
                        hvhVar.e.G();
                    }
                } catch (Exception e4) {
                    zep.d("Error reading from protoDataStore", e4);
                }
                ((htf) this.v).w.a();
                return;
        }
    }
}
