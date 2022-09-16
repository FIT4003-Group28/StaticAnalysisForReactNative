package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
/* compiled from: PG */
/* renamed from: lfa  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lfa implements zcn {
    public final /* synthetic */ GeneralPrefsFragment a;
    private final /* synthetic */ int b;

    public /* synthetic */ lfa(GeneralPrefsFragment generalPrefsFragment) {
        this.a = generalPrefsFragment;
    }

    public /* synthetic */ lfa(GeneralPrefsFragment generalPrefsFragment, int i) {
        this.b = i;
        this.a = generalPrefsFragment;
    }

    @Override // defpackage.zcn
    public final void a(Object obj) {
        int i = this.b;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                Boolean bool = (Boolean) obj;
                this.a.af.b();
                return;
            } else if (i == 2) {
                GeneralPrefsFragment generalPrefsFragment = this.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                acti oi = generalPrefsFragment.ai.oi();
                oi.D(new acte(actj.SNAP_ZOOM_INITIALLY_ZOOMED_SETTING_TOGGLED_OFF));
                oi.D(new acte(actj.SNAP_ZOOM_INITIALLY_ZOOMED_SETTING_TOGGLED_ON));
                if (booleanValue) {
                    oi.H(3, new acte(actj.SNAP_ZOOM_INITIALLY_ZOOMED_SETTING_TOGGLED_ON), null);
                    return;
                } else {
                    oi.H(3, new acte(actj.SNAP_ZOOM_INITIALLY_ZOOMED_SETTING_TOGGLED_OFF), null);
                    return;
                }
            } else {
                GeneralPrefsFragment generalPrefsFragment2 = this.a;
                String str = (String) obj;
                Handler handler = generalPrefsFragment2.aq;
                final dt mJ = generalPrefsFragment2.mJ();
                mJ.getClass();
                handler.postAtFrontOfQueue(new Runnable() { // from class: lfd
                    @Override // java.lang.Runnable
                    public final void run() {
                        dt.this.recreate();
                    }
                });
                return;
            }
        }
        GeneralPrefsFragment generalPrefsFragment3 = this.a;
        if (!((Boolean) obj).booleanValue() && emn.C(generalPrefsFragment3.al) && (((gft) generalPrefsFragment3.al.c()).b & 16) != 0) {
            acth acthVar = generalPrefsFragment3.ai;
            gfs gfsVar = gfs.LIGHT;
            aopa createBuilder = asiz.a.createBuilder();
            createBuilder.copyOnWrite();
            asiz asizVar = (asiz) createBuilder.instance;
            asizVar.b |= 1;
            asizVar.c = false;
            if (gfsVar != gfs.DARK) {
                z = false;
            }
            createBuilder.copyOnWrite();
            asiz asizVar2 = (asiz) createBuilder.instance;
            asizVar2.b = 2 | asizVar2.b;
            asizVar2.d = z;
            asiz asizVar3 = (asiz) createBuilder.mo39build();
            aopa createBuilder2 = asjj.a.createBuilder();
            createBuilder2.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder2.instance;
            asizVar3.getClass();
            asjjVar.r = asizVar3;
            asjjVar.c |= 4;
            acthVar.oi().w(new acte(actj.BATTERY_SAVER_AUTO_SWITCH_THEME_ACTION), (asjj) createBuilder2.mo39build());
        }
        Handler handler2 = generalPrefsFragment3.aq;
        final dt mJ2 = generalPrefsFragment3.mJ();
        mJ2.getClass();
        handler2.postAtFrontOfQueue(new Runnable() { // from class: lfd
            @Override // java.lang.Runnable
            public final void run() {
                dt.this.recreate();
            }
        });
    }
}
