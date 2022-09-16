package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mkb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mkb implements ajry {
    public final /* synthetic */ mke a;
    private final /* synthetic */ int b;

    public /* synthetic */ mkb(mke mkeVar, int i) {
        this.b = i;
        this.a = mkeVar;
    }

    @Override // defpackage.ajry
    public final ajru b(ViewGroup viewGroup) {
        if (this.b == 0) {
            return this.a.b.b(null, null, R.layout.horizontal_button_list_button_layout_light);
        }
        return this.a.b.b(null, null, R.layout.horizontal_button_list_button_layout_dark);
    }
}
