package defpackage;

import android.graphics.Rect;
import java.io.PrintWriter;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: kdr  reason: default package */
/* loaded from: classes7.dex */
public final class kdr implements btph {
    public final kxu a;
    public final dbty<Rect> d;
    public final crzo<Rect> b = new crzo<>();
    public final crzo<Rect> c = new crzo<>();
    public final Queue<kdq> e = dcba.a(100);
    public int f = 1;

    public kdr(kxu kxuVar, dbty<Rect> dbtyVar) {
        this.d = dbtyVar;
        this.a = kxuVar;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final crzm<Rect> a() {
        return this.b.a;
    }
}
