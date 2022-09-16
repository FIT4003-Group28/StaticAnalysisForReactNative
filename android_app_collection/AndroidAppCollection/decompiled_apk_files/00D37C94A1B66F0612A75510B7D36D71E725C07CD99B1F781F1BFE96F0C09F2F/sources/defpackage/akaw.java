package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akaw  reason: default package */
/* loaded from: classes.dex */
public class akaw extends vez {
    public boolean g;
    public String h;
    public final Context i;

    public akaw(Context context, String str) {
        super(str);
        this.i = context;
    }

    public void a(boolean z) {
        this.g = z;
        this.e = z ? this.i.getResources().getDrawable(2131232423) : null;
    }

    @Override // defpackage.vez, defpackage.vex
    public int b() {
        return R.layout.bottom_sheet_list_checkmark_item;
    }
}
