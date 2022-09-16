package defpackage;

import android.text.Html;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aiyn  reason: default package */
/* loaded from: classes.dex */
public final class aiyn implements afwf {
    private final List c = new ArrayList();
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    @Override // defpackage.afwf
    /* renamed from: b */
    public final aiyo a() {
        List list = this.c;
        List list2 = this.a;
        List<String> list3 = this.b;
        ArrayList arrayList = new ArrayList(list3.size());
        for (String str : list3) {
            arrayList.add(Html.fromHtml(str));
        }
        return new aiyo(list, list2, arrayList);
    }

    public final void c(String str, long j, long j2) {
        if (!this.c.isEmpty() && j < ((Long) arey.s(this.c)).longValue()) {
            zep.l("subtitles are not given in non-decreasing start time order");
        }
        this.c.add(Long.valueOf(j));
        this.a.add(Long.valueOf(j2));
        this.b.add(str);
    }
}
