package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: zaa  reason: default package */
/* loaded from: classes7.dex */
public final class zaa {
    public static final cqjg a = cqjg.a();
    public List<yzz> b = null;

    public final void a(View view) {
        boolean z = this.b == null;
        if (z) {
            this.b = new ArrayList();
        }
        cqkx.h(view, a, RecyclerView.class, new yzy(this, z));
    }

    public final void b() {
        List<yzz> list = this.b;
        if (list == null) {
            return;
        }
        for (yzz yzzVar : list) {
            yzzVar.b = yzzVar.a.l.B();
        }
    }

    public final void c() {
        List<yzz> list = this.b;
        if (list == null) {
            return;
        }
        for (yzz yzzVar : list) {
            Parcelable parcelable = yzzVar.b;
            if (parcelable != null) {
                yzzVar.a.l.C(parcelable);
            }
        }
    }
}
