package defpackage;

import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: peu  reason: default package */
/* loaded from: classes7.dex */
final class peu implements Runnable {
    final /* synthetic */ UsageInfo a;
    final /* synthetic */ pev b;

    public peu(pev pevVar, UsageInfo usageInfo) {
        this.b = pevVar;
        this.a = usageInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pev pevVar = this.b;
        UsageInfo usageInfo = this.a;
        if (pevVar.e.a() != null) {
            cnoa<cmqj> cnoaVar = cmps.a;
            GoogleApiClient a = pevVar.e.a();
            a.enqueue(new cmqk(a, new UsageInfo[]{usageInfo})).i(pevVar);
        }
    }
}
