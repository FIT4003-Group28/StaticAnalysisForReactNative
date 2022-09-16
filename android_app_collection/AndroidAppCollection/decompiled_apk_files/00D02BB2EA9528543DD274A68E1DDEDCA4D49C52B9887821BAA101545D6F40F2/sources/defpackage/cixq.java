package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cixq  reason: default package */
/* loaded from: classes4.dex */
public class cixq implements cixp {
    private final List<cixz> a;

    public cixq(ciyb ciybVar, chrx chrxVar, chvk chvkVar) {
        ArrayList arrayList = new ArrayList();
        for (chvo chvoVar : chvkVar.c) {
            Activity activity = (Activity) ((dxjd) ciybVar.a).a;
            ciyb.a(activity, 1);
            ciyb.a(chrxVar, 2);
            ciyb.a(chvoVar, 3);
            arrayList.add(new ciya(activity, chrxVar, chvoVar));
        }
        this.a = arrayList;
    }

    @Override // defpackage.cixp
    public List<cixz> a() {
        return this.a;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof cixq)) {
            return false;
        }
        return ((cixq) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
