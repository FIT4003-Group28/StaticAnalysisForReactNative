package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import com.google.protos.youtube.api.innertube.PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ihl  reason: default package */
/* loaded from: classes3.dex */
public final class ihl implements ajru {
    public final Activity a;
    public final Executor b;
    public final ajmr c;
    public final aafo d;
    final LinearLayout f;
    public boolean h;
    public igs i;
    private final alaz j;
    private final afvn l;
    private final akys m;
    private final ajmy o;
    private final fzs p;
    private ajrs q;
    private PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer r;
    private ankt s;
    private final acth t;
    private final alax k = new ihd(this);
    final Map e = new HashMap();
    public boolean g = false;
    private final ihk n = new ihk(this);

    public ihl(Activity activity, Executor executor, afvn afvnVar, alaz alazVar, ajmr ajmrVar, akys akysVar, aafo aafoVar, ajmy ajmyVar, ajxz ajxzVar, acth acthVar) {
        this.a = activity;
        this.b = executor;
        this.l = afvnVar;
        this.c = ajmrVar;
        this.j = alazVar;
        this.m = akysVar;
        this.d = aafoVar;
        this.o = ajmyVar;
        this.p = new fzs(activity, ajxzVar);
        this.f = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.reel_upload_bottomsheet_root_view, (ViewGroup) null);
        this.t = acthVar;
    }

    private final boolean m() {
        return this.f.findViewWithTag("WATCH_STORY_TAG") != null;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    public final void d(String str) {
        if (((ggq) this.e.get(str)) != null) {
            this.e.remove(str);
            View findViewWithTag = this.f.findViewWithTag(str);
            ((ImageView) findViewWithTag.findViewById(R.id.reel_upload_thumbnail)).setImageDrawable(null);
            this.f.removeView(findViewWithTag);
        }
    }

    public final void e(final alcw alcwVar) {
        String queryParameter;
        int i;
        alcu a = alcu.a(alcwVar.l);
        if (a == null) {
            a = alcu.UNKNOWN_UPLOAD;
        }
        if (a != alcu.REELS_UPLOAD || this.l.c() == null) {
            return;
        }
        this.l.c().d();
        if (!this.l.c().d().equals(alcwVar.e)) {
            return;
        }
        String str = alcwVar.k;
        zgh.m(str);
        ggq ggqVar = (ggq) this.e.get(str);
        if (ggqVar == null) {
            aopa createBuilder = ater.a.createBuilder();
            arag g = ajgl.g(this.a.getResources().getString(R.string.reel_upload_bottomsheet_delete_upload));
            createBuilder.copyOnWrite();
            ater aterVar = (ater) createBuilder.instance;
            g.getClass();
            aterVar.c = g;
            aterVar.b |= 1;
            aopa createBuilder2 = DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.a.createBuilder();
            String str2 = alcwVar.k;
            createBuilder2.copyOnWrite();
            DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) createBuilder2.instance;
            str2.getClass();
            deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.b |= 4;
            deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d = str2;
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint, (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) createBuilder2.mo39build());
            createBuilder.copyOnWrite();
            ater aterVar2 = (ater) createBuilder.instance;
            apzg apzgVar = (apzg) aopcVar.mo39build();
            apzgVar.getClass();
            aterVar2.e = apzgVar;
            aterVar2.b |= 8;
            aopa createBuilder3 = aten.a.createBuilder();
            createBuilder3.copyOnWrite();
            aten atenVar = (aten) createBuilder3.instance;
            ater aterVar3 = (ater) createBuilder.mo39build();
            aterVar3.getClass();
            atenVar.d = aterVar3;
            atenVar.b |= 2;
            aten atenVar2 = (aten) createBuilder3.mo39build();
            aopa createBuilder4 = atep.a.createBuilder();
            createBuilder4.copyOnWrite();
            atep atepVar = (atep) createBuilder4.instance;
            atenVar2.getClass();
            atepVar.a();
            atepVar.c.add(atenVar2);
            ggq ggqVar2 = new ggq(str, (atep) createBuilder4.mo39build(), alcwVar.f);
            this.e.put(str, ggqVar2);
            this.j.b(this.l.c(), alcwVar.k, null, alcwVar.V);
            ggqVar = ggqVar2;
        }
        alct alctVar = alcwVar.H;
        if (alctVar == null) {
            alctVar = alct.a;
        }
        ggqVar.c(alctVar);
        if (alcwVar.ad) {
            ggqVar.b();
        }
        String str3 = alcwVar.k;
        ggq ggqVar3 = (ggq) this.e.get(str3);
        if (ggqVar3 == null || this.f.findViewWithTag(str3) != null) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.a).inflate(R.layout.reel_upload_bottomsheet_cell, (ViewGroup) this.f, false);
        relativeLayout.setTag(str3);
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.reel_upload_thumbnail);
        Uri uri = ggqVar3.a;
        if (uri != null && (queryParameter = uri.getQueryParameter("videoThumbnailFilePath")) != null && new File(queryParameter).exists()) {
            int dimension = (int) this.a.getResources().getDimension(R.dimen.reel_upload_bottomsheet_circular_thumbnail_size);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(queryParameter, options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            if (i2 > dimension || i3 > dimension) {
                int i4 = i2 / 2;
                int i5 = i3 / 2;
                i = 1;
                while (i4 / i >= dimension && i5 / i >= dimension) {
                    i += i;
                }
            } else {
                i = 1;
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            Bitmap decodeFile = BitmapFactory.decodeFile(queryParameter, options);
            if (decodeFile != null) {
                imageView.setImageBitmap(decodeFile);
                this.h = true;
            }
        }
        ((ImageView) relativeLayout.findViewById(R.id.reel_upload_delete_button)).setOnClickListener(new View.OnClickListener() { // from class: igv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ihl ihlVar = ihl.this;
                alcw alcwVar2 = alcwVar;
                aopc aopcVar2 = (aopc) apzg.a.createBuilder();
                aopg aopgVar = DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint;
                aopa createBuilder5 = DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.a.createBuilder();
                String str4 = alcwVar2.k;
                createBuilder5.copyOnWrite();
                DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2 = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) createBuilder5.instance;
                str4.getClass();
                deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2.b |= 4;
                deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2.d = str4;
                aopcVar2.e(aopgVar, (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) createBuilder5.mo39build());
                ihlVar.d.c((apzg) aopcVar2.mo39build(), null);
            }
        });
        k(str3);
        this.f.addView(relativeLayout, m() ? 1 : 0);
        l(ggqVar3);
        this.f.setVisibility(0);
        if (!zdg.e(this.f.getContext())) {
            return;
        }
        zdg.c(this.f.getContext(), relativeLayout, this.f.getContext().getString(R.string.reel_upload_bottomsheet_content_description));
    }

    public final void f() {
        igs igsVar = this.i;
        if (igsVar != null) {
            igsVar.a.z();
        }
        i();
    }

    @Override // defpackage.ajru
    /* renamed from: h */
    public final void oK(ajrs ajrsVar, PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer) {
        this.q = ajrsVar;
        this.r = pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;
        this.f.removeAllViews();
        this.t.oi().u(new acte(pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.f), null);
        afvm c = this.l.c();
        this.j.a(this.k);
        this.m.d(this.n);
        ankt b = this.m.b(c);
        this.s = b;
        boolean z = true;
        this.g = true;
        ylx.k(b, this.b, gpe.i, new ylw() { // from class: igy
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ihl ihlVar = ihl.this;
                List<alcw> list = (List) obj;
                if (ihlVar.g) {
                    for (alcw alcwVar : list) {
                        alcv a = alcv.a(alcwVar.X);
                        if (a == null) {
                            a = alcv.UNKNOWN;
                        }
                        if (a == alcv.UNKNOWN || a == alcv.NOT_CREATED) {
                            ihlVar.e(alcwVar);
                        }
                    }
                }
            }
        });
        PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer2 = this.r;
        if ((pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer2.b & 8) == 0) {
            z = false;
        }
        aunb aunbVar = pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer2.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        final apoj b2 = hqp.b(z, aunbVar);
        if (b2 != null) {
            View inflate = LayoutInflater.from(this.a).inflate(R.layout.reel_upload_bottomsheet_open_camera, (ViewGroup) this.f, false);
            inflate.setTag("ADD_TO_STORY_TAG");
            TextView textView = (TextView) inflate.findViewById(R.id.label_view);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon_view);
            Resources resources = this.a.getResources();
            fzs fzsVar = this.p;
            arhs arhsVar = b2.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b3 = arhr.b(arhsVar.c);
            if (b3 == null) {
                b3 = arhr.UNKNOWN;
            }
            imageView.setImageDrawable(resources.getDrawable(fzsVar.a(b3)));
            arag aragVar = b2.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            inflate.setOnClickListener(new View.OnClickListener() { // from class: igw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ihl ihlVar = ihl.this;
                    apoj apojVar = b2;
                    aafo aafoVar = ihlVar.d;
                    apzg apzgVar = apojVar.p;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, null);
                    ihlVar.f();
                }
            });
            this.f.addView(inflate, 0);
            this.t.oi().u(new acte(b2.t), null);
        }
        aunb aunbVar2 = this.r.d;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        int bP = awwc.bP(((ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer) aunbVar2.qm(ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.channelReelAvatarRenderer)).e);
        if (bP != 0 && bP == 3) {
            return;
        }
        j();
    }

    public final void i() {
        akaf akafVar;
        ajrs ajrsVar = this.q;
        if (ajrsVar == null || (akafVar = (akaf) ajrsVar.c("sectionListController")) == null) {
            return;
        }
        akafVar.ll();
    }

    public final void j() {
        if (m()) {
            return;
        }
        aopa createBuilder = atnp.a.createBuilder();
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 2;
        atnpVar.d = 6827;
        atnp atnpVar2 = (atnp) createBuilder.mo39build();
        aunb aunbVar = this.r.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer = (ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer) ajjh.k(aunbVar);
        if (channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer == null) {
            return;
        }
        this.t.oi().u(new acte(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.h), null);
        apzg apzgVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        aopcVar.e(atno.b, atnpVar2);
        final apzg apzgVar2 = (apzg) aopcVar.mo39build();
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.reel_upload_bottomsheet_view_story, (ViewGroup) this.f, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.avatar_view);
        ajmy ajmyVar = this.o;
        avhn avhnVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar, null);
        inflate.setTag("WATCH_STORY_TAG");
        inflate.setOnClickListener(new View.OnClickListener() { // from class: igx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ihl ihlVar = ihl.this;
                apzg apzgVar3 = apzgVar2;
                ihlVar.f();
                ihlVar.d.c(apzgVar3, null);
            }
        });
        this.f.addView(inflate, 0);
    }

    public final void k(String str) {
        ggq ggqVar = (ggq) this.e.get(str);
        View findViewWithTag = this.f.findViewWithTag(str);
        if (ggqVar == null || findViewWithTag == null) {
            return;
        }
        ((TextView) findViewWithTag.findViewById(R.id.reel_upload_progress_text)).setText(this.a.getResources().getString(R.string.reel_upload_bottomsheet_uploading, NumberFormat.getPercentInstance().format(ggqVar.a())));
        ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) findViewWithTag.findViewById(R.id.reel_upload_progressbar), "progress", (int) (ggqVar.a() * 95.0d));
        ofInt.setDuration(250L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public final void l(ggq ggqVar) {
        View findViewWithTag = this.f.findViewWithTag(ggqVar.b);
        if (findViewWithTag == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewWithTag.findViewById(R.id.reel_upload_progressbar_layout);
        TextView textView = (TextView) findViewWithTag.findViewById(R.id.reel_upload_status_message);
        if (ggqVar.c || ggqVar.i == 3 || ggqVar.d) {
            viewGroup.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(R.string.reel_upload_bottomsheet_upload_failed);
            return;
        }
        int i = ggqVar.h;
        if (i == 2) {
            viewGroup.setVisibility(8);
            textView.setText(R.string.reel_upload_bottomsheet_waiting_for_network);
            textView.setVisibility(0);
        } else if (i != 1) {
            textView.setVisibility(8);
            viewGroup.setVisibility(0);
            k(ggqVar.b);
        } else {
            viewGroup.setVisibility(8);
            textView.setText(R.string.reel_upload_bottomsheet_waiting_for_wifi);
            textView.setVisibility(0);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.j.c();
        this.j.f(this.k);
        if (this.g) {
            this.g = false;
            if (!this.s.isDone()) {
                this.s.cancel(true);
            }
            this.m.e(this.n);
        }
        ArrayList arrayList = new ArrayList(this.e.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d((String) arrayList.get(i));
        }
        this.f.removeAllViews();
    }
}
