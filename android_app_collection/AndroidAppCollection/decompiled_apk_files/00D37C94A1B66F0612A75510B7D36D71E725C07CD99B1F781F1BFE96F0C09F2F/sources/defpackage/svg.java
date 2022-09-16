package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: svg  reason: default package */
/* loaded from: classes4.dex */
public final class svg {
    final List a = new ArrayList();
    String b = null;
    String c;

    public svg() {
        String str = svh.a;
        int incrementAndGet = svh.b.incrementAndGet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(incrementAndGet);
        this.c = sb.toString();
    }
}
