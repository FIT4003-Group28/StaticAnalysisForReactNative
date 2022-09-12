package defpackage;

import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import androidx.activity.result.ActivityResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ge  reason: default package */
/* loaded from: classes.dex */
public final class ge implements agp<ActivityResult> {
    final /* synthetic */ gn a;

    public ge(gn gnVar) {
        this.a = gnVar;
    }

    @Override // defpackage.agp
    public final /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
        ActivityResult activityResult2 = activityResult;
        FragmentManager$LaunchedFragmentInfo pollFirst = this.a.r.pollFirst();
        if (pollFirst == null) {
            String str = "No Activities were started for result for " + this;
            return;
        }
        String str2 = pollFirst.a;
        int i = pollFirst.b;
        fd k = this.a.a.k(str2);
        if (k != null) {
            k.Z(i, activityResult2.a, activityResult2.b);
            return;
        }
        String str3 = "Activity result delivered for unknown Fragment " + str2;
    }
}
