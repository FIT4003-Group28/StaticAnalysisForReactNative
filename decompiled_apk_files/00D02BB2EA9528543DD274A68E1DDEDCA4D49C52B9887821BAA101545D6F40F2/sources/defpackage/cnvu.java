package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cnvu  reason: default package */
/* loaded from: classes5.dex */
public final class cnvu {
    private final List<String> a = new ArrayList();
    private final Object b;

    public cnvu(Object obj) {
        this.b = obj;
    }

    public final void a(String str, Object obj) {
        List<String> list = this.a;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.b.getClass().getSimpleName());
        sb.append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.a.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
