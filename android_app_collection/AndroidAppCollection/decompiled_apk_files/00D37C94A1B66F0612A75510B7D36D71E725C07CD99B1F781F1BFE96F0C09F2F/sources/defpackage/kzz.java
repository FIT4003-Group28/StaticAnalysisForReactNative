package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzz  reason: default package */
/* loaded from: classes3.dex */
public final class kzz extends mfs {
    private final FixedAspectRatioFrameLayout C;
    private final FixedAspectRatioRelativeLayout D;
    private final YouTubeTextView E;
    private final View F;
    private final LinearLayout G;
    private final ViewStub H;
    private final View I;
    public apzg a;
    public final aafo b;
    public final fmr c;
    public final lbd d;
    private final ajrp e;
    private final ajxz f;

    public kzz(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, fms fmsVar, lbd lbdVar, akem akemVar, ViewGroup viewGroup) {
        super(context, ajmyVar, new ajsn(), LayoutInflater.from(context).inflate(R.layout.watch_card_hero_video, viewGroup, false), aafoVar, ajxzVar, (jkv) null, (ftb) null, (kua) null);
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) this.i;
        this.C = fixedAspectRatioFrameLayout;
        FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = (FixedAspectRatioRelativeLayout) fixedAspectRatioFrameLayout.findViewById(R.id.hero_image_container);
        this.D = fixedAspectRatioRelativeLayout;
        this.e = new ajrp(aafoVar, fixedAspectRatioRelativeLayout);
        this.b = aafoVar;
        this.f = ajxzVar;
        this.E = (YouTubeTextView) fixedAspectRatioFrameLayout.findViewById(R.id.play_all_button);
        this.G = (LinearLayout) fixedAspectRatioFrameLayout.findViewById(R.id.info_container);
        this.F = fixedAspectRatioFrameLayout.findViewById(R.id.gradient);
        this.H = (ViewStub) fixedAspectRatioFrameLayout.findViewById(R.id.watch_card_collage_stub);
        View findViewById = fixedAspectRatioFrameLayout.findViewById(R.id.reminder_button);
        this.I = findViewById;
        this.c = fmsVar.a(findViewById);
        this.d = lbdVar;
        if (akemVar.d()) {
            akemVar.c(fixedAspectRatioRelativeLayout, akemVar.a(fixedAspectRatioRelativeLayout, null));
        } else {
            zav.d(fixedAspectRatioRelativeLayout, zag.e(context, 0));
        }
    }

    private final void d(View view, int i, avhn avhnVar) {
        ImageView imageView = (ImageView) view.findViewById(i);
        this.h.h(imageView, avhnVar);
        imageView.setVisibility(true != akel.A(avhnVar) ? 8 : 0);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0185  */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzz.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.c();
        super.qZ(ajsaVar);
    }
}
