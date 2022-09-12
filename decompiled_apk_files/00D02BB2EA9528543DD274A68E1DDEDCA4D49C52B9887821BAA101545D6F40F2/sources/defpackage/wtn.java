package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: wtn  reason: default package */
/* loaded from: classes7.dex */
final class wtn extends WeakReference<wtm> {
    private final int a;

    public wtn(wtm wtmVar) {
        super(wtmVar);
        this.a = wtmVar.hashCode();
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof wtn) {
            return dbsd.a(get(), ((wtn) obj).get());
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        return this.a;
    }
}
