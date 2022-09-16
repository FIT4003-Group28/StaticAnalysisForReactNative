package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;
/* compiled from: PG */
/* renamed from: nu  reason: default package */
/* loaded from: classes3.dex */
final class nu extends ArrayAdapter {
    public nu(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, 16908308, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
