package defpackage;

import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ej  reason: default package */
/* loaded from: classes3.dex */
public final class ej implements abw {
    final /* synthetic */ eo a;
    private final /* synthetic */ int b;

    public ej(eo eoVar) {
        this.a = eoVar;
    }

    public ej(eo eoVar, int i) {
        this.b = i;
        this.a = eoVar;
    }

    @Override // defpackage.abw
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ActivityResult activityResult = (ActivityResult) obj;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) this.a.t.pollFirst();
            if (fragmentManager$LaunchedFragmentInfo == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = fragmentManager$LaunchedFragmentInfo.a;
            int i2 = fragmentManager$LaunchedFragmentInfo.b;
            dp b = this.a.a.b(str);
            if (b == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            b.S(i2, activityResult.a, activityResult.b);
        } else if (i == 1) {
            ActivityResult activityResult2 = (ActivityResult) obj;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) this.a.t.pollFirst();
            if (fragmentManager$LaunchedFragmentInfo2 == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str2 = fragmentManager$LaunchedFragmentInfo2.a;
            int i3 = fragmentManager$LaunchedFragmentInfo2.b;
            dp b2 = this.a.a.b(str2);
            if (b2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                return;
            }
            b2.S(i3, activityResult2.a, activityResult2.b);
        } else {
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                iArr[i4] = true != ((Boolean) arrayList.get(i4)).booleanValue() ? -1 : 0;
            }
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) this.a.t.pollFirst();
            if (fragmentManager$LaunchedFragmentInfo3 == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str3 = fragmentManager$LaunchedFragmentInfo3.a;
            int i5 = fragmentManager$LaunchedFragmentInfo3.b;
            dp b3 = this.a.a.b(str3);
            if (b3 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str3);
                return;
            }
            b3.X(i5, strArr, iArr);
        }
    }
}
