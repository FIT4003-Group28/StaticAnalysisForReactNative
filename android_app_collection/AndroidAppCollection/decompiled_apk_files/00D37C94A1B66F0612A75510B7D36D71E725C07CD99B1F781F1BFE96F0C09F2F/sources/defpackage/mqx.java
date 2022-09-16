package defpackage;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: mqx  reason: default package */
/* loaded from: classes3.dex */
public final class mqx {
    public final View a;
    public final View b;
    public final TextView c;
    public final fmg d;
    public final gts e;
    public final aafo f;
    public apzg g;
    private final Handler h;
    private final ajmy i;
    private final View j;
    private final ImageView k;
    private final View l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final View q;
    private final TextView r;
    private final TextView s;
    private final ejj t;
    private final akbm u;

    public mqx(Handler handler, ajmy ajmyVar, final aafo aafoVar, fnz fnzVar, akbn akbnVar, fmh fmhVar, ejk ejkVar, gts gtsVar, View view) {
        this.h = handler;
        this.i = ajmyVar;
        this.a = view;
        this.e = gtsVar;
        this.f = aafoVar;
        View findViewById = view.findViewById(R.id.channel_navigation_container);
        this.j = findViewById;
        this.k = (ImageView) view.findViewById(R.id.channel_owner_avatar);
        this.b = view.findViewById(R.id.channel_reel_avatar_ring);
        this.l = view.findViewById(R.id.channel_reel_avatar_ring_button);
        view.findViewById(R.id.channel_title_container);
        this.m = (TextView) view.findViewById(R.id.channel_title);
        this.n = (TextView) view.findViewById(R.id.header_text);
        this.o = (TextView) view.findViewById(R.id.channel_subscribers);
        this.p = (TextView) view.findViewById(R.id.channel_subscribers_long);
        TextView textView = (TextView) view.findViewById(R.id.subscribe_button);
        this.c = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.sponsor_button);
        this.s = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.purchase_button);
        this.r = textView3;
        View findViewById2 = view.findViewById(R.id.subscription_notification_view);
        this.q = findViewById2;
        fmg a = fmhVar.a(textView, fnzVar.a(findViewById2));
        this.d = a;
        if (textView2 != null) {
            this.t = ejkVar.a(textView2);
        } else {
            a.k(2);
            this.t = null;
        }
        if (textView3 == null) {
            this.u = null;
        } else {
            this.u = akbnVar.a(textView3);
        }
        (findViewById != null ? findViewById : view).setOnClickListener(new View.OnClickListener() { // from class: mqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mqx mqxVar = mqx.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar = mqxVar.g;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
            }
        });
    }

    public final void a() {
        this.d.d();
    }

    public final void b() {
        View view = this.b;
        if (view != null) {
            zag.o(view, false);
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.setOnClickListener(null);
            this.l.setClickable(false);
            zag.o(this.l, false);
        }
    }

    public final boolean c(ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer) {
        int bP = awwc.bP(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.e);
        if ((bP == 0 || bP == 1) && (channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.b & 2) != 0) {
            gts gtsVar = this.e;
            apzg apzgVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)) {
                ates atesVar = ((MenuEndpointOuterClass$MenuEndpoint) apzgVar.qm(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c;
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
                    ateo ateoVar = atenVar.c;
                    if (ateoVar == null) {
                        ateoVar = ateo.a;
                    }
                    if ((ateoVar.b & 4) != 0) {
                        ateo ateoVar2 = atenVar.c;
                        if (ateoVar2 == null) {
                            ateoVar2 = ateo.a;
                        }
                        apzg apzgVar2 = ateoVar2.e;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        if (apzgVar2.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                            apzgVar = apzgVar2;
                            break;
                        }
                    }
                }
            }
            if (!gtsVar.f(apzgVar)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r8 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r8 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        r8 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.auxc d(final defpackage.aopa r12, boolean r13, final defpackage.acti r14, final defpackage.akaf r15) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqx.d(aopa, boolean, acti, akaf):auxc");
    }
}
