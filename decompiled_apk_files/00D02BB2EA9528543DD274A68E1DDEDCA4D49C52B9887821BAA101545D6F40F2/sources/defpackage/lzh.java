package defpackage;

import java.io.PrintWriter;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: lzh  reason: default package */
/* loaded from: classes7.dex */
public final class lzh implements btph {
    private final HashSet<Object> a = new HashSet<>();
    private final btrm b;

    public lzh(btrm btrmVar) {
        this.b = btrmVar;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("allNotificationsSuppressors: ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
    }

    public final void a(Object obj) {
        if (this.a.isEmpty()) {
            this.b.b(ascc.a);
        }
        this.a.add(obj);
    }

    public final void b(Object obj) {
        this.a.remove(obj);
        if (this.a.isEmpty()) {
            this.b.b(ascc.c);
        }
    }
}
