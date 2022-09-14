package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.net.Uri;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dmi  reason: default package */
/* loaded from: classes6.dex */
public final class dmi implements dms {
    public final Object a = new Object();
    public final Map<dmr, dme> b = new LinkedHashMap();
    private final int c;
    private final Activity d;
    private final ahjq e;
    private final dhk f;
    private final dhs g;
    private final dxio<dhp> h;
    private final Executor i;
    private final dkl j;
    private final daj k;
    private final dbsg<cjqp> l;

    public dmi(Activity activity, ahjq ahjqVar, dhk dhkVar, dhs dhsVar, dxio<dhp> dxioVar, Executor executor, dkl dklVar, daj dajVar, dbsg<cjqp> dbsgVar) {
        this.d = activity;
        this.e = ahjqVar;
        this.f = dhkVar;
        this.g = dhsVar;
        this.h = dxioVar;
        this.i = executor;
        this.j = dklVar;
        this.k = dajVar;
        this.l = dbsgVar;
        this.c = activity.getResources().getDimensionPixelSize(R.dimen.lighthouse_secondary_marker_hovered_icon_size);
    }

    private final dfer d(akqi akqiVar, akqq akqqVar) {
        daj dajVar = this.k;
        dfhh bZ = dfhj.d.bZ();
        dfhg a = dna.a(akqiVar, akqqVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfhj dfhjVar = (dfhj) bZ.b;
        a.getClass();
        dfhjVar.b = a;
        dfhjVar.a |= 1;
        dfhj dfhjVar2 = (dfhj) bZ.b;
        dfhjVar2.c = 1;
        dfhjVar2.a |= 8;
        dfer e = dajVar.e(bZ.bK());
        dzvx.b(e, "arScene.createPlacePin(\n…E)\n        .build()\n    )");
        return e;
    }

    private final dfeq<dfhp> e(dmr dmrVar, dhh dhhVar, dkk dkkVar) {
        return new dmf(this, dmrVar, dkkVar, dhhVar);
    }

    private final void f(dfer dferVar, final dhj dhjVar, String str, float f, String str2) {
        dehn<Picture> a;
        bvrj.UI_THREAD.c();
        dehn<Picture> dehnVar = dhjVar.f;
        if (dehnVar != null && !dehnVar.isDone()) {
            dehnVar.cancel(false);
        }
        dhjVar.e.setText(str);
        dhjVar.b(f);
        if (str2 == null || str2.isEmpty()) {
            dhjVar.d.setVisibility(8);
            a = deha.a(dhq.a(dhjVar.c));
        } else {
            brw<Bitmap> g = brc.e(dhjVar.a).g();
            g.j(Uri.parse(str2));
            a = deew.h(bsv.a(g), new dbrn(dhjVar) { // from class: dhi
                private final dhj a;

                {
                    this.a = dhjVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    dhj dhjVar2 = this.a;
                    dhjVar2.d.setVisibility(0);
                    dhjVar2.d.setImageBitmap((Bitmap) obj);
                    return dhq.a(dhjVar2.c);
                }
            }, dhjVar.b);
        }
        dhjVar.f = a;
        deha.q(a, new dmg(dferVar), this.i);
    }

    private static final void g(dme dmeVar) {
        dmeVar.a.b(dmeVar.b);
        dmeVar.a.h();
    }

    @Override // defpackage.dms
    public final void a(dmv dmvVar) {
        dfer e;
        ddho ddhoVar;
        final cqss cqssVar;
        dhh dhhVar;
        dzvx.c(dmvVar, "poi");
        dmr a = dmvVar.a();
        dzvx.b(a, "poi.identifier");
        float f = 0.0f;
        Float f2 = null;
        Uri uri = null;
        if (a.a() != dmq.ICONIC_LANDMARK) {
            dmr a2 = dmvVar.a();
            dzvx.b(a2, "poi.identifier");
            if (a2.a() != dmq.PERSONAL_PLACE) {
                dmr a3 = dmvVar.a();
                dzvx.b(a3, "poi.identifier");
                if (a3.a() != dmq.ORIENTATION_CUE) {
                    return;
                }
                ilo b = dmvVar.c().b();
                dzvx.b(b, "poi.placemark.get()");
                dvyw h = b.h();
                dzvx.b(h, "place");
                dhjz dhjzVar = h.e;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                dzvx.b(dhjzVar, "place.location");
                double d = dhjzVar.c;
                dhjz dhjzVar2 = h.e;
                if (dhjzVar2 == null) {
                    dhjzVar2 = dhjz.e;
                }
                dzvx.b(dhjzVar2, "place.location");
                akqq akqqVar = new akqq(d, dhjzVar2.b);
                GmmLocation a4 = this.e.a();
                Float valueOf = a4 != null ? Float.valueOf(a4.F(akqqVar)) : null;
                akqi b2 = akqi.b(h.g);
                dsrj<dvxx> dsrjVar = h.B;
                dzvx.b(dsrjVar, "place.getAdditionalCategoryInfoList()");
                Iterator<dvxx> it = dsrjVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        dvxx next = it.next();
                        dzvx.b(next, "it");
                        if (dzvx.d("iconic_landmark", next.b)) {
                            e = d(b2, akqqVar);
                            dhj a5 = this.f.a();
                            ddhoVar = dtxj.bH;
                            String str = h.i;
                            dzvx.b(str, "place.title");
                            f(e, a5, str, valueOf != null ? valueOf.floatValue() : 0.0f, h.am);
                            dhhVar = a5;
                        }
                    } else {
                        daj dajVar = this.k;
                        dfhh bZ = dfhj.d.bZ();
                        dfhg a6 = dna.a(b2, akqqVar);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dfhj dfhjVar = (dfhj) bZ.b;
                        a6.getClass();
                        dfhjVar.b = a6;
                        dfhjVar.a |= 1;
                        dfhj dfhjVar2 = (dfhj) bZ.b;
                        dfhjVar2.c = 1;
                        dfhjVar2.a |= 8;
                        e = dajVar.e(bZ.bK());
                        dzvx.b(e, "arScene.createPlacePin(\n…E)\n        .build()\n    )");
                        dhs dhsVar = this.g;
                        Activity activity = (Activity) ((dxjd) dhsVar.a).a;
                        dhs.a(activity, 1);
                        bvsl a7 = dhsVar.b.a();
                        dhs.a(a7, 2);
                        dhr dhrVar = new dhr(activity, a7);
                        ddhoVar = dtxj.bF;
                        String str2 = h.i;
                        if (valueOf != null) {
                            f = valueOf.floatValue();
                        }
                        dhrVar.b.setText(str2);
                        dhrVar.b(f);
                        e.f(dhq.a(dhrVar.a));
                        String str3 = h.am;
                        cqss cqssVar2 = dmz.a;
                        dzvx.c(h, "place");
                        dsrj<dvxx> dsrjVar2 = h.B;
                        dzvx.b(dsrjVar2, "place.getAdditionalCategoryInfoList()");
                        Iterator<dvxx> it2 = dsrjVar2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                dvxx next2 = it2.next();
                                Map<String, cqss> map = dmz.b;
                                dzvx.b(next2, "it");
                                if (map.containsKey(next2.b)) {
                                    Map<String, cqss> map2 = dmz.b;
                                    String str4 = next2.b;
                                    dzvx.b(str4, "it.categoryId");
                                    dzvx.c(map2, "$this$getValue");
                                    dzvx.c(map2, "$this$getOrImplicitDefault");
                                    cqss cqssVar3 = map2.get(str4);
                                    if (cqssVar3 != null || map2.containsKey(str4)) {
                                        dzvx.b(cqssVar3, "categoryIdToColorMap.getValue(it.categoryId)");
                                        cqssVar = cqssVar3;
                                    } else {
                                        throw new NoSuchElementException("Key " + ((Object) str4) + " is missing in the map.");
                                    }
                                }
                            } else {
                                cqssVar = dmz.a;
                                dzvx.b(cqssVar, "genericColor");
                                break;
                            }
                        }
                        final dhp a8 = this.h.a();
                        final int i = this.c;
                        final Picture picture = new Picture();
                        if (str3 != null) {
                            uri = Uri.parse(str3);
                        }
                        brw<Bitmap> g = brc.d(a8.a).g();
                        g.j(uri);
                        deha.q(deew.h(bsv.a(g), new dbrn(a8, picture, i, cqssVar) { // from class: dhn
                            private final dhp a;
                            private final Picture b;
                            private final int c;
                            private final cqss d;

                            {
                                this.a = a8;
                                this.b = picture;
                                this.c = i;
                                this.d = cqssVar;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj) {
                                dhp dhpVar = this.a;
                                Picture picture2 = this.b;
                                int i2 = this.c;
                                cqss cqssVar4 = this.d;
                                Bitmap bitmap = (Bitmap) obj;
                                Canvas beginRecording = picture2.beginRecording(i2, i2);
                                beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
                                dhpVar.a(beginRecording, cqssVar4.b(dhpVar.a));
                                int width = bitmap.getWidth();
                                int width2 = beginRecording.getWidth();
                                beginRecording.drawBitmap(Bitmap.createBitmap(bitmap, (width / 2) - (width2 / 2), (bitmap.getHeight() / 2) - (beginRecording.getHeight() / 2), beginRecording.getWidth(), beginRecording.getHeight()), 0.0f, 0.0f, new Paint());
                                dhpVar.b(beginRecording, dhpVar.d);
                                picture2.endRecording();
                                return picture2;
                            }
                        }, a8.b), new dmh(e), this.i);
                        dhhVar = dhrVar;
                    }
                }
                dmr a9 = dmvVar.a();
                dzvx.b(a9, "poi.identifier");
                dfeq<dfhp> e2 = e(a9, dhhVar, this.j.a(this.l, ddhoVar, b2));
                e.a(e2);
                dfhp bK = dfhp.d.bZ().bK();
                dzvx.b(bK, "PlacePinState.newBuilder().build()");
                dme dmeVar = new dme(e, e2, bK);
                synchronized (this.b) {
                    Map<dmr, dme> map3 = this.b;
                    dmr a10 = dmvVar.a();
                    dzvx.b(a10, "poi.identifier");
                    map3.put(a10, dmeVar);
                }
                return;
            }
        }
        ilo b3 = dmvVar.c().b();
        String b4 = dmvVar.b().b();
        dzvx.b(b3, "placemark");
        akqq aj = b3.aj();
        if (aj != null) {
            GmmLocation a11 = this.e.a();
            if (a11 != null) {
                f2 = Float.valueOf(a11.F(aj));
            }
            akqi ai = b3.ai();
            dzvx.b(ai, "placemark.featureId");
            dfer d2 = d(ai, aj);
            dhj a12 = this.f.a();
            f(d2, a12, b3.n(), f2 != null ? f2.floatValue() : 0.0f, b4);
            dmr a13 = dmvVar.a();
            dzvx.b(a13, "poi.identifier");
            dfeq<dfhp> e3 = e(a13, a12, this.j.a(this.l, dtxj.bH, b3.ai()));
            d2.a(e3);
            dfhp bK2 = dfhp.d.bZ().bK();
            dzvx.b(bK2, "PlacePinState.newBuilder().build()");
            dme dmeVar2 = new dme(d2, e3, bK2);
            synchronized (this.a) {
                Map<dmr, dme> map4 = this.b;
                dmr a14 = dmvVar.a();
                dzvx.b(a14, "poi.identifier");
                map4.put(a14, dmeVar2);
            }
        }
    }

    @Override // defpackage.dms
    public final void b(dmr dmrVar) {
        dme remove;
        dzvx.c(dmrVar, "poiIdentifier");
        synchronized (this.a) {
            remove = this.b.remove(dmrVar);
        }
        if (remove != null) {
            g(remove);
        }
    }

    @Override // defpackage.dms
    public final void c() {
        synchronized (this.a) {
            for (Map.Entry<dmr, dme> entry : this.b.entrySet()) {
                entry.getKey();
                g(entry.getValue());
            }
            this.b.clear();
        }
    }
}
