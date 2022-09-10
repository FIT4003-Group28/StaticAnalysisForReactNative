package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import com.google.android.apps.gmm.wearable.api.WearableLocationStatusEvent;
/* compiled from: PG */
/* renamed from: ahox  reason: default package */
/* loaded from: classes2.dex */
public final class ahox<T> extends btrh<T> {
    private final int d;

    public ahox(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ahow ahowVar = (ahow) this.a;
            if (((WearableLocationStatusEvent) obj).isUsingWearableLocation()) {
                return;
            }
            ahowVar.f = Long.MIN_VALUE;
            return;
        }
        ahow ahowVar2 = (ahow) this.a;
        if (((GmmCarProjectionStateEvent) obj).isInProjectedMode()) {
            return;
        }
        ahowVar2.e = Long.MIN_VALUE;
    }
}
