package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: cps  reason: default package */
/* loaded from: classes.dex */
public final class cps {
    private final List<View> a;
    private final Integer[] b;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public cps(List<View> list) {
        this.a = list;
        this.b = new Integer[list.size()];
    }

    public final void a() {
        if (!this.c) {
            for (int i = 0; i < this.a.size(); i++) {
                View view = this.a.get(i);
                if (view != null) {
                    this.b[i] = Integer.valueOf(view.getImportantForAccessibility());
                    view.setImportantForAccessibility(4);
                }
            }
            this.c = true;
        }
    }

    public final void b() {
        if (this.c) {
            for (int i = 0; i < this.a.size(); i++) {
                View view = this.a.get(i);
                if (view != null) {
                    view.setImportantForAccessibility(this.b[i].intValue());
                }
            }
            this.c = false;
        }
    }
}
