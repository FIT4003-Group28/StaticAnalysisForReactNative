package defpackage;

import java.io.PrintWriter;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjur  reason: default package */
/* loaded from: classes.dex */
public final class cjur implements btph {
    public final dzsj<dusf> a;
    public final dcba<cjuq> b = dcba.a(10);
    public final dcba<cjuq> c = dcba.a(10);

    public cjur(dzsj<dusf> dzsjVar) {
        this.a = dzsjVar;
    }

    public static <T> List<T> a(List<T> list, int i) {
        return list.subList(Math.max(list.size() - i, 0), list.size());
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }
}
