package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class j3 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<j3> CREATOR = new l3();

    /* renamed from: b  reason: collision with root package name */
    private final int f3933b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f3934c;

    public j3() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j3(int i, List<String> list) {
        List<String> emptyList;
        this.f3933b = i;
        if (list == null || list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.set(i2, com.google.android.gms.common.util.n.a(list.get(i2)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.f3934c = emptyList;
    }

    private j3(List<String> list) {
        this.f3933b = 1;
        this.f3934c = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f3934c.addAll(list);
    }

    public static j3 a(j3 j3Var) {
        return new j3(j3Var != null ? j3Var.f3934c : null);
    }

    public static j3 j() {
        return new j3(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f3933b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3934c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
