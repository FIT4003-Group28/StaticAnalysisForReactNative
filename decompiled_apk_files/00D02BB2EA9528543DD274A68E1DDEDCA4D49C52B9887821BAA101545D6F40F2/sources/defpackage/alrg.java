package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alrg  reason: default package */
/* loaded from: classes2.dex */
public class alrg implements akvp {
    public final akvu<?> c;
    protected int d;
    protected final amxg e;

    public alrg(akvu<?> akvuVar, int i, amxg amxgVar) {
        this.c = akvuVar;
        this.d = i;
        this.e = amxgVar;
    }

    @Override // defpackage.akvp
    public akvu<?> a() {
        return this.c;
    }

    @Override // defpackage.akvp
    public final int b() {
        return this.d;
    }

    public boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            alrg alrgVar = (alrg) obj;
            if (a().equals(alrgVar.a()) && this.d == alrgVar.d && this.e.equals(alrgVar.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(this.d), this.e});
    }
}
