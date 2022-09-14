package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dypf  reason: default package */
/* loaded from: classes6.dex */
public final class dypf {
    private final ArrayList<String> a = new ArrayList<>();

    public final void a(@dzsi Object obj) {
        this.a.add(String.valueOf(obj));
    }

    public final void b(String str, @dzsi Object obj) {
        ArrayList<String> arrayList = this.a;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        arrayList.add(sb.toString());
    }

    public final String toString() {
        return this.a.toString();
    }
}
