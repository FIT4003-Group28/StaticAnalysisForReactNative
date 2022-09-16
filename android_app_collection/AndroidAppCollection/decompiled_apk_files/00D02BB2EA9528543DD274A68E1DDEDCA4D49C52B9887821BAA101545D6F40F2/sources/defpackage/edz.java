package defpackage;

import android.content.Intent;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import com.google.android.apps.gmm.directions.api.PseudoTrackDirectionsEvent;
import com.google.android.apps.gmm.map.intents.AndroidIntentEvent;
/* compiled from: PG */
/* renamed from: edz  reason: default package */
/* loaded from: classes.dex */
public final class edz<T> extends btrh<T> {
    private final int d;

    public edz(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            edu eduVar = (edu) this.a;
            int i2 = edx.aU;
            Object obj2 = ((dcpy) obj).a;
        } else if (i == 1) {
            edu eduVar2 = (edu) this.a;
            bvpc bvpcVar = (bvpc) obj;
        } else if (i == 2) {
            edu eduVar3 = (edu) this.a;
            awnt awntVar = (awnt) obj;
        } else if (i == 3) {
            edu eduVar4 = (edu) this.a;
            Intent intent = ((AndroidIntentEvent) obj).getIntent();
            intent.setPackage(eduVar4.a.getPackageName());
            efz.a(intent);
            eduVar4.a.startActivity(intent);
        } else if (i != 4) {
            edu eduVar5 = (edu) this.a;
            int i3 = edx.aU;
            if (!((GmmCarProjectionStateEvent) obj).isInProjectedMode()) {
                return;
            }
            edx edxVar = eduVar5.a;
            if (!edxVar.aJ) {
                edxVar.ay.h(edxVar);
            } else {
                edxVar.finish();
            }
        } else {
            ((edu) this.a).a.N.a().l((PseudoTrackDirectionsEvent) obj);
        }
    }

    public edz(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = 1;
    }
}
