package defpackage;

import android.widget.Filter;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpmt  reason: default package */
/* loaded from: classes5.dex */
final class cpmt extends Filter {
    final /* synthetic */ cpmu a;

    public cpmt(cpmu cpmuVar) {
        this.a = cpmuVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        if (obj instanceof cpnc) {
            cpnc cpncVar = (cpnc) obj;
            if (cpncVar.c() == null || cpncVar.c().isEmpty()) {
                return cpncVar.a();
            }
            return cpncVar.c();
        }
        return super.convertResultToString(obj);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence != null && !charSequence.toString().trim().isEmpty()) {
            cpmu cpmuVar = this.a;
            cpmz cpmzVar = new cpmz();
            cpmzVar.a = charSequence.toString();
            List<cpnc> list = cpmuVar.b.c(cpmzVar).a;
            filterResults.values = list;
            filterResults.count = list.size();
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null || filterResults.count <= 0) {
            this.a.notifyDataSetInvalidated();
            return;
        }
        this.a.a = (List) filterResults.values;
        this.a.notifyDataSetChanged();
    }
}
