package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: agaj  reason: default package */
/* loaded from: classes2.dex */
final class agaj {
    private final String a;
    private final agak b;
    private final dspd c;
    private final List<String> d;

    public agaj(String str, agak agakVar, dspd dspdVar, List<String> list) {
        this.a = str;
        this.b = agakVar;
        this.c = dspdVar;
        this.d = list;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof agaj)) {
            return false;
        }
        agaj agajVar = (agaj) obj;
        return dbsd.a(this.a, agajVar.a) && dbsd.a(this.b, agajVar.b) && dbsd.a(this.c, agajVar.c) && dbsd.a(this.d, agajVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
