package defpackage;

import android.view.View;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ajsk  reason: default package */
/* loaded from: classes.dex */
public final class ajsk {
    public final Set a = new HashSet();

    public final void a(Object obj, View view) {
        if (this.a.isEmpty()) {
            return;
        }
        for (ajsj ajsjVar : this.a) {
            ajsjVar.a(obj, view);
        }
    }
}
