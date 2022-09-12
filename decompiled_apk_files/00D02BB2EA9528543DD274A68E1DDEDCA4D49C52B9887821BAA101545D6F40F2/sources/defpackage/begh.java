package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: begh  reason: default package */
/* loaded from: classes3.dex */
public final class begh {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof begh) {
            begh beghVar = (begh) obj;
            return this.a == beghVar.a && this.b == beghVar.b && this.c == beghVar.c && this.d == beghVar.d && this.e == beghVar.e && this.f == beghVar.f;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }
}
