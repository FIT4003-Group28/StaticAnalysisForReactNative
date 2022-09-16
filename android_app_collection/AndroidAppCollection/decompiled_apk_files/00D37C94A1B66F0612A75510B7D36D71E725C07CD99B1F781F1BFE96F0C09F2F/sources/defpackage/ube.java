package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
/* compiled from: PG */
/* renamed from: ube  reason: default package */
/* loaded from: classes4.dex */
public final class ube implements ubb {
    private final rgt a;
    private final CallerInfo b;

    public ube(Context context, rgt rgtVar, String str, amqo amqoVar, amqo amqoVar2) {
        this.a = rgtVar;
        this.b = new CallerInfo(String.format("%s-%s", "profile", str), 1L);
        context.registerReceiver(new ubc(amqoVar2), new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        context.registerReceiver(new ubd(amqoVar), new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
    }

    @Override // defpackage.ubb
    public final ankt a() {
        Feature[] featureArr;
        Feature[] featureArr2;
        rgt rgtVar = this.a;
        SyncOptions syncOptions = new SyncOptions();
        final CallerInfo callerInfo = this.b;
        final SyncRequest syncRequest = new SyncRequest(1, new byte[0], syncOptions);
        qvx b = qvy.b();
        b.a = new qvo() { // from class: rgw
            @Override // defpackage.qvo
            public final void a(Object obj, Object obj2) {
                SyncRequest syncRequest2 = SyncRequest.this;
                CallerInfo callerInfo2 = callerInfo;
                qig qigVar = new qig((rvh) obj2, 6, (boolean[]) null);
                rgv rgvVar = (rgv) ((rgz) obj).D();
                Parcel pv = rgvVar.pv();
                dve.i(pv, qigVar);
                dve.g(pv, syncRequest2);
                dve.g(pv, callerInfo2);
                rgvVar.px(1, pv);
            }
        };
        int i = syncRequest.c - 1;
        if (i == 1 || i == 2 || i == 3) {
            featureArr = new Feature[]{rgs.b};
        } else if (i != 4) {
            featureArr2 = new Feature[0];
            b.b = featureArr2;
            b.c = 15902;
            return amnt.f(tjk.e(((qst) rgtVar).s(b.a())), g.p, anjk.a);
        } else {
            featureArr = new Feature[]{rgs.a};
        }
        featureArr2 = featureArr;
        b.b = featureArr2;
        b.c = 15902;
        return amnt.f(tjk.e(((qst) rgtVar).s(b.a())), g.p, anjk.a);
    }
}
