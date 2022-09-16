package defpackage;

import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qun  reason: default package */
/* loaded from: classes4.dex */
public final class qun {
    public final qtp a;
    public final Feature b;

    public qun(qtp qtpVar, Feature feature) {
        this.a = qtpVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof qun)) {
            qun qunVar = (qun) obj;
            if (tnk.j(this.a, qunVar.a) && tnk.j(this.b, qunVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("key", this.a, arrayList);
        tjk.g("feature", this.b, arrayList);
        return tjk.f(arrayList, this);
    }
}
