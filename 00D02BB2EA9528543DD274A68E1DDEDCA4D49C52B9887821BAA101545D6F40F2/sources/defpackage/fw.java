package defpackage;

import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import java.util.ArrayList;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fw  reason: default package */
/* loaded from: classes.dex */
public final class fw implements agp<Map<String, Boolean>> {
    final /* synthetic */ gn a;

    public fw(gn gnVar) {
        this.a = gnVar;
    }

    @Override // defpackage.agp
    public final /* bridge */ /* synthetic */ void a(Map<String, Boolean> map) {
        StringBuilder sb;
        Map<String, Boolean> map2 = map;
        String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map2.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = true != ((Boolean) arrayList.get(i)).booleanValue() ? -1 : 0;
        }
        FragmentManager$LaunchedFragmentInfo pollFirst = this.a.r.pollFirst();
        if (pollFirst == null) {
            sb = new StringBuilder();
            sb.append("No permissions were requested for ");
            sb.append(this);
        } else {
            String str = pollFirst.a;
            int i2 = pollFirst.b;
            fd k = this.a.a.k(str);
            if (k != null) {
                k.ab(i2, strArr, iArr);
                return;
            }
            sb = new StringBuilder();
            sb.append("Permission request result delivered for unknown Fragment ");
            sb.append(str);
        }
        sb.toString();
    }
}
