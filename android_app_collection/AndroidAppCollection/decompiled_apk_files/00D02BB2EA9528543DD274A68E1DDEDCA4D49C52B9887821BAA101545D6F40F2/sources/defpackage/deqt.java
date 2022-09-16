package defpackage;

import java.io.Writer;
/* compiled from: PG */
/* renamed from: deqt  reason: default package */
/* loaded from: classes6.dex */
public final class deqt {
    final /* synthetic */ deqv a;

    public deqt(deqv deqvVar) {
        this.a = deqvVar;
    }

    public final void a(Object obj, Writer writer) {
        deqv deqvVar = this.a;
        deqw deqwVar = new deqw(writer, deqvVar.a, deqvVar.b, deqvVar.c, deqvVar.d);
        deqwVar.g(obj);
        deqwVar.a.flush();
    }
}
