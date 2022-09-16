package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CaptionPickerEndpointOuterClass$CaptionPickerEndpoint;
/* compiled from: PG */
/* renamed from: hzr  reason: default package */
/* loaded from: classes3.dex */
public final class hzr extends hyn implements AdapterView.OnItemClickListener {
    public jyu ae;
    private atep ag;
    private Context ah;
    private gfu ai;

    public static hzr aH(atep atepVar, ajxz ajxzVar, gfu gfuVar, acth acthVar) {
        hzr hzrVar = new hzr();
        aL(hzrVar, atepVar, ajxzVar, acthVar, Integer.valueOf((int) R.attr.ytTextPrimary));
        hzrVar.ai = gfuVar;
        return hzrVar;
    }

    @Override // defpackage.akbf, defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        return aG();
    }

    @Override // defpackage.akbf, defpackage.vew, defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            return;
        }
        try {
            this.ag = (atep) aphq.i(bundle2, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", atep.a, aoos.b());
        } catch (aopx e) {
            zep.d("Error decoding menu", e);
            this.ag = atep.a;
        }
    }

    @Override // defpackage.vew, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mJ(), this.ai.a() == gfs.DARK ? 2132083359 : 2132083360);
        this.ah = contextThemeWrapper;
        return super.mc(layoutInflater.cloneInContext(contextThemeWrapper), viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akbf
    public final akaz mu() {
        ajsm ajsmVar = new ajsm();
        atep atepVar = this.ag;
        if (atepVar != null) {
            for (aten atenVar : atepVar.c) {
                apzg d = abgc.d(atenVar);
                ampq aK = aK(atenVar);
                if (d != null && d.qn(CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.captionPickerEndpoint)) {
                    ajsmVar.add(this.ae.a());
                } else if (aK.h()) {
                    ajsmVar.add(aK.c());
                }
            }
        }
        return new akaz(this.ah, ajsmVar);
    }

    @Override // defpackage.akbf, android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        super.onItemClick(adapterView, view, i, j);
        vex item = ((akaz) this.aC).getItem(i);
        if (item instanceof jxt) {
            ((jxt) item).a();
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        Context context = this.ah;
        return context == null ? mJ() : context;
    }
}
