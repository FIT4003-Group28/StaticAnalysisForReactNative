package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mqj  reason: default package */
/* loaded from: classes3.dex */
public final class mqj implements mpy, jeb {
    public final jed a;
    public final Context b;
    public final yni c;
    public final aafo d;
    public final View e;
    public final TextView f;
    public final OfflineArrowView g;
    public final jec h;
    public final airr i;
    public final jla j;
    public final ajsk k;
    public final View.OnClickListener l;
    public final ColorStateList m;
    public final ColorStateList n;
    public acti o;
    public auwy p;
    public String q;
    public apoj r;
    private final azqb s;

    public mqj(ahcy ahcyVar, airr airrVar, azqb azqbVar, jee jeeVar, Context context, yni yniVar, aafo aafoVar, fcu fcuVar, ajsk ajskVar, jpd jpdVar, azqb azqbVar2, ViewGroup viewGroup) {
        this.s = azqbVar;
        this.i = airrVar;
        Activity activity = (Activity) jeeVar.a.get();
        activity.getClass();
        jdy jdyVar = (jdy) jeeVar.b.get();
        jdyVar.getClass();
        acti actiVar = (acti) jeeVar.c.get();
        actiVar.getClass();
        jpu jpuVar = (jpu) jeeVar.d.get();
        jpuVar.getClass();
        azqb azqbVar3 = jeeVar.e;
        fbj fbjVar = (fbj) jeeVar.f.get();
        fbjVar.getClass();
        jed jedVar = new jed(activity, jdyVar, actiVar, jpuVar, azqbVar3, fbjVar, this);
        this.a = jedVar;
        this.b = context;
        this.c = yniVar;
        this.d = aafoVar;
        this.k = ajskVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.slim_metadata_offline_button, viewGroup, false);
        this.e = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.button_text);
        this.f = textView;
        OfflineArrowView offlineArrowView = (OfflineArrowView) inflate.findViewById(R.id.button_icon);
        this.g = offlineArrowView;
        this.m = textView.getTextColors();
        this.n = offlineArrowView.c;
        this.h = new jea(context, jedVar, ahcyVar, azqbVar, airrVar, new azqb() { // from class: mqi
            @Override // defpackage.azqb
            public final Object get() {
                return mqj.this.o;
            }
        }, fcuVar, aafoVar, jpdVar, azqbVar2);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: mqh
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, acti] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, acti] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerResponseModel a;
                mqj mqjVar = mqj.this;
                apoj d = mqj.d(mqjVar.i);
                if (d != null && (d.b & 16384) != 0) {
                    aafo aafoVar2 = mqjVar.d;
                    apzg apzgVar = d.o;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar2.c(apzgVar, null);
                    return;
                }
                apoj apojVar = mqjVar.r;
                if ((apojVar.b & 16384) == 0) {
                    jec jecVar = mqjVar.h;
                    String str = mqjVar.q;
                    jea jeaVar = (jea) jecVar;
                    final fcu fcuVar2 = jeaVar.i;
                    anlz.A(anii.i(anko.q(anii.h(fcuVar2.b.a(), fcq.c, anjk.a)), new anir() { // from class: eth
                        @Override // defpackage.anir
                        public final ankt a(Object obj) {
                            fcu fcuVar3 = fcu.this;
                            if (!((Boolean) obj).booleanValue()) {
                                return ankq.a;
                            }
                            return fcuVar3.c(true);
                        }
                    }, anjk.a), ylx.a(etg.a), anjk.a);
                    String q = jeaVar.h.q();
                    if (q == null || !q.equals(str) || (a = fcw.a(jeaVar.h)) == null) {
                        return;
                    }
                    jed jedVar2 = jeaVar.c;
                    apoj apojVar2 = jedVar2 != null ? jedVar2.g : null;
                    if (apojVar2 != null && (apojVar2.b & 8192) != 0) {
                        apzg apzgVar2 = apojVar2.n;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("YpcGetOfflineUpsellResponse_videoIdKey", str);
                        jeaVar.f.c(apzgVar2, hashMap);
                        if (apzgVar2.qn(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint)) {
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        zag.q(jeaVar.a, R.string.add_video_to_offline_error, 1);
                        return;
                    }
                    attp e = aijr.e(a.t());
                    agqv e2 = ((agrf) jeaVar.b.get()).a().m().e(str);
                    if (e2 == null || e2.s()) {
                        jeaVar.d.o(str, e, jeaVar.c, jeaVar.e.get(), null);
                        return;
                    } else if (e2.i() == agqp.PLAYABLE || e2.A() || e2.C()) {
                        jeaVar.g.a(str);
                        return;
                    } else if (!e2.u()) {
                        return;
                    } else {
                        if (jeaVar.a(e2)) {
                            jeaVar.d.n(null, str, jeaVar.c, true);
                            return;
                        } else if (e2.r()) {
                            zag.q(jeaVar.a, R.string.add_video_to_offline_error, 1);
                            return;
                        } else if (e2.x()) {
                            agqu agquVar = e2.j;
                            if (agquVar.e()) {
                                jeaVar.d.f(agquVar, true);
                                return;
                            }
                            Object c = agquVar.c();
                            if (c == null) {
                                return;
                            }
                            jeaVar.d.r(str, c, jeaVar.e.get());
                            return;
                        } else {
                            jeaVar.d.d(str, true);
                            return;
                        }
                    }
                }
                aafo aafoVar3 = mqjVar.d;
                apzg apzgVar3 = apojVar.o;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                aafoVar3.c(apzgVar3, null);
            }
        };
        this.l = onClickListener;
        offlineArrowView.getClass();
        this.j = new jla(offlineArrowView, onClickListener);
    }

    public static apoj d(airr airrVar) {
        PlayerResponseModel a = fcw.a(airrVar);
        if (a == null || a.t() == null) {
            return null;
        }
        arzv arzvVar = a.t().l;
        if (arzvVar == null) {
            arzvVar = arzv.a;
        }
        if (arzvVar.b != 65153809) {
            return null;
        }
        arzv arzvVar2 = a.t().l;
        if (arzvVar2 == null) {
            arzvVar2 = arzv.a;
        }
        if (arzvVar2.b == 65153809) {
            return (apoj) arzvVar2.c;
        }
        return apoj.a;
    }

    private final void f() {
        this.e.setContentDescription(this.g.getContentDescription());
    }

    @Override // defpackage.jeb
    public final void a(agqv agqvVar, attp attpVar) {
        if ((agqvVar != null && !agqvVar.x()) || attpVar == null || attpVar.c) {
            this.j.b(true);
            this.j.d(agqvVar);
            e(agqvVar);
            f();
            return;
        }
        this.j.b(false);
        jla jlaVar = this.j;
        jlaVar.a();
        OfflineArrowView offlineArrowView = jlaVar.b;
        offlineArrowView.b(offlineArrowView.a);
        jlaVar.b.k();
    }

    @Override // defpackage.mpy
    public final void b() {
        this.q = null;
        this.p = null;
        this.o = null;
        this.r = null;
        this.a.h = null;
        this.e.setOnClickListener(null);
        this.e.setAlpha(0.5f);
        this.e.setClickable(false);
        this.g.setClickable(false);
        this.c.m(this.a);
    }

    public final agqv c() {
        if (TextUtils.isEmpty(this.q)) {
            return null;
        }
        return ((agrf) this.s.get()).a().m().e(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.agqv r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L59
            agqp r1 = r4.i()
            agqp r2 = defpackage.agqp.PLAYABLE
            if (r1 != r2) goto L20
            auwy r4 = r3.p
            int r1 = r4.b
            r1 = r1 & 4
            if (r1 == 0) goto L1a
            arag r4 = r4.e
            if (r4 != 0) goto L1b
            arag r4 = defpackage.arag.a
            goto L1b
        L1a:
            r4 = r0
        L1b:
            android.text.Spanned r4 = defpackage.ajgl.b(r4)
            goto L5a
        L20:
            boolean r1 = r4.z()
            if (r1 != 0) goto L41
            agqe r1 = r4.l
            agqe r2 = defpackage.agqe.ACTIVE
            if (r1 != r2) goto L41
            auwy r4 = r3.p
            int r1 = r4.b
            r1 = r1 & 2
            if (r1 == 0) goto L3b
            arag r4 = r4.d
            if (r4 != 0) goto L3c
            arag r4 = defpackage.arag.a
            goto L3c
        L3b:
            r4 = r0
        L3c:
            android.text.Spanned r4 = defpackage.ajgl.b(r4)
            goto L5a
        L41:
            boolean r4 = r4.C()
            if (r4 == 0) goto L59
            android.content.Context r4 = r3.b
            r1 = 2132018671(0x7f1405ef, float:1.9675655E38)
            java.lang.String r4 = r4.getString(r1)
            arag r4 = defpackage.ajgl.h(r4)
            android.text.Spanned r4 = defpackage.ajgl.b(r4)
            goto L5a
        L59:
            r4 = r0
        L5a:
            if (r4 != 0) goto L6e
            apoj r4 = r3.r
            int r1 = r4.b
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L6a
            arag r0 = r4.i
            if (r0 != 0) goto L6a
            arag r0 = defpackage.arag.a
        L6a:
            android.text.Spanned r4 = defpackage.ajgl.b(r0)
        L6e:
            android.widget.TextView r0 = r3.f
            r0.setText(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqj.e(agqv):void");
    }

    @Override // defpackage.mpy
    public final View oN() {
        return this.e;
    }

    @Override // defpackage.jeb
    public final void oO(agqv agqvVar) {
        this.j.b(true);
        this.j.d(agqvVar);
        e(agqvVar);
        f();
    }
}
