package defpackage;

import android.database.Cursor;
import android.widget.Filter;
/* compiled from: PG */
/* renamed from: amm  reason: default package */
/* loaded from: classes2.dex */
final class amm extends Filter {
    final aml a;

    public amm(aml amlVar) {
        this.a = amlVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.a.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor g = this.a.g();
        if (filterResults.values == null || filterResults.values == g) {
            return;
        }
        this.a.b((Cursor) filterResults.values);
    }
}
