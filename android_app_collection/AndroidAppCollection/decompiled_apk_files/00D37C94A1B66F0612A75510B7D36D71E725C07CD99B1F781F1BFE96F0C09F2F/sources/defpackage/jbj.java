package defpackage;
/* compiled from: PG */
/* renamed from: jbj  reason: default package */
/* loaded from: classes3.dex */
public final class jbj {
    public final jbi a;
    public final Class b;
    public final Runnable c;

    private jbj(jbi jbiVar, Class cls, Runnable runnable) {
        this.a = jbiVar;
        this.b = cls;
        this.c = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jbj a(String str, Class cls, Runnable runnable) {
        return new jbj(new jbi(jbh.PLAYLIST, str), cls, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jbj b(String str, Class cls, Runnable runnable) {
        return new jbj(new jbi(jbh.VIDEO, str), cls, runnable);
    }
}
