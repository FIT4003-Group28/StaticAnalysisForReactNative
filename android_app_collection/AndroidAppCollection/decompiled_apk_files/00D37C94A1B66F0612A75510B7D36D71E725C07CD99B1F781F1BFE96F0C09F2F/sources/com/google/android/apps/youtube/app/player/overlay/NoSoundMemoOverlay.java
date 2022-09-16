package com.google.android.apps.youtube.app.player.overlay;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NoSoundMemoOverlay extends ahyf implements airt, f, ynl {
    private static final long a = TimeUnit.SECONDS.toMillis(1);
    private final Context b;
    private final aypf c;
    private AnimatorSet d;
    private Spanned e;
    private TextView f;

    public NoSoundMemoOverlay(Context context) {
        super(context);
        this.c = new aypf();
        this.b = context;
    }

    private static ObjectAnimator m(TextView textView, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", f);
        ofFloat.setInterpolator(new fqy());
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    private final void o(Spanned spanned) {
        if (!TextUtils.equals(this.e, spanned)) {
            this.e = spanned;
            X();
        }
        if (p(this.e)) {
            kU();
        } else {
            kT();
        }
    }

    private static boolean p(Spanned spanned) {
        return !TextUtils.isEmpty(spanned);
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(context, R.layout.no_sound_overlay, null);
        TextView textView = (TextView) frameLayout.findViewById(R.id.message_view);
        this.f = textView;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(m(textView, 0.0f)).after(a).after(m(textView, 1.0f));
        this.d = animatorSet;
        return frameLayout;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final void d(Context context, View view) {
        this.f.setText(this.e);
        l();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new kfm(this, 1), jww.n)};
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.ahhw r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L6c
            aika r1 = r3.c()
            if (r1 == 0) goto L6c
            aika r1 = r3.c()
            boolean r1 = r1.h()
            if (r1 == 0) goto L14
            goto L6c
        L14:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r3 = r3.b()
            if (r3 == 0) goto L1d
            asaj r3 = r3.a
            goto L1e
        L1d:
            r3 = r0
        L1e:
            if (r3 == 0) goto L39
            asad r1 = r3.C
            if (r1 != 0) goto L26
            asad r1 = defpackage.asad.a
        L26:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L39
            asad r3 = r3.C
            if (r3 != 0) goto L32
            asad r3 = defpackage.asad.a
        L32:
            atzx r3 = r3.c
            if (r3 != 0) goto L3a
            atzx r3 = defpackage.atzx.a
            goto L3a
        L39:
            r3 = r0
        L3a:
            if (r3 == 0) goto L55
            atzz r1 = r3.e
            if (r1 != 0) goto L42
            atzz r1 = defpackage.atzz.a
        L42:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L55
            atzz r3 = r3.e
            if (r3 != 0) goto L4e
            atzz r3 = defpackage.atzz.a
        L4e:
            atzy r3 = r3.c
            if (r3 != 0) goto L56
            atzy r3 = defpackage.atzy.a
            goto L56
        L55:
            r3 = r0
        L56:
            if (r3 == 0) goto L68
            int r1 = r3.b
            r1 = r1 & 1
            if (r1 == 0) goto L64
            arag r0 = r3.c
            if (r0 != 0) goto L64
            arag r0 = defpackage.arag.a
        L64:
            android.text.Spanned r0 = defpackage.ajgl.b(r0)
        L68:
            r2.o(r0)
            return
        L6c:
            r2.o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay.j(ahhw):void");
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.a = 0;
        kS.b = 0;
        return kS;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                j((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    public final void l() {
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null || animatorSet.isRunning() || !mZ()) {
            return;
        }
        this.d.start();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return p(this.e);
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.c.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.c.c();
        aypf aypfVar = this.c;
        final Context context = this.b;
        aypfVar.d(aynx.k(new aynz() { // from class: kfn
            @Override // defpackage.aynz
            public final void a(ayny aynyVar) {
                Context context2 = context;
                final ContentResolver contentResolver = context2.getContentResolver();
                final kfp kfpVar = new kfp(context2, aynyVar);
                contentResolver.registerContentObserver(kfp.a, true, kfpVar);
                aynyVar.c(new ayqa() { // from class: kfo
                    @Override // defpackage.ayqa
                    public final void a() {
                        contentResolver.unregisterContentObserver(kfpVar);
                    }
                });
            }
        }, aynq.LATEST).Z(new kfm(this)));
    }
}
