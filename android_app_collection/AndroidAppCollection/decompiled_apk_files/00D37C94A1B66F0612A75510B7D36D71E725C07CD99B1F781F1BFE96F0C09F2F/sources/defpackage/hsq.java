package defpackage;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: hsq  reason: default package */
/* loaded from: classes3.dex */
public final class hsq implements afqs, hvm {
    public static final amup a = amup.l(axbb.LOCATION_NORMAL, Integer.valueOf((int) R.style.NormalDynamicSticker), axbb.LOCATION_LIGHT, Integer.valueOf((int) R.style.LightDynamicSticker));
    public static final axbb b = axbb.LOCATION_NORMAL;
    public final afqw c;
    public final Activity d;
    public final hvn e;
    public final boolean f;
    public final htu g;
    public akdv h;
    public LocationSearchView i;
    public afqv j;
    public dp k;
    public acti l;
    public aunb m;
    public boolean n;
    public hrm o;
    private final hta p;
    private final hwq q;
    private final akdr r;
    private final aakr s;

    public hsq(afqw afqwVar, Activity activity, hvn hvnVar, aadd aaddVar, hta htaVar, aakr aakrVar, htu htuVar, hwq hwqVar, akdr akdrVar, byte[] bArr, byte[] bArr2) {
        this.c = afqwVar;
        this.d = activity;
        this.e = hvnVar;
        this.p = htaVar;
        this.s = aakrVar;
        this.g = htuVar;
        this.q = hwqVar;
        this.r = akdrVar;
        boolean z = false;
        if (aaddVar.a() != null) {
            asuw asuwVar = aaddVar.a().c;
            if ((asuwVar == null ? asuw.a : asuwVar).k) {
                z = true;
            }
        }
        this.f = z;
    }

    private final View g(String str, int i) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.d, i)).inflate(R.layout.location_sticker, new FrameLayout(this.d));
        ((TextView) inflate.findViewById(R.id.text)).setText(str);
        return inflate;
    }

    private final void h(Place place, axbb axbbVar, axbl axblVar, final boolean z) {
        axba axbaVar;
        axba axbaVar2;
        aopa mo52toBuilder = ((axbm) axblVar.instance).i().mo52toBuilder();
        axbk i = ((axbm) axblVar.instance).i();
        if (i.c == 3) {
            axbaVar = (axba) i.d;
        } else {
            axbaVar = axba.a;
        }
        aopa mo52toBuilder2 = axbaVar.mo52toBuilder();
        String str = place.a;
        mo52toBuilder2.copyOnWrite();
        axba axbaVar3 = (axba) mo52toBuilder2.instance;
        str.getClass();
        axbaVar3.b |= 2;
        axbaVar3.d = str;
        String str2 = place.b;
        mo52toBuilder2.copyOnWrite();
        axba axbaVar4 = (axba) mo52toBuilder2.instance;
        str2.getClass();
        axbaVar4.b |= 4;
        axbaVar4.e = str2;
        axbk i2 = ((axbm) axblVar.instance).i();
        if (i2.c == 3) {
            axbaVar2 = (axba) i2.d;
        } else {
            axbaVar2 = axba.a;
        }
        axaz axazVar = axbaVar2.f;
        if (axazVar == null) {
            axazVar = axaz.b;
        }
        aopa mo52toBuilder3 = axazVar.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        axaz axazVar2 = (axaz) mo52toBuilder3.instance;
        axazVar2.d = axbbVar.d;
        axazVar2.c |= 1;
        mo52toBuilder2.copyOnWrite();
        axba axbaVar5 = (axba) mo52toBuilder2.instance;
        axaz axazVar3 = (axaz) mo52toBuilder3.mo39build();
        axazVar3.getClass();
        axbaVar5.f = axazVar3;
        axbaVar5.b |= 8;
        mo52toBuilder.copyOnWrite();
        axbk axbkVar = (axbk) mo52toBuilder.instance;
        axba axbaVar6 = (axba) mo52toBuilder2.mo39build();
        axbaVar6.getClass();
        axbkVar.d = axbaVar6;
        axbkVar.c = 3;
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).F((axbk) mo52toBuilder.mo39build());
        hxb.e(this.d, this.s, g(place.b, ((Integer) a.get(axbbVar)).intValue()), axblVar, new hvg() { // from class: hso
            @Override // defpackage.hvg
            public final void a(axbl axblVar2) {
                hsq hsqVar = hsq.this;
                boolean z2 = z;
                hsqVar.e.aH(axblVar2);
                if (z2) {
                    hsqVar.g.d(axblVar2);
                }
            }
        });
    }

    @Override // defpackage.hvm
    public final void a(axaj axajVar) {
        axba axbaVar;
        axba axbaVar2;
        axba axbaVar3;
        this.l.H(3, new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        axbk i = axajVar.c().i();
        if (i.c == 3) {
            axbaVar = (axba) i.d;
        } else {
            axbaVar = axba.a;
        }
        Place place = new Place(axbaVar.d, axbaVar.e);
        axaz axazVar = axbaVar.f;
        if (axazVar == null) {
            axazVar = axaz.b;
        }
        aops aopsVar = new aops(axazVar.e, axaz.a);
        axaz axazVar2 = axbaVar.f;
        if (axazVar2 == null) {
            axazVar2 = axaz.b;
        }
        axbb b2 = axbb.b(axazVar2.d);
        if (b2 == null) {
            b2 = axbb.LOCATION_STYLE_UNSPECIFIED;
        }
        axbb axbbVar = (axbb) htj.a(aopsVar, b2);
        final aopa mo52toBuilder = axajVar.mo52toBuilder();
        axbl axblVar = (axbl) ((axaj) mo52toBuilder.instance).c().mo52toBuilder();
        aopa mo52toBuilder2 = ((axbm) axblVar.instance).i().mo52toBuilder();
        axbk i2 = ((axbm) axblVar.instance).i();
        if (i2.c == 3) {
            axbaVar2 = (axba) i2.d;
        } else {
            axbaVar2 = axba.a;
        }
        aopa mo52toBuilder3 = axbaVar2.mo52toBuilder();
        String str = place.a;
        mo52toBuilder3.copyOnWrite();
        axba axbaVar4 = (axba) mo52toBuilder3.instance;
        str.getClass();
        axbaVar4.b |= 2;
        axbaVar4.d = str;
        String str2 = place.b;
        mo52toBuilder3.copyOnWrite();
        axba axbaVar5 = (axba) mo52toBuilder3.instance;
        str2.getClass();
        axbaVar5.b |= 4;
        axbaVar5.e = str2;
        axbk i3 = ((axbm) axblVar.instance).i();
        if (i3.c == 3) {
            axbaVar3 = (axba) i3.d;
        } else {
            axbaVar3 = axba.a;
        }
        axaz axazVar3 = axbaVar3.f;
        if (axazVar3 == null) {
            axazVar3 = axaz.b;
        }
        aopa mo52toBuilder4 = axazVar3.mo52toBuilder();
        mo52toBuilder4.copyOnWrite();
        axaz axazVar4 = (axaz) mo52toBuilder4.instance;
        axazVar4.d = axbbVar.d;
        axazVar4.c |= 1;
        mo52toBuilder3.copyOnWrite();
        axba axbaVar6 = (axba) mo52toBuilder3.instance;
        axaz axazVar5 = (axaz) mo52toBuilder4.mo39build();
        axazVar5.getClass();
        axbaVar6.f = axazVar5;
        axbaVar6.b |= 8;
        mo52toBuilder2.copyOnWrite();
        axbk axbkVar = (axbk) mo52toBuilder2.instance;
        axba axbaVar7 = (axba) mo52toBuilder3.mo39build();
        axbaVar7.getClass();
        axbkVar.d = axbaVar7;
        axbkVar.c = 3;
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).F((axbk) mo52toBuilder2.mo39build());
        hxb.e(this.d, this.s, g(place.b, ((Integer) a.get(axbbVar)).intValue()), axblVar, new hvg() { // from class: hsn
            @Override // defpackage.hvg
            public final void a(axbl axblVar2) {
                hsq hsqVar = hsq.this;
                aopa aopaVar = mo52toBuilder;
                aopaVar.copyOnWrite();
                ((axaj) aopaVar.instance).e((axbm) axblVar2.mo39build());
                hsqVar.e.aR(aopaVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akdv c() {
        return new akdv(akdu.e(this.k), this.l, Arrays.asList(new PermissionDescriptor(3, actj.REEL_APPROVE_LOCATION_BUTTON, actj.REEL_DENY_LOCATION_BUTTON)), R.string.reel_permission_open_settings_location, R.string.reel_permissions_missing_location, new Runnable() { // from class: hsp
            @Override // java.lang.Runnable
            public final void run() {
                hsq.this.f();
            }
        }, bhj.c, this.r);
    }

    @Override // defpackage.afqs
    public final void d() {
        this.i.setVisibility(8);
    }

    @Override // defpackage.afqs
    public final void e(Place place) {
        this.p.b(this.m, this.k);
        this.i.setVisibility(8);
        this.o.a();
        this.l.n(new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON));
        aopa createBuilder = axba.a.createBuilder();
        ArrayList<axbb> arrayList = new ArrayList();
        arrayList.add(axbb.LOCATION_NORMAL);
        arrayList.add(axbb.LOCATION_LIGHT);
        aopa createBuilder2 = axaz.b.createBuilder();
        createBuilder2.copyOnWrite();
        axaz axazVar = (axaz) createBuilder2.instance;
        aopq aopqVar = axazVar.e;
        if (!aopqVar.c()) {
            axazVar.e = aopi.mutableCopy(aopqVar);
        }
        for (axbb axbbVar : arrayList) {
            axazVar.e.g(axbbVar.d);
        }
        axbb axbbVar2 = b;
        createBuilder2.copyOnWrite();
        axaz axazVar2 = (axaz) createBuilder2.instance;
        axazVar2.d = axbbVar2.d;
        axazVar2.c |= 1;
        createBuilder.copyOnWrite();
        axba axbaVar = (axba) createBuilder.instance;
        axaz axazVar3 = (axaz) createBuilder2.mo39build();
        axazVar3.getClass();
        axbaVar.f = axazVar3;
        axbaVar.b = 8 | axbaVar.b;
        axbl j = axbm.j();
        aopa createBuilder3 = axbk.a.createBuilder();
        boolean z = this.n;
        createBuilder3.copyOnWrite();
        axbk axbkVar = (axbk) createBuilder3.instance;
        axbkVar.b |= 4096;
        axbkVar.e = z;
        createBuilder3.copyOnWrite();
        axbk axbkVar2 = (axbk) createBuilder3.instance;
        axba axbaVar2 = (axba) createBuilder.mo39build();
        axbaVar2.getClass();
        axbkVar2.d = axbaVar2;
        axbkVar2.c = 3;
        boolean b2 = this.q.b();
        createBuilder3.copyOnWrite();
        axbk axbkVar3 = (axbk) createBuilder3.instance;
        axbkVar3.b |= 8192;
        axbkVar3.f = b2;
        j.copyOnWrite();
        ((axbm) j.instance).F((axbk) createBuilder3.mo39build());
        h(place, axbbVar2, j, true);
    }

    public final void f() {
        this.i.setVisibility(0);
        this.j.a();
    }

    @Override // defpackage.hvm
    public final void mt(axbm axbmVar) {
        axba axbaVar;
        this.l.H(3, new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        axbk i = axbmVar.i();
        if (i.c == 3) {
            axbaVar = (axba) i.d;
        } else {
            axbaVar = axba.a;
        }
        Place place = new Place(axbaVar.d, axbaVar.e);
        axaz axazVar = axbaVar.f;
        if (axazVar == null) {
            axazVar = axaz.b;
        }
        aops aopsVar = new aops(axazVar.e, axaz.a);
        axaz axazVar2 = axbaVar.f;
        if (axazVar2 == null) {
            axazVar2 = axaz.b;
        }
        axbb b2 = axbb.b(axazVar2.d);
        if (b2 == null) {
            b2 = axbb.LOCATION_STYLE_UNSPECIFIED;
        }
        h(place, (axbb) htj.a(aopsVar, b2), (axbl) axbmVar.mo52toBuilder(), false);
    }
}
