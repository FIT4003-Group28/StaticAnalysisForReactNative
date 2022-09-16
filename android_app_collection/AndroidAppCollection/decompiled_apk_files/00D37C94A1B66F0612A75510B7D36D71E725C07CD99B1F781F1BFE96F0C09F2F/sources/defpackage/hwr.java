package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hwr  reason: default package */
/* loaded from: classes3.dex */
public final class hwr implements abv {
    final /* synthetic */ hws a;

    public hwr(hws hwsVar) {
        this.a = hwsVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        hws hwsVar = this.a;
        if (!hwsVar.a) {
            hwsVar.a = true;
            hwsVar.lI();
            ReelWatchActivity reelWatchActivity = (ReelWatchActivity) hwsVar;
        }
    }
}
