package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpy  reason: default package */
/* loaded from: classes5.dex */
final class cpy implements cpk {
    public static AccessibilityManager c;
    public final int[] b;
    public Map<oy, ? extends pp> a = dztv.a;
    private final pp d = new cpx(this);

    public cpy(int[] iArr) {
        this.b = iArr;
    }

    @Override // defpackage.cpk
    public final void a(Map<Integer, pp> map) {
        dzvx.c(map, "actionMap");
        map.put(64, this.d);
        for (Map.Entry<oy, ? extends pp> entry : this.a.entrySet()) {
            map.put(Integer.valueOf(entry.getKey().a()), entry.getValue());
        }
    }

    @Override // defpackage.cqa
    public final void b(View view, pc pcVar) {
        dzvx.c(view, "host");
        for (Map.Entry<oy, ? extends pp> entry : this.a.entrySet()) {
            pcVar.h(entry.getKey());
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof cpy) && dzvx.d(this.b, ((cpy) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ClickCollectorAccessibilityAction(viewIds=" + Arrays.toString(this.b) + ")";
    }
}
