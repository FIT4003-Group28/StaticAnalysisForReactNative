package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: fsp  reason: default package */
/* loaded from: classes3.dex */
public final class fsp {
    public final boolean a;
    public final RecyclerView b;

    public fsp() {
    }

    public fsp(boolean z, RecyclerView recyclerView) {
        this.a = z;
        this.b = recyclerView;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fsp) {
            fsp fspVar = (fsp) obj;
            if (this.a == fspVar.a && this.b.equals(fspVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
        sb.append("SearchResultsChipBarModel{chipApplied=");
        sb.append(z);
        sb.append(", resultsRecyclerView=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
