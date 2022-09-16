package defpackage;
/* compiled from: PG */
/* renamed from: abgm  reason: default package */
/* loaded from: classes.dex */
public final class abgm implements afzs {
    private final abgf a;
    private final abgk b;
    private final aacb c;

    public abgm(abgf abgfVar, abgk abgkVar, aacb aacbVar) {
        this.a = abgfVar;
        this.b = abgkVar;
        this.c = aacbVar;
    }

    @Override // defpackage.afzs
    public final void a(String str) {
        int i = this.c.a;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                this.a.a(str);
                return;
            } else if (i2 != 2) {
                return;
            } else {
                this.b.a(str);
                return;
            }
        }
        throw null;
    }
}
