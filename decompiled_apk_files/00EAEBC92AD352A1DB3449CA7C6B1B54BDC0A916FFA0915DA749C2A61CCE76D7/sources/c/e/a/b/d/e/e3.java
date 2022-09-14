package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class e3 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<e3> CREATOR = new d3();

    /* renamed from: b  reason: collision with root package name */
    private List<c3> f3895b;

    public e3() {
        this.f3895b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e3(List<c3> list) {
        this.f3895b = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public static e3 a(e3 e3Var) {
        List<c3> list = e3Var.f3895b;
        e3 e3Var2 = new e3();
        if (list != null) {
            e3Var2.f3895b.addAll(list);
        }
        return e3Var2;
    }

    public final List<c3> f() {
        return this.f3895b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.b(parcel, 2, this.f3895b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
