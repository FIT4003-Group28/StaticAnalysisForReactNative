package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
/* compiled from: PG */
/* renamed from: cssi  reason: default package */
/* loaded from: classes5.dex */
public final class cssi implements csse {
    private final cork a;
    private final CallerInfo b;

    public cssi(Context context, cork corkVar, String str, dbty<cssc> dbtyVar, dbty<cssd> dbtyVar2) {
        this.a = corkVar;
        this.b = new CallerInfo(String.format("%s-%s", "profile", str), 1L);
        context.registerReceiver(new cssg(dbtyVar2), new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        context.registerReceiver(new cssh(dbtyVar), new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
    }

    @Override // defpackage.csse
    public final dehn<dhdi> a() {
        Feature[] featureArr;
        Feature[] featureArr2;
        cork corkVar = this.a;
        SyncOptions syncOptions = new SyncOptions();
        final CallerInfo callerInfo = this.b;
        final SyncRequest syncRequest = new SyncRequest(1, new byte[0], syncOptions);
        cntc builder = cntd.builder();
        builder.a = new cnsr(syncRequest, callerInfo) { // from class: cors
            private final SyncRequest a;
            private final CallerInfo b;

            {
                this.a = syncRequest;
                this.b = callerInfo;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                SyncRequest syncRequest2 = this.a;
                CallerInfo callerInfo2 = this.b;
                ((corr) ((corw) obj).L()).e(new coru((cpct) obj2), syncRequest2, callerInfo2);
            }
        };
        int i = syncRequest.c - 1;
        if (i == 1 || i == 2 || i == 3) {
            featureArr = new Feature[]{corj.b};
        } else if (i != 4) {
            featureArr2 = new Feature[0];
            builder.b = featureArr2;
            return dbae.a(csac.a(((cnof) corkVar).c(builder.a())), cssf.a, dege.a);
        } else {
            featureArr = new Feature[]{corj.a};
        }
        featureArr2 = featureArr;
        builder.b = featureArr2;
        return dbae.a(csac.a(((cnof) corkVar).c(builder.a())), cssf.a, dege.a);
    }
}
