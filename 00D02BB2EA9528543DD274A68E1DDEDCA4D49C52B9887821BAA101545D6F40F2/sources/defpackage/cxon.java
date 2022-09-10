package defpackage;

import android.content.Context;
import com.google.android.libraries.social.licenses.License;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: cxon  reason: default package */
/* loaded from: classes5.dex */
final class cxon extends apk<List<License>> {
    private List<License> i;

    public cxon(Context context) {
        super(context.getApplicationContext());
    }

    @Override // defpackage.apk
    public final /* bridge */ /* synthetic */ List<License> c() {
        TreeSet treeSet = new TreeSet();
        String[] split = cxoq.a(this.c.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            int indexOf = str.indexOf(32);
            String[] split2 = str.substring(0, indexOf).split(":");
            boolean z = split2.length == 2 && indexOf > 0;
            String valueOf = String.valueOf(str);
            dbsk.m(z, valueOf.length() != 0 ? "Invalid license meta-data line:\n".concat(valueOf) : new String("Invalid license meta-data line:\n"));
            arrayList.add(new License(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    @Override // defpackage.apl
    protected final void k() {
        f();
    }

    @Override // defpackage.apl
    /* renamed from: r */
    public final void g(List<License> list) {
        this.i = list;
        super.g(list);
    }

    @Override // defpackage.apl
    protected final void i() {
        List<License> list = this.i;
        if (list == null) {
            a();
        } else {
            g(list);
        }
    }
}
