package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zda  reason: default package */
/* loaded from: classes4.dex */
public final class zda {
    public final Set a = new HashSet();
    public RecyclerView b;
    private ya c;
    private ne d;

    public final ya a() {
        if (this.c == null) {
            this.c = new zcy(this);
        }
        return this.c;
    }

    public final ne b() {
        if (this.d == null) {
            this.d = new zcz(this);
        }
        return this.d;
    }
}
