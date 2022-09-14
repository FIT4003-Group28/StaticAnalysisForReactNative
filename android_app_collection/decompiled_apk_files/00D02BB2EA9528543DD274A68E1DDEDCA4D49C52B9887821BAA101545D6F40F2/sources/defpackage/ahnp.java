package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.BleBeaconEvent;
/* compiled from: PG */
/* renamed from: ahnp  reason: default package */
/* loaded from: classes2.dex */
public final class ahnp<T> extends btrh<T> {
    public ahnp(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        BleBeaconEvent bleBeaconEvent = (BleBeaconEvent) obj;
        ahqd ahqdVar = ((ahno) this.a).a;
        if (ahqdVar != null) {
            ahqdVar.r(new ahqg(bleBeaconEvent));
        }
    }
}
