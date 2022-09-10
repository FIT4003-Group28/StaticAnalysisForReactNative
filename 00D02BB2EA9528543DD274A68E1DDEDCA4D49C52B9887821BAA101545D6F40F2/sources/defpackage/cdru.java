package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cdru  reason: default package */
/* loaded from: classes4.dex */
public final class cdru implements cdis {
    private final bvrt<dmbe> a;

    public cdru(dmbe dmbeVar) {
        this.a = bvrt.b(dmbeVar);
    }

    private final dmbe g() {
        return this.a.e((dssr) dmbe.c.cu(7), dmbe.c);
    }

    @Override // defpackage.cdis
    public final dbsg<String> a() {
        String str;
        dhze dhzeVar = g().b;
        if (dhzeVar == null) {
            dhzeVar = dhze.m;
        }
        if ((dhzeVar.a & 16) != 0) {
            dhze dhzeVar2 = g().b;
            if (dhzeVar2 == null) {
                dhzeVar2 = dhze.m;
            }
            str = dhzeVar2.f;
        } else {
            str = null;
        }
        return dbsg.j(str);
    }

    @Override // defpackage.cdis
    public final dbsg<String> b() {
        String str;
        dhze dhzeVar = g().b;
        if (dhzeVar == null) {
            dhzeVar = dhze.m;
        }
        if ((dhzeVar.a & 256) != 0) {
            dhze dhzeVar2 = g().b;
            if (dhzeVar2 == null) {
                dhzeVar2 = dhze.m;
            }
            str = dhzeVar2.j;
        } else {
            str = null;
        }
        return dbsg.j(str);
    }

    @Override // defpackage.cdis
    public final int c() {
        dhze dhzeVar = g().b;
        if (dhzeVar == null) {
            dhzeVar = dhze.m;
        }
        return dhzeVar.c;
    }

    @Override // defpackage.cdis
    public final int d() {
        dhze dhzeVar = g().b;
        if (dhzeVar == null) {
            dhzeVar = dhze.m;
        }
        return dhzeVar.d;
    }

    @Override // defpackage.cdis
    public final dbsg<String> e() {
        String str;
        dhze dhzeVar = g().b;
        if (dhzeVar == null) {
            dhzeVar = dhze.m;
        }
        if ((dhzeVar.a & 8) != 0) {
            dhze dhzeVar2 = g().b;
            if (dhzeVar2 == null) {
                dhzeVar2 = dhze.m;
            }
            str = dhzeVar2.e;
        } else {
            str = null;
        }
        return dbsg.j(str);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdru) {
            return dbsd.a(this.a, ((cdru) obj).a);
        }
        return false;
    }

    @Override // defpackage.cdis
    public final boolean f() {
        dhze dhzeVar = g().b;
        if (dhzeVar == null) {
            dhzeVar = dhze.m;
        }
        dhzb dhzbVar = dhzeVar.b;
        if (dhzbVar == null) {
            dhzbVar = dhzb.e;
        }
        return dhzbVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
