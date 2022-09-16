package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: aiyk  reason: default package */
/* loaded from: classes.dex */
public final class aiyk {
    public final int a;
    final aiyo b;
    final aiym c;

    public aiyk(int i, aiyo aiyoVar, aiym aiymVar) {
        this.a = i;
        this.b = aiyoVar;
        this.c = aiymVar;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "id: %d text: %s settings: %s", Integer.valueOf(this.a), this.b, this.c);
    }
}
