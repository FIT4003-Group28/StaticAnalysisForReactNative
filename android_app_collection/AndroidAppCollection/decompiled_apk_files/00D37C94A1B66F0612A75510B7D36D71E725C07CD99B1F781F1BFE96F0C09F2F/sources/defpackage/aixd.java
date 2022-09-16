package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
/* compiled from: PG */
@Deprecated
/* renamed from: aixd  reason: default package */
/* loaded from: classes.dex */
public final class aixd {
    private final SparseArray a;
    private final boolean b;

    public aixd(TreeMap treeMap, SparseArray sparseArray, String str, boolean z) {
        treeMap.getClass();
        sparseArray.getClass();
        this.a = sparseArray;
        str.getClass();
        this.b = z;
    }

    public final synchronized List a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (!this.b) {
            for (aixa aixaVar : b()) {
                String str = aixaVar.b;
                if (str != null) {
                    arrayList.add(SubtitleTrack.n(new Locale(str).getDisplayName(Locale.getDefault()), "", aixaVar.b));
                }
            }
        } else {
            arrayList.add(SubtitleTrack.n("CC1", "rawcc", "0"));
            arrayList.add(SubtitleTrack.n("CC3", "rawcc", "1"));
        }
        return arrayList;
    }

    public final synchronized List b() {
        List list;
        if (this.b) {
            list = (List) this.a.get(1);
        } else {
            list = (List) this.a.get(2);
        }
        return list;
    }
}
