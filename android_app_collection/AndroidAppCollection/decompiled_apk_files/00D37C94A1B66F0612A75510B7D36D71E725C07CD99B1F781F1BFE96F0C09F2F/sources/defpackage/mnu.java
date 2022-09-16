package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mnu  reason: default package */
/* loaded from: classes3.dex */
public class mnu extends ajsl {
    protected final Context a;
    protected final ajyc b;
    protected final ajmy c;
    protected final aafo d;
    protected final gts e;
    protected final View f;
    protected final ajmu g;
    private final View h;

    public mnu(Context context, ajyc ajycVar, ajmy ajmyVar, aafo aafoVar, gts gtsVar, int i, int i2) {
        this.a = context;
        this.b = ajycVar;
        this.c = ajmyVar;
        this.d = aafoVar;
        this.e = gtsVar;
        View view = null;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.f = inflate;
        ajmt a = ajmu.a();
        a.b(2131232143);
        this.g = a.a();
        this.h = i2 != 0 ? inflate.findViewById(i2) : view;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ReelItemRendererOuterClass$ReelItemRenderer) obj).p.I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajsl
    /* renamed from: f */
    public void d(ajrs ajrsVar, final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        apzg apzgVar;
        int bG;
        final HashMap e = ajrsVar.e();
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4096) != 0) {
            gts gtsVar = this.e;
            apzg apzgVar2 = reelItemRendererOuterClass$ReelItemRenderer.m;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            int bP = awwc.bP(reelItemRendererOuterClass$ReelItemRenderer.o);
            boolean z = false;
            if (bP != 0 && bP == 2) {
                z = true;
            }
            gtsVar.c(1, apzgVar2, z);
            gts gtsVar2 = this.e;
            apzg apzgVar3 = reelItemRendererOuterClass$ReelItemRenderer.m;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            apzgVar = gtsVar2.a(apzgVar3);
            avhn b = gtd.b(apzgVar, this.c);
            if (b != null) {
                if (e == null) {
                    e = new HashMap();
                } else {
                    e = new HashMap(e);
                }
                e.put("com.google.android.libraries.youtube.innertube.bundle", gtd.a(b));
            }
        } else {
            apzgVar = null;
        }
        ReelToReelList reelToReelList = (ReelToReelList) ajrsVar.c("ReelToReelListDecorator");
        if (reelToReelList != null && (apzgVar == null || !apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) || (bG = awwc.bG(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).m)) == 0 || bG != 3)) {
            if (e == null) {
                e = new HashMap();
            } else if (!(e instanceof HashMap)) {
                e = new HashMap(e);
            }
            Bundle bundle = (Bundle) zew.K(e, "com.google.android.libraries.youtube.innertube.bundle", Bundle.class);
            if (bundle == null) {
                bundle = new Bundle();
                e.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
            }
            bundle.putParcelable("ReelToReelListBundleKey", reelToReelList);
        }
        this.e.b(this.f, new Runnable() { // from class: mnt
            @Override // java.lang.Runnable
            public final void run() {
                mnu mnuVar = mnu.this;
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                View view = mnuVar.f;
                if (view == null || !view.isAttachedToWindow()) {
                    return;
                }
                mnuVar.g(reelItemRendererOuterClass$ReelItemRenderer2);
            }
        });
        g(reelItemRendererOuterClass$ReelItemRenderer);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: mns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apzg apzgVar4;
                mnu mnuVar = mnu.this;
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                Map map = e;
                aafo aafoVar = mnuVar.d;
                if ((reelItemRendererOuterClass$ReelItemRenderer2.b & 4096) != 0) {
                    apzgVar4 = reelItemRendererOuterClass$ReelItemRenderer2.m;
                    if (apzgVar4 == null) {
                        apzgVar4 = apzg.a;
                    }
                } else {
                    apzgVar4 = null;
                }
                aafoVar.c(apzgVar4, map);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r0.f(r5) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.h
            r1 = 0
            if (r0 == 0) goto L34
            if (r5 == 0) goto L34
            int r0 = r5.o
            int r0 = defpackage.awwc.bP(r0)
            r2 = 1
            if (r0 != 0) goto L11
            goto L16
        L11:
            r3 = 2
            if (r0 != r3) goto L16
        L14:
            r1 = 1
            goto L2d
        L16:
            gts r0 = r4.e
            int r3 = r5.b
            r3 = r3 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L25
            apzg r5 = r5.m
            if (r5 != 0) goto L26
            apzg r5 = defpackage.apzg.a
            goto L26
        L25:
            r5 = 0
        L26:
            boolean r5 = r0.f(r5)
            if (r5 == 0) goto L2d
            goto L14
        L2d:
            android.view.View r5 = r4.h
            r0 = r1 ^ 1
            r5.setEnabled(r0)
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnu.g(com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer):boolean");
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
    }
}
