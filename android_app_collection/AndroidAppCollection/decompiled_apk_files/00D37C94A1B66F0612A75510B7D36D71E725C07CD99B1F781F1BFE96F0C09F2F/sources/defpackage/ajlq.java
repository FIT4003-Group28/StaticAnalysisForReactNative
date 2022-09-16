package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajlq  reason: default package */
/* loaded from: classes.dex */
public final class ajlq implements tct {
    public final aafo a;

    public ajlq(aafo aafoVar, ajjr ajjrVar) {
        int i;
        this.a = aafoVar;
        ajke a = ajjrVar.a();
        awtj awtjVar = awtj.a;
        dfz.b = awtjVar.c;
        dfz.c = awtjVar.d;
        dfz.d = awtjVar.e;
        int i2 = a.t;
        if (dga.a != -2) {
            i = dga.a;
        } else {
            i = -1;
            try {
                int a2 = dga.a("/sys/devices/system/cpu/possible");
                a2 = a2 == -1 ? dga.a("/sys/devices/system/cpu/present") : a2;
                i = a2 == -1 ? new File("/sys/devices/system/cpu/").listFiles(dga.b).length : a2;
            } catch (NullPointerException | SecurityException unused) {
            }
            dga.a = i;
        }
        int i3 = 1;
        int min = Math.min((int) Math.ceil((i <= 0 ? 1 : i) * a.e), i2);
        i3 = min > 0 ? min : i3;
        dfz.r = new dbu(i3, i3, -2);
        if (a.f) {
            dfz.s = dfz.r;
        }
        dfz.j = a.q;
        dfz.l = a.r;
        dia.a = a.z;
        dfz.q = a.C;
        boolean z = a.y;
        dfz.o = z;
        dfz.n = z;
    }

    private static View e(View view) {
        if (view.getTag(R.id.elements_image) instanceof awny) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View e = e(viewGroup.getChildAt(i));
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return arng.a;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    /* renamed from: d */
    public final aynr b(apzg apzgVar, tcs tcsVar) {
        awoc c;
        int c2;
        aopa mo52toBuilder;
        int abs;
        View e;
        avhn avhnVar;
        View view = tcsVar.a;
        final HashMap hashMap = new HashMap();
        Object obj = tcsVar.d;
        if (obj instanceof ajjf) {
            ajjf ajjfVar = (ajjf) obj;
            Object obj2 = ajjfVar.a;
            if (obj2 != null) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj2);
            }
            List list = ajjfVar.e;
            if (list != null) {
                hashMap.put("MacrosConverters.CustomConvertersKey", list.toArray());
            }
        }
        if (view != null) {
            hashMap.put("com.google.android.libraries.youtube.rendering.elements.sender_view", view);
        }
        try {
            final aopc aopcVar = (aopc) ((aopc) apzg.a.createBuilder()).mo38mergeFrom(apzgVar.toByteArray(), aoos.b());
            apzg apzgVar2 = (apzg) aopcVar.mo39build();
            if (view != null && apzgVar2.qn(WatchEndpointOuterClass.watchEndpoint) && (e = e(view)) != null) {
                hashMap.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", e);
                Object tag = e.getTag(R.id.elements_image);
                if (!(tag instanceof awny)) {
                    avhnVar = null;
                } else {
                    aopc aopcVar2 = (aopc) avhn.a.createBuilder();
                    for (awoa awoaVar : ((awny) tag).c) {
                        aopa createBuilder = avhm.a.createBuilder();
                        String str = "";
                        String str2 = true != (awoaVar.c == 1 ? (String) awoaVar.d : str).startsWith("//") ? str : "https:";
                        if (awoaVar.c == 1) {
                            str = (String) awoaVar.d;
                        }
                        String valueOf = String.valueOf(str);
                        String concat = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                        createBuilder.copyOnWrite();
                        avhm avhmVar = (avhm) createBuilder.instance;
                        concat.getClass();
                        avhmVar.b |= 1;
                        avhmVar.c = concat;
                        int i = awoaVar.e;
                        createBuilder.copyOnWrite();
                        avhm avhmVar2 = (avhm) createBuilder.instance;
                        avhmVar2.b |= 2;
                        avhmVar2.d = i;
                        int i2 = awoaVar.f;
                        createBuilder.copyOnWrite();
                        avhm avhmVar3 = (avhm) createBuilder.instance;
                        avhmVar3.b |= 4;
                        avhmVar3.e = i2;
                        aopcVar2.cw(createBuilder);
                    }
                    avhnVar = (avhn) aopcVar2.mo39build();
                }
                if (avhnVar != null) {
                    hashMap.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avhnVar);
                }
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (!(parent instanceof View)) {
                        break;
                    }
                    Map map = (Map) ((View) parent).getTag(R.id.elements_navigation_args);
                    if (map == null) {
                        parent = parent.getParent();
                    } else {
                        hashMap.putAll(map);
                        break;
                    }
                }
            }
            tdq tdqVar = tcsVar.f;
            if (tdqVar instanceof ajjk) {
                String k = ((ajjk) tdqVar).a.k();
                aopa createBuilder2 = auqr.a.createBuilder();
                createBuilder2.copyOnWrite();
                auqr auqrVar = (auqr) createBuilder2.instance;
                k.getClass();
                auqrVar.b = 1 | auqrVar.b;
                auqrVar.c = k;
                aopcVar.e(auqs.b, (auqr) createBuilder2.mo39build());
            }
            tda tdaVar = tcsVar.i;
            if (tdaVar != null) {
                tee b = tdaVar.b();
                if ((b instanceof acuq) && (c = tdaVar.c()) != null && (c2 = acuq.c(c)) != -1) {
                    if (!((apzg) aopcVar.mo39build()).qn(atno.b)) {
                        mo52toBuilder = atnp.a.createBuilder();
                    } else {
                        mo52toBuilder = ((atnp) ((apzg) aopcVar.mo39build()).qm(atno.b)).mo52toBuilder();
                    }
                    if (!((acuq) b).i() || !acuq.h(c) || !acuq.g(c)) {
                        abs = Math.abs(c.d);
                    } else {
                        asvv asvvVar = acuq.f(c).e;
                        if (asvvVar == null) {
                            asvvVar = asvv.b;
                        }
                        apxf apxfVar = asvvVar.h;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        abs = apxfVar.d;
                    }
                    mo52toBuilder.copyOnWrite();
                    atnp atnpVar = (atnp) mo52toBuilder.instance;
                    atnpVar.b |= 2;
                    atnpVar.d = c2;
                    mo52toBuilder.copyOnWrite();
                    atnp atnpVar2 = (atnp) mo52toBuilder.instance;
                    atnpVar2.b |= 4;
                    atnpVar2.e = abs;
                    aopcVar.e(atno.b, (atnp) mo52toBuilder.mo39build());
                }
            }
            ajna.d(aopcVar, tcsVar, view);
            ajna.c(hashMap, tcsVar);
            return aynr.j(new aynt() { // from class: ajlo
                @Override // defpackage.aynt
                public final void a(aysm aysmVar) {
                    ajlq ajlqVar = ajlq.this;
                    Map map2 = hashMap;
                    aopc aopcVar3 = aopcVar;
                    ajlp ajlpVar = new ajlp(aysmVar);
                    HashMap hashMap2 = new HashMap(map2);
                    hashMap2.put("command_status_callback", ajlpVar);
                    ajlqVar.a.c((apzg) aopcVar3.mo39build(), hashMap2);
                    if (!ajlpVar.a()) {
                        ajlpVar.b().a();
                    }
                }
            });
        } catch (aopx e2) {
            return aynr.s(e2);
        }
    }
}
