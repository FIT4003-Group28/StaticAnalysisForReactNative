package defpackage;
/* compiled from: PG */
/* renamed from: alvy  reason: default package */
/* loaded from: classes.dex */
final class alvy {
    final int a;
    final alvl b;

    public alvy(int i) {
        this(i, null);
    }

    public alvy(int i, alvl alvlVar) {
        this.a = i;
        this.b = alvlVar;
        if (i == 4) {
            apwt.n(alvlVar, "CompatService cannot be null when state is connected");
        }
    }
}
