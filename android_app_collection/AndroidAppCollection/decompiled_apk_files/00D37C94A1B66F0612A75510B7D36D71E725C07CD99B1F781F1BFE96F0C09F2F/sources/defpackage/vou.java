package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: vou  reason: default package */
/* loaded from: classes4.dex */
public final class vou {
    private final StringBuilder b = new StringBuilder();
    public final ArrayList a = new ArrayList();

    public final vot a() {
        String sb = this.b.toString();
        ArrayList arrayList = this.a;
        return new vot(sb, arrayList.toArray(new Object[arrayList.size()]));
    }

    public final void b(String str) {
        this.b.append(str);
    }

    public final void c(String str) {
        this.a.add(str);
    }
}
