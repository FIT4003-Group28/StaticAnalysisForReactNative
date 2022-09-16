package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: oba  reason: default package */
/* loaded from: classes3.dex */
public final class oba implements fea, ynl {
    public final dt a;
    public final acti b;
    public final yni c;
    public final aafo d;
    public final airr e;
    public final oei f;
    public final ajxz g;
    public final aakn h;
    public final View i;
    public final PlaylistLoopButtonView j;
    public final ImageView k;
    public audg l;
    public apos m;
    public boolean n;
    public boolean o;
    public final lmm p;
    private final PlaybackLoopShuffleMonitor q;
    private final ImageView r;
    private boolean s;
    private gae t;

    public oba(dt dtVar, final acti actiVar, yni yniVar, airr airrVar, final aire aireVar, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, aafo aafoVar, oei oeiVar, ajxz ajxzVar, aakn aaknVar, lmm lmmVar) {
        this.a = dtVar;
        this.b = actiVar;
        this.c = yniVar;
        this.q = playbackLoopShuffleMonitor;
        this.d = aafoVar;
        this.e = airrVar;
        this.f = oeiVar;
        this.g = ajxzVar;
        this.h = aaknVar;
        this.p = lmmVar;
        View inflate = LayoutInflater.from(dtVar).inflate(R.layout.compact_playlist_panel_header, (ViewGroup) null);
        this.i = inflate;
        PlaylistLoopButtonView playlistLoopButtonView = (PlaylistLoopButtonView) inflate.findViewById(R.id.repeat);
        this.j = playlistLoopButtonView;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.shuffle);
        this.k = imageView;
        this.r = (ImageView) inflate.findViewById(R.id.three_dots_menu);
        playlistLoopButtonView.setOnClickListener(new View.OnClickListener() { // from class: oax
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
                if (r7.o == false) goto L8;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r7) {
                /*
                    r6 = this;
                    oba r7 = defpackage.oba.this
                    acti r0 = r2
                    aire r1 = r3
                    com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView r2 = r7.j
                    boolean r2 = r2.isSelected()
                    r3 = 0
                    r4 = 2
                    if (r2 == 0) goto L1e
                    com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView r2 = r7.j
                    int[] r2 = r2.b
                    int[] r5 = com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView.a
                    if (r2 != r5) goto L19
                    goto L25
                L19:
                    boolean r7 = r7.o
                    if (r7 == 0) goto L25
                    goto L24
                L1e:
                    boolean r7 = r7.n
                    if (r7 == 0) goto L24
                    r3 = 1
                    goto L25
                L24:
                    r3 = 2
                L25:
                    if (r3 != r4) goto L33
                    acte r7 = new acte
                    actj r2 = defpackage.actj.SINGLE_LOOP_PLAYLIST_ACTION_BUTTON
                    r7.<init>(r2)
                    r2 = 3
                    r4 = 0
                    r0.H(r2, r7, r4)
                L33:
                    r1.h(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oax.onClick(android.view.View):void");
            }
        });
        imageView.setOnClickListener(new oaz(this));
        playbackLoopShuffleMonitor.g(this);
    }

    public static boolean c(apos aposVar) {
        return (aposVar == null || (aposVar.b & 1024) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.audg r5, defpackage.aaks r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L7
            yni r0 = r4.c
            r0.g(r4)
        L7:
            r4.l = r5
            r0 = 0
            if (r5 == 0) goto L36
            int r1 = r5.e
            r2 = 34
            if (r1 != r2) goto L17
            java.lang.Object r1 = r5.f
            aunb r1 = (defpackage.aunb) r1
            goto L19
        L17:
            aunb r1 = defpackage.aunb.a
        L19:
            aopg r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.toggleButtonRenderer
            boolean r1 = r1.qn(r3)
            if (r1 != 0) goto L22
            goto L36
        L22:
            int r1 = r5.e
            if (r1 != r2) goto L2b
            java.lang.Object r5 = r5.f
            aunb r5 = (defpackage.aunb) r5
            goto L2d
        L2b:
            aunb r5 = defpackage.aunb.a
        L2d:
            aopg r1 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.toggleButtonRenderer
            java.lang.Object r5 = r5.qm(r1)
            apos r5 = (defpackage.apos) r5
            goto L37
        L36:
            r5 = r0
        L37:
            r4.m = r5
            r5 = 0
            r1 = 1
            if (r6 == 0) goto L45
            boolean r2 = r6.c()
            if (r2 == 0) goto L45
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            r4.n = r2
            if (r6 == 0) goto L52
            boolean r2 = r6.b()
            if (r2 == 0) goto L52
            r2 = 1
            goto L53
        L52:
            r2 = 0
        L53:
            r4.o = r2
            if (r6 == 0) goto L5d
            boolean r6 = r6.d()
            if (r6 != 0) goto L61
        L5d:
            apos r6 = r4.m
            if (r6 == 0) goto L63
        L61:
            r6 = 1
            goto L64
        L63:
            r6 = 0
        L64:
            r4.s = r6
            boolean r6 = r4.o
            if (r6 == 0) goto L76
            acti r6 = r4.b
            acte r2 = new acte
            actj r3 = defpackage.actj.SINGLE_LOOP_PLAYLIST_ACTION_BUTTON
            r2.<init>(r3)
            r6.n(r2)
        L76:
            com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView r6 = r4.j
            boolean r2 = r4.n
            if (r2 != 0) goto L83
            boolean r2 = r4.o
            if (r2 == 0) goto L81
            goto L83
        L81:
            r2 = 0
            goto L84
        L83:
            r2 = 1
        L84:
            r6.setEnabled(r2)
            android.widget.ImageView r6 = r4.k
            boolean r2 = r4.s
            r6.setEnabled(r2)
            com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor r6 = r4.q
            int r2 = r6.a
            boolean r6 = r6.b
            r4.g(r2, r6)
            audg r6 = r4.l
            if (r6 == 0) goto Lb6
            ates r6 = r6.z
            if (r6 != 0) goto La1
            ates r6 = defpackage.ates.a
        La1:
            int r6 = r6.b
            r6 = r6 & r1
            if (r6 == 0) goto Lb6
            android.widget.ImageView r5 = r4.r
            defpackage.zag.o(r5, r1)
            android.widget.ImageView r5 = r4.r
            oaz r6 = new oaz
            r6.<init>(r4, r1)
            r5.setOnClickListener(r6)
            goto Lc0
        Lb6:
            android.widget.ImageView r6 = r4.r
            defpackage.zag.o(r6, r5)
            android.widget.ImageView r5 = r4.r
            r5.setOnClickListener(r0)
        Lc0:
            gae r5 = r4.t
            r4.b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oba.a(audg, aaks):void");
    }

    public final void b(gae gaeVar) {
        audg audgVar = this.l;
        atex atexVar = null;
        if (audgVar == null || gaeVar == null || !TextUtils.equals(audgVar.k, gaeVar.b())) {
            this.t = null;
            return;
        }
        int i = 0;
        boolean z = gaeVar.a() == aspb.LIKE;
        audg audgVar2 = this.l;
        if (audgVar2 != null) {
            ates atesVar = audgVar2.z;
            if (atesVar == null) {
                atesVar = ates.a;
            }
            atep atepVar = atesVar.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
            Iterator it = atepVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aten atenVar = (aten) it.next();
                if ((atenVar.b & 8) != 0) {
                    atex atexVar2 = atenVar.f;
                    if (atexVar2 == null) {
                        atexVar2 = atex.a;
                    }
                    apzg apzgVar = atexVar2.e;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    if (apzgVar.qn(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)) {
                        atexVar = atenVar.f;
                        if (atexVar == null) {
                            atexVar = atex.a;
                        }
                    }
                }
                i++;
            }
            if (atexVar != null) {
                ates atesVar2 = this.l.z;
                if (atesVar2 == null) {
                    atesVar2 = ates.a;
                }
                atep atepVar2 = atesVar2.c;
                if (atepVar2 == null) {
                    atepVar2 = atep.a;
                }
                aopa mo52toBuilder = atepVar2.mo52toBuilder();
                aopa createBuilder = aten.a.createBuilder();
                aopa mo52toBuilder2 = atexVar.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                atex atexVar3 = (atex) mo52toBuilder2.instance;
                atexVar3.b |= 256;
                atexVar3.i = z;
                createBuilder.copyOnWrite();
                aten atenVar2 = (aten) createBuilder.instance;
                atex atexVar4 = (atex) mo52toBuilder2.mo39build();
                atexVar4.getClass();
                atenVar2.f = atexVar4;
                atenVar2.b |= 8;
                mo52toBuilder.aD(i, createBuilder);
                atep atepVar3 = (atep) mo52toBuilder.mo39build();
                aopc aopcVar = (aopc) this.l.mo52toBuilder();
                aopa createBuilder2 = ates.a.createBuilder();
                createBuilder2.copyOnWrite();
                ates atesVar3 = (ates) createBuilder2.instance;
                atepVar3.getClass();
                atesVar3.c = atepVar3;
                atesVar3.b |= 1;
                aopcVar.copyOnWrite();
                audg audgVar3 = (audg) aopcVar.instance;
                ates atesVar4 = (ates) createBuilder2.mo39build();
                atesVar4.getClass();
                audgVar3.z = atesVar4;
                audgVar3.c |= 4194304;
                this.l = (audg) aopcVar.mo39build();
            }
        }
        this.t = gaeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // defpackage.fea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r6, boolean r7) {
        /*
            r5 = this;
            com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView r0 = r5.j
            r1 = 0
            r2 = 1
            r3 = 2
            if (r6 == r2) goto Lc
            if (r6 != r3) goto Lb
            r6 = 2
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r0.setSelected(r2)
            com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView r0 = r5.j
            int[] r2 = r0.b
            if (r2 != 0) goto L1f
            if (r6 != r3) goto L1f
            int[] r6 = com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView.a
            r0.b = r6
        L1b:
            r0.refreshDrawableState()
            goto L29
        L1f:
            int[] r4 = com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView.a
            if (r2 != r4) goto L29
            if (r6 == r3) goto L29
            r6 = 0
            r0.b = r6
            goto L1b
        L29:
            apos r6 = r5.m
            boolean r6 = c(r6)
            if (r6 != 0) goto L37
            android.widget.ImageView r6 = r5.k
            r6.setSelected(r7)
            return
        L37:
            android.widget.ImageView r6 = r5.k
            r6.setSelected(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oba.g(int, boolean):void");
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((gae) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{gae.class};
    }
}
