package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelVodLinkRendererOuterClass;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hrf  reason: default package */
/* loaded from: classes3.dex */
public final class hrf implements aafl {
    private final dt a;
    private final htq b;
    private final aafo c;

    public hrf(dt dtVar, htq htqVar, aafo aafoVar) {
        this.a = dtVar;
        this.b = htqVar;
        this.c = aafoVar;
    }

    private static acti b(Map map) {
        if (map != null && (map.get("com.google.android.libraries.youtube.logging.interaction_logger") instanceof acti)) {
            return (acti) map.get("com.google.android.libraries.youtube.logging.interaction_logger");
        }
        return acti.l;
    }

    private final void c(VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction, acti actiVar, ampq ampqVar, ampq ampqVar2) {
        aqfs aqfsVar = videoSelectedActionOuterClass$VideoSelectedAction.d;
        if (aqfsVar == null) {
            aqfsVar = aqfs.a;
        }
        if ((aqfsVar.b & 1) == 0) {
            zag.q(this.a, R.string.reel_generic_error_message, 0);
            return;
        }
        aqfs aqfsVar2 = videoSelectedActionOuterClass$VideoSelectedAction.d;
        if (aqfsVar2 == null) {
            aqfsVar2 = aqfs.a;
        }
        aqft aqftVar = aqfsVar2.c;
        if (aqftVar == null) {
            aqftVar = aqft.a;
        }
        actiVar.D(new acte(aqftVar.n));
        aopa mo52toBuilder = aqftVar.mo52toBuilder();
        arag aragVar = aqftVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        mo52toBuilder.copyOnWrite();
        aqft aqftVar2 = (aqft) mo52toBuilder.instance;
        aqftVar2.c = (arag) ampqVar.e(aragVar);
        aqftVar2.b |= 1;
        mo52toBuilder.copyOnWrite();
        aqft aqftVar3 = (aqft) mo52toBuilder.instance;
        aqftVar3.a();
        aqftVar3.g.set(0, (arag) ampqVar2.e((arag) aqftVar.g.get(0)));
        ajgx.n(this.a, (aqft) mo52toBuilder.mo39build(), this.c, actiVar, new Object());
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        dp f;
        VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction = (VideoSelectedActionOuterClass$VideoSelectedAction) apzgVar.qm(VideoSelectedActionOuterClass$VideoSelectedAction.videoSelectedAction);
        if (!this.b.a(videoSelectedActionOuterClass$VideoSelectedAction)) {
            c(videoSelectedActionOuterClass$VideoSelectedAction, b(map), ampq.j(this.b.e(this.a)), amon.a);
            return;
        }
        eo supportFragmentManager = this.a.getSupportFragmentManager();
        if (supportFragmentManager.e(R.id.reel_creation_container) != null) {
            f = supportFragmentManager.e(R.id.reel_creation_container);
        } else {
            f = supportFragmentManager.f("creation_fragment");
        }
        dp e = f.mL().e(R.id.reel_container);
        if (e instanceof htp) {
            htp htpVar = (htp) e;
            if (videoSelectedActionOuterClass$VideoSelectedAction.c && !htpVar.bk()) {
                c(videoSelectedActionOuterClass$VideoSelectedAction, b(map), amon.a, ampq.j(htpVar.aV()));
                return;
            }
        }
        if (!(f instanceof hum)) {
            return;
        }
        dp f2 = supportFragmentManager.f("reels_video_picker_fragment");
        if (f2 != null) {
            ex l = supportFragmentManager.l();
            l.m(f2);
            l.a();
        }
        hun q = ((hum) f).q();
        aunb aunbVar = videoSelectedActionOuterClass$VideoSelectedAction.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (!aunbVar.qn(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
            return;
        }
        if (!q.e.a(videoSelectedActionOuterClass$VideoSelectedAction)) {
            aqfs aqfsVar = videoSelectedActionOuterClass$VideoSelectedAction.d;
            if (aqfsVar == null) {
                aqfsVar = aqfs.a;
            }
            if ((aqfsVar.b & 1) == 0) {
                zag.q(q.a, R.string.reel_generic_error_message, 0);
                return;
            }
            aqfs aqfsVar2 = videoSelectedActionOuterClass$VideoSelectedAction.d;
            if (aqfsVar2 == null) {
                aqfsVar2 = aqfs.a;
            }
            aqft aqftVar = aqfsVar2.c;
            if (aqftVar == null) {
                aqftVar = aqft.a;
            }
            q.h.D(new acte(aqftVar.n));
            aopa mo52toBuilder = aqftVar.mo52toBuilder();
            arag e2 = q.e.e(q.a);
            mo52toBuilder.copyOnWrite();
            aqft aqftVar2 = (aqft) mo52toBuilder.instance;
            e2.getClass();
            aqftVar2.c = e2;
            aqftVar2.b |= 1;
            ajgx.n(q.a, (aqft) mo52toBuilder.mo39build(), q.g, q.h, new Object());
            return;
        }
        aunb aunbVar2 = videoSelectedActionOuterClass$VideoSelectedAction.e;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        aumc aumcVar = (aumc) aunbVar2.qm(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
        View inflate = LayoutInflater.from(q.a).inflate(R.layout.video_sticker, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.duration);
        if ((aumcVar.b & 4) != 0) {
            arag aragVar = aumcVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            textView.setVisibility(0);
        }
        if ((aumcVar.b & 1) != 0) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.video_title_text);
            arag aragVar2 = aumcVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            textView2.setText(ajgl.b(aragVar2));
            textView2.setVisibility(0);
        }
        if ((aumcVar.b & 2) != 0) {
            TextView textView3 = (TextView) inflate.findViewById(R.id.video_channel_text);
            arag aragVar3 = aumcVar.d;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            textView3.setText(ajgl.b(aragVar3));
            textView3.setVisibility(0);
        }
        ajmy ajmyVar = q.d;
        avhn avhnVar = aumcVar.f;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.a(akel.r(avhnVar, 320, 180), new hul(q, inflate, videoSelectedActionOuterClass$VideoSelectedAction));
    }
}
