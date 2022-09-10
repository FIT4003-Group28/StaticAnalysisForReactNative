package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: xkw  reason: default package */
/* loaded from: classes7.dex */
public final class xkw {
    public final SparseArray<xkv> a = new SparseArray<>();
    public final akpm b;
    public final alen c;
    public final alec d;

    public xkw(akpm akpmVar, alen alenVar, alec alecVar) {
        this.b = akpmVar;
        this.c = alenVar;
        this.d = alecVar;
    }

    public static int b(@dzsi xmw xmwVar) {
        if (xmwVar == null) {
            return 0;
        }
        return Arrays.hashCode(new Object[]{xmwVar.c(), xmwVar.b(), Integer.valueOf(xmwVar.a())});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(xmx xmxVar) {
        int b = b(xmxVar.p());
        xkv xkvVar = this.a.get(b);
        if (xkvVar == null) {
            return;
        }
        xkvVar.a().remove(xmxVar.a());
        if (!xkvVar.a().isEmpty()) {
            return;
        }
        xkvVar.b().j();
        this.d.c(xkvVar.c());
        this.a.remove(b);
    }
}
