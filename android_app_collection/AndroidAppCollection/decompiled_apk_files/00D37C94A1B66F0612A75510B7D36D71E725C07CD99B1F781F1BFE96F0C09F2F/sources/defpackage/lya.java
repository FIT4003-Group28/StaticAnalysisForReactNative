package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: lya  reason: default package */
/* loaded from: classes3.dex */
public final class lya {
    public final ArrayList a;
    private int b;

    public lya() {
        a();
        this.a = amxp.r(Integer.valueOf((int) R.id.menu_item_0), Integer.valueOf((int) R.id.menu_item_1), Integer.valueOf((int) R.id.menu_item_2), Integer.valueOf((int) R.id.menu_item_3), Integer.valueOf((int) R.id.menu_item_4), Integer.valueOf((int) R.id.menu_item_5), Integer.valueOf((int) R.id.menu_item_6), Integer.valueOf((int) R.id.menu_item_7), Integer.valueOf((int) R.id.menu_item_8), Integer.valueOf((int) R.id.menu_item_9), Integer.valueOf((int) R.id.menu_item_10), Integer.valueOf((int) R.id.menu_item_11), Integer.valueOf((int) R.id.menu_item_12), Integer.valueOf((int) R.id.menu_item_13), Integer.valueOf((int) R.id.menu_item_14), Integer.valueOf((int) R.id.menu_item_15), Integer.valueOf((int) R.id.menu_item_16), Integer.valueOf((int) R.id.menu_item_17), Integer.valueOf((int) R.id.menu_item_18), Integer.valueOf((int) R.id.menu_item_19));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b = -1;
    }

    public final lyb b() {
        int i = this.b + 1;
        this.b = i;
        if (i >= this.a.size()) {
            throw new IllegalStateException("This id for ActionBarMenuItem is exceeding the maximum allowed number.");
        }
        return new lyb(this, this.b);
    }
}
